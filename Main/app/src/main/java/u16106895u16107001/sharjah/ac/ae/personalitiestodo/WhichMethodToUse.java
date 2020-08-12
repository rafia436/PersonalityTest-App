package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WhichMethodToUse extends Activity {

    private Button letsGoButton;
    private RadioGroup methodsRadioGroup;
    private RadioButton behaviourRadioButton;
    private RadioButton zodiacRadioButton;
    private RadioButton looksRadioButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_which_method_to_use);

        letsGoButton = (Button) findViewById(R.id.letsGoButton);

        methodsRadioGroup = (RadioGroup)  findViewById(R.id.methodsRadioGroup);
        behaviourRadioButton = (RadioButton) findViewById(R.id.behaviourRadioButton);
        zodiacRadioButton = (RadioButton) findViewById(R.id.zodiacRadioButton);
        looksRadioButton = (RadioButton) findViewById(R.id.looksRadioButton);


        letsGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(methodsRadioGroup.getCheckedRadioButtonId()==R.id.behaviourRadioButton)
                {
                    Intent intent = new Intent(WhichMethodToUse.this,Behaviour.class);
                    startActivity(intent);
                }
                else if(methodsRadioGroup.getCheckedRadioButtonId()==R.id.zodiacRadioButton)
                {
                    Intent intent = new Intent(WhichMethodToUse.this,Zodiac.class);
                    startActivity(intent);
                }
                else if(methodsRadioGroup.getCheckedRadioButtonId()==R.id.looksRadioButton)
                {
                    Intent intent = new Intent(WhichMethodToUse.this,Looks.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "CHOOSE AN OPTION DUDE..", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
