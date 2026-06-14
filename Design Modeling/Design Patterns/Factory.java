//create interface 
//create classes
//create factory class
//use factory class 
//Interface
// Rules/Contract define karta hai.

//implements
//Interface ke rules ko follow karta hai.

//equalsIgnoreCase()
// Strings compare karta hai without checking uppercase/lowercase.
interface Payment{
    void pay();

}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment done using UPI");

    }
}
class Card implements Payment{
    public void pay(){
        System.out.println("Payment done using card");

    }
}
class PaymentFactory{
    public static Payment getPayment(String type){
        if(type.equalsIgnoreCase("UPI")){
            return new UPI();
        }
        else if(type.equalsIgnoreCase("Card")){
            return new Card();
        }
        return null;
    }
}
class Main{
    public static void main(String[] args){
        Payment payment=PaymentFactory.getPayment("UPI");
        payment.pay();
    }

}