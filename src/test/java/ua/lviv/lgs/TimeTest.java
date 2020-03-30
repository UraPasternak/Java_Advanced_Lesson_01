package ua.lviv.lgs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;



public class TimeTest {
	private Time time, time2;
	
	@Rule
	public TestWatcher testWacher = new TestWatcher(){
		
		protected void failed(Throwable e,org.junit.runner.Description description){
			System.out.println("FAILED --> "+description.getMethodName());
			};
		
		protected void succeeded(org.junit.runner.Description description){
			System.out.println("SUCCEED --> "+description.getMethodName());
			};
		};
	
	@Before
	public void beforeTest() throws MyTimeException{
		time = new Time(0,0);
		time2 = new Time(2,30);
	}
	
	@After
	public void afterTest(){
		time = null;
	}
	
	@Test
	public void plusTimeTest() throws MyTimeException{
		
		Time time3 = time.plusTime(time2);
		
		Assert.assertEquals(time2.getHour(), time3.getHour());
	}
	
	@Test
	public void plusTimeTest2() throws MyTimeException{
		
		Time time3 = time.plusTime(time2);
		
		Assert.assertEquals(time2.getMin(), time3.getMin());
	}
	
}
