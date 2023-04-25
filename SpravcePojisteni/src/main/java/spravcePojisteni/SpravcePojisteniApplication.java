package spravcePojisteni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpravcePojisteniApplication {
    public static void main(String[] args){
        SpringApplication.run(SpravcePojisteniApplication.class, args);
    }
}
