package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @SpringBootApplication이 갖는 어노테이션 3개중 1개의 기능을 보기 위해 
 * @SpringBootConfiguration만 실행
 * SpringApplication.run(...)에서 이 어노테이션이 붙은 클래스를 탐지하여 Application의
 * 시작점으로 사용한다.
 */
@SpringBootConfiguration
public class MyApplication01 {

	@Bean("MyComponent01")
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication01.class, args)){}
	}
	
}
