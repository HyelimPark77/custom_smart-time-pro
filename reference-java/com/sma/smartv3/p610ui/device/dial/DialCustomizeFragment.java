package com.sma.smartv3.p610ui.device.dial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.dial.DialCustomizeFragment;
import com.sma.smartv3.p610ui.device.watchface.WatchFaceVideoActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n257#2,2:68\n78#3,3:70\n81#3,5:74\n1#4:73\n*S KotlinDebug\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n*L\n58#1:68,2\n63#1:70,3\n63#1:74,5\n63#1:73\n*E\n"})
public final class DialCustomizeFragment extends BaseFragment {

    @aa1
    private final Lazy itemCustomize$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOOO10I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialCustomizeFragment.itemCustomize_delegate$lambda$0(this.f2064IO);
        }
    });

    @aa1
    private final Lazy tv_dial_customize_desc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXO11i0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialCustomizeFragment.tv_dial_customize_desc_delegate$lambda$0(this.f2042IO);
        }
    });

    @aa1
    private final Lazy itemVideo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11ii100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialCustomizeFragment.itemVideo_delegate$lambda$0(this.f2694IO);
        }
    });

    private final View getItemCustomize() {
        return (View) this.itemCustomize$delegate.getValue();
    }

    private final View getItemVideo() {
        return (View) this.itemVideo$delegate.getValue();
    }

    private final TextView getTv_dial_customize_desc() {
        return (TextView) this.tv_dial_customize_desc$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DialCustomizeFragment dialCustomizeFragment, View view) {
        if (BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
            return;
        }
        q62 q62Var = q62.OXO1;
        FragmentActivity fragmentActivityRequireActivity = dialCustomizeFragment.requireActivity();
        Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
        q62.IiiO11(q62Var, fragmentActivityRequireActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(DialCustomizeFragment dialCustomizeFragment, View view) {
        if (BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            dialCustomizeFragment.startActivity(new Intent(dialCustomizeFragment.getActivity(), (Class<?>) WatchFaceVideoActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemCustomize_delegate$lambda$0(DialCustomizeFragment dialCustomizeFragment) {
        return dialCustomizeFragment.getMView().findViewById(R.id.item_customize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemVideo_delegate$lambda$0(DialCustomizeFragment dialCustomizeFragment) {
        return dialCustomizeFragment.getMView().findViewById(R.id.item_video);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_dial_customize_desc_delegate$lambda$0(DialCustomizeFragment dialCustomizeFragment) {
        return (TextView) dialCustomizeFragment.getMView().findViewById(R.id.tv_dial_customize_desc);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void initView() {
        String language = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        if (i72.OXO1.XOOI0O() && Intrinsics.XOO0ii0(language, "ko")) {
            getTv_dial_customize_desc().setTextSize(28.0f);
            Drawable drawable = ContextCompat.getDrawable(getMActivity(), R.drawable.kfit_right_icon);
            if (drawable != null) {
                drawable.setBounds(0, 0, 0, 0);
            }
            getTv_dial_customize_desc().setCompoundDrawables(null, null, drawable, null);
        }
        getItemCustomize().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OiXI10X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomizeFragment.initView$lambda$0(this.f3778IO, view);
            }
        });
        getItemCustomize().setFocusableInTouchMode(true);
        getItemCustomize().requestFocus();
        View itemVideo = getItemVideo();
        Intrinsics.O10IXXX0X(itemVideo, "<get-itemVideo>(...)");
        itemVideo.setVisibility(q62.OXO1.X10iI0() ? 0 : 8);
        getItemVideo().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iXi0I1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomizeFragment.initView$lambda$1(this.f8422IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_dial_customize;
    }
}
