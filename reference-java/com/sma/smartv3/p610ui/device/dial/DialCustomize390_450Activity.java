package com.sma.smartv3.p610ui.device.dial;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.dial.DialCustomize390_450Activity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleWeatherRealtime3;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize390_450Activity extends BaseDialCustomizeActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$0(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_0);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$1(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_1);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$2(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_2);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$3(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_3);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$4(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_4);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$5(DialCustomize390_450Activity dialCustomize390_450Activity, I0OOX i0oox, View view) {
        dialCustomize390_450Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_5);
        i0oox.dismiss();
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
        i0oox.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXi1XIXO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$0(this.f2132IO, i0oox, view);
            }
        });
        i0oox.XiOIii1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OIiXXOI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$1(this.f3098IO, i0oox, view);
            }
        });
        i0oox.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.II1IOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$2(this.f1547IO, i0oox, view);
            }
        });
        i0oox.m485OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iXiO110O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$3(this.f8440IO, i0oox, view);
            }
        });
        i0oox.m484I1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Ii1O000i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$4(this.f2206IO, i0oox, view);
            }
        });
        i0oox.iOOX010X().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Ii00i001
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize390_450Activity.customizeDialBgItemClick$lambda$5(this.f2162IO, i0oox, view);
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

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setSupportConvertPng(q62.OXO1.OIIi110I());
        setIgnoreBlack(isSupportConvertPng() ? 4 : 1);
        setFileFormat(isSupportConvertPng() ? "png" : "bmp");
        setScreenWidth(BleWeatherRealtime3.ITEM_LENGTH);
        setScreenHeight(450);
        setScreenPreviewWidth(250);
        setScreenPreviewHeight(288);
        setControlValueInterval(1);
        setControlValueRange(10);
        setRoundCornerRadius(40.0f);
        setRound(getMArg1() == 1);
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_dial_customize_368;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_scale_10_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_10_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_10_2, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_360";
    }
}
