package mx.edu.ittepic.deliamacias.tpdm_u1_practica1_deliamaciasurzua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2;
    TextView asunto,texto;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = findViewById(R.id.cale);
        ch2 = findViewById(R.id.calee);
        asunto = findViewById(R.id.impo);
        texto = findViewById(R.id.texto);
        aceptar = findViewById(R.id.enviar);
    }

    public void enviar(View v){

        if (texto.getText().toString().equals("")){
            Toast.makeText(this,"Usted no a completado un campo",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Correo enviado",Toast.LENGTH_LONG).show();
            asunto.setText("");
            texto.setText("");
            ch1.setChecked(false);
            ch2.setChecked(false);
        }


    }
}
