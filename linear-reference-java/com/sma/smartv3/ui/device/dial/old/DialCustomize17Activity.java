package com.sma.smartv3.ui.device.dial.old;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.I1iI0II0O;
import com.android.mltcode.paycertificationapi.III100X1;
import com.android.mltcode.paycertificationapi.Oi1ii0;
import com.android.mltcode.paycertificationapi.X0OX0XXO0;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOO110OiX;
import com.android.mltcode.paycertificationapi.iiIOO1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize17Activity extends BaseDialCustomizeActivity {
    public DialCustomize17Activity() {
    }

    public static /* synthetic */ void Ii1iii0(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$4(r0, r1, r2);
    }

    public static /* synthetic */ void O001I(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ void X11I(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ void XXO(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$5(r0, r1, r2);
    }

    private static final void customizeDialBgItemClick$lambda$0(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_0);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$1(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_1);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$2(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_2);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$3(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_3);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$4(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_4);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$5(DialCustomize17Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_2_5);
        r1.dismiss();
    }

    public static /* synthetic */ void iXiiiO(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$3(r0, r1, r2);
    }

    public static /* synthetic */ void iiiO(DialCustomize17Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$0(r0, r1, r2);
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public byte[] bitmap2Bytes(@aa1 Bitmap r8) {
        Intrinsics.X0O(r8, "finalBgBitMap");
        ByteBuffer r0 = ByteBuffer.allocate(r8.getByteCount());
        r8.copyPixelsToBuffer(r0);
        byte[] r2 = r0.array();
        String r1 = getFileFormat();
        Intrinsics.XXI(r2);
        return X1iIIO.OXO1(r1, r2, r8.getWidth(), 16, 0, false);
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    public void customizeDialBgItemClick(@aa1 final I0OOX r3) {
        Intrinsics.X0O(r3, "<this>");
        r3.OiIIX101O().setOnClickListener(new iOO110OiX(this, r3));
        r3.XiOIii1().setOnClickListener(new III100X1(this, r3));
        r3.OII().setOnClickListener(new iiIOO1(this, r3));
        r3.OX().setOnClickListener(new I1iI0II0O(this, r3));
        r3.I1().setOnClickListener(new Oi1ii0(this, r3));
        r3.iOOX010X().setOnClickListener(new X0OX0XXO0(this, r3));
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    public /* bridge */ /* synthetic */ Object customizeDir() {
        return customizeDir();
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public Bitmap getFinalBgBitmap(@aa1 Bitmap r5) {
        Intrinsics.X0O(r5, "bgBitMap");
        Bitmap r0 = Bitmap.createBitmap(r5.getWidth(), r5.getHeight() + 1, Bitmap.Config.RGB_565);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        Canvas r1 = new Canvas(r0);
        Paint r2 = new Paint();
        r2.setColor(ViewCompat.MEASURED_STATE_MASK);
        r1.drawBitmap(r5, 0.0f, 0.0f, r2);
        return r0;
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setSupportConvertPng(q62.OXO1.OIIi110I());
        if (isSupportConvertPng() == false) goto L5;
        int r0 = 4;
    L6:
        setIgnoreBlack(r0);
        if (isSupportConvertPng() == false) goto L9;
        String r1 = "png";
    L10:
        setFileFormat(r1);
        setScreenWidth(454);
        setScreenHeight(454);
        setScreenPreviewWidth(280);
        setScreenPreviewHeight(280);
        setControlValueInterval(1);
        setControlValueRange(10);
        setRound(true);
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        super.initView();
        return;
    L9:
        r1 = "bmp";
        goto L10
    L5:
        r0 = 1;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_dial_customize_17;
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_3, 0, false, 6, null)});
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_454";
    }
}
