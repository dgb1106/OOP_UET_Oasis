import org.junit.Test;
import org.junit.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Assert.assertEquals(Week4.max2Int(1, 2), 2);
    }

    @Test
    public void testMax2Int2(){
        Assert.assertEquals(Week4.max2Int(2, 2), 2);
    }

    @Test
    public void testMax2Int3(){
        Assert.assertEquals(Week4.max2Int(3, 2), 3);
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals(Week4.max2Int(4, 2), 4);
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals(Week4.max2Int(5, 2), 5);
    }

    @Test
    public void testMinArray1(){
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray2(){
        int[] arr = {3, 5, 8, 2, 4};
        Assert.assertEquals(Week4.minArray(arr), 2);
    }

    @Test
    public void testMinArray3(){
        int[] arr = {10, 30, 15, 8, 18};
        Assert.assertEquals(Week4.minArray(arr), 8);
    }

    @Test
    public void testMinArray4(){
        int[] arr = {19, 11, 14, 17, 22};
        Assert.assertEquals(Week4.minArray(arr), 11);
    }

    @Test
    public void testMinArray5(){
        int[] arr = {36, 21, 22, 55, 73};
        Assert.assertEquals(Week4.minArray(arr), 21);
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals(Week4.calculateBMI(58, 1.72), "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        Assert.assertEquals(Week4.calculateBMI(65, 1.8), "Bình thường");
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals(Week4.calculateBMI(88, 1.65), "Béo phì");
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals(Week4.calculateBMI(44, 1.75), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals(Week4.calculateBMI(70, 1.7), "Thừa cân");
    }
}
