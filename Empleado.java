public class Empleado {
    private final String nombre;
    private final String cargo;
    private final double salario;
    /*
    constructor empleado
    
    */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    /*
    metodos get
    */
    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("Empleado{nombre='%s', cargo='%s', salario=%.2f}", nombre, cargo, salario);
    }
}
