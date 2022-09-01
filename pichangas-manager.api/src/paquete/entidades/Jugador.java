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
public class Jugador extends Usuario{
    private String[] posicion;
    private double puntaje;
    
    public Jugador(int id, String nombres, String apellidos, int dd_nac, int mm_nac, int aa_nac, int celular, String email, String[] posicion, double puntaje) {
        super(id, nombres, apellidos, dd_nac, mm_nac, aa_nac, celular, email);
        this.posicion = posicion;
        this.puntaje = puntaje;
    }
    
    public void SetPuntaje(double puntaje){
        this.puntaje = puntaje;
    }

    @Override
    public void VerInfo() {
        super.VerInfo();
        String posiciones = "";
        for(int i=0;i<3;i++){
            posiciones = posiciones + this.posicion[i];
            if(i<2){
                posiciones = posiciones + " - ";
            }
        }
        System.out.println("Posicion: " + posiciones +
                "\nPuntaje: " + this.puntaje);
    } 
    
}
