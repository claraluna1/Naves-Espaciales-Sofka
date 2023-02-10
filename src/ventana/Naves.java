
package ventana;

public class Naves {
    
    private String nombre, pais, tipoNave, combustible, descripcion;

    public Naves(String nombre, String pais, String tipoNave, String combustible, String descripcion) {
        this.nombre = nombre;
        this.pais = pais;
        this.tipoNave = tipoNave;
        this.combustible = combustible;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public String toString(){
        return this.nombre +", " + this.tipoNave;
    }
}
