package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXO11X;
import com.android.mltcode.paycertificationapi.O0Xi0X;
import com.android.mltcode.paycertificationapi.O1OXX0;
import com.android.mltcode.paycertificationapi.OI0IO0XX;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XI00I0X;
import com.android.mltcode.paycertificationapi.XXO1XOXO;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i0Xi1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIXII11iI;
import com.android.mltcode.paycertificationapi.iO0i01I;
import com.android.mltcode.paycertificationapi.iX0O01iI1;
import com.android.mltcode.paycertificationapi.ii0iO1I;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BloodOxyGenSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @aa1
    private final BleBloodOxyGenSettings mBloodOxyGenSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate;

    public BloodOxyGenSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iIXII11iI(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new ii0iO1I(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new O1OXX0(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new OI0IO0XX(this));
        this.mBloodOxyGenSettings = (BleBloodOxyGenSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.BLOOD_OXYGEN_SET, BleBloodOxyGenSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(BloodOxyGenSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(BloodOxyGenSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean IIX1OXO(BloodOxyGenSettingsActivity r0, int r1, int r2) {
        return onDeviceSetInterval$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader O10IXXX0X(BloodOxyGenSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(BloodOxyGenSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void X0O() {
        initView$lambda$0$0$0$0();
    }

    public static /* synthetic */ Unit X1ii(BloodOxyGenSettingsActivity r0, int r1, int r2, BleConnector r3) {
        return onDeviceSetInterval$lambda$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XX0(BloodOxyGenSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem XXI(BloodOxyGenSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(BloodOxyGenSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    public static /* synthetic */ View iIiiO(BloodOxyGenSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private static final Unit initView$lambda$0$0(final BloodOxyGenSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new iX0O01iI1(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(BloodOxyGenSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r9.mBloodOxyGenSettings});
        r9.mBloodOxyGenSettings.getMBleTimeRange().setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, r9.mBloodOxyGenSettings, false, false, 24, null);
        new Handler(Looper.getMainLooper()).postDelayed(new i0Xi1(), 150);
        return Unit.OXO1;
    }

    private static final void initView$lambda$0$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOOX010X, null, 2, null);
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(BloodOxyGenSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(BloodOxyGenSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(BloodOxyGenSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private final void onDeviceSetInterval(final int r8, int r9) {
        if (this.mIntervalPopup != null) goto L5;
        int r4 = 0;
        BloodOxyGenSettingsActivity r2 = this;
        dj4 r1 = new dj4(r2, r9, r4, 4, null);
        r1.iX(R.string.interval);
        r1.i010I(new XI00I0X(this, r8));
        r2.mIntervalPopup = r1;
    L6:
        dj4 r10 = r2.mIntervalPopup;
        if (r10 == null) goto L10;
        r10.II1Xi0(XiiOXI.OXO1(r2.mBloodOxyGenSettings.getMInterval() / r8));
        View r11 = getRootView();
        Intrinsics.O10IXXX0X(r11, "<get-rootView>(...)");
        r10.I1XOi1(r11);
        return;
    L10:
        return;
    L5:
        r2 = this;
        goto L6
    }

    public static /* synthetic */ void onDeviceSetInterval$default(BloodOxyGenSettingsActivity r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 15;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = R.array.blood_oxygen_set_intervals;
    L8:
        r0.onDeviceSetInterval(r1, r2);
    }

    private static final boolean onDeviceSetInterval$lambda$0$0(final BloodOxyGenSettingsActivity r1, final int r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IXO11X(r1, r2, r3), 1, null);
    }

    private static final Unit onDeviceSetInterval$lambda$0$0$0(BloodOxyGenSettingsActivity r8, int r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r8.mBloodOxyGenSettings.setMInterval(r9 * ((int) Math.pow(2.0d, r10)));
        r8.getItemInterval().setMRightText(cp5.iI(r8.mBloodOxyGenSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, r8.mBloodOxyGenSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final BloodOxyGenSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new XXO1XOXO(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(BloodOxyGenSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mBloodOxyGenSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, r9.mBloodOxyGenSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(BloodOxyGenSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_oxygen_set);
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(q62.OXO1.IIX(this.mBloodOxyGenSettings.getMBleTimeRange().getMEnabled()));
        r0.setMListener(new O0Xi0X(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mBloodOxyGenSettings.getMBleTimeRange().getMStartHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMStartMinute(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.iI(this.mBloodOxyGenSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_oxygen_settings;
    }

    public final void onSetInterval(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (q62.OXO1.X0100I() == false) goto L6;
        onDeviceSetInterval(60, R.array.blood_oxygen_set_intervals_ring);
        return;
    L6:
        onDeviceSetInterval$default(this, 0, 0, 3, null);
    }

    public final void onSetTimeRange(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new iO0i01I(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mBloodOxyGenSettings.getMBleTimeRange().getMStartHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMStartMinute(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndMinute());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r7.I1XOi1(r0);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
