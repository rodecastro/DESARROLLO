/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author Ro de Castro
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    private int legajo;
    private String nombre;
    private int edad; 
    private String curso;
    
    public Estudiantes(){}
    public Estudiantes (int l,String n,int e, String c){
    this.legajo= l; 
    this.nombre= n;
    this.edad= e;
    this.curso=c; 
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    int a= 1;
    int i; 
    Estudiantes java[] = new Estudiantes [a];
    for (i=0; i<java.length; i++){
        java[i] = new Estudiantes ();
        java[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("ingrese legajo")));
        java[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));        
        java[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("ingrese edad")));
        java[i].setCurso(JOptionPane.showInputDialog("Ingrese el curso"));
        }
    for (i=0; i<java.length; i++){
        JOptionPane.showMessageDialog (null,java[i].getLegajo() + "," + java[i].getNombre()+","+java[i].getEdad()+" años, "+java[i].getCurso());
        {
        
}}}}

