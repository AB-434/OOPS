class Enum_02{
    public static void main(String args[]){
        for(Product p:Product.values()){
            System.out.println(p+" "+p.getPrice());
        }
    }
}
enum Product{
    Phone(2000),Laptop(5000),Computer(10000);
    private int price;
    private Product(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}