package tobyspring.helloboot;


import org.springframework.boot.SpringApplication;
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

}
