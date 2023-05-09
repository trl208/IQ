/**
 * Rajyalaxmi_Thumarada on 18-10-2022
 */
public class NationalGroupDetailDTO {


    private Integer id;
    private String code;
    private String name;
    private String subGroupId;
    private String subGroupCode;
    private String subGroupName;
    private String regionId;
    private String regionCode;
    private String regionName;
    private String districtId;
    private String districtCode;
    private String districtName;

    public NationalGroupDetailDTO(Integer id, String code, String name, String subGroupId, String subGroupCode, String subGroupName, String regionId, String regionCode, String regionName, String districtId, String districtCode, String districtName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.subGroupId = subGroupId;
        this.subGroupCode = subGroupCode;
        this.subGroupName = subGroupName;
        this.regionId = regionId;
        this.regionCode = regionCode;
        this.regionName = regionName;
        this.districtId = districtId;
        this.districtCode = districtCode;
        this.districtName = districtName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getSubGroupCode() {
        return subGroupCode;
    }

    public void setSubGroupCode(String subGroupCode) {
        this.subGroupCode = subGroupCode;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
