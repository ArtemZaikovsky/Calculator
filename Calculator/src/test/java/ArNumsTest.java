import org.junit.Assert;
import org.junit.Test;

public class ArNumsTest {

    ArNums arNums = new ArNums();
    @Test
    public void test(){

        String error = "";
        int result = arNums.arabicNumbers("1 + 2");
        Assert.assertEquals(3,result);
        try{

            arNums.arabicNumbers("20 и 1");

        }catch (IllegalArgumentException e){

            error = e.getMessage();

        }
        Assert.assertEquals("Ошибка: числа должны быть в диапазоне от 1 до 10!", error);

    }
}
