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
import com.sma.smartv3.p610ui.device.dial.DialCustomize466Activity;
import com.sma.smartv3.pro.R;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize466Activity extends BaseDialCustomizeActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$0(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_0);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$1(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_1);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$2(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_2);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$3(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_3);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$4(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_4);
        i0oox.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void customizeDialBgItemClick$lambda$5(DialCustomize466Activity dialCustomize466Activity, I0OOX i0oox, View view) {
        dialCustomize466Activity.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_5);
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
        i0oox.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iO0IIXXI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$0(this.f7989IO, i0oox, view);
            }
        });
        i0oox.XiOIii1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiIIX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$1(this.f8578IO, i0oox, view);
            }
        });
        i0oox.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1Xii1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$2(this.f2933IO, i0oox, view);
            }
        });
        i0oox.m485OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Ii1OOX1X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$3(this.f2212IO, i0oox, view);
            }
        });
        i0oox.m484I1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiX11OOXi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$4(this.f5329IO, i0oox, view);
            }
        });
        i0oox.iOOX010X().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XXOXXI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialCustomize466Activity.customizeDialBgItemClick$lambda$5(this.f5075IO, i0oox, view);
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
        View viewFindViewById = findViewById(R.id.small_widget_layout);
        q62 q62Var = q62.OXO1;
        viewFindViewById.setVisibility(q62Var.I1XII0X() ? 8 : 0);
        setSupportConvertPng(q62Var.OIIi110I());
        setIgnoreBlack(isSupportConvertPng() ? 4 : 1);
        setFileFormat(isSupportConvertPng() ? "png" : "bmp");
        setScreenWidth(466);
        setScreenHeight(466);
        setScreenPreviewWidth(280);
        setScreenPreviewHeight(280);
        setControlValueInterval(1);
        setControlValueRange(10);
        setRound(true);
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_dial_customize_466;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_scale_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_3, 0, false, 6, null));
    }

    @Override // com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_454";
    }
}
