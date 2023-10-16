import java.util.HashMap;

public class Ejercicio {
    public static void main(String[] args) {
        String [] partido={"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
        System.out.println(puntuacion(partido));

    }

    private static String puntuacion(String [] equipo){
        HashMap<Integer, String> traduccion = new HashMap<>();
        traduccion.put(0, "Love");
        traduccion.put(1, "15");
        traduccion.put(2, "30");
        traduccion.put(3, "40");

        String fin = "Fin del partido";

        int p1=0;
        int p2=0;
        for (int i=0; i<equipo.length; i++){
            if (equipo[i].equals("P1")){
                p1++;
            }else{
                p2++;
            }
            if (p1==p2 && p1>=3){
                System.out.println("Deuce");
            }else if(p1>3&&p2<p1){
                if (p1-p2==1){
                    System.out.println("Ventaja P1");
                }else{
                    System.out.println("Ha ganado P1");
                    return fin;
                }
            }else if(p2>3&&p1<p2){
                if (p2-p1==1){
                    System.out.println("Ventaja P2");
                }else{
                    System.out.println("Ha ganado P2");
                    return fin;
                }
            } else{
                System.out.println(traduccion.get(p1) + " - " + traduccion.get(p2));
            }
        }
        return "Partido sin finalizar";

    }


}
