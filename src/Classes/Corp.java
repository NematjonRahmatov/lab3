package Classes;

import Enums.CorpType;

public class Corp extends Stock{
    String name;
    double price = 0;
    CorpType Type = CorpType.Normal;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public Corp(String name, double price){
        super(price);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setType(CorpType Type){
        this.Type = Type;
    }
    public CorpType getType(){
        return Type;
    }
}
