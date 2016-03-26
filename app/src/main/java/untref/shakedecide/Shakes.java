package untref.shakedecide;

import java.util.ArrayList;
import java.util.List;

import static untref.shakedecide.TipoDeShake.*;

/**
 * Created by gasto on 26/03/2016.
 */
public class Shakes {

    private static TipoDeShake shake;

    public Shakes(){
        setShake(NORMAL);
    }

    public static void setShakeSeleccionado(TipoDeShake shakeSeleccionado){
        shake = shakeSeleccionado;
    }

    public static List<String> getListaSegunTipoDeShake(){
        switch (shake){
            case NORMAL:
                break;
            case DADO:
                return getListaDados();
            case LETRAS:
                return getListaLetras();
            case NUMEROS:
                return getListaNumeros();
            case MONEDA:
                return getListaMoneda();
            default:
                return new ArrayList<String>();
        }
        return new ArrayList<String>();
    }

    private static List<String> getListaDados(){
        List<String> lista =  new ArrayList<String>();
        for (int i = 1 ; i <= 6; i++)
            lista.add(String.valueOf(i));
        return lista;
    }

    private static List<String> getListaLetras(){
        List<String> lista =  new ArrayList<String>();
        for(int i = 65; i <= 90; i++) {
            char letra = (char) i;
            lista.add(String.valueOf(letra));
        }
        return lista;
    }

    private static List<String> getListaNumeros() {
        List<String> lista = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            lista.add(String.valueOf(i));
        }
        return lista;
    }

    private static List<String> getListaMoneda(){
        List<String> lista = new ArrayList<String>();
        lista.add("CARA");
        lista.add("SECA");
        return lista;
    }

    public TipoDeShake getShake() {
        return shake;
    }

    public void setShake(TipoDeShake shake) {
        this.shake = shake;
    }
}
