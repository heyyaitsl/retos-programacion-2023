import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int num = scanner.nextInt();
        boolean primo = esPrimo(num);
        boolean fibo = esFibonacci(num);
        boolean par = esPar(num);
        System.out.print("El número " +  num);
        if (primo){
            System.out.print(" es primo, ");
        }else{
            System.out.print(" no es primo, ");
        }
        if (fibo){
            System.out.print("es fibonacci, ");
        }else{
            System.out.print("no es fibonacci, ");
        }
        if (par){
            System.out.print("y es par.");
        }else{
            System.out.print("y no es par.");
        }
    }

    private static boolean esPar(int num) {
        if (num%2==0){
            return true;
        }
        return false;
    }

    private static boolean esFibonacci(int num) {
        int ant = 0;
        int post=1;
        int aux;
        if(num==0||num==1) return true;
        while(num>post){
            aux=ant;
            ant=post;
            post=ant+aux;
            if(post==num) return true;
        }
        return false;
    }

    private static boolean esPrimo(int num) {
        for (int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
