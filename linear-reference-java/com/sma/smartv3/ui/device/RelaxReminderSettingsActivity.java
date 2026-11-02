package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah3;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sg3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tg3;
import com.android.mltcode.paycertificationapi.ug3;
import com.android.mltcode.paycertificationapi.vg3;
import com.android.mltcode.paycertificationapi.wg3;
import com.android.mltcode.paycertificationapi.xg3;
import com.android.mltcode.paycertificationapi.yg3;
import com.android.mltcode.paycertificationapi.zg3;
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
import com.szabh.smable3.entity.BleRelaxReminder;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RelaxReminderSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @aa1
    private final BleRelaxReminder mBleRelaxReminderSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate;

    public RelaxReminderSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new sg3(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new tg3(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new ug3(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new vg3(this));
        this.mBleRelaxReminderSettings = (BleRelaxReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RELAX_REMINDER, BleRelaxReminder.class, null, null, 12, null);
    }

    public static /* synthetic */ boolean I0iXXO(RelaxReminderSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ AbhSettingsItem I1XOi1(RelaxReminderSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO() {
        initView$lambda$0$0$0$0();
    }

    public static /* synthetic */ Unit O10IXXX0X(RelaxReminderSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit OIX0iXi(RelaxReminderSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem X0O(RelaxReminderSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(RelaxReminderSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XXI(RelaxReminderSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(RelaxReminderSettingsActivity r0, boolean r1) {
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

    private static final Unit initView$lambda$0$0(final RelaxReminderSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new ah3(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(RelaxReminderSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r9.mBleRelaxReminderSettings});
        r9.mBleRelaxReminderSettings.getMBleTimeRange().setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.RELAX_REMINDER, BleKeyFlag.UPDATE, r9.mBleRelaxReminderSettings, false, false, 24, null);
        new Handler(Looper.getMainLooper()).postDelayed(new yg3(), 150);
        return Unit.OXO1;
    }

    private static final void initView$lambda$0$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.X01IiOiIi, null, 2, null);
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(RelaxReminderSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(RelaxReminderSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(RelaxReminderSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final boolean onSetTimeRange$lambda$0$0(final RelaxReminderSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new zg3(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(RelaxReminderSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mBleRelaxReminderSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.RELAX_REMINDER, BleKeyFlag.UPDATE, r9.mBleRelaxReminderSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(RelaxReminderSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.relax_reminder);
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(q62.OXO1.IIX(this.mBleRelaxReminderSettings.getMBleTimeRange().getMEnabled()));
        r0.setMListener(new wg3(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartMinute(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_relax_reminder_settings;
    }

    public final void onSetInterval(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void onSetTimeRange(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new xg3(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartMinute(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndMinute());
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
