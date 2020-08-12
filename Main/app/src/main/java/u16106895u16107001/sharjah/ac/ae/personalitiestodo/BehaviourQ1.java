package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BehaviourQ1 extends Activity {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;

    private Button sleepQ1NextButton;

    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    private boolean done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_q1);

        sleepQ1NextButton = (Button) findViewById(R.id.sleepQ1NextButton);

        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb4=(RadioButton) findViewById(R.id.rb4);
        rb5=(RadioButton) findViewById(R.id.rb5);

        con=0;
        ext=0;
        agr=0;
        ope=0;
        neu=0;

        sleepQ1NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                done=false;
                if(rb1.isChecked())
                {
                    con++;
                    done=true;
                }
                else if(rb2.isChecked())
                {
                    ext++;
                    done=true;

                }
                else if(rb3.isChecked())
                {
                    ope++;
                    done=true;

                }
                else if(rb4.isChecked())
                {
                    agr++;
                    done=true;

                }
                else if(rb5.isChecked())
                {
                    neu++;
                    done=true;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE AN OPTION NOOB", Toast.LENGTH_SHORT).show();
                }

                if(done == true)
                {
                    Intent intent = new Intent(BehaviourQ1.this, BehaviourQ2.class);
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
