package ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import ex02.component.MyComponent;


@SpringBootTest
class MyApplicationTest {
	
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void test() {
		MyComponent myComponent = applicationContext.getBean("MyComponent", MyComponent.class);
		assertNotNull(myComponent);
	}

}
