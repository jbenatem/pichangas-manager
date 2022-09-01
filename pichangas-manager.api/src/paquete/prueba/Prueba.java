/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.entidades.*;

/**
 *
 * @author Juan
 */
public class Prueba {
    public static void main(String[] args) {
        Jugador obj1;
        //obj1.VerInfo();
        
        Jugador obj2; 
        
        Equipo team1 = new Equipo();
        String[] pos1 = new String[3];
        pos1[0] = "LTD";
        pos1[1] = "EXD";
        pos1[2] = "DC";
        Equipo team2 = new Equipo();
        for(int i=0; i<8; i++){
            obj1 = new Jugador(i+1,"Juan Domingo","Benate Mendoza",16,1,1998,989022161,"jbenatem@gmail.com", pos1, 5.0);
            team1.addJugador(obj1);
        }
        for(int i=0; i<8; i++){
            obj2 = new Jugador(i+100,"Santiago Lionel","Benate Zuñiga",11,9,2000,987654321,"sbenatez@gmail.com", pos1, 5.0);
            team2.addJugador(obj2);
        }
        team2.eliminarJugador(4);
        //team1.VerEquipo();
        
        Pichanga pichanga1 = new Pichanga();
        pichanga1.addEquipo(team1);
        pichanga1.addEquipo(team2);
        pichanga1.VerEquipos();
    }
}
