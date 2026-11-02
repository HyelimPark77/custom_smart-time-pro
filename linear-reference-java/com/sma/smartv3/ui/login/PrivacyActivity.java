package com.sma.smartv3.ui.login;

import android.app.Activity;
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
import com.android.mltcode.paycertificationapi.q52;
import com.android.mltcode.paycertificationapi.r52;
import com.android.mltcode.paycertificationapi.s52;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t52;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ironsource.C2985d4;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPrivacyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyActivity.kt\ncom/sma/smartv3/ui/login/PrivacyActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,119:1\n255#2:120\n*S KotlinDebug\n*F\n+ 1 PrivacyActivity.kt\ncom/sma/smartv3/ui/login/PrivacyActivity\n*L\n93#1:120\n*E\n"})
public final class PrivacyActivity extends BaseActivity {

    @aa1
    private final Lazy privacyAppCheck$delegate;

    @aa1
    private final Lazy privacyAppTv$delegate;

    @aa1
    private final Lazy privacyContentTv$delegate;

    public static final class OXO1 extends ClickableSpan {
        public final /* synthetic */ PrivacyActivity IO;

        public OXO1(PrivacyActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View r2) {
            Intrinsics.X0O(r2, "widget");
            i72.OXO1.iIi011O(PrivacyActivity.access$getMContext(this.IO));
        }
    }

    public PrivacyActivity() {
        this.privacyContentTv$delegate = LazyKt__LazyJVMKt.iO(new r52(this));
        this.privacyAppTv$delegate = LazyKt__LazyJVMKt.iO(new s52(this));
        this.privacyAppCheck$delegate = LazyKt__LazyJVMKt.iO(new t52(this));
    }

    public static /* synthetic */ CheckBox I0iXXO(PrivacyActivity r0) {
        return privacyAppCheck_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(PrivacyActivity r0, CompoundButton r1, boolean r2) {
        initView$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ PFMedium X1ii(PrivacyActivity r0) {
        return privacyAppTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(PrivacyActivity r0) {
        return privacyContentTv_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMContext(PrivacyActivity r0) {
        return r0.getMContext();
    }

    private final CheckBox getPrivacyAppCheck() {
        return (CheckBox) getValue();
    }

    private final PFMedium getPrivacyAppTv() {
        return (PFMedium) getValue();
    }

    private final PFMedium getPrivacyContentTv() {
        return (PFMedium) getValue();
    }

    private static final void initView$lambda$0$0(PrivacyActivity r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "<unused var>");
        View r4 = r1.findViewById(R.id.bt_agree);
        if (r4 == null) goto L9;
        if (r3 == false) goto L6;
        int r5 = R.drawable.shape_privacy_agree_false;
    L7:
        r4.setBackgroundResource(r5);
        return;
    L6:
        r5 = R.drawable.pop_bt_color_c8c8c8;
        goto L7
    }

    private static final CheckBox privacyAppCheck_delegate$lambda$0(PrivacyActivity r1) {
        return (CheckBox) r1.findViewById(R.id.privacyAppCheck);
    }

    private static final PFMedium privacyAppTv_delegate$lambda$0(PrivacyActivity r1) {
        return (PFMedium) r1.findViewById(R.id.privacyAppTv);
    }

    private static final PFMedium privacyContentTv_delegate$lambda$0(PrivacyActivity r1) {
        return (PFMedium) r1.findViewById(R.id.privacyContentTv);
    }

    public final void agreePrivacyClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        CheckBox r6 = getPrivacyAppCheck();
        Intrinsics.O10IXXX0X(r6, "<get-privacyAppCheck>(...)");
        if (r6.getVisibility() == 0) goto L5;
    L8:
        a01 r7 = a01.OXO1;
        r7.OXO1().put(b01.OIX0iXi, true);
        I01XX0.XIi00iiXO(b01.OIX0iXi, null, 2, null);
        i72 r1 = i72.OXO1;
        if (r1.ii0111XI() == false) goto L11;
        r1.Oi1I(this);
    L12:
        finish();
        return;
    L11:
        r7.IiI10X().put(b01.O001I, false);
        r1.XX(this);
        goto L12
    L5:
        if (getPrivacyAppCheck().isChecked() == true) goto L8;
        ToastUtils.showLong(getString(R.string.privacy_tick_tip) + C2985d4.j.d + getPrivacyAppTv().getText() + C2985d4.j.e, new Object[0]);
    }

    public final void denyPrivacyClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        AppUtils.exitApp();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        i72 r0 = i72.OXO1;
        if (r0.ii0111XI() == false) goto L5;
        int r1 = R.string.privacy_content;
        int r2 = R.string.privacy_agreement_reminder;
    L6:
        getPrivacyContentTv().setText(getString(r1, new Object[]{getString(R.string.app_name)}));
        getPrivacyContentTv().setMovementMethod(new ScrollingMovementMethod());
        SpanUtils.with(getPrivacyAppTv()).append(getString(r2)).append(getString(R.string.privacy_agreement)).setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new OXO1(this)).create();
        View r3 = findViewById(R.id.bt_deny);
        int r4 = 8;
        if (r0.IIX() == false) goto L9;
        int r5 = 0;
    L10:
        r3.setVisibility(r5);
        CheckBox r6 = getPrivacyAppCheck();
        if (r0.IIX() == false) goto L13;
    L14:
        r4 = 0;
    L15:
        r6.setVisibility(r4);
        r6.setOnCheckedChangeListener(new q52(this));
        return;
    L13:
        if (r0.OiXI1OiX0() == false) goto L15;
    L9:
        r5 = 8;
        goto L10
    L5:
        r1 = R.string.privacy_content_no_login;
        r2 = R.string.privacy_agreement_reminder_no_login;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_privacy;
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        if (isFinishing() == true) goto L6;
        finish();
        return;
    }
}
