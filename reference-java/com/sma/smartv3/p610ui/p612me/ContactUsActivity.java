package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OiOii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.p612me.ContactUsActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ContactUsActivity extends BaseActivity {

    @tb1
    private OiOii contactImgPopup;

    @aa1
    private final Lazy rooView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01XOiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.rooView_delegate$lambda$0(this.f3931IO);
        }
    });

    @aa1
    private final Lazy facebookLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiIXOi01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.facebookLl_delegate$lambda$0(this.f2244IO);
        }
    });

    @aa1
    private final Lazy facebookLlLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.facebookLlLine_delegate$lambda$0(this.f2897IO);
        }
    });

    @aa1
    private final Lazy lineLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOiXI11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.lineLl_delegate$lambda$0(this.f8199IO);
        }
    });

    @aa1
    private final Lazy lineLlLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX111IOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.lineLlLine_delegate$lambda$0(this.f1959IO);
        }
    });

    @aa1
    private final Lazy whatsAppLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiOXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.whatsAppLl_delegate$lambda$0(this.f3753IO);
        }
    });

    @aa1
    private final Lazy whatsAppLlLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOOi0OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.whatsAppLlLine_delegate$lambda$0(this.f3290IO);
        }
    });

    @aa1
    private final Lazy wxLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1iI1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.wxLl_delegate$lambda$0(this.f1487IO);
        }
    });

    @aa1
    private final Lazy wxLlLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiXIO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.wxLlLine_delegate$lambda$0(this.f1920IO);
        }
    });

    @aa1
    private final Lazy qqLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi01IIiIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.qqLl_delegate$lambda$0(this.f5185IO);
        }
    });

    @aa1
    private final Lazy qqLlLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXIOO0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ContactUsActivity.qqLlLine_delegate$lambda$0(this.f2017IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final View facebookLlLine_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.facebookLlLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View facebookLl_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.facebookLl);
    }

    private final View getFacebookLl() {
        return (View) this.facebookLl$delegate.getValue();
    }

    private final View getFacebookLlLine() {
        return (View) this.facebookLlLine$delegate.getValue();
    }

    private final View getLineLl() {
        return (View) this.lineLl$delegate.getValue();
    }

    private final View getLineLlLine() {
        return (View) this.lineLlLine$delegate.getValue();
    }

    private final View getQqLl() {
        return (View) this.qqLl$delegate.getValue();
    }

    private final View getQqLlLine() {
        return (View) this.qqLlLine$delegate.getValue();
    }

    private final View getRooView() {
        return (View) this.rooView$delegate.getValue();
    }

    private final View getWhatsAppLl() {
        return (View) this.whatsAppLl$delegate.getValue();
    }

    private final View getWhatsAppLlLine() {
        return (View) this.whatsAppLlLine$delegate.getValue();
    }

    private final View getWxLl() {
        return (View) this.wxLl$delegate.getValue();
    }

    private final View getWxLlLine() {
        return (View) this.wxLlLine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View lineLlLine_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.lineLlLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View lineLl_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.lineLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View qqLlLine_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.qqLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View qqLl_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.qqLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rooView_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View whatsAppLlLine_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.whatsAppLlLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View whatsAppLl_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.whatsAppLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View wxLlLine_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.wxLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View wxLl_delegate$lambda$0(ContactUsActivity contactUsActivity) {
        return contactUsActivity.findViewById(R.id.wxLl);
    }

    public final void contactFacebook(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Uri uri = Uri.parse(i72.OXO1.i010I());
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.facebook.katana");
        try {
            startActivity(intent);
        } catch (Exception unused) {
            startActivity(new Intent(new Intent("android.intent.action.VIEW", uri)));
        }
    }

    public final void contactLine(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Intent intent = new Intent();
        intent.setData(Uri.parse(i72.OXO1.O1O()));
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    public final void contactQQ(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        OiOii oiOii = new OiOii(this);
        oiOii.m1040OX(Integer.valueOf(i72.OXO1.X1IX()));
        this.contactImgPopup = oiOii;
        View rooView = getRooView();
        Intrinsics.O10IXXX0X(rooView, "<get-rooView>(...)");
        oiOii.XiOIO(rooView);
    }

    public final void contactWX(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        OiOii oiOii = new OiOii(this);
        oiOii.m1040OX(Integer.valueOf(i72.OXO1.iiiO()));
        this.contactImgPopup = oiOii;
        View rooView = getRooView();
        Intrinsics.O10IXXX0X(rooView, "<get-rooView>(...)");
        oiOii.XiOIO(rooView);
    }

    public final void contactWhatsApp(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Intent intent = new Intent();
        intent.setData(Uri.parse(i72.OXO1.Ii1iii0()));
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.contact_us);
        i72 i72Var = i72.OXO1;
        if (i72Var.I011X()) {
            getFacebookLl().setVisibility(0);
            getFacebookLlLine().setVisibility(0);
        } else {
            getFacebookLl().setVisibility(8);
            getFacebookLlLine().setVisibility(8);
        }
        if (i72Var.m2041II()) {
            getLineLl().setVisibility(0);
            getLineLlLine().setVisibility(0);
        } else {
            getLineLl().setVisibility(8);
            getLineLlLine().setVisibility(8);
        }
        if (i72Var.iXi1iI0()) {
            getWhatsAppLl().setVisibility(0);
            getWhatsAppLlLine().setVisibility(0);
        } else {
            getWhatsAppLl().setVisibility(8);
            getWhatsAppLlLine().setVisibility(8);
        }
        if (i72Var.OO1O00iI()) {
            getWxLl().setVisibility(0);
            getWxLlLine().setVisibility(0);
        } else {
            getWxLl().setVisibility(8);
            getWxLlLine().setVisibility(8);
        }
        if (i72Var.IOI()) {
            getQqLl().setVisibility(0);
            getQqLlLine().setVisibility(0);
        } else {
            getQqLl().setVisibility(8);
            getQqLlLine().setVisibility(8);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_contact_us;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
