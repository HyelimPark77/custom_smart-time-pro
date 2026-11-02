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
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.device.guide.HIDGuideFragment;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HIDGuideFragment extends BaseGuideFragment {
    private int bondFailedTime;
    private boolean canSwipe;

    @tb1
    private C3006uq mLoadingPopup;
    private final int BOUND_MAX_TIME = 3;

    @aa1
    private final Lazy tvHighTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.III1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HIDGuideFragment.tvHighTip_delegate$lambda$0(this.f1576IO);
        }
    });

    @aa1
    private HIDGuideFragment$mBluetoothReceiver$1 mBluetoothReceiver = new BroadcastReceiver() { // from class: com.sma.smartv3.ui.device.guide.HIDGuideFragment$mBluetoothReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            C3006uq c3006uq;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            HIDGuideFragment hIDGuideFragment = this.OXO1;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("BluetoothReceiver onReceive intent -> " + intent);
            if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.ACL_DISCONNECTED") || (c3006uq = hIDGuideFragment.mLoadingPopup) == null) {
                    return;
                }
                c3006uq.dismiss();
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && Intrinsics.XOO0ii0(bluetoothDevice.getAddress(), BleCache.INSTANCE.getMBleAddress())) {
                int bondState = bluetoothDevice.getBondState();
                i1o0oxo1o.OXO1("BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = " + bluetoothDevice + ", bondState = " + bondState + ", bondFailedTime = " + hIDGuideFragment.bondFailedTime);
                if (bondState != 10) {
                    if (bondState != 12) {
                        return;
                    }
                    C3006uq c3006uq2 = hIDGuideFragment.mLoadingPopup;
                    if (c3006uq2 != null) {
                        c3006uq2.dismiss();
                    }
                    hIDGuideFragment.getBtnSet().setVisibility(4);
                    hIDGuideFragment.doPairDone(true);
                    return;
                }
                C3006uq c3006uq3 = hIDGuideFragment.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                hIDGuideFragment.bondFailedTime++;
                if (hIDGuideFragment.bondFailedTime >= hIDGuideFragment.BOUND_MAX_TIME) {
                    hIDGuideFragment.doPairDone(false);
                    hIDGuideFragment.getBtnSet().setText(R.string.re_pair);
                    hIDGuideFragment.getTvHighTip().setVisibility(0);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void doPairDone(boolean z) {
        this.canSwipe = true;
        if (z) {
            I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
        }
        AppGuideActivity appGuideActivity = getAppGuideActivity();
        if (appGuideActivity != null) {
            appGuideActivity.setSwipe(true);
            if (z) {
                appGuideActivity.getNext().setText(R.string.next);
            } else {
                appGuideActivity.getNext().setText(R.string.ignore);
            }
        }
    }

    private final AppGuideActivity getAppGuideActivity() {
        if (!(getMActivity() instanceof AppGuideActivity)) {
            return null;
        }
        Activity mActivity = getMActivity();
        Intrinsics.X1ii(mActivity, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity");
        return (AppGuideActivity) mActivity;
    }

    private final Spanned getTip(int i, int i2) {
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
    public final TextView getTvHighTip() {
        return (TextView) this.tvHighTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(HIDGuideFragment hIDGuideFragment, View view, int i, KeyEvent keyEvent) {
        C3006uq c3006uq;
        return keyEvent.getAction() == 1 && i == 4 && (c3006uq = hIDGuideFragment.mLoadingPopup) != null && c3006uq.isShowing();
    }

    private final String tipColor() {
        return "grey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHighTip_delegate$lambda$0(HIDGuideFragment hIDGuideFragment) {
        return (TextView) hIDGuideFragment.getMView().findViewById(R.id.tv_high_tip);
    }

    public final boolean getCanSwipe() {
        return this.canSwipe;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        I0iIi i0iIi = I0iIi.OXO1;
        Activity mActivity = getMActivity();
        HIDGuideFragment$mBluetoothReceiver$1 hIDGuideFragment$mBluetoothReceiver$1 = this.mBluetoothReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit unit = Unit.OXO1;
        i0iIi.OXO1(mActivity, hIDGuideFragment$mBluetoothReceiver$1, intentFilter, 2);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_hid_pair);
        getTvTitle().setText(R.string.guide_hid_pair_title);
        getTvTip().setText(R.string.guide_hid_pair_tip);
        if (this.bondFailedTime >= this.BOUND_MAX_TIME) {
            getTvHighTip().setVisibility(0);
            getBtnSet().setText(R.string.re_pair);
        } else {
            getTvHighTip().setVisibility(8);
            getBtnSet().setText(R.string.pairing);
        }
        getBtnSet().setOnKeyListener(new View.OnKeyListener() { // from class: com.android.mltcode.paycertificationapi.X1X1II
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return HIDGuideFragment.initView$lambda$0(this.f4333IO, view, i, keyEvent);
            }
        });
        if (!BleConnector.INSTANCE.isBoundHID()) {
            getBtnSet().setVisibility(0);
        } else {
            getBtnSet().setVisibility(4);
            doPairDone(true);
        }
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
        if (this.bondFailedTime >= this.BOUND_MAX_TIME) {
            I01XX0.XIi00iiXO(I01XX0.XX1Oi, null, 2, null);
            AppGuideActivity appGuideActivity = getAppGuideActivity();
            if (appGuideActivity != null) {
                appGuideActivity.setNeedConnectHID(false);
            }
            getMActivity().finish();
            return;
        }
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMActivity());
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        BleConnector.INSTANCE.connectHID();
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        TextView next;
        AppGuideActivity appGuideActivity = getAppGuideActivity();
        if (appGuideActivity == null || (next = appGuideActivity.getNext()) == null) {
            return;
        }
        next.setText(R.string.next);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        AppGuideActivity appGuideActivity = getAppGuideActivity();
        if (appGuideActivity != null) {
            if (this.bondFailedTime >= this.BOUND_MAX_TIME) {
                appGuideActivity.getNext().setText(R.string.ignore);
            } else {
                appGuideActivity.getNext().setText(R.string.next);
            }
        }
    }

    public final void setCanSwipe(boolean z) {
        this.canSwipe = z;
    }
}
