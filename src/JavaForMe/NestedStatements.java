package JavaForMe;
import java.util.Scanner;

public class NestedStatements {
    public static void main(String[] args) {

//        for this scanner it only out -put a string
        System.out.print("Input your age");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if(age >= 13){
            System.out.print("what is your favorite food");
            String food = sc.nextLine();
            if(food.equals("pizza")){
                System.out.print("that is a good choice");
            } else {
                System.out.print("Not the best choice");
            }


        } else {
            System.out.println("you can not ride, you are to young!");
        }


    }
}
