package com.sma.smartv3.p610ui.device.dial.old;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity;
import com.sma.smartv3.p610ui.device.dial.old.DialCustomize11Activity;
import com.sma.smartv3.pro.R;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize11Activity extends BaseDialCustomizeActivity {

    @aa1
    private final Lazy pointers$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXXO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialCustomize11Activity.pointers_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$0(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_0);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$1(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_1);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$2(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_2);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$3(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_3);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$4(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_4);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$5(DialCustomize11Activity dialCustomize11Activity, I0OOX i0oox, View view) {
        dialCustomize11Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_5);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List pointers_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_point_1_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_5, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public byte[] bitmap2Bytes(@aa1 Bitmap finalBgBitMap) {
        Intrinsics.X0O(finalBgBitMap, "finalBgBitMap");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(finalBgBitMap.getByteCount());
        finalBgBitMap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        String fileFormat = getFileFormat();
        Intrinsics.XXI(bArrArray);
        return X1iIIO.OXO1(fileFormat, bArrArray, finalBgBitMap.getWidth(), 16, 0, false);
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    public void customizeDialBgItemClick(@aa1 final I0OOX i0oox) {
        Intrinsics.X0O(i0oox, "<this>");
        i0oox.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXX1IOiOi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$0(this.f2090IO, i0oox, view);
            }
        });
        i0oox.XiOIii1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i00Oi11IO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$1(this.f7281IO, i0oox, view);
            }
        });
        i0oox.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O111O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$2(this.f2666IO, i0oox, view);
            }
        });
        i0oox.m485OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i1IOX0XX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$3(this.f7584IO, i0oox, view);
            }
        });
        i0oox.m484I1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiOIIOO1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$4(this.f8605IO, i0oox, view);
            }
        });
        i0oox.iOOX010X().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1IiO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize11Activity.customizeDialBgItemClick$lambda$5(this.f2911IO, i0oox, view);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public Bitmap getFinalBgBitmap(@aa1 Bitmap bgBitMap) {
        Intrinsics.X0O(bgBitMap, "bgBitMap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bgBitMap.getWidth(), bgBitMap.getHeight() + 1, Bitmap.Config.RGB_565);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawBitmap(bgBitMap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> getPointers() {
        return (List) this.pointers$delegate.getValue();
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setScreenWidth(240);
        setScreenHeight(240);
        setScreenPreviewWidth(150);
        setScreenPreviewHeight(150);
        setControlValueInterval(1);
        setIgnoreBlack(1);
        setRound(true);
        setFileFormat("bmp");
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_dial_customize_2;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_scale_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_3, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_7";
    }
}
