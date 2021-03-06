import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.api.IHelloService;

public class App {
	
	
	public static void main(String[] args) {
		
		ApplicationContext  act = new ClassPathXmlApplicationContext("spring-config.xml");
		
		IHelloService bean = act.getBean(IHelloService.class);
		
		String sayHello = bean.sayHello("Spring rmi");
		
		System.out.println(sayHello);
		
	}

}
