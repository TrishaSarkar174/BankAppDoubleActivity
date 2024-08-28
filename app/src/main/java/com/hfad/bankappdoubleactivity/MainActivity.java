package com.hfad.bankappdoubleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Account account=new Account();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void findAccount(View view) {
        Spinner spinner = findViewById(R.id.spinnerID);
        String string = String.valueOf(spinner.getSelectedItem());


       List<String> accounts=  account.getAccounts(string);

       StringBuilder stringBuilder = new StringBuilder();
       for(String s:accounts)
       {
           stringBuilder.append(s).append('\n');
       }
       String text= stringBuilder.toString();
       Intent intent = new Intent(this,DisplayActivity.class);
       intent.putExtra("message",text);
       startActivity(intent);
    }
}