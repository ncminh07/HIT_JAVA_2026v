public class Product {
    private String id;
    private String name;
    private Double price;
    private Integer quantity ; // số lượng đấy

    public Product ( String id,String name, Double price ,Integer quantity){
        this.id = id;
        this.name = name;
        this.price  = price;
        this.quantity  =quantity;
    }
    public double totalPrice(){
        double sum = this.price * this.quantity;
        return sum;
    }
    public void printInfo(){
        System.out.print("\nID :" );
        
        System.out.print("\nname :" + this.name);
        System.out.print("\nprice :" + this.price);
        System.out.print("\nquantity :" + this.quantity);
    }
}
