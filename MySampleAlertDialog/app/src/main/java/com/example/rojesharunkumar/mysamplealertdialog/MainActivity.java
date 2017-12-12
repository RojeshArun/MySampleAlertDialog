package com.example.rojesharunkumar.mysamplealertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btnDefault, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDefault = findViewById(R.id.btn_default);
        btnCustom = findViewById(R.id.btn_custom);


        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                showDefaultAlert();
            }
        });


        btnCustom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                showCustomAlertDialog();

            }
        }
        );


    }

    private void showCustomAlertDialog() {

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.my_custom_alertdialog);

        final Button btnStart = dialog.findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                btnStart.setBackgroundColor(R.color.colorAccent);
            }
        });

        dialog.show();

    }

    private void showDefaultAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Alert!!!");
        builder.setMessage("Hi Heloo how are you today???");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //TODO
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "No Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Dialog dialog = builder.create();
        dialog.show();


    }


}
