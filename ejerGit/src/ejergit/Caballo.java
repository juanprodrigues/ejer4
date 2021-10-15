/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejergit;

/**
 *
 * @author moebius
 */
public class Caballo {
   
    private String nombre;
    private String raza;
    private String pelaje;
    private String pais;
    private String sexo;
    private Integer edad;
    private Double altura;
    private Double peso;
    private Boolean registro;
    private Boolean marca;

    public Caballo() {
    }

    public Caballo(String nombre, String raza, String pelaje, String pais, String sexo, Integer edad, Double altura, Double peso, Boolean registro, Boolean marca) {
        this.nombre = nombre;
        this.raza = raza;
        this.pelaje = pelaje;
        this.pais = pais;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.registro = registro;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getRegistro() {
        return registro;
    }

    public void setRegistro(Boolean registro) {
        this.registro = registro;
    }

    public Boolean getMarca() {
        return marca;
    }

    public void setMarca(Boolean marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", pais=" + pais + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", registro=" + registro + ", marca=" + marca + '}';
    }
    
    
    
}
