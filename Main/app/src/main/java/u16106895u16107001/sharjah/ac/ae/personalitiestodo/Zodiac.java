package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Zodiac extends Activity {

    RadioButton AriesRadioButton;
    RadioButton LibraRadioButton;
    RadioButton taurusRadioButton;
    RadioButton scorpioRadioButton;
    RadioButton geminiRadioButton;
    RadioButton sagittariusRadioButton;
    RadioButton cancerRadioButton;
    RadioButton capriconRadioButton;
    RadioButton aquariusRadioButton;
    RadioButton piscesRadioButton;
    RadioButton virgoRadioButton;
    RadioButton leoRadioButton;

    Button letsGoBB;

    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    boolean done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);


        AriesRadioButton = (RadioButton)findViewById(R.id.AriesRadioButton);
        LibraRadioButton = (RadioButton)findViewById(R.id.LibraRadioButton);
        taurusRadioButton = (RadioButton)findViewById(R.id.taurusRadioButton);
        scorpioRadioButton = (RadioButton)findViewById(R.id.scorpioRadioButton);
        geminiRadioButton = (RadioButton)findViewById(R.id.geminiRadioButton);
        sagittariusRadioButton = (RadioButton)findViewById(R.id.sagittariusRadioButton);
        cancerRadioButton = (RadioButton)findViewById(R.id.cancerRadioButton);
        capriconRadioButton = (RadioButton)findViewById(R.id.capriconRadioButton);
        aquariusRadioButton = (RadioButton)findViewById(R.id.aquariusRadioButton);
        piscesRadioButton = (RadioButton)findViewById(R.id.piscesRadioButton);
        virgoRadioButton = (RadioButton)findViewById(R.id.virgoRadioButton);
        leoRadioButton = (RadioButton)findViewById(R.id.leoRadioButton);

        letsGoBB = (Button) findViewById(R.id.letsGoBB);

        letsGoBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                done = false;

                if(AriesRadioButton.isChecked())
                {

                    ope = 15;
                    ext = 20;
                    con = 40;
                    neu = 15;
                    ope = 10;
                    agr = 5;
                    done = true;

                }
                else if(LibraRadioButton.isChecked())
                {

                    ope = 20;
                    ext = 10;
                    con = 10;
                    neu = 25;
                    ope = 10;
                    agr = 25;
                    done = true;

                }
                else if(taurusRadioButton.isChecked())
                {

                    ope = 15;
                    ext = 15;
                    con = 15;
                    neu = 15;
                    ope = 15;
                    agr = 25;
                    done = true;

                }
                else if(scorpioRadioButton.isChecked())
                {

                    ope = 10;
                    ext = 20;
                    con = 10;
                    neu = 20;
                    ope = 10;
                    agr = 30;
                    done = true;

                }
                else if(geminiRadioButton.isChecked())
                {

                    ope = 20;
                    ext = 10;
                    con = 10;
                    neu = 25;
                    ope = 10;
                    agr = 25;
                    done = true;

                }
                else if(sagittariusRadioButton.isChecked())
                {

                    ope = 15;
                    ext = 20;
                    con = 40;
                    neu = 15;
                    ope = 10;
                    agr = 5;
                    done = true;

                }
                else if(cancerRadioButton.isChecked())
                {

                    ope = 10;
                    ext = 20;
                    con = 10;
                    neu = 20;
                    ope = 10;
                    agr = 30;
                    done = true;

                }
                else if(capriconRadioButton.isChecked())
                {

                    ope = 15;
                    ext = 15;
                    con = 15;
                    neu = 15;
                    ope = 15;
                    agr = 25;
                    done = true;

                }
                else if(aquariusRadioButton.isChecked())
                {

                    ope = 20;
                    ext = 10;
                    con = 10;
                    neu = 25;
                    ope = 10;
                    agr = 25;
                    done = true;

                }
                else if(piscesRadioButton.isChecked())
                {

                    ope = 10;
                    ext = 20;
                    con = 10;
                    neu = 20;
                    ope = 10;
                    agr = 30;
                    done = true;

                }
                else if(virgoRadioButton.isChecked())
                {
                    ope = 15;
                    ext = 15;
                    con = 15;
                    neu = 15;
                    ope = 15;
                    agr = 25;
                    done = true;

                }
                else if(leoRadioButton.isChecked())
                {

                    ope = 15;
                    ext = 20;
                    con = 40;
                    neu = 15;
                    ope = 10;
                    agr = 5;
                    done = true;

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE ONE NOOB", Toast.LENGTH_SHORT).show();
                }


                if(done == true)
                {
                    Intent intent = new Intent(Zodiac.this,zodiacPersonality.class);
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
}
