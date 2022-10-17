package lecture.p09core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	private Dao dao;
	
	// 주입 가능한 빈이 있다면 이 메소드를 사용해서 주입해라
	@Autowired
	private void setDao() {
		// TODO Auto-generated method stub

	}
	
	private void getDao() {
		// TODO Auto-generated method stub

	}
}
