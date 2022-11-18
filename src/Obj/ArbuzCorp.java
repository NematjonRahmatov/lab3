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
    public String toString() {
        return "I am a Arbuz! I am a biggest Corp!";
    }
}
