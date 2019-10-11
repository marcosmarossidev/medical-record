package com.example.emr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    Spinner idioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_principal);

        idioma = findViewById(R.id.spinIdioma);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.idioma,android.R.layout.simple_spinner_item);
        idioma.setAdapter(adapter);

        AdapterView.OnItemClickListener escolhaIdioma = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Fazer toda a lógica do idioma assim que estiver tudo pronto
            }
        };

        startActivity(new Intent (this, RetrofitTestsActivity.class));
    }
    public void abrirTelaLogin(View v){
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void abrirTelaCadastro(View v){
        startActivity(new Intent(this,CadastrarActivity.class));
    }
}
