package pl.coderslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.coderslab.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Warjees22sbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Warjees22sbsApplication.class, args);
    }

}
