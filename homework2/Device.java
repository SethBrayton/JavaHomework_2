public class Device {
    public static void main(String[] args) {
        int temperature1 = 110;
        int temperature2 = 90;

        boolean result = testDevice(temperature1, temperature2);
        System.out.println("Result: " + result);
    }

    public static boolean testDevice(int temperature1, int temperature2) {
        if (temperature1 < 100) {
            return false;
        } else if (temperature2 > 100) {
            return false;
        } else {
            return true;
        }
    }
}



