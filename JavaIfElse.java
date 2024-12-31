import java.util.*;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N%2 == 0 && 2 <= N && 5 >= N){
            System.out.println("Not Weird");

        } else if (N%2 == 0 && 6 <= N && 20 >= N){
            System.out.println("Weird");

        } else if (N%2 ==0 && N >= 20) {
            System.out.println("Not Weird");

        } else {
            System.out.println("Weird");
        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}