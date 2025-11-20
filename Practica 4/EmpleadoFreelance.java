public class EmpleadoFreelance extends Empleado implements Beneficiable {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, String id, int horasTrabajadas, double tarifaHora) {
        super(nombre, id, 0);  // salarioBase no aplica, pero se usa para el contrato
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        double salario = horasTrabajadas * tarifaHora;
        return salario + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        double salario = horasTrabajadas * tarifaHora;
        if (horasTrabajadas > 160) {
            return salario * 0.05; // 5%
        }
        return 0;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        double total = calcularSalario();
        return total * 0.03; // 3%
    }
}
