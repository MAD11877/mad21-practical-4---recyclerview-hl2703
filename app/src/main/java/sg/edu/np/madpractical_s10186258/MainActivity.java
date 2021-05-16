package sg.edu.np.madpractical_s10186258;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView numValue;
    private TextView desText;
    private final static String TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dump all code here
        Log.v(TAG, "Main activity created!");
        Intent receivingEnd = getIntent();
        String ranNum = receivingEnd.getStringExtra("Name");
        numValue=findViewById(R.id.ranNum);
        numValue.setText(ranNum);

        String description = receivingEnd.getStringExtra("Des");
        desText=findViewById(R.id.editText);
        desText.setText(description);
       //ArrayList<User> userList=receivingEnd.getA
        final String[] followed = {receivingEnd.getStringExtra("followed")};
        Log.v(TAG, "followed?:"+ followed[0]);
        final Button followBtn =findViewById(R.id.followBtn);
        if (followed[0] =="true"){

            followBtn.setText("Unfollow");
            followBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //inner class
                    Toast.makeText(getApplicationContext(),"unfollowed",Toast.LENGTH_SHORT).show();
                    followBtn.setText("Follow");
                    followed[0] ="false";

                }



            });
        }
        else{

            followBtn.setText("Follow");
            followBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //inner class
                    Toast.makeText(getApplicationContext(),"followed",Toast.LENGTH_SHORT).show();
                    followBtn.setText("unfollow");
                    followed[0]="true";

                }



            });


        }


        /*followBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //inner class

                if (followed=="true"){
                    Log.v(TAG, "Button pressed.");
                    followBtn.setText("Unfollow");
                    Toast.makeText(getApplicationContext(),"unfollowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    Log.v(TAG, "Button pressed.");
                    followBtn.setText("Follow");
                    Toast.makeText(getApplicationContext(),"followed",Toast.LENGTH_SHORT).show();
                }

            }



        });
*/

        Button button =findViewById(R.id.messageBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inner class
                Log.v(TAG, "Button pressed.");
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });


        /*final boolean[] followed = {false};
        final Button followBtn =findViewById(R.id.followBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //inner class
                Log.v(TAG, "Button pressed.");
                if(!followed[0]) {
                    followBtn.setText("Unfollow");
                    Toast.makeText(getApplicationContext(),"followed",Toast.LENGTH_SHORT).show();
                    followed[0] =true;
                }
                else{
                    followBtn.setText("follow");
                    Toast.makeText(getApplicationContext(),"unfollowed",Toast.LENGTH_SHORT).show();
                    followed[0] =false;
                }

            }
        });*/

    }
}