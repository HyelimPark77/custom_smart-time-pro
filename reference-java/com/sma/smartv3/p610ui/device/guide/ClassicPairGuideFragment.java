package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.device.guide.ClassicPairGuideFragment;
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
    private ClassicPairGuideFragment$mBluetoothReceiver$1 mBluetoothReceiver = new BroadcastReceiver() { // from class: com.sma.smartv3.ui.device.guide.ClassicPairGuideFragment$mBluetoothReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            C3006uq c3006uq;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            ClassicPairGuideFragment classicPairGuideFragment = this.OXO1;
            LogUtils.m11128d("BluetoothReceiver onReceive intent -> " + intent);
            if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.ACL_DISCONNECTED") || (c3006uq = classicPairGuideFragment.mLoadingPopup) == null) {
                    return;
                }
                c3006uq.dismiss();
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && Intrinsics.XOO0ii0(bluetoothDevice.getAddress(), BleCache.INSTANCE.getMClassicAddress())) {
                int bondState = bluetoothDevice.getBondState();
                LogUtils.m11128d("BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = " + bluetoothDevice + ", bondState = " + bondState + ", bondFailedTime = " + classicPairGuideFragment.bondFailedTime);
                if (bondState != 10) {
                    if (bondState != 12) {
                        return;
                    }
                    C3006uq c3006uq2 = classicPairGuideFragment.mLoadingPopup;
                    if (c3006uq2 != null) {
                        c3006uq2.dismiss();
                    }
                    classicPairGuideFragment.getBtnSet().setVisibility(4);
                    return;
                }
                C3006uq c3006uq3 = classicPairGuideFragment.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                classicPairGuideFragment.bondFailedTime++;
                if (classicPairGuideFragment.bondFailedTime >= 3) {
                    classicPairGuideFragment.getBtnSet().setText(R.string.settings);
                    classicPairGuideFragment.getTvTip().setText(classicPairGuideFragment.getTip(R.string.guide_classic_pair_tip, R.string.go_pair_failed));
                }
            }
        }
    };

    @tb1
    private C3006uq mLoadingPopup;

    /* JADX INFO: Access modifiers changed from: private */
    public final Spanned getTip(int i, int i2) {
        String string = getString(i);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String strIXO0OOi = oe5.IXO0OOi(string, "\n", "<br>", false, 4, null);
        String strTipColor = tipColor();
        String string2 = getString(i2);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        Spanned spannedFromHtml = Html.fromHtml(strIXO0OOi + "<br><br><font color = " + strTipColor + ">" + oe5.IXO0OOi(string2, "\n", "<br>", false, 4, null) + "</font>");
        Intrinsics.O10IXXX0X(spannedFromHtml, "fromHtml(...)");
        return spannedFromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(ClassicPairGuideFragment classicPairGuideFragment, View view, int i, KeyEvent keyEvent) {
        C3006uq c3006uq;
        return keyEvent.getAction() == 1 && i == 4 && (c3006uq = classicPairGuideFragment.mLoadingPopup) != null && c3006uq.isShowing();
    }

    private final String tipColor() {
        return "grey";
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        I0iIi i0iIi = I0iIi.OXO1;
        Activity mActivity = getMActivity();
        ClassicPairGuideFragment$mBluetoothReceiver$1 classicPairGuideFragment$mBluetoothReceiver$1 = this.mBluetoothReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit unit = Unit.OXO1;
        i0iIi.OXO1(mActivity, classicPairGuideFragment$mBluetoothReceiver$1, intentFilter, 2);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        CharSequence string;
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_classice_pair);
        getTvTitle().setText(R.string.guide_classic_pair_title);
        TextView tvTip = getTvTip();
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707)) {
            string = getString(R.string.guide_classic_pair_tip);
            Intrinsics.XXI(string);
        } else {
            string = getTip(R.string.guide_classic_pair_tip, R.string.guide_classic_pair_tip_2);
        }
        tvTip.setText(string);
        getBtnSet().setText(R.string.go_pair);
        getBtnSet().setOnKeyListener(new View.OnKeyListener() { // from class: com.android.mltcode.paycertificationapi.IiXXO10Oi
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return ClassicPairGuideFragment.initView$lambda$0(this.f2302IO, view, i, keyEvent);
            }
        });
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMActivity().unregisterReceiver(this.mBluetoothReceiver);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        getBtnSet().setFocusableInTouchMode(true);
        getBtnSet().requestFocus();
        if (this.bondFailedTime >= 3) {
            startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
            return;
        }
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMActivity());
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        BleConnector.INSTANCE.connectClassic();
    }
}
