import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NationalGroupDetail {
    private String id;
    private String name;
    /*private List<SubGroupDetail> subGroups;
    private SubGroupDetail subGroup;*/
}
