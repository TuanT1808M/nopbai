package JV2_Session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        plus(5,7,4,5);
        plus("aaa","bbb",6,7);
        MyGeneric<String> myGeneric=new MyGeneric<>();


    }
    public static <E,X,Y> void plus(E a,E b,X x,Y y){
        if (a instanceof Integer){
            Integer k=(Integer)a+(Integer)b;
            System.out.println(k);
            //return a;
        }
        else if (a instanceof Double){
            Double k=(Double)a+(Double)b;
            System.out.println(k);
           //return a;
        }
        else {
            System.out.println("Khong tinh toan dc \nThao ngu .");
           //  return null;
        }
    }
    public static <T> T changeValue(T obj){
        return obj;
    }

}
