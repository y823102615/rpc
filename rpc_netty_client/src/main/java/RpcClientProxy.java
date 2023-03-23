import iface.RpcClient;
import imp.NettyClient;
import vo.RpcRequest;
import vo.RpcResponse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class RpcClientProxy implements InvocationHandler {
//   private String host;
//   private int port;
   private RpcClient rpc;
   public RpcClientProxy(RpcClient rpc) {
//       this.host = host;
//       this.port = port;
       this.rpc=rpc;
   }

   @SuppressWarnings("unchecked")
   public <T> T getProxy(Class<T> clazz) {
       return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, this);
   }
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       RpcRequest rpcRequest = RpcRequest.builder()
               .interfaceName(method.getDeclaringClass().getName())
               .methodName(method.getName())
               .parameters(args)
               .paramTypes(method.getParameterTypes())
               .build();
//       RpcClient rpcClient = new RpcClient();
//       return ((RpcResponse) rpcClient.sendRequest(rpcRequest, host, port)).getData();
       return  rpc.sendRequest(rpcRequest);
   }

}
