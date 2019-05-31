/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        int item = 0;
        int limit = 10;
        int menu = 0 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("1 for Add Item");
        System.out.println("2 for Remove Item");
        System.out.println("3 for Show Amount");
        System.out.print("Choose your action : ");
        menu = sc.nextInt();
        if (menu == 1) {
            int amountAdd = 0;
            System.out.print("How many will you add :");
            amountAdd = sc.nextInt( );
            if (item + amountAdd <= limit) {
                item = amountAdd +  item;
                System.out.println("Your amount of item in cargo is : " + item);
            } else {
                System.out.println("Your cargo is Full!!");
            }
        }
        if (menu == 2) {
            int amountDel = 0;
            System.out.print("How many will you take out : ");
            if(item - amountDel >= 0) {
                item = item - amountDel;
                System.out.println("Your amount of item in cargo is : " + item);    
            } else {
                System.out.println("Your cargo has less than you want!!");
            }
        }
        if (menu == 3) {
            System.out.println("Your amount of item in cargo is : " + item);
        }
    }}