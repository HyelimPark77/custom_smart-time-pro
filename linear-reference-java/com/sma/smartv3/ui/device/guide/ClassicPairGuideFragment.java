package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.IiXXO10Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ClassicPairGuideFragment extends BaseGuideFragment {
    private int bondFailedTime;

    @aa1
    private ClassicPairGuideFragment$mBluetoothReceiver$1 mBluetoothReceiver;

    @tb1
    private uq mLoadingPopup;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.ui.device.guide.ClassicPairGuideFragment$mBluetoothReceiver$1] */
    public ClassicPairGuideFragment() {
        this.mBluetoothReceiver = new ClassicPairGuideFragment$mBluetoothReceiver$1(this);
    }

    public static final /* synthetic */ int access$getBondFailedTime$p(ClassicPairGuideFragment r0) {
        return r0.bondFailedTime;
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(ClassicPairGuideFragment r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ Spanned access$getTip(ClassicPairGuideFragment r0, int r1, int r2) {
        return r0.getTip(r1, r2);
    }

    public static final /* synthetic */ void access$setBondFailedTime$p(ClassicPairGuideFragment r0, int r1) {
        r0.bondFailedTime = r1;
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

    public static /* synthetic */ boolean iO(ClassicPairGuideFragment r0, View r1, int r2, KeyEvent r3) {
        return initView$lambda$0(r0, r1, r2, r3);
    }

    private static final boolean initView$lambda$0(ClassicPairGuideFragment r1, View r2, int r3, KeyEvent r4) {
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        I0iIi r6 = I0iIi.OXO1;
        Activity r0 = getMActivity();
        ClassicPairGuideFragment$mBluetoothReceiver$1 r1 = this.mBluetoothReceiver;
        IntentFilter r2 = new IntentFilter();
        r2.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        r2.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit r3 = Unit.OXO1;
        r6.OXO1(r0, r1, r2, 2);
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_classice_pair);
        getTvTitle().setText(R.string.guide_classic_pair_title);
        TextView r0 = getTvTip();
        BleCache r1 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L8:
        CharSequence r2 = getString(R.string.guide_classic_pair_tip);
        Intrinsics.XXI(r2);
    L9:
        r0.setText(r2);
        getBtnSet().setText(R.string.go_pair);
        getBtnSet().setOnKeyListener(new IiXXO10Oi(this));
        return;
    L5:
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L8;
        r2 = getTip(R.string.guide_classic_pair_tip, R.string.guide_classic_pair_tip_2);
        goto L9
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
        if (this.bondFailedTime < 3) goto L7;
        startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        return;
    L7:
        if (this.mLoadingPopup != null) goto L9;
        this.mLoadingPopup = new uq(getMActivity());
    L9:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L12;
        r0.IIX1OXO();
    L12:
        BleConnector.INSTANCE.connectClassic();
    }
}
