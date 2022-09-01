/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.entidades;

/**
 *
 * @author Juan
 */
public class Equipo {
    private Jugador[] jugadores;
    private int puntero;
    
    public Equipo(){
        this.jugadores = new Jugador[8];
        puntero = 0;
    }
    
    public void addJugador(Jugador jugador){
        this.jugadores[puntero] = jugador;
        this.puntero++;
    }
    
    public void eliminarJugador(int pos){
        for(int i=pos;i<puntero-1;i++){
            this.jugadores[i] = this.jugadores[i+1];
        }
        this.jugadores[puntero-1] = null;
        puntero--;
    }
    
    public void VerEquipo(){
        for(int i=0; i<puntero; i++){
            System.out.println("************************************************ Jugador " +
                    (i + 1) + " ************************************************");
            jugadores[i].VerInfo();
        }
    }
}
