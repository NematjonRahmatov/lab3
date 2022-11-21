package Classes;

import Enums.CorpType;

public class Corp extends Stock{
    public String name;
    public double price = 0;
    public CorpType Type = CorpType.NORMAL;

    public Corp(String name, double price){
        super(price);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public boolean setType(CorpType Type){
        this.Type = Type;
        return true;
    }
    public CorpType getType(){
        return Type;
    }

    @Override
    public boolean setPrice(double price) {
        this.price = price;
        return true;
    }

    @Override
    public void describe(String txt) {
        super.describe(txt);
    }

    @Override
    public void info() {
        this.describe("Corparation!");
    }
}
