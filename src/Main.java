// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FDP TECHNOLOGY");

        String[] nombres = {"Erika Thompson", "Salvador Durand", "Cayetana Velez", "Eduardo Higashi",
                "Juan Perez", "Erick Mogollon", "Asier Ibanez", "Maria Goicochea",
                "Paola Ocampo", "Justo Santacruz", "Rafael Loza", "Diana Salvatierra",
                "Samuel Smith", "Aurelio Sotomayor", "Sofia Aguayo", "Steve Leon", "Luciana Cabello", "Billy Vasquez", "Renzo Diaz", "Belen velarne", "Alvaro Prado"};

        int[] dni = {80988442, 12345678, 87654321, 11110000,
                32359245, 78507914, 51479881, 21856550,
                85958984, 79610293, 51626745, 40540467,
                72807291, 17158555, 45449496, 60051530, 80813847, 60164066, 45526684, 73090594, 72524889 };

        String[] puestos = {"Gerente", "Jefe de Ventas", "Vendedor", "Vendedor",
                "Supervisor", "Supervisor", "Gerente de Logistica", "Secretaria",
                "Asistente de Logistica", "Gerente de RRHH", "Asistente de RRHH", "Capacitacion",
                "Gerente de Finanzas", "Vendedor", "Vendedor", "Vendedor", "Vendedor", "Soporte", "Soporte", "Soporte", "Soporte" };

        String[] areas = {"Gerencia", "Jefatura", "Ventas", "Ventas",
                "Ventas", "Ventas", "Supply Chain", "Gerencia",
                "Supply Chain", "RRHH", "RRHH", "RRHH",
                "Finanzas", "Ventas", "Ventas", "Ventas", "Ventas", "IT", "IT", "IT", "IT"  };

        Scanner scanner = new Scanner(System.in);

        int dniIngresado;
        int indice;

        do {
            System.out.print("Ingrese el DNI: ");
            dniIngresado = scanner.nextInt();

            indice = -1;
            for (int i = 0; i < dni.length; i++) {
                if (dni[i] == dniIngresado) {
                    indice = i;
                    break;
                }
            }

            if (indice == -1) {
                System.out.println("DOCUMENTO NO REGISTRADO");
            }
        } while (indice == -1);

        int horaIngresada;
        int minutosIngresados;

        do {
            System.out.print("Ingrese la hora (en formato 24 horas): ");
            horaIngresada = scanner.nextInt();

            if (horaIngresada < 0 || horaIngresada > 23) {
                System.out.println("Hora no válida. Ingrese nuevamente.");
            }
        } while (horaIngresada < 0 || horaIngresada > 23);

        do {
            System.out.print("Ingrese los minutos: ");
            minutosIngresados = scanner.nextInt();

            if (minutosIngresados < 0 || minutosIngresados > 59) {
                System.out.println("Minutos no válidos. Ingrese nuevamente.");
            }
        } while (minutosIngresados < 0 || minutosIngresados > 59);

        System.out.println();

        if (horaIngresada > 9 || (horaIngresada == 9 && minutosIngresados > 0)) {
            System.out.println("TARDANZA");
        } else {
            System.out.println("INGRESO PUNTUAL");
        }

        System.out.println("Nombre: " + nombres[indice]);
        System.out.println("DNI: " + dni[indice]);
        System.out.println("Puesto: " + puestos[indice]);
        System.out.println("Área: " + areas[indice]);
        System.out.println("ASISTENCIA DE ENTRADA EXITOSA");
        System.out.println("Hora Registrada: " + String.format("%02d:%02d", horaIngresada, minutosIngresados));
    }
}
