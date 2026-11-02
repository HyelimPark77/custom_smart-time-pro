package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I00XIO1i;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0OIXiX0X;
import com.android.mltcode.paycertificationapi.I1XXII1I;
import com.android.mltcode.paycertificationapi.I1XiiXO1;
import com.android.mltcode.paycertificationapi.IX1iXXI;
import com.android.mltcode.paycertificationapi.IiiXXi;
import com.android.mltcode.paycertificationapi.OXOOO0III;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XIO1XXO0;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i111XXX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIOI01;
import com.android.mltcode.paycertificationapi.iO1Oi0;
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
import com.szabh.smable3.entity.BleEcgSettings;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class EcgMonitoringSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @aa1
    private final BleEcgSettings mEcgMonitoringSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy timePanel$delegate;

    public EcgMonitoringSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XIO1XXO0(this));
        this.timePanel$delegate = LazyKt__LazyJVMKt.iO(new I1XXII1I(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new I1XiiXO1(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new IiiXXi(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new I00XIO1i(this));
        this.mEcgMonitoringSettings = (BleEcgSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.ECG_SET, BleEcgSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(EcgMonitoringSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(EcgMonitoringSettingsActivity r0, int r1) {
        return onSetInterval$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(EcgMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean O10IXXX0X(EcgMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OIX0iXi(EcgMonitoringSettingsActivity r0, int r1, BleConnector r2) {
        return onSetInterval$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader X0O(EcgMonitoringSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(EcgMonitoringSettingsActivity r0, BleConnector r1) {
        return initView$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(EcgMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ AbhSettingsItem XXI(EcgMonitoringSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(EcgMonitoringSettingsActivity r0) {
        return timePanel_delegate$lambda$0(r0);
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

    private final View getTimePanel() {
        return (View) getValue();
    }

    public static /* synthetic */ View iIiiO(EcgMonitoringSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private static final Unit initView$lambda$0$0(final EcgMonitoringSettingsActivity r4, boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new I0OIXiX0X(r4), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(EcgMonitoringSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r10.mEcgMonitoringSettings});
        BleTimeRange r0 = r10.mEcgMonitoringSettings.getMBleTimeRange();
        if (r10.mEcgMonitoringSettings.getMBleTimeRange().getMEnabled() != 0) goto L5;
        int r1 = 255;
    L6:
        r0.setMEnabled(r1);
        BaseBleConnector.sendObject$default(r11, BleKey.ECG_SET, BleKeyFlag.UPDATE, r10.mEcgMonitoringSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.XiOIii1, null, 2, null);
        return Unit.OXO1;
    L5:
        r1 = 0;
        goto L6
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(EcgMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(EcgMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(EcgMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final boolean onSetInterval$lambda$0$0(final EcgMonitoringSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IX1iXXI(r2, r3), 1, null);
    }

    private static final Unit onSetInterval$lambda$0$0$0(EcgMonitoringSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mEcgMonitoringSettings.setMInterval(((int) Math.pow(2.0d, r10)) * 15);
        r9.getItemInterval().setMRightText(cp5.iI(r9.mEcgMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.ECG_SET, BleKeyFlag.UPDATE, r9.mEcgMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final EcgMonitoringSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new iO1Oi0(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(EcgMonitoringSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mEcgMonitoringSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.ECG_SET, BleKeyFlag.UPDATE, r9.mEcgMonitoringSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(EcgMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    private static final View timePanel_delegate$lambda$0(EcgMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.ll_time_panel);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.electrocardiogram_monitoring);
        q62 r0 = q62.OXO1;
        if (r0.XXI0XOIX() == false) goto L6;
        getTimePanel().setVisibility(0);
        AbhSettingsHeader r1 = getItemHeader();
        r1.setChecked(r0.IIX(this.mEcgMonitoringSettings.getMBleTimeRange().getMEnabled()));
        r1.setMListener(new OXOOO0III(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mEcgMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.iI(this.mEcgMonitoringSettings.getMInterval()));
        return;
    L6:
        getTimePanel().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ecg_monitoring_settings;
    }

    public final void onSetInterval(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mIntervalPopup != null) goto L5;
        int r2 = R.array.hr_monitoring_intervals;
        int r3 = 0;
        EcgMonitoringSettingsActivity r1 = this;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.monitoring_interval);
        r0.i010I(new iIOI01(this));
        r1.mIntervalPopup = r0;
    L6:
        dj4 r8 = r1.mIntervalPopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(XiiOXI.OXO1(r1.mEcgMonitoringSettings.getMInterval() / 15));
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
        r6.X01IiOiIi(new i111XXX(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mEcgMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
