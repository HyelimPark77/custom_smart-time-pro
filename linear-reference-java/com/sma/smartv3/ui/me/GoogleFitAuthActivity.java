package com.sma.smartv3.ui.me;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.IiIOXX;
import com.android.mltcode.paycertificationapi.O00X00;
import com.android.mltcode.paycertificationapi.X1IIXO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GoogleFitAuthActivity extends BaseActivity {

    @aa1
    private final Lazy btnRevoke$delegate;
    private boolean isGoogleFitSyncBoolean;

    @aa1
    private final Lazy rootView$delegate;

    public GoogleFitAuthActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new IiIOXX(this));
        this.btnRevoke$delegate = LazyKt__LazyJVMKt.iO(new O00X00(this));
    }

    public static /* synthetic */ View I0iXXO(GoogleFitAuthActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OIX0iXi(GoogleFitAuthActivity r0) {
        return btnRevoke_delegate$lambda$0(r0);
    }

    private static final View btnRevoke_delegate$lambda$0(GoogleFitAuthActivity r1) {
        return r1.findViewById(R.id.btn_revoke);
    }

    private final View getBtnRevoke() {
        return (View) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private static final View rootView_delegate$lambda$0(GoogleFitAuthActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    @aa1
    public final Intent getFitIntent(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        PackageManager r3 = r2.getPackageManager();
        Intrinsics.O10IXXX0X(r3, "getPackageManager(...)");
        Intent r4 = r3.getLaunchIntentForPackage("com.google.android.apps.fitness");     // Catch: Exception -> L5
        Intrinsics.XXI(r4);     // Catch: Exception -> L5
        r4.addCategory("android.intent.category.LAUNCHER");     // Catch: Exception -> L5
        return r4;
    L6:
        return new Intent();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.authorize);
        View r0 = getBtnRevoke();
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        return;
    L5:
        r1 = 8;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_google_fit_auth;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r3, int r4, @tb1 Intent r5) {
        super.onActivityResult(r3, r4, r5);
        LogUtils.d(new Object[]{r3 + " " + r4 + " " + r5});
        a01.OXO1.IiI10X().put(b01.X1ii, X1IIXO.OXO1.O10IXXX0X(this, r3, r4));
        this.isGoogleFitSyncBoolean = true;
        initView();
    }

    public final void onRevoke(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        X1IIXO.OXO1.OX(this);
        a01.OXO1.IiI10X().put(b01.X1ii, false);
        initView();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void toGoogleFit(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01 r4 = a01.OXO1;
        if (r4.IiI10X().getBoolean(b01.X1ii) == true) goto L12;
        X1IIXO.OXO1.XXI(this);
        if (this.isGoogleFitSyncBoolean == false) goto L15;
        r4.IiI10X().put(b01.X1ii, true);
        initView();
        return;
    L15:
        return;
    L12:
        startActivity(getFitIntent(this));     // Catch: ActivityNotFoundException -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }
}
