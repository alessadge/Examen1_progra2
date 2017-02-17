



public class Persona {
    protected String nombre;
    protected String edad;
    protected String ID;
    protected String boleto;
    protected String departamentos;
    protected String dinero;
    protected String empleo;

    public Persona() {
    }

    public Persona(String nombre, String edad, String ID, String boleto, String dinero, String empleo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.boleto = boleto;
        this.dinero = dinero;
        this.empleo=empleo;
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

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
