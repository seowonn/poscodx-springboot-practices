package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @SpringBootApplication
 * : Spring Boot 애플리케이션의 시작점(entry point)을 정의하는 어노테이션
 * 1. Spring의 설정 클래스를 나타내며, @Configuration을 포함한다. 
 * 2. Spring Boot의 자동 설정 (Auto Configuration)을 활성화한다. 
 * 	Auto Configuration: classpath에 존재하는 라이브러리를 기반으로 자동으로 필요한 빈(Bean)을 설정함
 * 3. 컴포넌트 스캔(@ComponentScan)을 활성화하여 어노테이션이 붙은 클래스를 스캔하여 Spring Bean으로 등록한다. 
 */
@SpringBootApplication
public class ExApplication { // Bootstrapping Class

	/**
	 * Bootstrapping의 역할
	 * SpringApplication.run(ExApplication.class, args);를 호출하여 애플리케이션(ApplicationContext)의 전반적인 초기화를 진행
	 */
	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greetings", "Hello World");
	}
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac = null; // ApplicationContext를 반환
		
		try {
			ac = SpringApplication.run(ExApplication.class, args);
			System.out.println("ExApplication runs... " + ac.getBean("myMap", Map.class).get("greetings"));
		} catch (Exception ignored) {

		} finally {
			ac.close();
		}		
		
	}

}
