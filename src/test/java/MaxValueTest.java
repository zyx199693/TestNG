import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxValueTest {

  @Test
  public void maxTest() {
	  int result=MaxValue.max(3, 6);
	  int expect=6;
	  Assert.assertEquals(result, expect);
	  System.out.println("This is MaxValueTest");
//    throw new RuntimeException("Test not implemented");
  }
}