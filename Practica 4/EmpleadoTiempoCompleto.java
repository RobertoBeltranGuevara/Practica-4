public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable {

    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase,
                                  int antiguedad, String departamento) {
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.10 * antiguedad;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        double total = calcularSalario();
        return total * 0.05;  // 5%
    }
}
