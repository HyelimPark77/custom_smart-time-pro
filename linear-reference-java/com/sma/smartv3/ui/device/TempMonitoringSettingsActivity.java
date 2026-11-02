package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.an5;
import com.android.mltcode.paycertificationapi.bn5;
import com.android.mltcode.paycertificationapi.cn5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.dn5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.um5;
import com.android.mltcode.paycertificationapi.vm5;
import com.android.mltcode.paycertificationapi.wm5;
import com.android.mltcode.paycertificationapi.xm5;
import com.android.mltcode.paycertificationapi.ym5;
import com.android.mltcode.paycertificationapi.zm5;
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
import com.szabh.smable3.entity.BleTemperatureDetecting;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TempMonitoringSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @tb1
    private dj4 mIntervalPopup;

    @aa1
    private final BleTemperatureDetecting mTempMonitoringSettings;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate;

    public TempMonitoringSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new wm5(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new xm5(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new ym5(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new zm5(this));
        this.mTempMonitoringSettings = (BleTemperatureDetecting) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.TEMPERATURE_DETECTING, BleTemperatureDetecting.class, null, null, 12, null);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(TempMonitoringSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem I1XOi1(TempMonitoringSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(TempMonitoringSettingsActivity r0, int r1, BleConnector r2) {
        return onSetInterval$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit O10IXXX0X(TempMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OIX0iXi(TempMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ View X0O(TempMonitoringSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(TempMonitoringSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XXI(TempMonitoringSettingsActivity r0, int r1) {
        return onSetInterval$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsHeader XiOIO(TempMonitoringSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
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

    public static /* synthetic */ boolean iIiiO(TempMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    private static final Unit initView$lambda$0$0(final TempMonitoringSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new vm5(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(TempMonitoringSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mTempMonitoringSettings.getMBleTimeRange().setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.TEMPERATURE_DETECTING, BleKeyFlag.UPDATE, r9.mTempMonitoringSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.OII, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(TempMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(TempMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(TempMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final boolean onSetInterval$lambda$0$0(final TempMonitoringSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new cn5(r2, r3), 1, null);
    }

    private static final Unit onSetInterval$lambda$0$0$0(TempMonitoringSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mTempMonitoringSettings.setMInterval(((int) Math.pow(2.0d, r10)) * 15);
        r9.getItemInterval().setMRightText(cp5.iI(r9.mTempMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.TEMPERATURE_DETECTING, BleKeyFlag.UPDATE, r9.mTempMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final TempMonitoringSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new an5(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(TempMonitoringSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mTempMonitoringSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.TEMPERATURE_DETECTING, BleKeyFlag.UPDATE, r9.mTempMonitoringSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(TempMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        q62 r1 = q62.OXO1;
        boolean r2 = r1.XI1OX0IO();
        int r3 = R.string.temp_monitoring;
        if (r2 == false) goto L5;
        int r4 = R.string.body_temperature_detection;
    L6:
        r0.setText(r4);
        AbhSettingsHeader r5 = getItemHeader();
        TextView r6 = r5.getTvTitle();
        if (r1.XI1OX0IO() == false) goto L9;
        r3 = R.string.body_temperature_detection;
    L9:
        r6.setText(r3);
        r5.setChecked(OiOX0i.XIi00iiXO(this.mTempMonitoringSettings.getMBleTimeRange().getMEnabled()));
        r5.setMListener(new bn5(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mTempMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mTempMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mTempMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mTempMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.iI(this.mTempMonitoringSettings.getMInterval()));
        return;
    L5:
        r4 = R.string.temp_monitoring;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_temp_monitoring_settings;
    }

    public final void onSetInterval(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mIntervalPopup != null) goto L5;
        int r2 = R.array.hr_monitoring_intervals;
        int r3 = 0;
        TempMonitoringSettingsActivity r1 = this;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.monitoring_interval);
        r0.i010I(new um5(this));
        r1.mIntervalPopup = r0;
    L6:
        dj4 r8 = r1.mIntervalPopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(XiiOXI.OXO1(r1.mTempMonitoringSettings.getMInterval() / 15));
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
        r6.X01IiOiIi(new dn5(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mTempMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mTempMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mTempMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mTempMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
