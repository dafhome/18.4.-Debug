public class Partido {
    
    private String nombre;
    private int escanos;
    private int porcentaje;

    public Partido(String nombre, int escanos, int porcentaje) {
        this.nombre = nombre;
        this.escanos = escanos;
        this.porcentaje = porcentaje;
    }
    public Partido() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEscanos() {
        return escanos;
    }
    public void setEscanos(int escanos) {
        this.escanos = escanos;
    }
    public int getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "El partido " + nombre + ", ha obtenido " + escanos + " escaños.";
    }
    public String toString2() {
        return "El partido " + nombre + ", ha obtenido " + escanos + " escaños con un porcentaje de "+porcentaje+"%";
    }
    
}
