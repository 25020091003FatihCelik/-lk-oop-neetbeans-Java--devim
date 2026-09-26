
package com.mycompany.bolm9_1;

public class test_kısmı {
    double width;
    double hight;
    
   public test_kısmı (){
    width = 1;
    hight =1;
    }
    public test_kısmı (double w ,double h){
    width = w;
    hight = h ;
    } 
    double getcevre(){
    return 2*(width + hight) ;
    }
    double getAlan(){
    
    return width * hight ;
    }
   }

