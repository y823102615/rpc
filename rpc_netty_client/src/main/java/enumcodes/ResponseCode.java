package enumcodes;


public enum ResponseCode {

    SUCCESS(200,"OK");

    private Integer code;
    private String message;

     ResponseCode(Integer code, String message){
        this.code=code;
        this.message=message;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
