package com.sma.smartv3.p610ui.device.dial.old;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity;
import com.sma.smartv3.p610ui.device.dial.old.DialCustomize6Activity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize6Activity extends BaseDialCustomizeActivity {

    @aa1
    private final Lazy pointers$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXXO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialCustomize6Activity.pointers_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$0(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_0);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$1(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_1);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$2(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_2);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$3(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_3);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$4(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_4);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$5(DialCustomize6Activity dialCustomize6Activity, I0OOX i0oox, View view) {
        dialCustomize6Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_6_5);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List pointers_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_point_1_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_5, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    public void customizeDialBgItemClick(@aa1 final I0OOX i0oox) {
        Intrinsics.X0O(i0oox, "<this>");
        i0oox.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X11iXIO1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$0(this.f4237IO, i0oox, view);
            }
        });
        i0oox.XiOIii1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OO1X1IOXO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$1(this.f3191IO, i0oox, view);
            }
        });
        i0oox.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IIIX10X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$2(this.f1589IO, i0oox, view);
            }
        });
        i0oox.m485OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iO1i1X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$3(this.f8050IO, i0oox, view);
            }
        });
        i0oox.m484I1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOO10i11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$4(this.f8100IO, i0oox, view);
            }
        });
        i0oox.iOOX010X().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i1OOX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize6Activity.customizeDialBgItemClick$lambda$5(this.f7629IO, i0oox, view);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public Bitmap getFinalBgBitmap(@aa1 Bitmap bgBitMap) {
        Intrinsics.X0O(bgBitMap, "bgBitMap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bgBitMap.getWidth(), bgBitMap.getHeight() + getScreenReservedBoundary(), Bitmap.Config.RGB_565);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bgBitMap, 0.0f, getScreenReservedBoundary(), (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> getPointers() {
        return (List) this.pointers$delegate.getValue();
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setScreenWidth(320);
        setScreenHeight(385);
        setScreenPreviewWidth(160);
        setScreenPreviewHeight(180);
        setScreenReservedBoundary(22);
        setControlValueInterval(16);
        setControlValueRange(10);
        setRound(false);
        setRoundCornerRadius(SizeUtils.dp2px(10.0f));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_dial_customize_6;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_scale_6_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_6_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_6_2, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_6";
    }
}
