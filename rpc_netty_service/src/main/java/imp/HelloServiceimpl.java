package imp;

import iface.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bean.HelloObject;

public class HelloServiceimpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceimpl.class);
    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}", object.getMessage());
        return "这是掉用的返回值，id=" + object.getId();
    }
}
