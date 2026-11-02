package com.sma.smartv3.ui.sport;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.p45;
import com.android.mltcode.paycertificationapi.q45;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.view.SlideLockView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportScreenLockActivity extends BaseSportOnGoingActivity {

    public static final class OXO1 implements SlideLockView.iO {
        public final /* synthetic */ SportScreenLockActivity OXO1;

        public OXO1(SportScreenLockActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.SlideLockView.iO
        public void OXO1() {
            this.OXO1.finish();
        }
    }

    public SportScreenLockActivity() {
    }

    private final void setFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(5890);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        setFullScreen();
        if (Build.VERSION.SDK_INT < 27) goto L6;
        p45.OXO1(this, true);
        q45.OXO1(this, true);
        Object r3 = getSystemService("keyguard");
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type android.app.KeyguardManager");
        ((KeyguardManager) r3).requestDismissKeyguard(this, null);
        return;
    L6:
        getWindow().addFlags(4194304);
        getWindow().addFlags(524288);
        getWindow().addFlags(2097152);
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity, com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getCountdownRl().setVisibility(8);
        getScreenLockRl().setVisibility(0);
        getSportRunPanel().setVisibility(8);
        getSportProcess().setVisibility(0);
        getMapPanel().setVisibility(8);
        getSlideLockView().I1XOi1(new OXO1(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, @aa1 KeyEvent r5) {
        Intrinsics.X0O(r5, NotificationCompat.CATEGORY_EVENT);
        int r0 = r5.getKeyCode();
        if (r0 != 4) goto L5;
    L8:
        return true;
    L5:
        if (r0 == 82) goto L8;
        return super.onKeyDown(r4, r5);
    }

    @sf5(tag = I01XX0.i11I)
    public final void onUserPresent(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onUserPresent"});
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
        super.onWindowFocusChanged(r1);
        if (r1 == false) goto L6;
        setFullScreen();
        return;
    }
}
