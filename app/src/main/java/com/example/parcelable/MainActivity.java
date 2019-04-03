package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etBrand = findViewById(R.id.etBrand);
        final EditText etKilometers = findViewById(R.id.etKilometer);
        Button btGo = findViewById(R.id.btGo);
        btGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brand = etBrand.getText().toString();
                String kilometers = etKilometers.getText().toString();

            Vehicle vehicle1 = new Vehicle(brand, kilometers);

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("VEHICLE_HONDA", vehicle1);
                startActivity(intent);

            }
        });
    }
}
