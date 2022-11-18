package Interfaces;

import Classes.Corp;

public interface ClientIn {
    double getMoney();
    String addMoney(double money);
    void MinusMoney(double money);
    void addStock(Corp cp);
    String Stocks();
    int countOfStocks();

}
