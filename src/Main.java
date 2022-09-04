import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> generalNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i=0; i<50; i++){
            int numbers = random.nextInt(1,100);
            generalNumbers.add(numbers);

            if (numbers % 2 != 0) {
                oddNumbers.add(numbers);
            }else {
                evenNumbers.add(numbers);
            }
        }
        System.out.println("General numbers: " +generalNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " +evenNumbers);


    }
}