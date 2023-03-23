import iface.HelloService;
import iface.ServiceRegistry;
import imp.DefaultServiceRegistry;
import imp.HelloServiceimpl;
import imp.NettyServer;

public class GoService {
    public static void main(String[] args) {
        NettyServer ns=new NettyServer("127.0.0.1",9000);
        ns.start();

    }
}
