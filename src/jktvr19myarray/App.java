/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19myarray;


import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("===rabota s array====");
        
            int myArr[] = new int[20];
            Random random = new Random();
            
            for (int i = 0; i< myArr.length; i++){
                while (true){
                int num = random.nextInt(19-0+1)-0;    
                
                if(num % 2 == 0){
                    myArr[i]= num;
                    break;
                }
                
                }
            }
         // System.out.
         for(int n : myArr) {
            
             if(n>9){
             System.out.printf("%-3d", n);
         }else{
        System.out.printf("0%-2d",n);
        }
    }
         System.out.println();
         int max = 0;
         int min = 20;
         int sum = 0;
         for (int n : myArr) {
             if(n >max) max = n;
             if(n <min) max = n;
             sum += n;//sum = sum +n;
         }
         double result = (double)(sum - min - max) / myArr.length-2;
         System.out.printlf("Среднее арифметическое без учета минимального и максимального числа: %-5.2f%n",result);   
         
}
}

