package iface;

import java.net.InetSocketAddress;

public interface ServiceRegisterCenter {

        void register(String serviceName, InetSocketAddress inetSocketAddress);
        InetSocketAddress lookupService(String serviceName);

}
