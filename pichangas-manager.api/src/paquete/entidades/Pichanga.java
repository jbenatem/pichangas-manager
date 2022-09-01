/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.entidades;

import java.time.LocalDate;

/**
 *
 * @author Juan
 */
public class Pichanga {
    private Equipo[] equipos;
    private LocalDate fecha;
    private int puntero;
    
    public Pichanga(){
        this.fecha = LocalDate.now();
        this.equipos = new Equipo[2];
        this.puntero = 0;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public void addEquipo(Equipo equipo){
        this.equipos[puntero] = equipo;
        this.puntero++;
    }
    
    public void eliminarEquipo(int pos){
        for(int i=pos;i<puntero-1;i++){
            this.equipos[i] = this.equipos[i+1];
        }
        this.equipos[puntero-1] = null;
        puntero--;
    }
    
    public void VerEquipos(){
        for(int i=0; i<puntero; i++){
            System.out.println("//////////////////////////////////////////////// Equipo " +
                    (i + 1) + " ////////////////////////////////////////////////");
            equipos[i].VerEquipo();
        }
    }
}
