package hcmute.edu.vn.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLaunchWebPagebuttonClicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
        startActivity(intent);

    }
}