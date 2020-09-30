package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {


    private final Duck5 dack;

    @Autowired
    public Rabbit4(Duck5 dack) {
        this.dack = dack;
    }


    @Override
    public String toString() {
        return ", в зайце утка " + dack.toString();
    }
}
