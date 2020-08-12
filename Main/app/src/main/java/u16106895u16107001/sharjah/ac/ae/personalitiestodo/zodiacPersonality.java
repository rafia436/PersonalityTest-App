package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class zodiacPersonality extends Activity {

    private TextView conTextView;
    private TextView extTextView;
    private TextView agrTextView;
    private TextView opeTextView;
    private TextView neuTextView;


    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    Button whatDoTheymean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_personality);

        Intent moveIntent = getIntent();
        con = moveIntent.getIntExtra("CON",0);
        ext = moveIntent.getIntExtra("EXT",0);
        agr= moveIntent.getIntExtra("AGR",0);
        ope= moveIntent.getIntExtra("OPE",0);
        neu= moveIntent.getIntExtra("NEU",0);

        conTextView = (TextView) findViewById(R.id.conTextView);
        extTextView = (TextView) findViewById(R.id.extTextView);
        agrTextView = (TextView) findViewById(R.id.agrTextView);
        opeTextView = (TextView) findViewById(R.id.opeTextView);
        neuTextView = (TextView) findViewById(R.id.neuTextView);

        conTextView.setText(""+con + " %");
        extTextView.setText(""+ext + " %");
        agrTextView.setText(""+agr + " %");
        opeTextView.setText(""+ope + " %");
        neuTextView.setText(""+neu + " %");


        whatDoTheymean = (Button) findViewById(R.id.whatDoTheymean);

        whatDoTheymean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(zodiacPersonality.this,perInfoPage.class);
                startActivity(intent);

            }
        });

    }
}
