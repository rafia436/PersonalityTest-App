package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class BehaviourQ5 extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    private int isDoubleTapped=1;

    private GestureDetector gestureDetector;



    private int con;
    private int ext;
    private int agr;
    private int ope;
    private int neu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_q5);


        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);

        Intent moveIntent = getIntent();
        con = moveIntent.getIntExtra("CON",0);
        ext = moveIntent.getIntExtra("EXT",0);
        agr= moveIntent.getIntExtra("AGR",0);
        ope= moveIntent.getIntExtra("OPE",0);
        neu= moveIntent.getIntExtra("NEU",0);

    }


    //////////////////////////////////BEGIN GESTURES////////////////////////////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        ext++;
        agr++;
        ope++;
        agr++;
        con++;
        neu++;

        Intent intent = new Intent(BehaviourQ5.this, YourPersonalityIs.class);
        intent.putExtra("CON", con);
        intent.putExtra("EXT", ext);
        intent.putExtra("AGR", agr);
        intent.putExtra("OPE", ope);
        intent.putExtra("NEU", neu);
        startActivity(intent);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        con++;
        ext++;
        neu++;
        ext++;
        agr++;
        ope++;
        Intent intent = new Intent(BehaviourQ5.this, YourPersonalityIs.class);
        intent.putExtra("CON", con);
        intent.putExtra("EXT", ext);
        intent.putExtra("AGR", agr);
        intent.putExtra("OPE", ope);
        intent.putExtra("NEU", neu);
        startActivity(intent);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
    //////////////////////////////////END GESTURES////////////////////////////////////////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
