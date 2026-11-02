package com.sma.smartv3.otherdevice.charge;

import com.android.mltcode.paycertificationapi.gk4;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseChargeActivity extends BaseActivity {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setStatusBarColor(this, gk4.m1859iO(getMContext(), R.color.charge_status_bar_color));
        setNavBarColor(this, gk4.m1859iO(getMContext(), R.color.charge_nav_bar_color));
    }
}
