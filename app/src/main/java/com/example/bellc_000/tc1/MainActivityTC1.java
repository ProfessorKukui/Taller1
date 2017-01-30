package com.example.bellc_000.tc1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivityTC1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tc1);
    }




    public void CalcularNota(View view) {

        Float n1=Float.parseFloat(((EditText)findViewById(R.id.Nota1)).getText().toString());
        Float n2=Float.parseFloat(((EditText)findViewById(R.id.Nota2)).getText().toString());
        Float n3=Float.parseFloat(((EditText)findViewById(R.id.Nota3)).getText().toString());
        float n4=14-n1-n2-n3;

        EditText Resultado = (EditText)findViewById(R.id.Nota4);

        if (n4<=0){
            Resultado.setText("Ya pasaste");
        }
        else{
            Resultado.setText("Necesita "+n4);
        }

    }
}
