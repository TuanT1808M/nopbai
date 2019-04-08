package JV2_Session2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyGenericArraylist {
    public static void main(String[] args) {
        Show();
    }
    public static <N> void Show(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Scanner nhap=new Scanner(System.in);
            System.out.println("Nhap so "+i+" : ");
            i=nhap.nextInt();
            arrayList.add(i);
    }
        System.out.println(arrayList);

}
}
