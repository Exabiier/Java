package JavaForMe;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

//        in java you have to declare what data type your arrays have to be
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "no";
        newArr[2] = "this";
        newArr[3] = "sucks";
        newArr[4] = "so much";
        String x = newArr [0];

        int count = 0;
        for(String element:newArr){
            System.out.println(element + " " + count);
            count++;
        }

        int[] arr = {1,2,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < names.length; i++ ){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for(String n:names) {
            System.out.println(n);
            if (n.equals("tim")) {
            }
        }
            int y = sc.nextInt();

            while(y != 10){
                System.out.println("Type 10: ");
                y = sc.nextInt();
            }







    }
}
