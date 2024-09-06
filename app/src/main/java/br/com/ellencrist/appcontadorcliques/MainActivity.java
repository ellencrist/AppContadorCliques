package br.com.ellencrist.appcontadorcliques;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv_numero; // objeto de textview no usages
    Button btnClique; // objeto de button no usages
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);// link entre java e o XML
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //link entre os objetos JAVA e XML
        tv_numero = findViewById(R.id.tv_numero);
        btnClique = findViewById(R.id.btnClique);
    }

    public void dispararContador(View view){

    }
}

//o oncreate é o metodo('main') que quando apertamos o play o projeto é executado pelo oncreatte(disparador inicial)

//


