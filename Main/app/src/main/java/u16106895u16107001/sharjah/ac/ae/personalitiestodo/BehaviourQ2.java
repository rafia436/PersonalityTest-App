package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BehaviourQ2 extends Activity {

    private RadioButton rbb1;
    private RadioButton rbb2;
    private RadioButton rbb3;
    private RadioButton rbb4;
    private RadioButton rbb5;

    private Button sleepQ2NextButton;

    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    private boolean done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_q2);

        Intent moveIntent = getIntent();
        con = moveIntent.getIntExtra("CON",0);
        ext = moveIntent.getIntExtra("EXT",0);
        agr= moveIntent.getIntExtra("AGR",0);
        ope= moveIntent.getIntExtra("OPE",0);
        neu= moveIntent.getIntExtra("NEU",0);

        sleepQ2NextButton = (Button) findViewById(R.id.sleepQ2NextButton);

        rbb1 = (RadioButton) findViewById(R.id.rbb1) ;
        rbb2 = (RadioButton) findViewById(R.id.rbb2) ;
        rbb3 = (RadioButton) findViewById(R.id.rbb3) ;
        rbb4 = (RadioButton) findViewById(R.id.rbb4) ;
        rbb5 = (RadioButton) findViewById(R.id.rbb5) ;



        sleepQ2NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                done=false;

                if(rbb1.isChecked())
                {
                    agr++;
                    done=true;
                }
                else if(rbb2.isChecked())
                {
                    neu++;
                    done=true;

                }
                else if(rbb3.isChecked())
                {
                    ope++;
                    done=true;

                }
                else if(rbb4.isChecked())
                {
                    con++;
                    done=true;

                }
                else if(rbb5.isChecked())
                {
                    ext++;
                    done=true;

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE ONE NOOB" , Toast.LENGTH_SHORT).show();

                }

                if(done == true)
                {
                    Intent intent = new Intent(BehaviourQ2.this, BehaviourQ3.class);
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
