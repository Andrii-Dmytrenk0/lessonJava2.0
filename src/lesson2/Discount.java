package src.lesson2;

public class Discount {
    public static void main(String[] args) {
        boolean isRegularCustomer = false;
        int purchaseAmount = 800;
        int discount = 0;

        if(isRegularCustomer){
            discount = 5;
            if (purchaseAmount > 1000){
                discount += 5;
            }
        }
        System.out.println("Your discount: " + discount + "%");
    }

}
