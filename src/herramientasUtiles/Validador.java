package herramientasUtiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {

    //VALIDA UN ENTERO
    public static int validarEntero(Scanner sc) {
        int opcion;
        while (true) {
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion > 0) return opcion;
                else System.out.println("Debes ingresar un numero mayor a 0");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto");
                sc.nextLine();
            }
        }
    }

    //SOBRECARGA DE METODO QUE VALIDA UN ENTERO ENTRE RANGOS INGRESADOS POR EL USUARIO
    public static int validarEntero(Scanner sc, int minimo, int maximo) {
        int opcion;
        while (true) {
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion >= minimo && opcion <= maximo) return opcion;
                else System.out.println("Debes ingresar un numero entre " + minimo + " y " + maximo);
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto");
                sc.nextLine();
            }
        }
    }
    
    //VALIDA QUE LOS DATOS INGRESADOS A UN PRODUCTO NO SEAN CAMPOS VACIOS
    public static String solicitarDatos(Scanner sc) throws CampoVacioException {
        while (true){
            try{
                String datos = sc.nextLine(); 
                if (datos.isBlank()) throw new CampoVacioException("El campo no puede estar vacio");
                else {
                return datos;
                }
            }catch(CampoVacioException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    //VALIDA que un precio no pueda ser negativo
    public static double validarprecio(Scanner sc) throws PrecioNoValidoException {
        double precio=0;
        while (true) {
            try{
                try {
                    precio = sc.nextDouble();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto");
                    sc.nextLine();
                }
                if (precio<=0) throw new PrecioNoValidoException("El precio no puede ser inferior o igual a cero");
                else return precio;
                }catch(PrecioNoValidoException e){
                    System.out.println(e.getMessage());
            }
        }
    }
    
    //VALIDA que un precio no pueda ser negativo
    public static int validarIngresoStock(Scanner sc) throws StockNoValidoException {
        int stock=0;
        while (true) {
            try{
                try {
                    stock = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto");
                    sc.nextLine();
                }
                if (stock<=0) throw new StockNoValidoException("El stock ingresado no puede ser igual o inferior a cero");
                else return stock;
                }catch(StockNoValidoException e){
                    System.out.println(e.getMessage());
            }
        }
    }

    /*Verifica caracteres y longitud del rut
    public static int verificarRut(Scanner sc) {
        int rutCliente;
        String rutC;
        String pase = "";
        System.out.println("Ingrese el RUT sin puntos ni digito verificador.");
        do {
            rutCliente = validarEntero(sc);
            rutC = String.valueOf(rutCliente);
            if (rutC.length() == 7 || rutC.length() == 8) {
                pase = "valido";
            } else {
                System.out.println("\nEl Rut debe contener entre 7 y 8 digitos\nVuelva a intentarlo");
            }
        } while (!pase.equals("valido"));
        return rutCliente;
    }
    
    //Calcula el digito verificador y devuelve rut completo
    public static String calcularDV(int rutCliente) {
        String digitoVerificador;
        String rutC = (String.valueOf(rutCliente));
        int suma = 0;
        int multiplicador = 2;
        while (rutCliente > 0) {
            int digito = rutCliente % 10;
            suma += digito * multiplicador;
            rutCliente /= 10;
            multiplicador = (multiplicador == 7) ? 2 : multiplicador + 1;
        }
        int resto = 11 - (suma % 11);
        if (resto == 11) {
            digitoVerificador = "0";
        } else if (resto == 10) {
            digitoVerificador = "k";
        } else {
            digitoVerificador = String.valueOf(resto);
        }
        rutC = rutC + "-" + digitoVerificador;
        return rutC;
    }
*/
}
