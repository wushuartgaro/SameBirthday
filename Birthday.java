/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CJR
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Birthday {

    
    private static double calculateSameBirthdate(int n){
        double noOfDays = 365;
        double sum = noOfDays/noOfDays;
        double pointer = noOfDays - 1;
        for (int i = 0; i<n-1 ; i++){
            sum *= (pointer/noOfDays);
            pointer--;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of person(s) : ");                
        int n = reader.nextInt();
        double p = calculateSameBirthdate(n)*100;
        System.out.println("Probability of not having same birthday: "+p+"%");
        System.out.println("Probability of having same birthday: "+(100-p)+"%");
    }
    
}
