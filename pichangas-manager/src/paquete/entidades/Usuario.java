/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.entidades;

import java.time.*; 

/**
 *
 * @author Juan
 */
public class Usuario {
    private final int id;
    private final String nombres;
    private final String apellidos;
    private int edad;
    private int dd_nac;
    private int mm_nac;
    private int aa_nac;
    private int celular;
    private String email;
    
    public Usuario(int id, String nombres, String apellidos, int dd_nac, int mm_nac, int aa_nac, int celular, String email){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dd_nac = dd_nac;
        this.mm_nac = mm_nac;
        this.aa_nac = aa_nac;
        this.celular = celular;
        this.email = email;
        this.edad = CalcularEdad(dd_nac, mm_nac, aa_nac);        
    }
    
    public void SetFechaNacimiento(int dd, int mm, int aa){
        this.dd_nac = dd;
        this.mm_nac = mm;
        this.aa_nac = aa;
        this.edad = CalcularEdad(dd_nac, mm_nac, aa_nac);
    }
    
    public void SetCelular(int celular){
        this.celular = celular;
    }
    
    public void SetCelular(String email){
        this.email = email;
    }
    
    private int CalcularEdad(int dd_nac, int mm_nac, int aa_nac){
        LocalDate dob = LocalDate.of(aa_nac, mm_nac, dd_nac);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);        
        return period.getYears();
    }
    
    public void VerInfo(){
        System.out.println(id + ". Nombre completo: " + nombres + " " + apellidos + 
                "\nEdad: " + edad +
                "\nCelular: " + celular + 
                "\nEmail: " + email);
    }
}
