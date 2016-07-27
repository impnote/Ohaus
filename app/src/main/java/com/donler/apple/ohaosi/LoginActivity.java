package com.donler.apple.ohaosi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @InjectView(R.id.left_btn)
    Button leftBtn;
    @InjectView(R.id.title_text)
    TextView titleText;
    @InjectView(R.id.right_btn)
    Button rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        initTopbar();
    }

    private void initTopbar() {
        leftBtn.setText(R.string.back);
        titleText.setText(R.string.topbar_login_title);
        rightBtn.setEnabled(false);
    }

    @OnClick({R.id.left_btn, R.id.right_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_btn:
                finish();
                break;
            case R.id.right_btn:
                break;
        }
    }


}
