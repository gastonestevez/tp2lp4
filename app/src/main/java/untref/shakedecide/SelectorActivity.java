package untref.shakedecide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
    }

    public void seleccionNormal(View view){
        Shakes.setShakeSeleccionado(TipoDeShake.NORMAL);
        abrirMenuPrincipal();
    }

    public void seleccionDado(View view){
        Shakes.setShakeSeleccionado(TipoDeShake.DADO);
        abrirMenuPrincipal();
    }

    public void seleccionMoneda(View view){
        Shakes.setShakeSeleccionado(TipoDeShake.MONEDA);
        abrirMenuPrincipal();
    }

    public void seleccionNumeros(View view){
        Shakes.setShakeSeleccionado(TipoDeShake.NUMEROS);
        abrirMenuPrincipal();
    }

    public void seleccionLetras(View view){
        Shakes.setShakeSeleccionado(TipoDeShake.LETRAS);
        abrirMenuPrincipal();
    }

    private void abrirMenuPrincipal() {
        Intent i = new Intent(SelectorActivity.this, MainActivity.class);
        startActivity(i);
    }
}
