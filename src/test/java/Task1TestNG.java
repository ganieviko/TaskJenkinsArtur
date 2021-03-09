import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Task1TestNG {

    @Test
    public void arutr1() {
        System.out.println("Success");
    }
    @Test
    public void arutr2() {
        System.out.println("Success");
    }
    @Test
    public void arutr3() {
        boolean failOrNotFail = new Random().nextBoolean();
        if(failOrNotFail) {
            Assert.fail("Fail 3");
        } else {
            System.out.println("Success 3");
        }
    }

    @Test
    public void arutr4() {
        Assert.fail("Fail 4");
    }


}
