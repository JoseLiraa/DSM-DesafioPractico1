package sv.edu.udb.ml161665.primerdesafiopractico_ml161665_rf181492;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button signin;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usernamel);
        password = findViewById(R.id.passwordl);
        signin = findViewById(R.id.signinl);
        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(Login.this, "Completar todos los campos", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass= DB.checkusernamepassword(user, pass);
                    if (checkuserpass == true){
                        Toast.makeText(Login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Menu.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
