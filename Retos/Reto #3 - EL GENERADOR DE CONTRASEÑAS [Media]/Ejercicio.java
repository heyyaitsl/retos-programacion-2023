import java.security.SecureRandom;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length =0;
        boolean mayus = false;
        boolean num = false;
        boolean esp = false;
        boolean valido = false;

        do{
            if (valido){
                System.out.println("Longitud no válida. Vuelve a probar.");
            }
            System.out.print("Introduce la longitud de la contraseña (entre 8 y 16" +
                    " caracteres): ");
            length = scanner.nextInt();
            valido=true;
        }while (length<8 || length >16);

        System.out.println("¿Quieres mayúsculas?");
        System.out.println("1. Sí");
        System.out.println("2. No (Defecto)");
        if (scanner.nextInt()==1) mayus=true;

        System.out.println("¿Quieres números?");
        System.out.println("1. Sí");
        System.out.println("2. No (Defecto)");
        if (scanner.nextInt()==1) num=true;

        System.out.println("¿Quieres carácteres especiales?");
        System.out.println("1. Sí");
        System.out.println("2. No (Defecto)");
        if (scanner.nextInt()==1) esp=true;

        System.out.println("Contraseña generada:" + generadorContraseñas(length, mayus, num, esp));

    }


    public static String generadorContraseñas(int length, boolean mayus, boolean num, boolean esp){
        StringBuilder passwd = new StringBuilder("abcdefghijklmnñopqrstuvwxyz");
        if (mayus){
            passwd.append("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
        }
        if (num){
            passwd.append("0123456789");
        }
        if (esp){
            passwd.append("!·$%&/()=#@~¬| \\¨'?¿¡*^`+[]{}-_.:,;<>+");
        }
        String posibilidades = passwd.toString();

        SecureRandom random = new SecureRandom();
        StringBuilder cont = new StringBuilder();
        for (int i= 0; i<length; i++){
            cont.append(posibilidades.charAt(random.nextInt(posibilidades.length())));
        }
        return cont.toString();
    }

}
