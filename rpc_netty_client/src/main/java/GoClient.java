import iface.HelloService;
import iface.RpcClient;
import imp.NettyClient;
import bean.HelloObject;

public class GoClient {
    public static void main(String[] args){
        RpcClient rpc=new NettyClient("127.0.0.1",9000);
        RpcClientProxy prcc=new RpcClientProxy(rpc);
        HelloService hello=prcc.getProxy(HelloService.class);
        HelloObject ho=new HelloObject(13,"ni,hao");
        // hello.hello(ho);
        System.out.println( hello.hello(ho));

    }
}
