package be.pleckspaen.Ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    void sayHello(){
        System.out.println("Hello world");
    }
}
