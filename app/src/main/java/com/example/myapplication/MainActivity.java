package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
      TextInputLayout tname,trollno,temail,tmobno,tusername,tpassword;
      Button btn;
      FirebaseDatabase rootNode;
      DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tname=findViewById(R.id.Rname);
        trollno=findViewById(R.id.Rrollno);
        temail=findViewById(R.id.Remail);
        tmobno=findViewById(R.id.Rmobno);
        tusername=findViewById(R.id.Rusername);
        tpassword=findViewById(R.id.Rpassword);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                String name = tname.getEditText().getText().toString();
                String rollno=trollno.getEditText().getText().toString();
                String email = temail.getEditText().getText().toString();
                String mobno = tmobno.getEditText().getText().toString();
                String username = tusername.getEditText().getText().toString();
                String password =tpassword.getEditText().getText().toString();
                UserHelperClass helperClass = new UserHelperClass(name, rollno, email, mobno, username, password);
                reference.child(mobno).setValue(helperClass);
            }
        });
    }
}