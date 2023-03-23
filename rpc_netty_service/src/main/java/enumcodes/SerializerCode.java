package enumcodes;

public enum SerializerCode {
    JSON(1);

    private Integer code;
    SerializerCode(Integer code){
        this.code=code;
    }

    public Integer getCode() {
        return code;
    }
}
