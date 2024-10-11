public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int minArray (int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        long BMI = Math.round(weight / (height * height) * 10);
        if (BMI < 185) {
            return "Thiếu cân";
        }
        else if (BMI <= 229) {
            return "Bình thường";
        }
        else if (BMI <= 249) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}