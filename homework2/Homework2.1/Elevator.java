public class Elevator {

    public static void main(String[] args) {
        int h = 200;
        int n = 50;
        int m = 1;
        int numLifts = numberOfLifts(h, n, m);
        System.out.println("Необходимое число подъемов: " + numLifts);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int numLifts = 0;
        while (true) {
            currentFloor += stepUp;
            numLifts++;
            if (currentFloor >= floor) {
                break;
            }
            currentFloor -= stepDown;
        }
        return numLifts;
    }
}



