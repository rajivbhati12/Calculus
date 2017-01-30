package test.java.integration;

import main.java.Addition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by rajivbhati on 1/29/17.
 */
public class ITAddition {
    private Addition calculusAddition;

    @BeforeMethod
    public void getCalculusAddition(){
        calculusAddition = new Addition();
    }

    @Test(expectedExceptions = Exception.class)
    public void testToVerifyException(){
        Assert.assertEquals(calculusAddition.addRandomValue(2,2) < 109,"Junk Test");
    }

    @Test
    public void testToVerifyException1(){
        Assert.assertEquals(true,"Junk test");
    }
}
