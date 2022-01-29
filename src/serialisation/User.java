package serialisation;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    String password;

    public void sayhello() {
        System.out.println("Wagwan " + name);
    }
}