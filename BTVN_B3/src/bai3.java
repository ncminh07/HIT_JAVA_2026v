import java.util.Scanner;
import java.util.Random;

public class bai3 {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int a = r.nextInt(101);
        int b = r.nextInt(101);
        int c = r.nextInt(201);

        System.out.println(a + " + " + b + " = " + c);

        System.out.print("dung hay sai cu : ");
        String TF = s.nextLine();

        boolean oke = (a + b == c);


        if( (oke && TF.equals("dung")) || (!oke && TF.equals("sai")) ){
            System.out.println("thông minh đấy cu ");
        }else  System.out.println("aissss sai roi cu ");
    }

}
