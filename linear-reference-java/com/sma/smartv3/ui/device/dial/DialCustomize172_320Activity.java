package com.sma.smartv3.ui.device.dial;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.I1i0XXXX;
import com.android.mltcode.paycertificationapi.IiIIO0O1;
import com.android.mltcode.paycertificationapi.O0IOX0OO1;
import com.android.mltcode.paycertificationapi.O0iIXOiI;
import com.android.mltcode.paycertificationapi.OOIiO10X;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00I010;
import com.android.mltcode.paycertificationapi.ii0iX01X1;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize172_320Activity extends BaseDialCustomizeActivity {

    @aa1
    private final Lazy pointers$delegate;

    public DialCustomize172_320Activity() {
        this.pointers$delegate = LazyKt__LazyJVMKt.iO(new O0iIXOiI());
    }

    public static /* synthetic */ void Ii1iii0(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$4(r0, r1, r2);
    }

    public static /* synthetic */ void O001I(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$3(r0, r1, r2);
    }

    public static /* synthetic */ void X100O(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void X11I(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ List XXO() {
        return pointers_delegate$lambda$0();
    }

    private static final void customizeDialBgItemClick$lambda$0(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_0);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$1(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_1);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$2(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_2);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$3(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_3);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$4(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_4);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$5(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_172_5);
        r1.dismiss();
    }

    public static /* synthetic */ void iXiiiO(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ void iiiO(DialCustomize172_320Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$5(r0, r1, r2);
    }

    private static final List pointers_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_point_1_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_5, 0, false, 6, null)});
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
        r3.OiIIX101O().setOnClickListener(new i00I010(this, r3));
        r3.XiOIii1().setOnClickListener(new I1i0XXXX(this, r3));
        r3.OII().setOnClickListener(new O0IOX0OO1(this, r3));
        r3.OX().setOnClickListener(new OOIiO10X(this, r3));
        r3.I1().setOnClickListener(new ii0iX01X1(this, r3));
        r3.iOOX010X().setOnClickListener(new IiIIO0O1(this, r3));
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

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> getPointers() {
        return (List) getValue();
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setSupportConvertPng(q62.OXO1.OIIi110I());
        boolean r1 = true;
        if (isSupportConvertPng() == false) goto L5;
        int r0 = 4;
    L6:
        setIgnoreBlack(r0);
        if (isSupportConvertPng() == false) goto L9;
        String r2 = "png";
    L10:
        setFileFormat(r2);
        setScreenWidth(172);
        setScreenHeight(320);
        setScreenPreviewWidth(110);
        setScreenPreviewHeight(204);
        setControlValueInterval(1);
        setControlValueRange(10);
        if (getMArg1() == 1) goto L14;
        r1 = false;
    L14:
        setRound(r1);
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        setRoundCornerRadius(SizeUtils.dp2px(10.0f));
        super.initView();
        return;
    L9:
        r2 = "bmp";
        goto L10
    L5:
        r0 = 1;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_dial_customize_172;
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_172_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_172_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_172_2, 0, false, 6, null)});
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_172";
    }
}
