/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l08.t01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antti-Pekka Alanko-Luopa
 */
public class L08T01 {

   public static void main(String[] args) {
       
        BottleDispenser pullo = BottleDispenser.getInstance();
        
        ArrayList<Bottle> bottleList = new ArrayList();
        
        bottleList.add(new Bottle("Pepsi Max", "Pepsi", 0.3f, 1.8f, 0.5f));
        bottleList.add(new Bottle("Pepsi Max", "Pepsi", 0.3f, 2.2f, 1.5f));
        bottleList.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3f, 2.0f, 0.5f));
        bottleList.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3f, 2.5f, 1.5f));
        bottleList.add(new Bottle("Fanta Zero", "Coca-Cola", 0.3f, 1.95f, 0.5f));
        bottleList.add(new Bottle("Fanta Zero", "Coca-Cola", 0.3f, 1.95f, 0.5f));

        
        int valinta = 0;
        int a = 1;
        do {
            System.out.print("\n");
            System.out.println("*** LIMSA-AUTOMAATTI ***");
            System.out.println("1) Lisää rahaa koneeseen");
            System.out.println("2) Osta pullo");
            System.out.println("3) Ota rahat ulos");
            System.out.println("4) Listaa koneessa olevat pullot");
            System.out.println("0) Lopeta");
            
            System.out.print("Valintasi: ");
            Scanner scan = new Scanner(System.in);
            valinta = scan.nextInt();
            
            switch (valinta) {
                case 1:
                    pullo.addMoney();
                    break;
                case 2:
                    int paluu = 0;
                    paluu = pullo.buyBottle();
                    
                    if (paluu == 1) {
                        for (Bottle bt : bottleList) {
                            System.out.print(a + ". ");
                            bt.printBottles();
                            a++;
                        }   a = 1;
                    
                        int valinta_pullo = 0;
                        System.out.print("Valintasi: ");
                        Scanner scan1 = new Scanner(System.in);
                        valinta_pullo = scan1.nextInt();
                    
                    
                        System.out.println("KACHUNK! " + bottleList.get(valinta_pullo - 1).getName() + " tipahti masiinasta!");
                        
                        float vahennys = bottleList.get(valinta_pullo - 1).getPrice();
                        pullo.calculateMoney(vahennys);
                        bottleList.remove(valinta_pullo - 1);
                    }
                    break;
                case 3:
                    pullo.returnMoney();
                    break;   
                case 4:
                    for (Bottle bt : bottleList) {
                        System.out.print(a + ". ");
                        bt.printBottles();
                        a++;
                    } a = 1;
                    break; 
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("Väärä syöte.");
                
            }
         } while (valinta != 0);
        
    }
}
