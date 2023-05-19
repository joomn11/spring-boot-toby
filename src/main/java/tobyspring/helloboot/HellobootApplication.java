package tobyspring.helloboot;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.MySpringBootApplication;

//@Configuration
//@ComponentScan
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
//        MySpringApplication.run(HellobootApplication.class, args);
        SpringApplication.run(HellobootApplication.class, args);
    }

//    @Bean
//    public HelloController helloController(HelloService helloService) {
//        return new HelloController(helloService);
//    }
//    @Bean
//    public HelloService helloService() {
//        return new SimpleHelloService();
//    }

    @Bean
    ApplicationRunner applicationRunner(Environment env) {
        return args -> {
            String name = env.getProperty("my.name");
            System.out.println("my.name: " + name);
        };
    }
}
