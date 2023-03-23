package iface;

public interface ServiceProvider {


        <T> void addServiceProvider(T service);

        Object getServiceProvider(String serviceName);

    }


