package ex02.runner;

import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class HelloWorldRunner implements ApplicationRunner {
	
	private Map<?, ?> map;

	public HelloWorldRunner(Map<?, ?> map) {
		System.out.println("4. HelloWorldRunner 초기화");
		this.map = map;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("5. ExApplication의 run이 실행되면서 검색된 모든 ApplicationRunner 빈의 run() 메서드들이 실행.");
		System.out.println("HelloWorldRunner의 run 실행");
		System.out.println("ExApplication runs... " + map.get("greetings"));
	}

}
