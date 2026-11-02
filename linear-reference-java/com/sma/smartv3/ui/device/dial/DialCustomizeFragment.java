package com.sma.smartv3.ui.device.dial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IXO11i0;
import com.android.mltcode.paycertificationapi.IXOOO10I;
import com.android.mltcode.paycertificationapi.O11ii100;
import com.android.mltcode.paycertificationapi.OiXI10X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXi0I1i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.watchface.WatchFaceVideoActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n257#2,2:68\n78#3,3:70\n81#3,5:74\n1#4:73\n*S KotlinDebug\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n*L\n58#1:68,2\n63#1:70,3\n63#1:74,5\n63#1:73\n*E\n"})
public final class DialCustomizeFragment extends BaseFragment {

    @aa1
    private final Lazy itemCustomize$delegate;

    @aa1
    private final Lazy itemVideo$delegate;

    @aa1
    private final Lazy tv_dial_customize_desc$delegate;

    public DialCustomizeFragment() {
        this.itemCustomize$delegate = LazyKt__LazyJVMKt.iO(new IXOOO10I(this));
        this.tv_dial_customize_desc$delegate = LazyKt__LazyJVMKt.iO(new IXO11i0(this));
        this.itemVideo$delegate = LazyKt__LazyJVMKt.iO(new O11ii100(this));
    }

    public static /* synthetic */ void IiI10X(DialCustomizeFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ View O00(DialCustomizeFragment r0) {
        return itemVideo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XIi00iiXO(DialCustomizeFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ View XO0O10(DialCustomizeFragment r0) {
        return itemCustomize_delegate$lambda$0(r0);
    }

    private final View getItemCustomize() {
        return (View) getValue();
    }

    private final View getItemVideo() {
        return (View) getValue();
    }

    private final TextView getTv_dial_customize_desc() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iO(DialCustomizeFragment r0) {
        return tv_dial_customize_desc_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(DialCustomizeFragment r2, View r3) {
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        q62 r4 = q62.OXO1;
        FragmentActivity r5 = r2.requireActivity();
        Intrinsics.O10IXXX0X(r5, "requireActivity(...)");
        q62.IiiO11(r4, r5, null, 2, null);
    }

    private static final void initView$lambda$1(DialCustomizeFragment r2, View r3) {
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        r2.startActivity(new Intent(r2.getActivity(), WatchFaceVideoActivity.class));
    }

    private static final View itemCustomize_delegate$lambda$0(DialCustomizeFragment r1) {
        return r1.getMView().findViewById(R.id.item_customize);
    }

    private static final View itemVideo_delegate$lambda$0(DialCustomizeFragment r1) {
        return r1.getMView().findViewById(R.id.item_video);
    }

    private static final TextView tv_dial_customize_desc_delegate$lambda$0(DialCustomizeFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_dial_customize_desc);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void initView() {
        String r0 = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        int r2 = 0;
        if (i72.OXO1.XOOI0O() == true) goto L5;
    L10:
        getItemCustomize().setOnClickListener(new OiXI10X(this));
        getItemCustomize().setFocusableInTouchMode(true);
        getItemCustomize().requestFocus();
        View r1 = getItemVideo();
        Intrinsics.O10IXXX0X(r1, "<get-itemVideo>(...)");
        if (q62.OXO1.X10iI0() == true) goto L14;
        r2 = 8;
    L14:
        r1.setVisibility(r2);
        getItemVideo().setOnClickListener(new iXi0I1i(this));
        return;
    L5:
        if (Intrinsics.XOO0ii0(r0, "ko") == false) goto L10;
        getTv_dial_customize_desc().setTextSize(28.0f);
        Drawable r3 = ContextCompat.getDrawable(getMActivity(), R.drawable.kfit_right_icon);
        if (r3 == null) goto L9;
        r3.setBounds(0, 0, 0, 0);
    L9:
        getTv_dial_customize_desc().setCompoundDrawables(null, null, r3, null);
        goto L10
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_dial_customize;
    }
}
