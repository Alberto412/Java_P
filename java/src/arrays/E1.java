package arrays;

import java.lang.reflect.Array;

public class E1 {
    public static void main(String[] args) {
        int[] arrDig1 ={0,1,2,3,4,5,6,7,8,9};
        int[] arrDig2 ={9,8,7,6,5,4,3,2,1,0};
        char[] arrCh1 ={'a','e','i','o','u'};
        char[] arrCh2 ={'a','b','c','d','e'};
        StringBuilder cadCh1 = new StringBuilder();
        StringBuilder cadCh2 = new StringBuilder();
        StringBuilder cadCh3 = new StringBuilder();


        for (char a : arrCh1){
            cadCh1.append(a);
        }
        for (char a : arrCh2){
            cadCh2.append(a);
        }
        for (int i=0;i<arrCh2.length;i++){
            cadCh3.append(arrCh1[i]);
            cadCh3.append(arrCh2[i]);

        }
        System.out.println(cadCh1);
        System.out.println(cadCh2);
        System.out.println(cadCh3);
        for (int i=0;i<arrDig2.length;i++){
            System.out.println(arrDig2[i]+arrDig1[i]);

        }






    }
}
