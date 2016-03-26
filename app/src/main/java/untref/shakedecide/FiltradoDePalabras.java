package untref.shakedecide;

/**
 * Created by gasto on 26/03/2016.
 */
public class FiltradoDePalabras {

    /**
     * Devuelve True si la palabra no es vacia y es menor a 20 caracteres.
     * @param palabra
     * @return
     */
    public static boolean filtrar(String palabra){
        boolean resultado = false;

        resultado = !palabra.equals("") &&
                    !palabra.isEmpty() &&
                    palabra.length() < 21 &&
                    !palabra.equals(" ") &&
                    !palabra.contains("  ") &&
                    palabra.length() > 0;

        return resultado;
    }
}
