package JavaForMe;
import java.util.Scanner;

public class InputAndScanners {
    public static void main(String[] args) {

//        for this scanner it only out-put a string
//        Scanner sc = new Scanner(System.in);
//        String scanned = sc.next();

//        for this scanner you is will out-put a intiger. becuase you are using the nextInt() method.
        Scanner sc = new Scanner(System.in);

//        scanned became an int therfore you need to use nextInt(). This method tries to convert another data type into an intiger
        String scanned = sc.next();

//        to convert string into an integer you got to the Integer object and use the parseeInt() method
        int x = Integer.parseInt(scanned);

        System.out.println(scanned);

    }
}