package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.II00IIOO;
import com.android.mltcode.paycertificationapi.IIX11iIIi;
import com.android.mltcode.paycertificationapi.IOiOi1O;
import com.android.mltcode.paycertificationapi.Ii1I10;
import com.android.mltcode.paycertificationapi.O0II110OI;
import com.android.mltcode.paycertificationapi.O0IXiXX;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.O1OIiIOI;
import com.android.mltcode.paycertificationapi.O1OXOI;
import com.android.mltcode.paycertificationapi.O1i10iiX;
import com.android.mltcode.paycertificationapi.OIXXIIXi;
import com.android.mltcode.paycertificationapi.OX1O0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.OiOi01XI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0IXiOI0O;
import com.android.mltcode.paycertificationapi.X1OiXi;
import com.android.mltcode.paycertificationapi.XI0I11O1i;
import com.android.mltcode.paycertificationapi.XIiXO1O0;
import com.android.mltcode.paycertificationapi.XX011ii;
import com.android.mltcode.paycertificationapi.XXI001I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0OXX1;
import com.android.mltcode.paycertificationapi.i1OX1iIIO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIOO0IIiI;
import com.android.mltcode.paycertificationapi.iXOXiXOiO;
import com.android.mltcode.paycertificationapi.it5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGirlCareSettings;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHealthCareSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCareSettingsActivity.kt\ncom/sma/smartv3/ui/device/HealthCareSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class HealthCareSettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int DURATION_DEFAULT = 5;
    public static final int DURATION_MAX = 8;
    public static final int DURATION_MIN = 2;
    public static final int MENSTRUATION_REMINDER_DEFAULT = 2;
    public static final int MENSTRUATION_REMINDER_MAX = 3;
    public static final int MENSTRUATION_REMINDER_MIN = 1;
    public static final int OVULATION_REMINDER_DEFAULT = 3;
    public static final int OVULATION_REMINDER_MAX = 3;
    public static final int OVULATION_REMINDER_MIN = 1;
    public static final int PERIOD_DEFAULT = 28;
    private static final int PERIOD_MAX = 0;
    private static final int PERIOD_MIN = 0;

    @aa1
    private final Lazy itemDuration$delegate;

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemLast$delegate;

    @aa1
    private final Lazy itemOvulationReminder$delegate;

    @aa1
    private final Lazy itemPeriod$delegate;

    @aa1
    private final Lazy itemPeriodReminder$delegate;

    @aa1
    private final Lazy itemReminderTime$delegate;

    @tb1
    private qv1 mDurationPopup;

    @aa1
    private final BleGirlCareSettings mGirlCareSettings;

    @tb1
    private O1100iXOX mLastPopup;

    @tb1
    private qv1 mOvulationReminderPopup;

    @tb1
    private qv1 mPeriodPopup;

    @tb1
    private qv1 mPeriodReminderPopup;

    @tb1
    private it5 mReminderPopup;

    @aa1
    private final Lazy rootView$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final int OXO1() {
            return HealthCareSettingsActivity.access$getPERIOD_MAX$cp();
        }

        public final int XIi00iiXO() {
            return HealthCareSettingsActivity.access$getPERIOD_MIN$cp();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
        PERIOD_MIN = 25;
        PERIOD_MAX = 35;
    }

    public HealthCareSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iXOXiXOiO(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new Ii1I10(this));
        this.itemDuration$delegate = LazyKt__LazyJVMKt.iO(new O1OXOI(this));
        this.itemPeriod$delegate = LazyKt__LazyJVMKt.iO(new XXI001I(this));
        this.itemLast$delegate = LazyKt__LazyJVMKt.iO(new O0II110OI(this));
        this.itemPeriodReminder$delegate = LazyKt__LazyJVMKt.iO(new OiOi01XI(this));
        this.itemOvulationReminder$delegate = LazyKt__LazyJVMKt.iO(new IOiOi1O(this));
        this.itemReminderTime$delegate = LazyKt__LazyJVMKt.iO(new X0IXiOI0O(this));
        BleGirlCareSettings r0 = (BleGirlCareSettings) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.GIRL_CARE, BleGirlCareSettings.class, null, 4, null);
        if (r0 != null) goto L5;
        r0 = new BleGirlCareSettings(0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2043, null);
    L5:
        this.mGirlCareSettings = r0;
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(HealthCareSettingsActivity r0) {
        return itemLast_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(HealthCareSettingsActivity r0, int r1, BleConnector r2) {
        return onSetOvulationReminder$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(HealthCareSettingsActivity r0, int r1, BleConnector r2) {
        return onSetDuration$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit II1Xi0(HealthCareSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean IIX1OXO(HealthCareSettingsActivity r0, int r1) {
        return onSetDuration$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ boolean IXXOO(HealthCareSettingsActivity r0, int r1, int r2) {
        return onSetReminderTime$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader O10IXXX0X(HealthCareSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(HealthCareSettingsActivity r0, int r1, int r2, int r3, BleConnector r4) {
        return onSetLast$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ AbhSettingsItem OIX0iXi(HealthCareSettingsActivity r0) {
        return itemReminderTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OX(HealthCareSettingsActivity r0, int r1) {
        return onSetOvulationReminder$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem OiIIX101O(HealthCareSettingsActivity r0) {
        return itemOvulationReminder_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X01IiOiIi(HealthCareSettingsActivity r0, int r1, BleConnector r2) {
        return onSetPeriod$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean X0O(HealthCareSettingsActivity r0, int r1) {
        return onSetPeriodReminder$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(HealthCareSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(HealthCareSettingsActivity r0, int r1, BleConnector r2) {
        return onSetPeriodReminder$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XXI(HealthCareSettingsActivity r0, int r1, int r2, int r3) {
        return onSetLast$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ AbhSettingsItem XiOIO(HealthCareSettingsActivity r0) {
        return itemPeriod_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem XiOIii1(HealthCareSettingsActivity r0) {
        return itemDuration_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ int access$getPERIOD_MAX$cp() {
        return PERIOD_MAX;
    }

    public static final /* synthetic */ int access$getPERIOD_MIN$cp() {
        return PERIOD_MIN;
    }

    private final AbhSettingsItem getItemDuration() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemLast() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemOvulationReminder() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemPeriod() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemPeriodReminder() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemReminderTime() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    public static /* synthetic */ Unit i010I(HealthCareSettingsActivity r0, int r1, int r2, BleConnector r3) {
        return onSetReminderTime$lambda$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean iIiiO(HealthCareSettingsActivity r0, int r1) {
        return onSetPeriod$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ View iOOX010X(HealthCareSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem iX(HealthCareSettingsActivity r0) {
        return itemPeriodReminder_delegate$lambda$0(r0);
    }

    private static final Unit initView$lambda$0$0(final HealthCareSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new OIXXIIXi(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(HealthCareSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGirlCareSettings.setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r9.mGirlCareSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.OX, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsItem itemDuration_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_period_length);
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemLast_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_last);
    }

    private static final AbhSettingsItem itemOvulationReminder_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_ovulation_reminder);
    }

    private static final AbhSettingsItem itemPeriodReminder_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_period_reminder);
    }

    private static final AbhSettingsItem itemPeriod_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_cycle_length);
    }

    private static final AbhSettingsItem itemReminderTime_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_reminder_time);
    }

    private static final boolean onSetDuration$lambda$1$0(final HealthCareSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new i1OX1iIIO(r2, r3), 1, null);
    }

    private static final Unit onSetDuration$lambda$1$0$0(HealthCareSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGirlCareSettings.setMMenstruationDuration(r10 + 2);
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r9.mGirlCareSettings, false, false, 24, null);
        r9.updateDuration();
        return Unit.OXO1;
    }

    private static final boolean onSetLast$lambda$0$0(final HealthCareSettingsActivity r1, final int r2, final int r3, final int r4) {
        return X0IOiX1O.XIi00iiXO(false, new iIOO0IIiI(r1, r2, r3, r4), 1, null);
    }

    private static final Unit onSetLast$lambda$0$0$0(HealthCareSettingsActivity r8, int r9, int r10, int r11, BleConnector r12) {
        Intrinsics.X0O(r12, "it");
        r8.mGirlCareSettings.setMLatestYear(r9);
        r8.mGirlCareSettings.setMLatestMonth(r10);
        r8.mGirlCareSettings.setMLatestDay(r11);
        BaseBleConnector.sendObject$default(r12, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r8.mGirlCareSettings, false, false, 24, null);
        r8.updateLatest();
        return Unit.OXO1;
    }

    private static final boolean onSetOvulationReminder$lambda$1$0(final HealthCareSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new i0OXX1(r2, r3), 1, null);
    }

    private static final Unit onSetOvulationReminder$lambda$1$0$0(HealthCareSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGirlCareSettings.setMOvulationReminderAdvance(r10 + 1);
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r9.mGirlCareSettings, false, false, 24, null);
        r9.updateOvulation();
        return Unit.OXO1;
    }

    private static final boolean onSetPeriod$lambda$1$0(final HealthCareSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new XX011ii(r2, r3), 1, null);
    }

    private static final Unit onSetPeriod$lambda$1$0$0(HealthCareSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGirlCareSettings.setMMenstruationPeriod(r10 + PERIOD_MIN);
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r9.mGirlCareSettings, false, false, 24, null);
        r9.updatePeriod();
        return Unit.OXO1;
    }

    private static final boolean onSetPeriodReminder$lambda$1$0(final HealthCareSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new O1OIiIOI(r2, r3), 1, null);
    }

    private static final Unit onSetPeriodReminder$lambda$1$0$0(HealthCareSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGirlCareSettings.setMMenstruationReminderAdvance(r10 + 1);
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r9.mGirlCareSettings, false, false, 24, null);
        r9.updateMenstruation();
        return Unit.OXO1;
    }

    private static final boolean onSetReminderTime$lambda$0$0(final HealthCareSettingsActivity r1, final int r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new II00IIOO(r1, r2, r3), 1, null);
    }

    private static final Unit onSetReminderTime$lambda$0$0$0(HealthCareSettingsActivity r8, int r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r8.mGirlCareSettings.setMReminderHour(r9);
        r8.mGirlCareSettings.setMReminderMinute(r10);
        BaseBleConnector.sendObject$default(r11, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, r8.mGirlCareSettings, false, false, 24, null);
        r8.updateReminderTime();
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(HealthCareSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    private final void updateDuration() {
        getItemDuration().setMRightText(this.mGirlCareSettings.getMMenstruationDuration() + " " + getString(R.string.days));
    }

    private final void updateLatest() {
        AbhSettingsItem r0 = getItemLast();
        if (i72.OXO1.XiOIO() != DateTimeFormat.ddMMyyyy) goto L5;
        String r1 = this.mGirlCareSettings.getMLatestDay() + "/" + this.mGirlCareSettings.getMLatestMonth() + "/" + this.mGirlCareSettings.getMLatestYear();
    L6:
        r0.setMRightText(r1);
        return;
    L5:
        r1 = this.mGirlCareSettings.getMLatestMonth() + "/" + this.mGirlCareSettings.getMLatestDay() + "/" + this.mGirlCareSettings.getMLatestYear();
        goto L6
    }

    private final void updateMenstruation() {
        getItemPeriodReminder().setMRightText(this.mGirlCareSettings.getMMenstruationReminderAdvance() + " " + getString(R.string.days_in_advance));
    }

    private final void updateOvulation() {
        getItemOvulationReminder().setMRightText(this.mGirlCareSettings.getMOvulationReminderAdvance() + " " + getString(R.string.days_in_advance));
    }

    private final void updatePeriod() {
        getItemPeriod().setMRightText(this.mGirlCareSettings.getMMenstruationPeriod() + " " + getString(R.string.days));
    }

    private final void updateReminderTime() {
        getItemReminderTime().setMRightText(O0X11OiO.X01IiOiIi(this.mGirlCareSettings.getMReminderHour(), this.mGirlCareSettings.getMReminderMinute(), i72.OXO1.i0X000X0O()));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        LogUtils.d(new Object[]{this.mGirlCareSettings});
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        q62 r1 = q62.OXO1;
        r0.setText(r1.XX1Oi());
        getItemHeader().getTvTitle().setText(r1.XX1Oi());
        AbhSettingsHeader r2 = getItemHeader();
        r2.setChecked(OiOX0i.XIi00iiXO(this.mGirlCareSettings.getMEnabled()));
        r2.setMListener(new OX1O0(this));
        if (this.mGirlCareSettings.getMMenstruationDuration() != 0) goto L6;
        this.mGirlCareSettings.setMMenstruationDuration(5);
    L6:
        if (this.mGirlCareSettings.getMMenstruationPeriod() != 0) goto L8;
        this.mGirlCareSettings.setMMenstruationPeriod(28);
    L8:
        Calendar r3 = Calendar.getInstance();
        if (this.mGirlCareSettings.getMLatestYear() != 0) goto L12;
        this.mGirlCareSettings.setMLatestYear(r3.get(1));
    L12:
        if (this.mGirlCareSettings.getMLatestMonth() != 0) goto L15;
        this.mGirlCareSettings.setMLatestMonth(r3.get(2) + 1);
    L15:
        if (this.mGirlCareSettings.getMLatestDay() != 0) goto L18;
        this.mGirlCareSettings.setMLatestDay(r3.get(5));
    L18:
        if (this.mGirlCareSettings.getMMenstruationReminderAdvance() != 0) goto L21;
        this.mGirlCareSettings.setMMenstruationReminderAdvance(2);
    L21:
        if (this.mGirlCareSettings.getMOvulationReminderAdvance() != 0) goto L23;
        this.mGirlCareSettings.setMOvulationReminderAdvance(3);
    L23:
        updateDuration();
        updatePeriod();
        updateLatest();
        updateMenstruation();
        updateOvulation();
        updateReminderTime();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_health_care_settings;
    }

    public final void onSetDuration(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDurationPopup != null) goto L8;
        ArrayList r5 = new ArrayList(7);
        int r1 = 0;
    L5:
        if (r1 >= 7) goto L7;
        r5.add(String.valueOf(r1 + 2));
        r1 = r1 + 1;
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.period_length);
        r0.iOO1ii1(R.string.days);
        r0.iX(new XIiXO1O0(this));
        this.mDurationPopup = r0;
    L8:
        qv1 r6 = this.mDurationPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mGirlCareSettings.getMMenstruationDuration() - 2);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r6.I1XOi1(r2);
        return;
    }

    public final void onSetLast(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mLastPopup != null) goto L5;
        O1100iXOX r5 = new O1100iXOX(this);
        r5.iX(R.string.last_menstrual_period);
        r5.i010I(new O0IXiXX(this));
        this.mLastPopup = r5;
    L5:
        O1100iXOX r6 = this.mLastPopup;
        if (r6 == null) goto L9;
        r6.II1Xi0(this.mGirlCareSettings.getMLatestYear(), this.mGirlCareSettings.getMLatestMonth(), this.mGirlCareSettings.getMLatestDay());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void onSetOvulationReminder(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mOvulationReminderPopup != null) goto L8;
        ArrayList r5 = new ArrayList(3);
        int r1 = 0;
    L5:
        if (r1 >= 3) goto L7;
        r1 = r1 + 1;
        r5.add(String.valueOf(r1));
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.ovulation_reminder);
        r0.iOO1ii1(R.string.days_in_advance);
        r0.iX(new X1OiXi(this));
        this.mOvulationReminderPopup = r0;
    L8:
        qv1 r6 = this.mOvulationReminderPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mGirlCareSettings.getMOvulationReminderAdvance() - 1);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r6.I1XOi1(r2);
        return;
    }

    public final void onSetPeriod(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mPeriodPopup != null) goto L8;
        int r5 = (PERIOD_MAX - PERIOD_MIN) + 1;
        ArrayList r0 = new ArrayList(r5);
        int r1 = 0;
    L5:
        if (r1 >= r5) goto L7;
        r0.add(String.valueOf(PERIOD_MIN + r1));
        r1 = r1 + 1;
        goto L5
    L7:
        qv1 r6 = new qv1(this, r0);
        r6.IXXOO(R.string.cycle_length);
        r6.iOO1ii1(R.string.days);
        r6.iX(new O1i10iiX(this));
        this.mPeriodPopup = r6;
    L8:
        qv1 r7 = this.mPeriodPopup;
        if (r7 == null) goto L13;
        r7.O1O(this.mGirlCareSettings.getMMenstruationPeriod() - PERIOD_MIN);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r7.I1XOi1(r2);
        return;
    }

    public final void onSetPeriodReminder(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mPeriodReminderPopup != null) goto L8;
        ArrayList r5 = new ArrayList(3);
        int r1 = 0;
    L5:
        if (r1 >= 3) goto L7;
        r1 = r1 + 1;
        r5.add(String.valueOf(r1));
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.period_reminder);
        r0.iOO1ii1(R.string.days_in_advance);
        r0.iX(new IIX11iIIi(this));
        this.mPeriodReminderPopup = r0;
    L8:
        qv1 r6 = this.mPeriodReminderPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mGirlCareSettings.getMMenstruationReminderAdvance() - 1);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r6.I1XOi1(r2);
        return;
    }

    public final void onSetReminderTime(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mReminderPopup != null) goto L5;
        it5 r4 = new it5(this, i72.OXO1.i0X000X0O());
        r4.i010I(R.string.reminder_time);
        r4.II1Xi0(new XI0I11O1i(this));
        this.mReminderPopup = r4;
    L5:
        it5 r5 = this.mReminderPopup;
        if (r5 == null) goto L9;
        r5.iX(this.mGirlCareSettings.getMReminderHour(), this.mGirlCareSettings.getMReminderMinute());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
