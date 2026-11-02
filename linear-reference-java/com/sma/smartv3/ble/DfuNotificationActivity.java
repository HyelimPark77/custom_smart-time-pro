package com.sma.smartv3.ble;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ui.main.MainActivity;

/* JADX INFO: loaded from: classes18.dex */
public final class DfuNotificationActivity extends AppCompatActivity {
    public DfuNotificationActivity() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r2) {
        super.onCreate(r2);
        if (isTaskRoot() == false) goto L10;
        Intent r3 = new Intent(this, MainActivity.class);
        r3.addFlags(268435456);
        Intent r0 = getIntent();
        if (r0 == null) goto L9;
        Bundle r1 = r0.getExtras();
        if (r1 == null) goto L9;
        r3.putExtras(r1);
    L9:
        startActivity(r3);
    L10:
        finish();
    }
}
