
import org.junit.Assert;
import org.junit.Test;

public class ClassTest
{
    Runner r = new Runner();

    /**
     * After running changeClassVar("xyz"), the value of global_var should be "xyz".
     */
    @Test
    public void classTest1(){
        Class.global_var="xyz";
        r.changeClassVar("xyz");
        Assert.assertEquals(Class.global_var, "xyz");

    }
}
