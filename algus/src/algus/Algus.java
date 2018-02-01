/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 * Esimene katsetus. Muutujad, valik, massiiv
 * @author if17
 */
public class Algus {
    
    /**
     * Alamprogramm toa soojuse hindamiseks vastavalt temperatuurile.
     * Vähemasti kolm taset
     */
    
    public static void toaTemp(int temperatuur){
        if(temperatuur >= 30) {
            System.out.println("Ei kannata enam");
        } else { 
            if(temperatuur < 15) {
                System.out.println("Pane vähe juurde")
            }
        }
        
    }
    
    /**
     * Arvamus ilma kohta
     */
    
    public static void ilmaKommentaar(int temperatuur) {
        if (temperatuur > 0) {
            System.out.println("Sulab");
        } else {
            System.out.println("Jäätub");
        }
    }
    /**
     * Programmi alguskoht
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World");
        ilmaKommentaar(3);
        ilmaKommentaar(-2);
        toaTemp(33);
        
       
        
    }
    
}
