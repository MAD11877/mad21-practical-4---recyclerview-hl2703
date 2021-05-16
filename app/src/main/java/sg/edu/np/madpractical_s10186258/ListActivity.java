package sg.edu.np.madpractical_s10186258;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG ="List activity"; //starting line
    ArrayList<User> userList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);







        createUser(userList);


        RecyclerView recyclerViewCustom = findViewById(R.id.recyclerView);
        Adapter cAdapter = new Adapter(userList);
        LinearLayoutManager cLayoutManager = new LinearLayoutManager(this);
        recyclerViewCustom.setLayoutManager(cLayoutManager);
        recyclerViewCustom.setItemAnimator(new DefaultItemAnimator());
        recyclerViewCustom.setAdapter(cAdapter);

        //Intent intent = new Intent(ListActivity.this, MainActivity.class);
       // intent.putExtra("userList", userList); //send info to new activity in a map

    }




    private void createUser(ArrayList<User> userList) {
        for (int i=0;i<21;i++) {
            int ranName = generateInt();
            int ranDes = generateInt();
            User newUser = new User("Name-" + ranName, i,generateBool(),"Description"+ranDes);
            userList.add(newUser);

        }

    }

    //Upon clicking the View button, a random integer will be generated. The MainActivity
// (created in previous practical) will be launched, and the random integer is sent over.
    private int generateInt() {
        Random ran = new Random();
        int ranVal = ran.nextInt(1000);//assign var as it will return
        return ranVal;
    }

   private boolean generateBool() {

            Random rd = new Random(); // creating Random object
            boolean ranBool= rd.nextBoolean(); // a random boolean
            return ranBool;

        }
    }


