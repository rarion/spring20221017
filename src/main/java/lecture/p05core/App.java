package lecture.p05core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		String loc = "/lecture/p05core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Service s = context.getBean(Service.class);
		Repository r = context.getBean(Repository.class);
		
		Repository r2 = s.getRepository();
		
		System.out.println(s); // null이 아님
		System.out.println(r); // null이 아님
		System.out.println(r2); // r과 같은 참조값
		
		System.out.println("프로그램 계속 실행");
		}
}
