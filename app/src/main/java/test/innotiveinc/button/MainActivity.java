package test.innotiveinc.button;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=(TextView)findViewById(R.id.text1);
        Button red=(Button)findViewById(R.id.red);
        Button blue=(Button)findViewById(R.id.blue);
        Button black=(Button)findViewById(R.id.black);
        Button sizeup=(Button)findViewById(R.id.sizeup);
        Button sizedown=(Button)findViewById(R.id.sizedown);
        Button down=(Button)findViewById(R.id.down);
        Button up=(Button)findViewById(R.id.up);
        Button right=(Button)findViewById(R.id.right);
        Button left=(Button)findViewById(R.id.left);
        Button next=(Button)findViewById(R.id.next);

        red.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        ConstraintLayout wrap=(ConstraintLayout)findViewById(R.id.wrap);
                        text.setTextColor(Color.rgb(255,0,0));
                        wrap.setBackgroundColor(Color.rgb(194, 220, 237));
                    }
                }
        );
        blue.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        ConstraintLayout wrap=(ConstraintLayout)findViewById(R.id.wrap);
                        text.setTextColor(Color.rgb(0,0,255));
                        wrap.setBackgroundColor(Color.rgb(226,202,156));
                    }
                }
        );
        black.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        ConstraintLayout wrap=(ConstraintLayout)findViewById(R.id.wrap);
                        text.setTextColor(Color.rgb(0,0,0));
                        wrap.setBackgroundColor(Color.rgb(255,255,255));
                    }
                }
        );
        sizeup.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        text.setTextSize(i=i+5);
                    }
                }
        );
        sizedown.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        text.setTextSize(i=i-5);
                    }
                }
        );
        down.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        int y= (int) text.getY();
                        text.setY(y += 10);
                    }
                }
        );
        up.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        int y= (int) text.getY();
                        text.setY(y -= 10);
                    }
                }

        );
        right.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        int x= (int) text.getX();
                        text.setX(x+=10);
                    }
                }
        );
        left.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text=(TextView)findViewById(R.id.text1);
                        int x= (int) text.getX();
                        text.setX(x-=10);
                    }
                }
        );
        next.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent page2= new Intent(getApplicationContext(),sub_activity.class);
                        startActivity(page2);
                    }
                }
        );
    }
}
