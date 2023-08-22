import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestRunner extends SetUP{
    @Test
    public void Calculation(){
        CalScreen Calscreen=new CalScreen(driver);
        String res = CalScreen.math();
        assertTrue(res.contains("100"));
    }

}
