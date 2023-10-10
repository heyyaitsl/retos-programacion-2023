import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();
        char [] chars = texto.toLowerCase().toCharArray();


        for (char ch: chars){
            switch (ch){
                case 'a':
                    System.out.print('4');
                    break;
                case 'b':
                    System.out.print("I3");
                    break;
                case 'c':
                    System.out.print('[');
                    break;
                case 'd':
                    System.out.print(")");
                    break;
                case 'e':
                    System.out.print('3');
                    break;
                case 'f':
                    System.out.print("|=");
                    break;
                case 'g':
                    System.out.print('&');
                    break;
                case 'h':
                    System.out.print("#");
                    break;
                case 'i':
                    System.out.print('1');
                    break;
                case 'j':
                    System.out.print(",_|");
                    break;
                case 'k':
                    System.out.print(">|");
                    break;
                case 'l':
                    System.out.print("1");
                    break;
                case 'm':
                    System.out.print("/\\/\\");
                    break;
                case 'n':
                    System.out.print("^/");
                    break;
                case 'o':
                    System.out.print('0');
                    break;
                case 'p':
                    System.out.print("|*");
                    break;
                case 'q':
                    System.out.print("(_,)");
                    break;
                case 'r':
                    System.out.print("I2");
                    break;
                case 's':
                    System.out.print('5');
                    break;
                case 't':
                    System.out.print("7");
                    break;
                case 'u':
                    System.out.print("(_)");
                    break;
                case 'v':
                    System.out.print("\\/");
                    break;
                case 'w':
                    System.out.print("\\/\\/");
                    break;
                case 'x':
                    System.out.print("><");
                    break;
                case 'y':
                    System.out.print("j");
                    break;
                case 'z':
                    System.out.print("2");
                    break;
                case '0':
                    System.out.print("O");
                    break;
                case '1':
                    System.out.print("L");
                    break;
                case '2':
                    System.out.print("R");
                    break;
                case '3':
                    System.out.print("E");
                    break;
                case '4':
                    System.out.print("A");
                    break;
                case '5':
                    System.out.print("S");
                    break;
                case '6':
                    System.out.print("b");
                    break;
                case '7':
                    System.out.print("T");
                    break;
                case '8':
                    System.out.print("B");
                    break;
                case '9':
                    System.out.print("g");
                    break;
                default:
                    System.out.print(" ");
                    break;

            }
        }
    }
}
