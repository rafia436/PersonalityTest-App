package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainScreen extends Activity {

    //Options Text
    private Button whatsMyPTextView;
    private Button iKnowMyPTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        whatsMyPTextView = (Button) findViewById(R.id.whatsMyPTextView);
        iKnowMyPTextView = (Button) findViewById(R.id.iKnowMyPTextView);
        

        whatsMyPTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mainScreen.this,WhichMethodToUse.class);
                startActivity(intent);
            }
        });

        iKnowMyPTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mainScreen.this,WhichPersonalityDescribesYouBest.class);
                startActivity(intent);

            }
        });
    }
}
