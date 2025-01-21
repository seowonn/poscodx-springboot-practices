package ex02;

import java.util.Map;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex02.runner.HelloWorldRunner;

@SpringBootApplication
public class ExApplication { // Bootstrapping Class

	@Bean
	public Map<?, ?> myMap() {
		System.out.println("3. myMap 빈 등록");
		return Map.of("greetings", "Hello World");
	}
	
	@Bean
	public ApplicationRunner applicationRunner() {
		System.out.println("3. ApplicationRunner 반 등록");
		return new HelloWorldRunner(myMap());
	}
	
	public static void main(String[] args) {
		System.out.println("1. ExApplication의 main문 실행");
		System.out.println("2. SpringApplication.run이 호출되면서 SpringApplication 객체가 생성되고,");
		System.out.println("ApplicationContext 생성. 빈 등록 및 초기화 작업 시작 ");
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)) {}		
	}

}
