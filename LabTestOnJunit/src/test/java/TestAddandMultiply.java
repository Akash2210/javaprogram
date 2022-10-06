import static org.junit.Assert.*;
import org.junit.Test;
public class TestAddandMultiply {
	@Test
	   public void testAddPass() {
	      // assertEquals(String message, long expected, long actual)
	      assertEquals("error in add()",  3,  AddandMultiply.add(1, 2));
	      assertEquals("error in add()", -3,  AddandMultiply.add(-1, -2));
	      assertEquals("error in add()",  9,  AddandMultiply.add(9, 0));
	   }
	 @Test
	   public void testAddFail() {
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotEquals("error in add()", 0, AddandMultiply.add(1, 2));
	   }
	 @Test
	   public void testMultiplication() {
	      assertNotEquals("15",AddandMultiply.add(5,3));
	      assertNotEquals("20",AddandMultiply.add(5,4));
	   }
}
