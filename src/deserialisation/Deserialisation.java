package deserialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user;
        FileInputStream fIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fIn);
        user = (User) in.readObject();
        in.close();
        fIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayhello();
    }
}