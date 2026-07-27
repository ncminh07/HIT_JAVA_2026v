public class Bai2 {
    private String nhapVao;

    public Bai2(String nhapVao){
        this.nhapVao = nhapVao;
    }

    public String getnhapVao(){
        return nhapVao;
    }

    public boolean ktradxung(){
        int n = nhapVao.length();
        for(int i = 0 ; i < n / 2 ; i++){
            if( nhapVao.charAt(i) != nhapVao.charAt(n - 1 - i) ){
                return false;
            }
        }
        return true;
    }

}