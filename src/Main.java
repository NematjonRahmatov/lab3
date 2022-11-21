import Classes.Client;
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
        System.out.println();
        Corp[] korotishka = new Corp[25];
        for(int i = 0; i <= 24;  i++){
            String name = "Коротышка " + i;
            korotishka[i] = new Corp(name, new Random().nextInt(1,50));
            //System.out.println(korotishka[i].getPrice());
        }
        int[] fivesmallbig = new int[5];
        int s = 0;
        while(s < 5){
            int ii = new Random().nextInt(0, 24);
            korotishka[ii].addPrice((new Random().nextInt(20,50)));
            if(s > 0 && fivesmallbig[s - 1] != ii && korotishka[ii].getPrice() > 100){
                fivesmallbig[s] = ii;
                s = s + 1;
            }
            if(s == 0 && korotishka[ii].getPrice() > 100){
                fivesmallbig[s] = ii;
                s = s + 1;
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(korotishka[fivesmallbig[i]].getName() + " залез на вершину арбуза");
        }
        System.out.println();
        Cucumber[] Cucumbers = new Cucumber[8];
        for(int i = 0; i < 8;  i++){
            String name = "Cucumber " + i;
            Cucumbers[i] = new Cucumber(name);
            System.out.println(Cucumbers[i].toString());
        }
        System.out.println();
        Neznayka Neznayka = new Neznayka();
        System.out.println(Neznayka);
        System.out.println();

        Stock.BuyStock(Neznayka, Cucumbers[0], 10);
        System.out.println(Cucumbers[0].getPrice());
        System.out.println();
        System.out.println(Neznayka.stocks());
        System.out.println();
        System.out.println(Neznayka.inScafandara());
        System.out.println(Neznayka.gotoKosmos());
        System.out.println();
        Sedenkiy Sed = new Sedenkiy();
        while(Sed.countOfStocks() < 10){
            if(new Random().nextInt(1,2) == 1){
                int ii = new Random().nextInt(0, 24);
                int price = new Random().nextInt(1,20);
                Stock.BuyStock(Sed, korotishka[ii], price);
            }
            else{
                int ii = new Random().nextInt(0, 8);
                int price = new Random().nextInt(1,20);
                Stock.BuyStock(Sed, Cucumbers[ii], price);
            }
        }

        System.out.println();
        System.out.println(Sed.stocks());
        System.out.println(Sed.addMoney(1));

    }
}