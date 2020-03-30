package ua.lviv.lgs;

import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class ScheduleTest {
	Schedule sched;
	
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
			sched = new Schedule();
						
		}
		
		@After
		public void afterTest(){
			sched = null;
		}
		
		@Test
		public void addSeanceTest() throws MyTimeException{
			Time duration = new Time(1,20);
			Time startTime = new Time(10,30);
			Movie movie = new Movie("Matrix", duration);
			Seance seance = new Seance(movie, startTime);
			Set<Seance> seancesExpected = new TreeSet<>();
			seancesExpected.add(seance);
			sched.addSeance(seance);
			
			Assert.assertEquals(seancesExpected, sched.seances);
		}
		
		@Test
		public void removeSeanceTest() throws MyTimeException{
			Time duration = new Time(1,20);
			Time startTime = new Time(10,30);
			Movie movie = new Movie("Matrix", duration);
			Seance seance = new Seance(movie, startTime);
			Set<Seance> seancesExpected = new TreeSet<>();
			seancesExpected.add(seance);
			sched.addSeance(seance);
			seancesExpected.remove(seance);
			sched.removeSeance(seance);
			
			Assert.assertEquals(seancesExpected, sched.seances);
		}
}
