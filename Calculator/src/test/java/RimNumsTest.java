import org.junit.Assert;
import org.junit.Test;

public class RimNumsTest {

    RimNums rimNums = new RimNums();

    @Test
    public void test(){

        String res = rimNums.rimNumbers("X + V");
        Assert.assertEquals("XV",res);
        try {

            res = rimNums.rimNumbers("XX b V");

        }catch (IllegalArgumentException e){

            res = e.getMessage();

        }
        Assert.assertEquals("Ошибка: введены некоректные данные.", res);

    }

}
