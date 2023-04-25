package Entidad;

public class NIF {
    private String[] letra =  new String[22];
    private long DNI;

    public NIF() {
    }

    public NIF(String[] letra, long DNI) {
        this.letra = letra;
        this.DNI = DNI;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    
}
