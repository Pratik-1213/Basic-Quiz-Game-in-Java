package Java_Microproject;

import java.util.*;
import Java_Microproject.Quiz_GK;
import Java_Microproject.Quiz_Comp;

public class Quiz_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        System.out.println("Welcome the Quiz Menia : ");

        System.out.println("Which Type of Quiz you would Like To Solve : \n1.General Quiz\n2.Compter Engg Quiz");
        int ch;
        System.out.println("Enter the Choice : ");
        ch = s.nextInt();

        Login l = new Login();
        if (ch == 1) {
            l.Enter();
            Quiz_GK.main("General Quiz");
            cnt = 1;
        } else if (ch == 2) {
            l.Enter();
            Quiz_Comp.main();
            cnt = 2;
        }

        try {
            if (cnt != 1 || cnt != 2) {
                throw new Exception("Invalid Number");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            s.close();
        }

    }
}
