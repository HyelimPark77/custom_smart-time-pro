package com.sma.smartv3.ui.launcher;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class GuideActivity extends BaseActivity {
    public GuideActivity() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        i72.OXO1.iO00(getMContext());
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_launcher;
    }
}
