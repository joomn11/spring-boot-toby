package tobyspring.helloboot;

import java.util.Objects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
//    private final ApplicationContext applicationContext;

//    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
//        this.helloService = helloService;
//        this.applicationContext = applicationContext;
//        System.out.println(this.applicationContext);
//
//    }

    @GetMapping("/hello")
    public String hello(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        return helloService.sayHello(Objects.requireNonNull(name));
    }

//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println(applicationContext);
//        this.applicationContext = applicationContext;
//    }
}
