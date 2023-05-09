import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Rajyalaxmi_Thumarada on 16-09-2022
 */
public class TestB {

    public static void main(String args[]) {

        String accounts  = "0101,0210,0401,0110";
        //Optional.ofNullable(accounts).map(s -> s.split(",",-1)).stream().toList().forEach(s -> System.out.println(s));
        Optional.ofNullable(accounts)
                .map(s -> s.split(",", -1))
                .filter(l -> l.length >= 4)
                .map(l -> Arrays.stream(l).map(String::trim)
                        .map(v -> v.equals("") ? null : v)
                        .collect(Collectors.toList())).stream().forEach(strings -> {
                    System.out.println(strings);
                });
              /*  .map(l -> new UserSearchFields(userCode, l.get(0), l.get(1), l.get(2), l.get(3)));
              .flatMap(usf -> Optional.ofNullable(accountFinders.get(accountType))
                .map(f -> f.apply(usf))
                .map(sa -> getListOf(sa, a -> generalModelMapper.map(account, AccountExtendedData.class))))
                .orElseThrow(InvalidDataException.exceptionOf(INVALID_ACCOUNT_TYPE));*/

    }

}
