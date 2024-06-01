/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author emaue
 */
public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander ();
        Bulbasaur bulbasaur = new Bulbasaur ();
        Pikachu pikachu = new Pikachu ();
        Squirtle squirtle = new Squirtle ();
    
        
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
        pikachu.atacarPunoTrueno();
        pikachu.atacarImpacTrueno();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();
       
       
        
    }
}
