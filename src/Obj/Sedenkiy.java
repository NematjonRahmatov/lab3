package Obj;

import Classes.Client;

public class Sedenkiy extends Client {
    public Sedenkiy() {
        super("Sedenkiy", 100000);
    }

    @Override
    public String toString() {
        return "Sedenkiy богатый! Ему подарил Миг!";
    }
}
