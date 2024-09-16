import java.util.Scanner;

public class trueorfalse {

    public static void separator(){
        System.out.println("------------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);

        while(true){
            separator();
            System.out.print("Enter a number: ");
            double num = checker.nextDouble();

            if (num > 0){
                separator();
                System.out.println(num + " is Positive");
            }
            else if (num < 0) {
                separator();
                System.out.println(num +" is negative? ");
            }
            else {
                separator();
                System.out.println("0 is neither positive or negative");
            }
        }
    }
}
