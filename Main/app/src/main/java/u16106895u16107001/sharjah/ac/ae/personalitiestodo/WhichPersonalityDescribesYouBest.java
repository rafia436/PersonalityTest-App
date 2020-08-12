package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class WhichPersonalityDescribesYouBest extends Activity {

    private RadioButton conscientiousnessRadioButton;
    private RadioButton extroversionRadioButton;
    private RadioButton agreeablenessRadioButton;
    private RadioButton opennessRadioButton;
    private RadioButton neuroticismRadioButton;


    private Button letsGoButton2;

    private Button whatDotheyMeanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_which_personality_describes_you_best);



        //RadioButtons Linking/////////////////////////////////////////////////////////////
        conscientiousnessRadioButton = (RadioButton) findViewById(R.id.conscientiousnessRadioButton);
        extroversionRadioButton = (RadioButton) findViewById(R.id.extroversionRadioButton);
        agreeablenessRadioButton = (RadioButton) findViewById(R.id.agreeablenessRadioButton);
        opennessRadioButton = (RadioButton) findViewById(R.id.opennessRadioButton);
        neuroticismRadioButton = (RadioButton) findViewById(R.id.neuroticismRadioButton);




        letsGoButton2 = (Button) findViewById(R.id.letsGoButton2);

        letsGoButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(conscientiousnessRadioButton.isChecked())
                {
                   Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, whereToGoCon.class);
                   startActivity(intent);
                }
                else if(extroversionRadioButton.isChecked())
                {
                    Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, whereToGoExy.class);
                    startActivity(intent);
                }
                else if(agreeablenessRadioButton.isChecked())
                {
                    Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, whereToGoAgr.class);
                    startActivity(intent);
                }
                else if(opennessRadioButton.isChecked())
                {
                    Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, whereToGoOpe.class);
                    startActivity(intent);
                }
                else if (neuroticismRadioButton.isChecked())
                {
                    Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, whereToGoNeu.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "CHOOSE AN OPTION YA NOOB", Toast.LENGTH_SHORT).show();
                }

            }
        });




        whatDotheyMeanButton = (Button) findViewById(R.id.whatDotheyMeanButton);

        whatDotheyMeanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WhichPersonalityDescribesYouBest.this, perInfoPage.class);
                startActivity(intent);
            }
        });
    }
}
