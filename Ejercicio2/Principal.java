/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


public class Principal 
{
    private int id;
    private int precio;
    private String nombre;
    private String autor;
    private String descripcion;

    public Principal() 
    {
        this.id = 0;
        this.precio = 0;
        this.nombre = null;
        this.autor = null;
        this.descripcion = null;
    }
    

    public Principal(int id, int precio, String nombre, String autor, String descripcion) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getDatos()
    {
        return "ID :"+id+
                "\nNombre :"+nombre+
                "\nAutor :"+autor+
                "\nDescripcion : "+descripcion+
                "\nPrecio : "+precio;
    }
 
  
    
}
