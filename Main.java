

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yr.service.UserService;

public class Main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ctx.getBean("userServiceImplement");
		userService.deleteUser("------------------------------");
		userService.deleteUser("------------------------------");
		userService.deleteUser("------------------------------");
		userService.deleteUser("=============================");
	}
}
