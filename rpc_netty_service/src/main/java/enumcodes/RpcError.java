package enumcodes;

import lombok.Data;
import lombok.Setter;

public enum RpcError {
    SERVICE_NOT_IMPLEMENT_ANY_INTERFACE("SERVICE_NOT_IMPLEMENT_ANY_INTERFACE"),
    SERVICE_NOT_FOUND("SERVICE_NOT_FOUND"),
    UNKNOWN_PROTOCOL("UNKNOWN_PROTOCOL"),
    UNKNOWN_PACKAGE_TYPE("UNKNOWN_PACKAGE_TYPE"),
    UNKNOWN_SERIALIZER("UNKNOWN_SERIALIZER"),
    FAILED_TO_CONNECT_TO_SERVICE_REGISTRY("FAILED_TO_CONNECT_TO_SERVICE_REGISTRY"),
    REGISTER_SERVICE_FAILED("REGISTER_SERVICE_FAILED");
    RpcError(String message){
        this.message=message;
    }
   private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
