package Java_Microproject;

import java.util.*;

public class Login {

    Scanner s = new Scanner(System.in);

    public void Enter() {
        String user, Pass;
        System.out.println("Enter username : ");
        user = s.nextLine();
        System.out.println("Enter Password : ");
        Pass = s.nextLine();

        main(user, Pass);
    }

    public static void main(String username, String password) {
        String u = "Pratik_1213", p = "BSIET@1213";
        if (!username.equals(u) && password.equals(p)) {
            System.out.println("Invalid Username And Password");
            System.exit(0);
        } else {
            System.out.println("login Successfull");
        }
    }
}
