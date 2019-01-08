package com.psyche.pay;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.psyche.pay.util.DialogUtils;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pay:
                DialogUtils.showDonateDialog(this);
                break;
        }
    }

}
