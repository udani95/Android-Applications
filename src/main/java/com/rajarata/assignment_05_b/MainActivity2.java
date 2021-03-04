package com.rajarata.assignment_05_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText username,password;
    Button signup,gohome;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username= (EditText) findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        signup=findViewById(R.id.button2);
        gohome=findViewById(R.id.button3);
        DB=new DBHelper(this);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                if (user.equals(" ")|pass.equals(" "))
                    Toast.makeText(MainActivity2.this,"Please Enter both",Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass=DB.checkusernamepassword(user,pass);

                    if(checkuserpass==false) {
                        Boolean insert = DB.insertData(user, pass);
                        if (insert = true) {
                            Toast.makeText(MainActivity2.this, "Registered Sucessfully", Toast.LENGTH_SHORT).show();
                        }
                    }

                    else {
                        Toast.makeText(MainActivity2.this,"You have already registered",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);



            }
        });


    }
}