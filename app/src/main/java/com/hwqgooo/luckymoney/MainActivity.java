package com.hwqgooo.luckymoney;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.activity_open_access);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.setClassName("com.android.settings", "com.android.settings.SubSettings");
//                intent.putExtra(EXTRA_SHOW_FRAGMENT, "com.android.settings
// .AccessibilitySettings");
//                intent.putExtra(EXTRA_SHOW_FRAGMENT_TITLE, "ttt");
//                intent.putExtra(EXTRA_NO_HEADERS, true);
//                startActivity(intent);
                Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                startActivity(intent);
            }
        });
    }
}
