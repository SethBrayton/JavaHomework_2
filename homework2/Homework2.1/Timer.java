public class Timer {
    public static void main(String[] args) {
        int secondsInWorkday = 28800;
        int n = 13550;
        int secondsLeft = secondsInWorkday - n;
        System.out.println(secondsLeft + " секунд осталось");

        int fullHoursLeft = secondsLeft / 3600;

        if (fullHoursLeft <= 0) {
            System.out.println("Осталось меньше часа");
        } else {
            System.out.println(fullHoursLeft + " целых часов осталось");
        }
    }
}