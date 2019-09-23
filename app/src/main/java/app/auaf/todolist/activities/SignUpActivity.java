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

import app.auaf.todolist.R;
import app.auaf.todolist.database.DatabaseHelper;
import app.auaf.todolist.model.User;

public class SignUpActivity extends AppCompatActivity {

    Button btnSignup;
    TextView tvSignIn;
    EditText etEmailUser,etPasswordUser;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        db = new DatabaseHelper(this);


        btnSignup =findViewById(R.id.btnSignUp);
        tvSignIn =findViewById(R.id.tvSignIn);

        etEmailUser=findViewById(R.id.etEmailUser);
        etPasswordUser=findViewById(R.id.etPasswordUser);




        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!TextUtils.isEmpty(etEmailUser.getText().toString()) && !TextUtils.isEmpty(etPasswordUser.getText().toString())){
                    User user=new User(etEmailUser.getText().toString(),etPasswordUser.getText().toString());

                    db.addUser(user);

                    Intent intent=new Intent(SignUpActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }else {
                    Toast.makeText(SignUpActivity.this, "Please Enter your Email And Password", Toast.LENGTH_SHORT).show();
                }


            }
        });
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
