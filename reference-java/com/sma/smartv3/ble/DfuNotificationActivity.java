package com.sma.smartv3.ble;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.main.MainActivity;

/* JADX INFO: loaded from: classes18.dex */
public final class DfuNotificationActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        if (isTaskRoot()) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            Intent intent2 = getIntent();
            if (intent2 != null && (extras = intent2.getExtras()) != null) {
                intent.putExtras(extras);
            }
            startActivity(intent);
        }
        finish();
    }
}
