
package Entidad;

public class Persona {
    //creo los atributos: primero como publicos y luego pasan a privados para cambiar los datos
    private String nombre;
    private int edad;
    private String apodo;
    
    //dato utilizado para el metodo "caminar"
    private int energia;
    
    //Creo los constructores de la clase: uno vacio y otro lleno de los atributos que quiero usar
    public Persona(){
        this.energia = 1000;
    }

    public Persona(String nombre, int edad, String apodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.energia = 1000;
    }
    
    //Creo los modificadores set (cambiar) y get (mostrar) para cada atributo que deseo modificar

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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    //Realizo un metodo funcional
  
    public int caminar(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
         energia -= energiaRestar;   
        }
        
        
        return energia;
    }

    //Creo la variable toString para mostrar todos los datos de forma automatica
    //Requiere actualizacion cada vez que agrego un atributo nuevo o metodo
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apodo=" + apodo + '}';
    }
    
    

    

 




}
