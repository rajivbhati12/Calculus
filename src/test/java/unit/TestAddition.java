/**
 * Created by rajivbhati on 1/29/17.
 */

package test.java.unit;

import main.java.Addition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestAddition {


    private Addition calculusAddition;

    @BeforeMethod
    public void getCalculusAddition(){
        calculusAddition = new Addition();
    }

    @Test
    public void testToAddValues(){
        Assert.assertEquals((int) (calculusAddition.addValues(1,2)),3,"should match");
    }

    @Test(expectedExceptions = Exception.class)
    public void testToVerifyException(){
        calculusAddition.addValues(null,null);
    }


}
