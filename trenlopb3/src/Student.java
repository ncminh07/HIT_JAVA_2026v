public class Student {
    private String id;
    private String name;
    private double diem;

    public Student(String id, String name, double diem) {
        this.id = id;
        this.name = name;
        this.diem = diem;
    }

    public String getRank() {
        String a;
        if (this.diem >= 8.5) {
            a = "gioi";
        } else if (5 <= this.diem && this.diem <= 8.5) {
            a = "khá quá nhở";
        } else {
            a = "dưới khá thoi";
        }
        return a;
    }

    public Double getScore() {
        System.out.print("Diem cua ban  la : ");
        return this.diem;
    }
    public void setDiem(double n){
        this.diem =n;
    }
}
