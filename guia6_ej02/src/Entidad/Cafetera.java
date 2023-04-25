package Entidad;

public class Cafetera {

    private int cantidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
     
    
}
