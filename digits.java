
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
public class digits {
    public static void main(String[] arg){
        int n,i=0,d;
        int s[]=new int[10];
        System.out.println("enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n>0)
        {
            d=n%10;
            s[i]=d;
            n=n/10;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            switch(s[j])
            {
                case 0:System.out.println("zero");
                    break;
                case 1:System.out.println("one");
                    break;
                case 2:System.out.println("two");
                    break;
                case 3:System.out.println("three");
                    break;
                case 4:System.out.println("four");
                    break;
                case 5:System.out.println("five");
                    break;
                case 6:System.out.println("six");
                    break;
                case 7:System.out.println("seven");
                    break;
                case 8:System.out.println("eight");
                    break;
                case 9:System.out.println("nine");
                    break;
                    
            }
        }
        
    }
}
