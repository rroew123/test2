package kr.co.hyeon.test;


import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;

import kr.co.hyeon.dao.MemDAO;
import kr.co.hyeon.dao.MemDAOImpl;
import kr.co.hyeon.vo.MemVO;

public class MemTest {
	MemVO vo1,vo2,vo3;
	MemDAO dao = new MemDAOImpl();
	DataSource dataSource;
	
	
	@Before
	public void before() {
		vo1 = new MemVO("kkk","aaa","bbb","01012312312","20221219");
		vo2 = new MemVO("qwe","asd","zxc","01012312312","20221219");
		vo3 = new MemVO("abc","def","ghi","01012312312","20221219");
	}
	
	@Test
	public void ConnectTest() {
		try {
			assertNotNull(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void delAllTest() {
		
	}
	
}
