package com.sma.smartv3.ui.device.dial.old;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.IX1IiX10;
import com.android.mltcode.paycertificationapi.Ii10Xi0;
import com.android.mltcode.paycertificationapi.Ii1OI00I;
import com.android.mltcode.paycertificationapi.O000iOiI;
import com.android.mltcode.paycertificationapi.O0XXIi;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.XOi1iOO1I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iXiO0i1;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCustomize3Activity extends BaseDialCustomizeActivity {

    @aa1
    private final Lazy pointers$delegate;

    public DialCustomize3Activity() {
        this.pointers$delegate = LazyKt__LazyJVMKt.iO(new O0XXIi());
    }

    public static /* synthetic */ void Ii1iii0(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ void O001I(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$4(r0, r1, r2);
    }

    public static /* synthetic */ List X100O() {
        return pointers_delegate$lambda$0();
    }

    public static /* synthetic */ void X11I(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void XXO(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$1(r0, r1, r2);
    }

    private static final void customizeDialBgItemClick$lambda$0(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_0);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$1(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_1);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$2(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_2);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$3(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_3);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$4(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_4);
        r1.dismiss();
    }

    private static final void customizeDialBgItemClick$lambda$5(DialCustomize3Activity r0, I0OOX r1, View r2) {
        r0.getCustomizeDialBg().setImageResource(R.drawable.dial_customize_3_5);
        r1.dismiss();
    }

    public static /* synthetic */ void iXiiiO(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$5(r0, r1, r2);
    }

    public static /* synthetic */ void iiiO(DialCustomize3Activity r0, I0OOX r1, View r2) {
        customizeDialBgItemClick$lambda$3(r0, r1, r2);
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
        r3.OiIIX101O().setOnClickListener(new iXiO0i1(this, r3));
        r3.XiOIii1().setOnClickListener(new Ii1OI00I(this, r3));
        r3.OII().setOnClickListener(new O000iOiI(this, r3));
        r3.OX().setOnClickListener(new IX1IiX10(this, r3));
        r3.I1().setOnClickListener(new Ii10Xi0(this, r3));
        r3.iOOX010X().setOnClickListener(new XOi1iOO1I(this, r3));
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
        setScreenWidth(240);
        setScreenHeight(240);
        setScreenPreviewWidth(150);
        setScreenPreviewHeight(150);
        setControlValueInterval(1);
        setIgnoreBlack(1);
        setRound(false);
        setFileFormat("bmp");
        setImageFormat(2);
        setX_CENTER(2);
        setY_CENTER(16);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_dial_customize_3;
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public List<ResourcesIdInfo> scalesList() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_3_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_3_1, 0, false, 6, null)});
    }

    @Override // com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity
    @aa1
    public String customizeDir() {
        return "dial_customize_7";
    }
}
