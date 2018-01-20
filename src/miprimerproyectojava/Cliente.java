
package miprimerproyectojava;
/* Estos son los atributos de la clase Cliente*/

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    
    /* Metodos dentro de la clase Cliente*/
    
    /*Metodo Set...*/
    public void setNombre(String nombre){
         this.nombre = nombre;    
    }
    
    public void setDireccion(String direccion){
         this.direccion = direccion;    
    }
    
    public void setTelefono(String telefono){
         this.telefono = telefono;    
    }
    
    public void setEdad(int edad){
         this.edad = edad;    
    }
    
    /* Metodo Get...*/
    public String getNombre(){
         return nombre;
    }
         
       
    public String getDireccion(){
         return direccion;
    }    
     
         
         
     public String getTelefono(){
         return telefono;
     }
         
     public int getEdad(){
         return edad;
    
    }
       
     
    
    
    
    
    }
