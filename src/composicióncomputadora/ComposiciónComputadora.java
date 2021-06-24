/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicióncomputadora;

import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Teclado;
import ico.fes.componentes.Mouse;


/**
 *
 * @author sayun
 */
public class ComposiciónComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Computadora c1 = new Computadora new CPU("Intel core ","i9 10900K ", DDR4-2933  ), new Monitor("Asus", "ProArt", 32), new ());
    Computadora c1 = new Computadora (new CPU("Intel core", "i9 10900K",3), new Monitor("Asus", "ProArt", 32), new Mouse("Razer", "Deathadder Essential", "Óptico"), new Teclado("Keychron", "K6", 68, 0));
    System.out.println(c1);
    }
}
