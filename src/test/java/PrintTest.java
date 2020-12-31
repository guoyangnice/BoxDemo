import org.junit.Assert;
import org.junit.Test;

public class PrintTest {

    @Test
    public void should_print_hh(){
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("HH",helloWorld.print());
    }
}
