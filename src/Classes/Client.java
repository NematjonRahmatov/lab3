package Classes;

import Interfaces.ClientIn;

import java.util.ArrayList;
import java.util.List;

public class Client implements ClientIn {
    String name;
    double money = 0;

    List<Corp> cp = new ArrayList<>();

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "I am a sample people! I want to be a rich!";
    }

    public double getMoney(){
        return this.money;
    }

    public String addMoney(double money){
        this.money = this.money + money;
        return "Вам начислино " + money + " USD";
    }

    public void MinusMoney(double money){
        this.money = this.money - money;
    }

    public void addStock(Corp cp){
        this.cp.add(cp);
    }

    public String Stocks(){
        String s = "";
        if(!this.cp.isEmpty()){
            for(Corp e: this.cp){
                s = s + (e.getName()) + " ";
            }
            return "Акции: " + s;
        }else {
            return "Нету акций у тебя!";
        }
    }

    public int countOfStocks(){
        return this.cp.size();
    }
}
