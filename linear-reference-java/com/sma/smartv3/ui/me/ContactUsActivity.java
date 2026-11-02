package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I1iI1O1;
import com.android.mltcode.paycertificationapi.IOiXIO1;
import com.android.mltcode.paycertificationapi.IX111IOX;
import com.android.mltcode.paycertificationapi.IXIOO0I;
import com.android.mltcode.paycertificationapi.IiIXOi01;
import com.android.mltcode.paycertificationapi.OI0iO;
import com.android.mltcode.paycertificationapi.OOOi0OI;
import com.android.mltcode.paycertificationapi.OiOXO;
import com.android.mltcode.paycertificationapi.OiOii;
import com.android.mltcode.paycertificationapi.X01XOiXi;
import com.android.mltcode.paycertificationapi.Xi01IIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOiXI11I;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ContactUsActivity extends BaseActivity {

    @tb1
    private OiOii contactImgPopup;

    @aa1
    private final Lazy facebookLl$delegate;

    @aa1
    private final Lazy facebookLlLine$delegate;

    @aa1
    private final Lazy lineLl$delegate;

    @aa1
    private final Lazy lineLlLine$delegate;

    @aa1
    private final Lazy qqLl$delegate;

    @aa1
    private final Lazy qqLlLine$delegate;

    @aa1
    private final Lazy rooView$delegate;

    @aa1
    private final Lazy whatsAppLl$delegate;

    @aa1
    private final Lazy whatsAppLlLine$delegate;

    @aa1
    private final Lazy wxLl$delegate;

    @aa1
    private final Lazy wxLlLine$delegate;

    public ContactUsActivity() {
        this.rooView$delegate = LazyKt__LazyJVMKt.iO(new X01XOiXi(this));
        this.facebookLl$delegate = LazyKt__LazyJVMKt.iO(new IiIXOi01(this));
        this.facebookLlLine$delegate = LazyKt__LazyJVMKt.iO(new OI0iO(this));
        this.lineLl$delegate = LazyKt__LazyJVMKt.iO(new iOiXI11I(this));
        this.lineLlLine$delegate = LazyKt__LazyJVMKt.iO(new IX111IOX(this));
        this.whatsAppLl$delegate = LazyKt__LazyJVMKt.iO(new OiOXO(this));
        this.whatsAppLlLine$delegate = LazyKt__LazyJVMKt.iO(new OOOi0OI(this));
        this.wxLl$delegate = LazyKt__LazyJVMKt.iO(new I1iI1O1(this));
        this.wxLlLine$delegate = LazyKt__LazyJVMKt.iO(new IOiXIO1(this));
        this.qqLl$delegate = LazyKt__LazyJVMKt.iO(new Xi01IIiIO(this));
        this.qqLlLine$delegate = LazyKt__LazyJVMKt.iO(new IXIOO0I(this));
    }

    public static /* synthetic */ View I0iXXO(ContactUsActivity r0) {
        return whatsAppLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View I1XOi1(ContactUsActivity r0) {
        return qqLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IIX1OXO(ContactUsActivity r0) {
        return whatsAppLlLine_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(ContactUsActivity r0) {
        return facebookLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OIX0iXi(ContactUsActivity r0) {
        return facebookLlLine_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(ContactUsActivity r0) {
        return lineLlLine_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(ContactUsActivity r0) {
        return rooView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XX0(ContactUsActivity r0) {
        return wxLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(ContactUsActivity r0) {
        return lineLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(ContactUsActivity r0) {
        return wxLlLine_delegate$lambda$0(r0);
    }

    private static final View facebookLlLine_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.facebookLlLine);
    }

    private static final View facebookLl_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.facebookLl);
    }

    private final View getFacebookLl() {
        return (View) getValue();
    }

    private final View getFacebookLlLine() {
        return (View) getValue();
    }

    private final View getLineLl() {
        return (View) getValue();
    }

    private final View getLineLlLine() {
        return (View) getValue();
    }

    private final View getQqLl() {
        return (View) getValue();
    }

    private final View getQqLlLine() {
        return (View) getValue();
    }

    private final View getRooView() {
        return (View) getValue();
    }

    private final View getWhatsAppLl() {
        return (View) getValue();
    }

    private final View getWhatsAppLlLine() {
        return (View) getValue();
    }

    private final View getWxLl() {
        return (View) getValue();
    }

    private final View getWxLlLine() {
        return (View) getValue();
    }

    public static /* synthetic */ View iIiiO(ContactUsActivity r0) {
        return qqLlLine_delegate$lambda$0(r0);
    }

    private static final View lineLlLine_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.lineLlLine);
    }

    private static final View lineLl_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.lineLl);
    }

    private static final View qqLlLine_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.qqLine);
    }

    private static final View qqLl_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.qqLl);
    }

    private static final View rooView_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final View whatsAppLlLine_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.whatsAppLlLine);
    }

    private static final View whatsAppLl_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.whatsAppLl);
    }

    private static final View wxLlLine_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.wxLine);
    }

    private static final View wxLl_delegate$lambda$0(ContactUsActivity r1) {
        return r1.findViewById(R.id.wxLl);
    }

    public final void contactFacebook(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Uri r5 = Uri.parse(i72.OXO1.i010I());
        Intent r0 = new Intent("android.intent.action.VIEW", r5);
        r0.setPackage("com.facebook.katana");
        startActivity(r0);     // Catch: Exception -> L5
        return;
    L5:
        startActivity(new Intent(new Intent("android.intent.action.VIEW", r5)));
    }

    public final void contactLine(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        Intent r3 = new Intent();
        r3.setData(Uri.parse(i72.OXO1.O1O()));
        r3.setAction("android.intent.action.VIEW");
        startActivity(r3);
    }

    public final void contactQQ(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        OiOii r4 = new OiOii(this);
        r4.OX(Integer.valueOf(i72.OXO1.X1IX()));
        this.contactImgPopup = r4;
        View r0 = getRooView();
        Intrinsics.O10IXXX0X(r0, "<get-rooView>(...)");
        r4.XiOIO(r0);
    }

    public final void contactWX(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        OiOii r4 = new OiOii(this);
        r4.OX(Integer.valueOf(i72.OXO1.iiiO()));
        this.contactImgPopup = r4;
        View r0 = getRooView();
        Intrinsics.O10IXXX0X(r0, "<get-rooView>(...)");
        r4.XiOIO(r0);
    }

    public final void contactWhatsApp(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        Intent r3 = new Intent();
        r3.setData(Uri.parse(i72.OXO1.Ii1iii0()));
        r3.setAction("android.intent.action.VIEW");
        startActivity(r3);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.contact_us);
        i72 r0 = i72.OXO1;
        if (r0.I011X() == false) goto L5;
        getFacebookLl().setVisibility(0);
        getFacebookLlLine().setVisibility(0);
    L7:
        if (r0.II() == false) goto L9;
        getLineLl().setVisibility(0);
        getLineLlLine().setVisibility(0);
    L11:
        if (r0.iXi1iI0() == false) goto L13;
        getWhatsAppLl().setVisibility(0);
        getWhatsAppLlLine().setVisibility(0);
    L15:
        if (r0.OO1O00iI() == false) goto L17;
        getWxLl().setVisibility(0);
        getWxLlLine().setVisibility(0);
    L19:
        if (r0.IOI() == false) goto L22;
        getQqLl().setVisibility(0);
        getQqLlLine().setVisibility(0);
        return;
    L22:
        getQqLl().setVisibility(8);
        getQqLlLine().setVisibility(8);
        return;
    L17:
        getWxLl().setVisibility(8);
        getWxLlLine().setVisibility(8);
        goto L19
    L13:
        getWhatsAppLl().setVisibility(8);
        getWhatsAppLlLine().setVisibility(8);
        goto L15
    L9:
        getLineLl().setVisibility(8);
        getLineLlLine().setVisibility(8);
        goto L11
    L5:
        getFacebookLl().setVisibility(8);
        getFacebookLlLine().setVisibility(8);
        goto L7
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_contact_us;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
