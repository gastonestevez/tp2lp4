package untref.shakedecide;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by gasto on 25/03/2016.
 */
public class ShakeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake);

        ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(500);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.coin);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                mp.release();
            }
        });
        mp.start();

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String value = extras.getString("RESULTADO");
            ((TextView) findViewById(R.id.t_resultado)).setText(value);
        }
    }
}
