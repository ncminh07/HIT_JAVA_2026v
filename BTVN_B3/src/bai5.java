import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine()); // nhập n vào để gán độ dài mảng bên dưới é

        int[] arr = new int[N]; // gán vào đây nè hihi

        for(int i = 0 ; i< (arr.length); i++){
            System.out.printf("arr(" + i + ") = "); // vieets nhuw nayf cho gioongs c++
            arr[i] = Integer.parseInt(s.nextLine()); // khúc này là gán giá tri từ bàn phím vào từng ptu của magr
        }
        int dinh = 0; // giả sử k có đỉnh
        for(int i = 0 ; i< (arr.length-2); i++){
            boolean chotVot = ( arr[i] < arr[i+1] && arr[i+2] < arr[i+1]); // điều kiện thoiii, dễ hiểu mà đkhongg
                if(chotVot){
                    dinh++; // đunghs thì lennn dỉnhh hhihihihihi
                }
        }
        System.out.printf("Số đỉnh =" + dinh);

    }
}
