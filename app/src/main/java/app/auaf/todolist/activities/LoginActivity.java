package app.auaf.todolist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.utils.Utils;

import app.auaf.todolist.R;
import app.auaf.todolist.database.DatabaseHelper;

public class LoginActivity extends AppCompatActivity {


     Button btnSignIn;
     TextView tvSignUp;
     EditText etEmailUser,etPasswordUser;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);


        btnSignIn=findViewById(R.id.btnSignIn);
        tvSignUp=findViewById(R.id.tvSignUp);

        etEmailUser=findViewById(R.id.etEmailUser);
        etPasswordUser=findViewById(R.id.etPasswordUser);




        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!TextUtils.isEmpty(etEmailUser.getText().toString()) && !TextUtils.isEmpty(etPasswordUser.getText().toString())){

                    if(db.checkUser(etEmailUser.getText().toString(),etPasswordUser.getText().toString())){

                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Toast.makeText(LoginActivity.this, " Email And Password are not correct", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(LoginActivity.this, "Please Enter your Email And Password", Toast.LENGTH_SHORT).show();
                }


            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
