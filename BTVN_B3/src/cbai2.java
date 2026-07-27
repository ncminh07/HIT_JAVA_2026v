import java.util.Scanner;

public class cbai2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String m = s.nextLine();

        Bai2 b = new Bai2(m);

        if(b.ktradxung()){
            System.out.println(b.getnhapVao().toUpperCase() + " chuỗi này đối xứng");
        }
        else{
            System.out.println(b.getnhapVao().toLowerCase() + " chuỗi này khong đối xứng");
        }

    }
}
