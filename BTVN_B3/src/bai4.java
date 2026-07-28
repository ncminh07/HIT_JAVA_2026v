import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
// median là số trung vị đó mom, vdu 1 2 3 thì median là 2
        int median = ( a > b) ? (a < c ? a : (b > c ? b : c)) : (b < c ? b : (a > c ? a : c));
        System.out.print(median);


    }
}
