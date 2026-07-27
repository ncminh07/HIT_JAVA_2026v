
public class Bai1 {
    private double banKinh;


    public Bai1(double banKinh) {
        this.banKinh = banKinh;
    }

    public double chuVi() {
        double V = banKinh * 2 * 3.14;
        return V;
    }

    public double dienTich() {
        double S = Math.pow(banKinh, 2) * 3.14;
        return S;
    }
}