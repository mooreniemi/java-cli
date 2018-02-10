package hello;

import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

@Service
public class Greeter {
    public String sayHello(final String name) {
        return "Hello " + StringUtils.capitalize(name) + "!";
    }
}
