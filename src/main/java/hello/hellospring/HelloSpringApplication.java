package hello.hellospring;
// hello.hellospring 패키지 하위에 있어야 컴포넌트 스캔이 가능함
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
	}

}



