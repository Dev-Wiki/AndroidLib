package net.devwiki.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.display_button)
    Button displayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.display_button})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.display_button:
                startToActivity(DisplayActivity.class);
                break;
            default:
                break;
        }
    }

    private void startToActivity(Class<?> clazz){
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }
}
