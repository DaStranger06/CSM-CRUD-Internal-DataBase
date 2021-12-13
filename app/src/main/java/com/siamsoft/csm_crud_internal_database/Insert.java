package com.siamsoft.csm_crud_internal_database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Insert extends AppCompatActivity {

    EditText txname,txmobile,txtmail;

    TextView lblmsg;
    String name,mobile, email;
    UserFunctions userFunction;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        txname = (EditText) findViewById(R.id.txtname);

        txmobile=(EditText)findViewById(R.id.txtmobileinsert);
        txtmail =findViewById(R.id.txtmailinsert);

        lblmsg=(TextView)findViewById(R.id.lblmsge);

        userFunction = new UserFunctions();
    }


    protected void onStart() {
        super.onStart();
    }

    public void submit_Click(View view){

        if(!txname.getText().toString().isEmpty()){

            if(!txmobile.getText().toString().isEmpty()){

 if(!txtmail.getText().toString().isEmpty()) {

     name = txname.getText().toString();
     mobile = txmobile.getText().toString();
     email = txtmail.getText().toString();



     userFunction.insertUserInfo(getApplicationContext(), name, mobile,email);
     //

     clear();
     startActivity(new Intent(getApplicationContext(), ViewAll.class));
 }
 else{lblmsg.setText("Please Enter Your Email!");}
            }
            else{lblmsg.setText("Please Enter Your Mobile Number!");}
        }
        else{ lblmsg.setText("Please Enter Your Name!");}

    }

    private void clear() {
        txname.setText("");
        txmobile.setText("");
        txtmail.setText("");

        lblmsg.setText("Insert Successfully");
    }

    public void btnShow_Click(View view){
        //userFunction.getAllInfo(getApplicationContext(), "07-11-2014", "07-11-14");
        Intent intent = new Intent(this, ViewAll.class);
        startActivity(intent);
    }



}
