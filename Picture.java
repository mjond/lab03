package edu.calvin.mjd85.password;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Picture extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //co 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        //ImageView.setVisibilty(View.INVISIBLE);
        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String prepwd="yourface";
                EditText  et=(EditText) findViewById(R.id.password);
                if(et.getText().toString().equalsIgnoreCase(prepwd))
                {
                    ImageView iv=(ImageView) findViewById(R.id.picture);
                    findViewById(R.id.picture).setVisibility(View.VISIBLE);
                }
                else{
                    findViewById(R.id.message).setVisibility(View.VISIBLE);
                }

            }
        });
    }
}
