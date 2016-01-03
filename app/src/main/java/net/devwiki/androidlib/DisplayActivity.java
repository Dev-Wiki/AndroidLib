package net.devwiki.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.devwiki.devlib.util.DisplayUtil;

public class DisplayActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView = (TextView) findViewById(R.id.display_view);

        textView.append("\n");
        textView.append("density:" + getResources().getDisplayMetrics().density);
        textView.append("\n");
        textView.append("dpi:" + getResources().getDisplayMetrics().densityDpi);
        textView.append("\n");
        textView.append("屏幕宽度:" + DisplayUtil.getScreenWidth(this) + "px");
        textView.append("\n");
        textView.append("屏幕宽度:" + DisplayUtil.px2dp(DisplayUtil.getScreenWidth(this)) + "dp");
        textView.append("\n");
        textView.append("屏幕高度:" + DisplayUtil.getScreenHeight(this) + "px");
        textView.append("\n");
        textView.append("屏幕高度:" + DisplayUtil.px2dp(DisplayUtil.getScreenHeight(this)) + "dp");
    }
}
