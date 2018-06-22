package test.innotiveinc.button;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sub_activity extends AppCompatActivity {

    private EditText textUrl;
    private WebView webView;
    private Button backButton,forwardButtobn;
    private View.OnKeyListener listener = new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() != KeyEvent.ACTION_DOWN) {
                return false;
            }
            boolean processed = false;
            switch (keyCode) {
                case KeyEvent.KEYCODE_ENTER:
                    webView.loadUrl(textUrl.getText().toString());
                    Toast.makeText(
                            sub_activity.this,
                            textUrl.getText().toString(), Toast.LENGTH_SHORT).show();
                    processed = true;
                    break;
                default:
                    break;
            }
            return processed;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_activity);
        hideActionBar();
        setupUI();
    }
    private void setupUI() {
        backButton=(Button)findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(webView.canGoBack()){
                    webView.goBack();
                }else{
                    Toast.makeText(sub_activity.this,"맨 뒷페이지",Toast.LENGTH_SHORT).show();
                }
            }
        });
        forwardButtobn=(Button)findViewById(R.id.forward) ;

        textUrl = (EditText) findViewById(R.id.text_url);
        textUrl.setOnKeyListener(listener);
        textUrl.setText("https://www.google.co.kr");
        webView=(WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
    }
    public void goForward(View view){
        if(webView.canGoForward()){
            webView.goForward();
        }else{
            Toast.makeText(sub_activity.this,"맨 앞페이지",Toast.LENGTH_SHORT).show();
        }
    }
    private void hideActionBar(){
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
    }
}

