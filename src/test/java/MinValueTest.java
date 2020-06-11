import org.testng.Assert;
import org.testng.annotations.Test;

public class MinValueTest {

  @Test
  public void minTest() {
	  int result = MinValue.min(4, 6);
	  int expect = 4;
	  Assert.assertEquals(result, expect);
	  System.out.println("This is MinValueTest");
//    throw new RuntimeException("Test not implemented");
  }
}
