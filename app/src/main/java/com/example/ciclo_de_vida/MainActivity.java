package com.example.ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
    public void mostrar(View v){
        switch (v.getId()){
            case R.id.banana:
                Toast.makeText(this,"Sellecionaste las bananas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranja:
                Toast.makeText(this,"Sellecionaste las naranjas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this,"Sellecionaste los melones",Toast.LENGTH_SHORT).show();
                break;
            case R.id.manza:
                Toast.makeText(this,"Sellecionaste las manzanas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mango:
                Toast.makeText(this,"Sellecionaste los mangos",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lu:
                Toast.makeText(this,"Sellecionaste los kiwis",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fre:
                Toast.makeText(this,"Sellecionaste las fresas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.f:
                Toast.makeText(this,"Sellecionaste las frambuesas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mora:
                Toast.makeText(this,"Sellecionaste las sarzamora",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this,"Sellecionaste las peras",Toast.LENGTH_SHORT).show();
                break;
            case R.id.piña:
                Toast.makeText(this,"Sellecionaste las piñas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.patilla:
                Toast.makeText(this,"Sellecionaste las Patillas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.uva:
                Toast.makeText(this,"Sellecionaste las uvas",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
