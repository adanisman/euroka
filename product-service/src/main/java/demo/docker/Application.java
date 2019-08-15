package demo.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 

@EnableEurekaClient
//Eureka server 'a register olabilmesi için bu notasyonu ekliyoruz.
@EnableDiscoveryClient
//springboot projesi
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
       	SpringApplication.run(Application.class, args);
    }
}