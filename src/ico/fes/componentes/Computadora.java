/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author sayun
 */
public class Computadora {
 private CPU cpu1;
 private Monitor mt1;
 private Mouse ms1;
 private Teclado t1;

    public Computadora() {
    }

    public Computadora(CPU cpu1, Monitor mt1, Mouse ms1, Teclado t1) {
        this.cpu1 = cpu1;
        this.mt1 = mt1;
        this.ms1 = ms1;
        this.t1 = t1;
    }

    public Teclado getT1() {
        return t1;
    }

    public void setT1(Teclado t1) {
        this.t1 = t1;
    }

    public CPU getCpu1() {
        return cpu1;
    }

    public void setCpu1(CPU cpu1) {
        this.cpu1 = cpu1;
    }

    public Monitor getMt1() {
        return mt1;
    }

    public void setMt1(Monitor mt1) {
        this.mt1 = mt1;
    }

    public Mouse getMs1() {
        return ms1;
    }

    public void setMs1(Mouse ms1) {
        this.ms1 = ms1;
    }

    @Override
    public String toString() {
        return "Computadora{" + "\n" + cpu1 + "\n" + mt1 + "\n" + ms1 + "\n" + t1 + "\n" + '}';
    }
 
 
    
}
