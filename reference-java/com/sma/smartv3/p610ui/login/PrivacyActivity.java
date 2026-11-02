package com.sma.smartv3.p610ui.login;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ironsource.C12616d4;
import com.sma.smartv3.p610ui.login.PrivacyActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPrivacyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyActivity.kt\ncom/sma/smartv3/ui/login/PrivacyActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,119:1\n255#2:120\n*S KotlinDebug\n*F\n+ 1 PrivacyActivity.kt\ncom/sma/smartv3/ui/login/PrivacyActivity\n*L\n93#1:120\n*E\n"})
public final class PrivacyActivity extends BaseActivity {

    @aa1
    private final Lazy privacyContentTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r52
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PrivacyActivity.privacyContentTv_delegate$lambda$0(this.f10750IO);
        }
    });

    @aa1
    private final Lazy privacyAppTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s52
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PrivacyActivity.privacyAppTv_delegate$lambda$0(this.f10968IO);
        }
    });

    @aa1
    private final Lazy privacyAppCheck$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t52
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PrivacyActivity.privacyAppCheck_delegate$lambda$0(this.f11191IO);
        }
    });

    public static final class OXO1 extends ClickableSpan {
        public OXO1() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            i72.OXO1.iIi011O(PrivacyActivity.this.getMContext());
        }
    }

    private final CheckBox getPrivacyAppCheck() {
        return (CheckBox) this.privacyAppCheck$delegate.getValue();
    }

    private final PFMedium getPrivacyAppTv() {
        return (PFMedium) this.privacyAppTv$delegate.getValue();
    }

    private final PFMedium getPrivacyContentTv() {
        return (PFMedium) this.privacyContentTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(PrivacyActivity privacyActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        View viewFindViewById = privacyActivity.findViewById(R.id.bt_agree);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(z ? R.drawable.shape_privacy_agree_false : R.drawable.pop_bt_color_c8c8c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox privacyAppCheck_delegate$lambda$0(PrivacyActivity privacyActivity) {
        return (CheckBox) privacyActivity.findViewById(R.id.privacyAppCheck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium privacyAppTv_delegate$lambda$0(PrivacyActivity privacyActivity) {
        return (PFMedium) privacyActivity.findViewById(R.id.privacyAppTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium privacyContentTv_delegate$lambda$0(PrivacyActivity privacyActivity) {
        return (PFMedium) privacyActivity.findViewById(R.id.privacyContentTv);
    }

    public final void agreePrivacyClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        CheckBox privacyAppCheck = getPrivacyAppCheck();
        Intrinsics.O10IXXX0X(privacyAppCheck, "<get-privacyAppCheck>(...)");
        if (privacyAppCheck.getVisibility() == 0 && !getPrivacyAppCheck().isChecked()) {
            ToastUtils.showLong(getString(R.string.privacy_tick_tip) + C12616d4.j.f34440d + ((Object) getPrivacyAppTv().getText()) + C12616d4.j.f34442e, new Object[0]);
            return;
        }
        a01 a01Var = a01.OXO1;
        a01Var.OXO1().put(b01.OIX0iXi, true);
        I01XX0.XIi00iiXO(b01.OIX0iXi, null, 2, null);
        i72 i72Var = i72.OXO1;
        if (i72Var.ii0111XI()) {
            i72Var.Oi1I(this);
        } else {
            a01Var.IiI10X().put(b01.O001I, false);
            i72Var.m2053XX(this);
        }
        finish();
    }

    public final void denyPrivacyClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        AppUtils.exitApp();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int i;
        int i2;
        i72 i72Var = i72.OXO1;
        if (i72Var.ii0111XI()) {
            i = R.string.privacy_content;
            i2 = R.string.privacy_agreement_reminder;
        } else {
            i = R.string.privacy_content_no_login;
            i2 = R.string.privacy_agreement_reminder_no_login;
        }
        getPrivacyContentTv().setText(getString(i, getString(R.string.app_name)));
        getPrivacyContentTv().setMovementMethod(new ScrollingMovementMethod());
        SpanUtils.with(getPrivacyAppTv()).append(getString(i2)).append(getString(R.string.privacy_agreement)).setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new OXO1()).create();
        findViewById(R.id.bt_deny).setVisibility(i72Var.IIX() ? 0 : 8);
        CheckBox privacyAppCheck = getPrivacyAppCheck();
        privacyAppCheck.setVisibility((i72Var.IIX() || i72Var.OiXI1OiX0()) ? 0 : 8);
        privacyAppCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.q52
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacyActivity.initView$lambda$0$0(this.f10513IO, compoundButton, z);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_privacy;
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
