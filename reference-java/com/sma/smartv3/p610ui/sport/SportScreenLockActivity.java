package com.sma.smartv3.p610ui.sport;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.view.SlideLockView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportScreenLockActivity extends BaseSportOnGoingActivity {

    public static final class OXO1 implements SlideLockView.InterfaceC19067iO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.SlideLockView.InterfaceC19067iO
        public void OXO1() {
            SportScreenLockActivity.this.finish();
        }
    }

    private final void setFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(5890);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setFullScreen();
        if (Build.VERSION.SDK_INT < 27) {
            getWindow().addFlags(4194304);
            getWindow().addFlags(524288);
            getWindow().addFlags(2097152);
        } else {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            Object systemService = getSystemService("keyguard");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            ((KeyguardManager) systemService).requestDismissKeyguard(this, null);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity, com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getCountdownRl().setVisibility(8);
        getScreenLockRl().setVisibility(0);
        getSportRunPanel().setVisibility(8);
        getSportProcess().setVisibility(0);
        getMapPanel().setVisibility(8);
        getSlideLockView().I1XOi1(new OXO1());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @aa1 KeyEvent event) {
        Intrinsics.X0O(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode == 4 || keyCode == 82) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    @sf5(tag = I01XX0.i11I)
    public final void onUserPresent(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onUserPresent");
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            setFullScreen();
        }
    }
}
