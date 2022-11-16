package Classes;

import Interfaces.CorpIn;

public class Stock implements CorpIn {
    double price;

    public Stock(double price){
        this.price = price;
    }
    @Override
    public void setPrice(double price){
        this.price = price;
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
}
