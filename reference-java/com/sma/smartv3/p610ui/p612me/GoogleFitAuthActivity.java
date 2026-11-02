package com.sma.smartv3.p610ui.p612me;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.X1IIXO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.p612me.GoogleFitAuthActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GoogleFitAuthActivity extends BaseActivity {
    private boolean isGoogleFitSyncBoolean;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiIOXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoogleFitAuthActivity.rootView_delegate$lambda$0(this.f2238IO);
        }
    });

    @aa1
    private final Lazy btnRevoke$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00X00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoogleFitAuthActivity.btnRevoke_delegate$lambda$0(this.f2381IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnRevoke_delegate$lambda$0(GoogleFitAuthActivity googleFitAuthActivity) {
        return googleFitAuthActivity.findViewById(R.id.btn_revoke);
    }

    private final View getBtnRevoke() {
        return (View) this.btnRevoke$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(GoogleFitAuthActivity googleFitAuthActivity) {
        return googleFitAuthActivity.findViewById(R.id.root_view);
    }

    @aa1
    public final Intent getFitIntent(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.O10IXXX0X(packageManager, "getPackageManager(...)");
        try {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.fitness");
            Intrinsics.XXI(launchIntentForPackage);
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            return launchIntentForPackage;
        } catch (Exception unused) {
            return new Intent();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.authorize);
        getBtnRevoke().setVisibility(a01.OXO1.IiI10X().getBoolean(b01.X1ii) ? 0 : 8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_google_fit_auth;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtils.m11128d(i + " " + i2 + " " + intent);
        a01.OXO1.IiI10X().put(b01.X1ii, X1IIXO.OXO1.O10IXXX0X(this, i, i2));
        this.isGoogleFitSyncBoolean = true;
        initView();
    }

    public final void onRevoke(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X1IIXO.OXO1.m1144OX(this);
        a01.OXO1.IiI10X().put(b01.X1ii, false);
        initView();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void toGoogleFit(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        if (a01Var.IiI10X().getBoolean(b01.X1ii)) {
            try {
                startActivity(getFitIntent(this));
                return;
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                return;
            }
        }
        X1IIXO.OXO1.XXI(this);
        if (this.isGoogleFitSyncBoolean) {
            a01Var.IiI10X().put(b01.X1ii, true);
            initView();
        }
    }
}
