package exception;


public class RpcException extends RuntimeException {
   public RpcException(String message){
       super();
       this.message=message;
   }
   String message;
}
