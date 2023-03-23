package imp;

import enumcodes.RpcError;
import exception.RpcException;
import iface.ServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceProviderimpl implements ServiceProvider {
    private static final Logger logger = LoggerFactory.getLogger(ServiceProviderimpl.class);

    private static final Map<String, Object> serviceMap = new ConcurrentHashMap<>();
    private static final Set<String> registeredService = ConcurrentHashMap.newKeySet();
    @Override
    public <T> void addServiceProvider(T service){
        String serviceName = service.getClass().getCanonicalName();
        if(registeredService.contains(serviceName)) return;
        registeredService.add(serviceName);
    };

    public Object getServiceProvider(String serviceName){
        Object service = serviceMap.get(serviceName);
        if(service == null) {
            throw new RpcException(RpcError.SERVICE_NOT_FOUND.getMessage());
        }
        return service;

    }
}
