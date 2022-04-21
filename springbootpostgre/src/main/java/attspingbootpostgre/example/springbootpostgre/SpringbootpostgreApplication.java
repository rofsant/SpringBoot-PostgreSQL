package attspingbootpostgre.example.springbootpostgre;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
            "model"
            })
@EnableJpaRepositories(basePackages = {
            "repository"
            })
public class SpringbootpostgreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootpostgreApplication.class, args);
    }

}