package Obj;

import Classes.Corp;
import Enums.CorpType;

import java.lang.reflect.Type;

public class ArbuzCorp extends Corp {
    public ArbuzCorp() {
        super("ArbuzCorp Inc.", 150.4);
        this.setType(CorpType.Big);
    }

    @Override
    public void describe(String txt) {
        super.describe(txt);
    }
    @Override
    public void info() {
        this.describe("I am a Arbuz! I am a biggest Corp!");
    }
}
