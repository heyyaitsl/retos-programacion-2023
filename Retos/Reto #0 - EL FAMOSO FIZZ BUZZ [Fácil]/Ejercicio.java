public class Ejercicio {
    public static void main(String[] args){

        for(int i=1; i<101;i++){

            String result = ((i%3==0) ? "fizz" : "" )+((i%5==0) ? "buzz" : "");
            System.out.println((result.isEmpty()) ? i : result);
        }
    }
}
