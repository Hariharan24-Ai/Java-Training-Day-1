
public class LargestElement {
    public static void main(String[] args) {

        int[] num = {10, 25, 8, 42, 18};

        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println("Largest element is " + largest);
    }
}