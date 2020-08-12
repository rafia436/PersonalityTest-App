package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BehaviourQ3 extends Activity {

    MediaPlayer player;
    private Button sleepQ3NextButton;


    RadioButton rbbb1;
    RadioButton rbbb2;
    RadioButton rbbb3;
    RadioButton rbbb4;
    RadioButton rbbb5;

    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    boolean done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_q3);

        sleepQ3NextButton = (Button) findViewById(R.id.sleepQ3NextButton);

        rbbb1 = (RadioButton) findViewById(R.id.rbbb1);
        rbbb2 = (RadioButton) findViewById(R.id.rbbb2);
        rbbb3 = (RadioButton) findViewById(R.id.rbbb3);
        rbbb4 = (RadioButton) findViewById(R.id.rbbb4);
        rbbb5 = (RadioButton) findViewById(R.id.rbbb5);


        Intent moveIntent = getIntent();
        con = moveIntent.getIntExtra("CON",0);
        ext = moveIntent.getIntExtra("EXT",0);
        agr= moveIntent.getIntExtra("AGR",0);
        ope= moveIntent.getIntExtra("OPE",0);
        neu= moveIntent.getIntExtra("NEU",0);

        sleepQ3NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                done=false;

                if(rbbb1.isChecked())
                {
                    con++;
                    done=true;
                }
                else if(rbbb2.isChecked())
                {
                    ext++;
                    done=true;

                }
                else if(rbbb3.isChecked())
                {
                    neu++;
                    done=true;

                }
                else if(rbbb4.isChecked())
                {
                    agr++;
                    done=true;

                }
                else if(rbbb5.isChecked())
                {
                    ope++;
                    done=true;

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE ONE NOOB" , Toast.LENGTH_SHORT).show();

                }

                if(done == true)
                {
                    Intent intent = new Intent(BehaviourQ3.this, BehaviourQ4.class);
                    intent.putExtra("CON", con);
                    intent.putExtra("EXT", ext);
                    intent.putExtra("AGR", agr);
                    intent.putExtra("OPE", ope);
                    intent.putExtra("NEU", neu);
                    startActivity(intent);
                }
            }
        });
    }


    //11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
    public void play1(View v)
    {

        if(player == null)
        {
            player = MediaPlayer.create(this, R.raw.calm);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause1(View v)
    {
        if(player != null)
        {
            player.pause();
        }
    }

    public void stop1(View v)
    {
        stopPlayer();
    }
    //11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111




    //222222222222222222222222222222222222222222222222222222222222222222222222
    public void play2(View v)
    {

        if(player == null)
        {
            player = MediaPlayer.create(this, R.raw.energytic);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause2(View v)
    {
        if(player != null)
        {
            player.pause();
        }
    }

    public void stop2(View v)
    {
        stopPlayer();
    }
    //222222222222222222222222222222222222222222222222222222222222222222222222





    //3333333333333333333333333333333333333333333333333333333333333333333333333333333333
    public void play3(View v)
    {

        if(player == null)
        {
            player = MediaPlayer.create(this, R.raw.metal);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause3(View v)
    {
        if(player != null)
        {
            player.pause();
        }
    }

    public void stop3(View v)
    {
        stopPlayer();
    }
    //3333333333333333333333333333333333333333333333333333333333333333333333333333333333



    //44444444444444444444444444444444444444444444444444444444444444444444444444444444444
    public void play4(View v)
    {

        if(player == null)
        {
            player = MediaPlayer.create(this, R.raw.rap);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause4(View v)
    {
        if(player != null)
        {
            player.pause();
        }
    }

    public void stop4(View v)
    {
        stopPlayer();
    }
    //44444444444444444444444444444444444444444444444444444444444444444444444444444444444




    private void stopPlayer ()
    {
        if(player != null)
        {
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        stopPlayer();
    }
}
