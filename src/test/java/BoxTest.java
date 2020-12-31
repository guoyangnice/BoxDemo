import org.junit.Assert;
import org.junit.Test;

public class BoxTest {

    @Test
    public void should_open_first_box_given_a_mysteriousNumber(){
        Client client = new Client();
        OpenBoxProperty openBoxProperty  = client.open(1,"0");
        Assert.assertTrue(openBoxProperty.getHashValue().startsWith("00000"));
        Assert.assertTrue(openBoxProperty.getMysteriousNumber() < 2147483647);
    }

    @Test
    public void should_open_second_box_given_a_mysteriousNumber(){
        Client client = new Client();
        OpenBoxProperty openBoxProperty  = client.open(1,"0");
        openBoxProperty  = client.open(2,openBoxProperty.getHashValue());
        Assert.assertTrue(openBoxProperty.getHashValue().startsWith("00000"));
        Assert.assertTrue(openBoxProperty.getMysteriousNumber() < 2147483647);
    }
}
