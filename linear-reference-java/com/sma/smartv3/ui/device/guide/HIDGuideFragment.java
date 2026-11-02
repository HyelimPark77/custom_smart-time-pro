package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.III1OI;
import com.android.mltcode.paycertificationapi.X1X1II;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HIDGuideFragment extends BaseGuideFragment {
    private final int BOUND_MAX_TIME;
    private int bondFailedTime;
    private boolean canSwipe;

    @aa1
    private HIDGuideFragment$mBluetoothReceiver$1 mBluetoothReceiver;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final Lazy tvHighTip$delegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.sma.smartv3.ui.device.guide.HIDGuideFragment$mBluetoothReceiver$1] */
    public HIDGuideFragment() {
        this.BOUND_MAX_TIME = 3;
        this.tvHighTip$delegate = LazyKt__LazyJVMKt.iO(new III1OI(this));
        this.mBluetoothReceiver = new HIDGuideFragment$mBluetoothReceiver$1(this);
    }

    public static /* synthetic */ boolean XO0O10(HIDGuideFragment r0, View r1, int r2, KeyEvent r3) {
        return initView$lambda$0(r0, r1, r2, r3);
    }

    public static final /* synthetic */ void access$doPairDone(HIDGuideFragment r0, boolean r1) {
        r0.doPairDone(r1);
    }

    public static final /* synthetic */ int access$getBOUND_MAX_TIME$p(HIDGuideFragment r0) {
        return r0.BOUND_MAX_TIME;
    }

    public static final /* synthetic */ int access$getBondFailedTime$p(HIDGuideFragment r0) {
        return r0.bondFailedTime;
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(HIDGuideFragment r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ TextView access$getTvHighTip(HIDGuideFragment r0) {
        return r0.getTvHighTip();
    }

    public static final /* synthetic */ void access$setBondFailedTime$p(HIDGuideFragment r0, int r1) {
        r0.bondFailedTime = r1;
    }

    private final void doPairDone(boolean r4) {
        this.canSwipe = true;
        if (r4 == false) goto L5;
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
    L5:
        AppGuideActivity r1 = getAppGuideActivity();
        if (r1 == null) goto L13;
        r1.setSwipe(true);
        if (r4 == false) goto L11;
        r1.getNext().setText(R.string.next);
        return;
    L11:
        r1.getNext().setText(R.string.ignore);
        return;
    }

    private final AppGuideActivity getAppGuideActivity() {
        if ((getMActivity() instanceof AppGuideActivity) == false) goto L6;
        Activity r0 = getMActivity();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity");
        return (AppGuideActivity) r0;
    L6:
        return null;
    }

    private final Spanned getTip(int r9, int r10) {
        String r0 = getString(r9);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        String r1 = oe5.IXO0OOi(r0, "\n", "<br>", false, 4, null);
        String r2 = tipColor();
        String r3 = getString(r10);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        Spanned r11 = Html.fromHtml(r1 + "<br><br><font color = " + r2 + ">" + oe5.IXO0OOi(r3, "\n", "<br>", false, 4, null) + "</font>");
        Intrinsics.O10IXXX0X(r11, "fromHtml(...)");
        return r11;
    }

    private final TextView getTvHighTip() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iO(HIDGuideFragment r0) {
        return tvHighTip_delegate$lambda$0(r0);
    }

    private static final boolean initView$lambda$0(HIDGuideFragment r1, View r2, int r3, KeyEvent r4) {
        if (r4.getAction() == 1) goto L5;
    L11:
        return false;
    L5:
        if (r3 != 4) goto L11;
        uq r5 = r1.mLoadingPopup;
        if (r5 == null) goto L11;
        if (r5.isShowing() != true) goto L11;
        return true;
    }

    private final String tipColor() {
        return "grey";
    }

    private static final TextView tvHighTip_delegate$lambda$0(HIDGuideFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_high_tip);
    }

    public final boolean getCanSwipe() {
        return this.canSwipe;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        I0iIi r6 = I0iIi.OXO1;
        Activity r0 = getMActivity();
        HIDGuideFragment$mBluetoothReceiver$1 r1 = this.mBluetoothReceiver;
        IntentFilter r2 = new IntentFilter();
        r2.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        r2.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit r3 = Unit.OXO1;
        r6.OXO1(r0, r1, r2, 2);
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_hid_pair);
        getTvTitle().setText(R.string.guide_hid_pair_title);
        getTvTip().setText(R.string.guide_hid_pair_tip);
        if (this.bondFailedTime < this.BOUND_MAX_TIME) goto L5;
        getTvHighTip().setVisibility(0);
        getBtnSet().setText(R.string.re_pair);
    L6:
        getBtnSet().setOnKeyListener(new X1X1II(this));
        if (BleConnector.INSTANCE.isBoundHID() == false) goto L10;
        getBtnSet().setVisibility(4);
        doPairDone(true);
        return;
    L10:
        getBtnSet().setVisibility(0);
        return;
    L5:
        getTvHighTip().setVisibility(8);
        getBtnSet().setText(R.string.pairing);
        goto L6
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMActivity().unregisterReceiver(this.mBluetoothReceiver);
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        getBtnSet().setFocusableInTouchMode(true);
        getBtnSet().requestFocus();
        if (this.bondFailedTime < this.BOUND_MAX_TIME) goto L10;
        I01XX0.XIi00iiXO(I01XX0.XX1Oi, null, 2, null);
        AppGuideActivity r0 = getAppGuideActivity();
        if (r0 == null) goto L7;
        r0.setNeedConnectHID(false);
    L7:
        getMActivity().finish();
        return;
    L10:
        if (this.mLoadingPopup != null) goto L12;
        this.mLoadingPopup = new uq(getMActivity());
    L12:
        uq r1 = this.mLoadingPopup;
        if (r1 == null) goto L15;
        r1.IIX1OXO();
    L15:
        BleConnector.INSTANCE.connectHID();
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        AppGuideActivity r0 = getAppGuideActivity();
        if (r0 == null) goto L8;
        TextView r1 = r0.getNext();
        if (r1 == null) goto L9;
        r1.setText(R.string.next);
        return;
    L9:
        return;
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        AppGuideActivity r0 = getAppGuideActivity();
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.bondFailedTime < this.BOUND_MAX_TIME) goto L8;
        r0.getNext().setText(R.string.ignore);
        return;
    L8:
        r0.getNext().setText(R.string.next);
    }

    public final void setCanSwipe(boolean r1) {
        this.canSwipe = r1;
    }
}
