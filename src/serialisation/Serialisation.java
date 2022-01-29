package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Matty";
        user.password = "letmein";

        FileOutputStream fOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fOut);
        out.writeObject(user);
        out.close();
        fOut.close();

        System.out.println("Operation complete.");
    }
}
