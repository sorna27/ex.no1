
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
public class minimum {
public static void main(String[] args) {
        int c,a,b;
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=(a<b)?a:b;
        System.out.println(c+"is minimum");
        
        // TODO code application logic here
    }
}
