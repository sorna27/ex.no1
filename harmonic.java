
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class harmonic {
    public static void main(String[] arg){
        int n;
        float i,sum=0;
        System.out.println("enter the limit:");
        Scanner obj= new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println(sum);
        
        
    }
}
