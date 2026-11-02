package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0XOiX;
import com.android.mltcode.paycertificationapi.IX001I;
import com.android.mltcode.paycertificationapi.O0OXI0O;
import com.android.mltcode.paycertificationapi.O1O0X;
import com.android.mltcode.paycertificationapi.O1iOOOXOX;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10O0IIXO;
import com.android.mltcode.paycertificationapi.XIiiX0I;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i0IX0I0i;
import com.android.mltcode.paycertificationapi.i1OXIX0X;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO01OX1O;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HrvMonitoringSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @aa1
    private final BleHrvMonitoringSettings mHrvMonitoringSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate;

    public HrvMonitoringSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new O1iOOOXOX(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new i1OXIX0X(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new IX001I(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new I0XOiX(this));
        this.mHrvMonitoringSettings = (BleHrvMonitoringSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.HRV_SET, BleHrvMonitoringSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(HrvMonitoringSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(HrvMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ boolean IIX1OXO(HrvMonitoringSettingsActivity r0, int r1) {
        return onSetInterval$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem O10IXXX0X(HrvMonitoringSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(HrvMonitoringSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader X0O(HrvMonitoringSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(HrvMonitoringSettingsActivity r0, int r1, BleConnector r2) {
        return onSetInterval$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ View XXI(HrvMonitoringSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(HrvMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
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

    public static /* synthetic */ Unit iIiiO(HrvMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    private static final Unit initView$lambda$0$0(final HrvMonitoringSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new iO01OX1O(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(HrvMonitoringSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mHrvMonitoringSettings.getMBleTimeRange().setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.HRV_SET, BleKeyFlag.UPDATE, r9.mHrvMonitoringSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.IiiiOIIi0, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(HrvMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(HrvMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(HrvMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final boolean onSetInterval$lambda$0$0(final HrvMonitoringSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new i0IX0I0i(r2, r3), 1, null);
    }

    private static final Unit onSetInterval$lambda$0$0$0(HrvMonitoringSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mHrvMonitoringSettings.setMInterval(((int) Math.pow(2.0d, r10)) * 15);
        r9.getItemInterval().setMRightText(cp5.iI(r9.mHrvMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.HRV_SET, BleKeyFlag.UPDATE, r9.mHrvMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final HrvMonitoringSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new O1O0X(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(HrvMonitoringSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mHrvMonitoringSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.HRV_SET, BleKeyFlag.UPDATE, r9.mHrvMonitoringSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(HrvMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.hvr_monitoring_set);
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(OiOX0i.XIi00iiXO(this.mHrvMonitoringSettings.getMBleTimeRange().getMEnabled()));
        r0.setMListener(new O0OXI0O(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mHrvMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.iI(this.mHrvMonitoringSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_hrv_monitoring_settings;
    }

    public final void onSetInterval(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mIntervalPopup != null) goto L5;
        int r2 = R.array.hr_monitoring_intervals;
        int r3 = 0;
        HrvMonitoringSettingsActivity r1 = this;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.monitoring_interval);
        r0.i010I(new XIiiX0I(this));
        r1.mIntervalPopup = r0;
    L6:
        dj4 r8 = r1.mIntervalPopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(XiiOXI.OXO1(r1.mHrvMonitoringSettings.getMInterval() / 15));
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r8.I1XOi1(r4);
        return;
    L10:
        return;
    L5:
        r1 = this;
        goto L6
    }

    public final void onSetTimeRange(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new X10O0IIXO(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mHrvMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
