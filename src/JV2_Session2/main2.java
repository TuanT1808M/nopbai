package JV2_Session2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
ShowRandomNumber(1532);
    }
    public static <N> void ShowRandomNumber(N n) {
        Random rd=new Random();
        if (n instanceof Integer) {
            Integer x = rd.nextInt();
            while (x<=(Integer)n){
                x=rd.nextInt();

            }
System.out.println("Random Number : "+x);
        }
        else if(n instanceof Double) {
            Double x = rd.nextDouble();
            while (x <= (Double) n) {
                x = rd.nextDouble();
            }

            System.out.println("Random number : " + x);
        }
        else {
            System.out.println("Khong tin duoc .");
        }





    }
}
