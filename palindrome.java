
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
public class palindrome {
    public static void main(String[] arg){
        int sum=0,n,i,a;
        System.out.println("enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        a=n;
        while(n>0)
        {
            i=n%10;
            sum=(sum*10)+i;
            n=n/10;
        }
        if(a==sum)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
    
}
