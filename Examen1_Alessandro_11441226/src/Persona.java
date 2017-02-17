
import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String edad;
    private String ID;
    private String boleto;
    private String departamentos;
    private String dinero;

    public Persona() {
    }

    public Persona(String nombre, String edad, String ID, String boleto, String dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.boleto = boleto;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + ", boleto=" + boleto + ", departamentos=" + departamentos + ", dinero=" + dinero + '}';
    }
    
    
}
