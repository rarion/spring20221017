package lecture.p06core;

import lecture.p06core.Dao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Service {
	
	@Getter
	private Dao dao;
}
