package Interfaces;
import Classes.Stock;

public interface ClientIn extends Info{
    double getMoney();
    boolean addMoney(double money);
    boolean minusMoney(double money);
    boolean addStock(Stock cp);
    boolean stocks();
    int countOfStocks();
}
