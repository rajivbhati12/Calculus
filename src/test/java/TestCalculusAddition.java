/**
 * Created by rajivbhati on 1/28/17.
 */


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCalculusAddition {
    CalculusAddition calculusAddition;

    @BeforeMethod
    public void getCalculusAddition(){
        calculusAddition = new CalculusAddition();
    }

    @Test
    public void testToAddValues(){
        Assert.assertEquals((int) (calculusAddition.addValues(1,2)),3,"should match");
    }

}
