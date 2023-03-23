package enumcodes;

public enum PackageType {
    REQUEST_PACK(400),
    RESPONSE_PACK(401);
     PackageType(Integer code){
        this.code=code;
    }

    public Integer getCode() {
        return code;
    }

    private Integer code;
}
