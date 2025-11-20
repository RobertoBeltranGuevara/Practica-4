public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto(
            "Roberto", "EMP001", 10000, 3, "Sistemas"
        );

        EmpleadoFreelance emp2 = new EmpleadoFreelance(
            "Hector", "EMP002", 170, 150
        );

        System.out.println("Empleado Tiempo Completo");
        emp1.mostrarInfo();
        System.out.println("Salario final: " + emp1.calcularSalario());
        System.out.println("Bonificación: " + emp1.calcularBonificacion());
        System.out.println("Seguro: " + emp1.aplicarDescuentoSeguro());

        System.out.println("\nEmpleado Freelance");
        emp2.mostrarInfo();
        System.out.println("Salario final: " + emp2.calcularSalario());
        System.out.println("Bonificación: " + emp2.calcularBonificacion());
        System.out.println("Seguro: " + emp2.aplicarDescuentoSeguro());
    }
}
