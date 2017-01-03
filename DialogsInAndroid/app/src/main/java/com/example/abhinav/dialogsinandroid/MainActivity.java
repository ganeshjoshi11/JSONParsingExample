package com.example.abhinav.dialogsinandroid;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDialog(View view){
        Dialog dialog = new Dialog(this);
        dialog.setTitle("Lorem Ipsum");

        //Creating view for dialog message
        TextView textView = new TextView(this);
        textView.setText("Lorem ipsum dolor sit amet");
        textView.setPadding(50,50,50,50);

        dialog.setContentView(textView);

       dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
           @Override
           public void onDismiss(DialogInterface dialog) {
               Toast.makeText(MainActivity.this,"Dialog Diss")
           }
       });
    }
}
