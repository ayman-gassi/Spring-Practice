package org.example.mundiapolis;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
 @Override
    public void run(String... args) throws Exception{}
@Bean
    PasswordEncoder passwordEncoder (){
        return new BCryptPasswordEncoder();
    }
}
