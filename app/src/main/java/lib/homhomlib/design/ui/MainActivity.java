package lib.homhomlib.design.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import lib.homhomlib.design.SlidingLayout;

public class MainActivity extends AppCompatActivity {
    private SlidingLayout mSlidingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        mSlidingLayout = (SlidingLayout)this.findViewById(R.id.slidingLayout);
        mSlidingLayout.setBackView(View.inflate(this, R.layout.view_bg, null));
//        View front = View.inflate(this,R.layout.view_front,null);
        WebView webView = (WebView) this.findViewById(R.id.webView);
        webView.loadUrl("https://github.com/HomHomLin");
//        mSlidingLayout.setFrontView(front);
    }
}
