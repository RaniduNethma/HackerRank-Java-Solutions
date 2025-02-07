import java.util.Scanner;

public class Java_Static_Initializer_Block {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (B<=0 | H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else{
            int area = B * H;
            System.out.println(area);
        }
    }
}
