package Classes;

import Interfaces.CorpIn;

public class Stock implements CorpIn {
    double price;

    public Stock(double price){
        this.price = price;
    }
    @Override
    public boolean setPrice(double price){
        this.price = price;
        return true;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public void addPrice(double n) {
        this.price = price + n;
    }

    public static double PricetoRUB(double price){
        return (price * 60.32);
    }

    public static void BuyStock(Client cl, Corp c, double price){
        if (cl.getMoney() >= price) {
            if ((c.getPrice() / 100) * 20 > price) {
                c.addPrice(price);
                System.out.println(cl.name + " купил акцию " + c.getName()); //todo refactoring
                cl.minusMoney(price);
                cl.addStock(c);
            } else {
                System.out.println("Не получиться купить акции " + c.getName());
            }
        }else{
            System.out.println("Не достаточно денег!");
        }
    }
}
