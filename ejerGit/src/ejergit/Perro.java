/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejergit;

/**
 *
 * @author Mariela
 */
public class Perro {
    private String nombre;
    private String apodo;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String apodo, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
