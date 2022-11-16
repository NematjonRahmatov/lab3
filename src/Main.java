import Classes.Corp;
import Classes.Stock;
import Obj.*;

import java.awt.image.CropImageFilter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Corp big = new ArbuzCorp();
        System.out.println(big.getName() + " is a bigger Corp");
        System.out.println(big.getPrice() + " USD");
        System.out.println(Stock.PricetoRUB(big.getPrice()) + " RUB");
        System.out.println(big.getType());
        Corp[] korotishka = new Corp[25];
        for(int i = 0; i <= 24;  i++){
            String name = "Коротышка " + i;
            korotishka[i] = new Corp(name, new Random().nextInt(1,100));
            System.out.println(korotishka[i].getPrice());
        }
    }
}