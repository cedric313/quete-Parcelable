package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        TextView tvBrandParcelable = findViewById(R.id.tvBrand);
        TextView tvKilometersParcelable = findViewById(R.id.tvKilometers);


        Intent intent = getIntent();
        Vehicle vehicle1 = intent.getParcelableExtra("VEHICLE_HONDA");
        tvBrandParcelable.setText(vehicle1.getBrand());
        tvKilometersParcelable.setText(vehicle1.getKilometers());


    }
}
