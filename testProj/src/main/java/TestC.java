import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Rajyalaxmi_Thumarada on 19-10-2022
 */
public class TestC {
    record NGGroupByFields(String code, String subGroupCode) {
    }
    private static ModelMapper generalModelMapper = new ModelMapper();
    public static void main(String[] args) {
        NationalGroupDetailDTO ngdd = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59493",	"000009",	"GERIMED AFFILIATED","010","0100","","","",""	);
        NationalGroupDetailDTO ngdd1 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59494",	"000010",	"MEDASSETS AFFILIATED","010","0100","","","",""	);
        NationalGroupDetailDTO ngdd2 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59495",	"000011",	"MARSHFIELD AFFILIATED","010","0100","","","",""	);
        NationalGroupDetailDTO ngdd3 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59496",	"000012",	"OMNICARE","010","0100","","","",""	);
        NationalGroupDetailDTO ngdd4 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59497",	"000013",	"D&K","011","0101","","","",""	);
        NationalGroupDetailDTO ngdd5 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59498",	"000014",	"HPG","011","0101","","","",""	);
        NationalGroupDetailDTO ngdd6 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59499",	"000015",	"FAIRVIEW AFFILIATED RELATIONSH","011","0101","","","",""	);
        NationalGroupDetailDTO ngdd7 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59500",	"000016",	"FAIRVIEW AFFILIATED RELATIONSH","011","0101","","","",""	);
        NationalGroupDetailDTO ngdd8 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59500",	"000016",	"COMMHLT","012","0102","","","",""	);
        NationalGroupDetailDTO ngdd9 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59500",	"000016",	"COMMHLT","012","0102","","","",""	);
        NationalGroupDetailDTO ngdd10 = new NationalGroupDetailDTO(630	,"0498",	"UNAFFILIATED ACUTE HOSPITALS",	"59500",	"000016",	"COMMHLT","012","0102","","","",""	);
        List<NationalGroupDetailDTO> nationalGroupDetailDTOS = new ArrayList<>();
        nationalGroupDetailDTOS.add(ngdd);nationalGroupDetailDTOS.add(ngdd1);nationalGroupDetailDTOS.add(ngdd2);
        nationalGroupDetailDTOS.add(ngdd3);nationalGroupDetailDTOS.add(ngdd4);nationalGroupDetailDTOS.add(ngdd5);
        nationalGroupDetailDTOS.add(ngdd6);nationalGroupDetailDTOS.add(ngdd7);nationalGroupDetailDTOS.add(ngdd8);
        nationalGroupDetailDTOS.add(ngdd9);nationalGroupDetailDTOS.add(ngdd10);

        List<Set<NationalGroupDetailDTO>> listOfListsng = nationalGroupDetailDTOS.stream()
                .collect(Collectors.groupingBy(NationalGroupDetailDTO::getCode,Collectors.toSet()))
                .entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(listOfListsng.size() + "nationalSubGroups");
        for (int i=0;i<listOfListsng.size();i++) {
            Set<NationalGroupDetailDTO> listng = listOfListsng.get(i);

        List<Set<NationalGroupDetailDTO>> listOfListsnsg = listng.stream().collect(Collectors.groupingBy(NationalGroupDetailDTO::getSubGroupCode,Collectors.toSet()))
                    .entrySet().stream()
                    .map(Map.Entry::getValue)
                    .collect(Collectors.toList());
            System.out.println(listOfListsnsg.size() );
            listOfListsnsg.stream().forEach(x -> x.stream().forEach(nationalGroupDetailDTO ->  System.out.println(nationalGroupDetailDTO.getCode()+" "+nationalGroupDetailDTO.getSubGroupCode())) );
            System.out.println("nationalRegions");
           for(int j=0;j<listOfListsnsg.size();j++){
               Set<NationalGroupDetailDTO> listnsg = listOfListsnsg.get(j);
               List<Set<NationalGroupDetailDTO>> listOfListsreg = listnsg.stream().collect(Collectors.groupingBy(NationalGroupDetailDTO::getRegionCode,Collectors.toSet()))
                       .entrySet().stream()
                       .map(Map.Entry::getValue)
                       .collect(Collectors.toList());
               System.out.println(listOfListsreg.size() );
               listOfListsreg.stream().forEach(x -> x.stream().forEach(nationalGroupDetailDTO ->  System.out.println(nationalGroupDetailDTO.getCode()+" "+nationalGroupDetailDTO.getSubGroupCode()+" "+nationalGroupDetailDTO.getRegionCode())) );
               for (int k=0;k<listOfListsreg.size();k++){
                   Set<NationalGroupDetailDTO> listreg = listOfListsreg.get(k);
                   List<Set<NationalGroupDetailDTO>> listOfListsdist= listreg.stream().collect(Collectors.groupingBy(NationalGroupDetailDTO::getDistrictCode,Collectors.toSet()))
                           .entrySet().stream()
                           .map(Map.Entry::getValue)
                           .collect(Collectors.toList());
                   System.out.println("" + listOfListsdist.size());
                   listOfListsdist.stream().forEach(x -> x.stream().forEach(nationalGroupDetailDTO ->  System.out.println(nationalGroupDetailDTO.getCode()+" "+nationalGroupDetailDTO.getSubGroupCode()+" "+nationalGroupDetailDTO.getRegionCode()+""+nationalGroupDetailDTO.getDistrictCode())) );
               }
           }
        }


    }
}
