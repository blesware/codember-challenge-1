import java.util.*;

public class Challenge_1 {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> palabraRep = new ArrayList<String>();

    public static void main(String[] args) {
     
        ArrayList<String> mensajes = new ArrayList<String>();        

        String cadena;
        String aux = "";
        String cadenaFinal = "";

        String banner = """
        
            ██████╗ ██╗     ███████╗███████╗██╗    ██╗ █████╗ ██████╗ ███████╗
            ██╔══██╗██║     ██╔════╝██╔════╝██║    ██║██╔══██╗██╔══██╗██╔════╝
            ██████╔╝██║     █████╗  ███████╗██║ █╗ ██║███████║██████╔╝█████╗  
            ██╔══██╗██║     ██╔══╝  ╚════██║██║███╗██║██╔══██║██╔══██╗██╔══╝  
            ██████╔╝███████╗███████╗███████║╚███╔███╔╝██║  ██║██║  ██║███████╗
            ╚═════╝ ╚══════╝╚══════╝╚══════╝ ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝

            Desafio semana 1 de Codember v1.0
            """;
        
        System.out.println(banner);

        System.out.print("Digite la cadena de texto: ");       
        cadena = input.nextLine();

        System.out.println("");

        //For para recorrer la cadena y guardar las palabras en mensaje omitiendo los espacios
        for (int i = 0; i < cadena.length(); i++ ) {
            
            if (String.valueOf(cadena.charAt(i)).equals(" ")) {

                mensajes.add(aux);
                aux = "";

            } else {

                aux = aux + String.valueOf(cadena.charAt(i));
            }
        }

        //Agregar la última palabra después de salir del bucle
        mensajes.add(aux);

        for (String palabra : mensajes) {

            cadenaFinal = cadenaFinal + valorRepetido(mensajes, palabra.toLowerCase());
        } 
        
        System.out.println(cadenaFinal);        
    }
    
    //Metodo para evaluar valores repetidos
    private static String valorRepetido(ArrayList<String> x, String y) {

        int i = 0;
        int j = 0;        
        boolean aux = false;
        
        do {                                               

            if (y.equalsIgnoreCase(x.get(i))) {
                
                j++;
            }

            i++;

        } while (i < x.size());

        y = y + j;

        for (String palabra : palabraRep) {

            if (palabra.equalsIgnoreCase(y)) {
                
                aux = true;
                break;
            }
        }       

        if (aux) {

            return "";

        } else {

            palabraRep.add(y);
            return y;
        }        
    }
}
