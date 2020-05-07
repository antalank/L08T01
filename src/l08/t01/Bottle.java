/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l08.t01;

/**
 *
 * @author Antti-Pekka
 */
public class Bottle {
    
    private String name = "Pepsi Max";
    private String manufacturer = "Pepsi";
    private float total_energy = 0.3f;
    private float price = 1.80f;
    private float size = 0.5f;
    
    public Bottle(String name, String manufacturer, float total_energy, float price, float size) {
            this.name = name;
            this.manufacturer = manufacturer;
            this.total_energy = total_energy;
            this.price = price;
            this.size = size;
            
    }   
    public String getName() {
            return name;
    }
    
    public String getManufacturer() {   
        return manufacturer;
    }
        
    public float getEnergy() {
           return total_energy;
    }
    
    public float getPrice() {
            return price;
    }

    public void printBottles() {
        
        System.out.println("Nimi: " + name);
        System.out.println("    Koko: " + size + "  Hinta: " + price);
        
    }
}
