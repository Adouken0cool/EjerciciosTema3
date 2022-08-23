package ejerciciostema3;

public class Main {
    public static void main(String[] args) {
        String mes = "Enero";
        boolean resultado = mes.equals("Febrero");

        if (mes.equals("Enero")) {
            System.out.println("Inicio del A;o");
        } else if (mes.equals("Febrero")) {
            System.out.println("Segundo mes del A;o");
        } else if (mes.equals("Marzo")) {
            System.out.println("Tercer mes del A;o");
        } else if (mes.equals("Abril")) {
            System.out.println("Cuarto mes del A;o");
        } else if (mes.equals("Mayo")) {
            System.out.println("Quinto mes del A;o");
        } else if (mes.equals("Junio")) {
            System.out.println("Mitad del A;o");
        }
        else {
            System.out.println("NO es un Mes valido");
        }
    }
}