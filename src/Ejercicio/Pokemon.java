/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author emaue
 */
 public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected int pesoPokemon;
    protected int temporadaQueAparece;
    protected String tipo;

   
     public abstract void atacarPlacaje();
     public abstract void acatarArañazo();
     public abstract void atacarMordisco();

    public Pokemon() {
    }

    public Pokemon(int num_pokedex, String nombrePokemon, int pesoPokemon, int temporadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

     
     
    
}
