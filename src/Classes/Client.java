package Classes;

import Interfaces.ClientIn;

import java.util.ArrayList;
import java.util.List;

public class Client implements ClientIn {
    public String name;
    public double money = 0; //todo add modifiers
    public List<Corp> cp = new ArrayList<>();

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }

    public boolean addMoney(double money){
        if (money > 0) {
            this.money = this.money + money;
            this.describe(("Вам начислино " + money + " USD"));
            return true;
        }else{
            return false;
        }
    }

    public boolean minusMoney(double money){
        this.money = this.money - Math.abs(money);
        return true;
    }

    public boolean addStock(Corp cp){
        this.cp.add(cp);
        return true;
    }

    public boolean stocks(){
        String s = "";
        if(!this.cp.isEmpty()){
            for(Corp e: this.cp){
                s = s + (e.getName()) + " ";
            }
            this.describe(s);
            return true;
        }else {
            this.describe("Нету акций у тебя!");
            return false; //todo return object components instead of plain text
        }
    }

    public int countOfStocks(){
        return this.cp.size();
    }

    @Override
    public void describe(String txt) {
        System.out.println(txt);
    }

    @Override
    public void info() {
        this.describe("I am a sample people! I want to be a rich!");
    }
}
