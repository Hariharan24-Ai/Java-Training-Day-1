public class ElseIfCondition {

    public static void main(String[] args) {

        int Time = 12;

        if (Time < 12) {
            System.out.println("Time is AM");
        } else if (Time == 12) {
            System.out.println("Time is Noon");
        } else {
            System.out.println("Time is PM");
        }
    }
}