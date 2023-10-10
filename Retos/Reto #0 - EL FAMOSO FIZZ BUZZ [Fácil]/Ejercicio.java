public class Ejercicio {
    public static void main(String[] args){

      /*  for(int i=1; i<101;i++){

            String result = ((i%3==0) ? "fizz" : "" )+((i%5==0) ? "buzz" : "");
            System.out.println((result.isEmpty()) ? i : result);
        }*/
        recursividad(1);
    }

    private static void recursividad(int num){

        String result = ((num%3==0) ? "fizz" : "" )+((num%5==0) ? "buzz" : "");
        System.out.println((result.isEmpty()) ? num : result);

        if (num<100){
            recursividad(num+1);
        }
    }
}
