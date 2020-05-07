/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l08.t01;

import java.util.ArrayList;

/**
 *
 * @author Antti-Pekka Alanko-Luopa
 */
public class BottleDispenser {
    private int bottles;
    private float money;
    
    private static BottleDispenser bd = new BottleDispenser();
    
    private BottleDispenser() {
        bottles = 5;
        money = 0;
}
    public static BottleDispenser getInstance() {
        return bd;
    }
    
    public void addMoney() {
        money += 1;
        
              System.out.println("Klink! Lisää rahaa laitteeseen!");  
        
}
    public int buyBottle() {
        ArrayList<Bottle> bottleList = new ArrayList();
        if (bottles > 0) {
            bottles -= 1;
    
        
            if (money <= 0 || money < 1.80) {
                System.out.println("Syötä rahaa ensin!");
               
            }
            else {
                
               return 1;   
            }}return 2;}
    public void calculateMoney(float summa) {
        money = money - summa;
    }
    public void returnMoney() {
        System.out.print("Klink klink. Sinne menivät rahat! Rahaa tuli ulos ");
        System.out.printf("%.2f", money);
        System.out.println("€");
       
        
        money = 0;
}
    
}
