import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Student s = new Student("motconvitv1p" , "ncminh", 5);
        System.out.println(s.getRank());
        System.out.println(s.getScore());
        s.setDiem(8);
        System.out.println(s.getScore());
    }
}
// class : thuộc tính, hàm khởi tạo, constructor