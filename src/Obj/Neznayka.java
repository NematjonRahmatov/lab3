package Obj;

import Classes.Client;
import Classes.Stock;

public class Neznayka extends Client {

    public Neznayka() {
        super("Neznayka", 50);
    }

    public String inScafandara(){
        if (this.getMoney() > 0) {
            return "Neznayka готов к полёту!";
        }else{
            return "Neznayka не готов к полёту!";
        }
    }

    public String gotoKosmos(){
        if (this.getMoney() > 0) {
            return "Neznayka в Космосе!\nNeznayka в акционерное общество!\nАкционерное общество гигантских растений -- путь к богатству и процветанию.\nЦена 1 фертинг";
        }else {
            return "Neznayka не готов к полёту!";
        }
    }
}
