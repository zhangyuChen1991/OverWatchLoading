package com.czy.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.chenzy.owloading.OWLoadingView;

public class MainActivity extends AppCompatActivity {
    private OWLoadingView owLoadingView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        owLoadingView = (OWLoadingView) findViewById(R.id.owloading);
        owLoadingView.setAutoStartAnim(true);//设置自动开启动画
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn.getText().equals("开始")){
                    owLoadingView.startAnim();
                    btn.setText("中止");
                }else{
                    owLoadingView.stopAnim();
                    btn.setText("开始");
                }
            }
        });
    }

}
