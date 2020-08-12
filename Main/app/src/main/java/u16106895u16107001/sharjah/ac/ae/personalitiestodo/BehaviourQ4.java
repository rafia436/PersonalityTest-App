package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BehaviourQ4 extends Activity {

    private Button sleepQ4NextButton;

    RadioButton rbbbb1;
    RadioButton rbbbb2;
    RadioButton rbbbb3;
    RadioButton rbbbb4;
    RadioButton rbbbb5;

    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    boolean done;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_q4);

        sleepQ4NextButton = (Button) findViewById(R.id.sleepQ4NextButton);

        rbbbb1 = (RadioButton) findViewById(R.id.rbbbb1);
        rbbbb2 = (RadioButton) findViewById(R.id.rbbbb2);
        rbbbb3 = (RadioButton) findViewById(R.id.rbbbb3);
        rbbbb4 = (RadioButton) findViewById(R.id.rbbbb4);
        rbbbb5 = (RadioButton) findViewById(R.id.rbbbb5);


        Intent moveIntent = getIntent();
        con = moveIntent.getIntExtra("CON",0);
        ext = moveIntent.getIntExtra("EXT",0);
        agr= moveIntent.getIntExtra("AGR",0);
        ope= moveIntent.getIntExtra("OPE",0);
        neu= moveIntent.getIntExtra("NEU",0);

        sleepQ4NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                done=false;

                if(rbbbb1.isChecked())
                {
                    con++;
                    done=true;
                }
                else if(rbbbb2.isChecked())
                {
                    ext++;
                    done=true;

                }
                else if(rbbbb3.isChecked())
                {
                    agr++;
                    done=true;

                }
                else if(rbbbb4.isChecked())
                {
                    ope++;
                    done=true;

                }
                else if(rbbbb5.isChecked())
                {
                    neu++;
                    done=true;

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE ONE NOOB" , Toast.LENGTH_SHORT).show();

                }

                if(done == true)
                {
                    Intent intent = new Intent(BehaviourQ4.this, BehaviourQ5.class);
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
