import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {

    Validation validation = new Validation();

    @Test
    public void test(){

        String error = "";
        boolean test = validation.numbersCheck("X + V");
        Assert.assertEquals(true, test);
        try{

            test = validation.numbersCheck("1 + V");

        }catch (IllegalArgumentException e){

            error = e.getMessage();

        }
        Assert.assertEquals("Оба числа должны быть или арабскими, или римскими!", error);
    }

}