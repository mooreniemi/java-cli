package hello;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import javax.validation.constraints.Size;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.standard.ShellComponent;

// https://docs.spring.io/spring-shell/docs/current-SNAPSHOT/reference/htmlsingle/#_using_spring_shell
@ShellComponent
@AllArgsConstructor
public class HelloWorld {
    private static final int MAX_NAME_SIZE = 40;

    @Autowired
    private final Greeter greeter;

    @ShellMethod("Say hello to someone...")
    public String greet(@ShellOption(defaultValue = "world")
                        @Size(min = 2, max = MAX_NAME_SIZE)
                        final String name) {
        return greeter.sayHello(name);
    }
}
