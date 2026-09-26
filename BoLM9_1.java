
package com.mycompany.bolm9_1;


public class BoLM9_1 {

    public static void main(String[] args) {
        test_kısmı r1 = new test_kısmı(4,40);
        test_kısmı r2 = new test_kısmı();
        
        System.out.println("alan : "+" "+r1.getAlan()+" "+"çevre : "+ r1.getcevre());
        System.out.println("alan : "+" "+r2.getAlan()+ " "+ "çevre : "+ r2.getcevre());
    }
}
