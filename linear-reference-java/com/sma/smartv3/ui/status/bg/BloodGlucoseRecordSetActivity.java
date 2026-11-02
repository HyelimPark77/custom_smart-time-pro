package com.sma.smartv3.ui.status.bg;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.OIOOXii;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.Oi1IOII11;
import com.android.mltcode.paycertificationapi.XOOOXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i1iIX0;
import com.android.mltcode.paycertificationapi.iOXiIIiX;
import com.android.mltcode.paycertificationapi.iXI11XXX;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.BGEMRecordSet;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseRecordSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,125:1\n18#2,2:126\n15#2:128\n11#2,2:129\n11#2,2:131\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n*L\n33#1:126,2\n33#1:128\n111#1:129,2\n117#1:131,2\n*E\n"})
public final class BloodGlucoseRecordSetActivity extends BaseActivity {

    @aa1
    private final Lazy itemCalendar$delegate;

    @aa1
    private final Lazy itemEndDate$delegate;

    @aa1
    private final Lazy itemStartDate$delegate;

    @aa1
    private BGEMRecordSet mSetting;

    public BloodGlucoseRecordSetActivity() {
        this.itemCalendar$delegate = LazyKt__LazyJVMKt.iO(new iXI11XXX(this));
        this.itemStartDate$delegate = LazyKt__LazyJVMKt.iO(new i1iIX0(this));
        this.itemEndDate$delegate = LazyKt__LazyJVMKt.iO(new XOOOXI(this));
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(BGEMRecordSet.class.getName()), BGEMRecordSet.class);
        if (r1 != null) goto L5;
        r1 = BGEMRecordSet.class.newInstance();
    L5:
        this.mSetting = (BGEMRecordSet) r1;
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(BloodGlucoseRecordSetActivity r0) {
        return itemCalendar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(BloodGlucoseRecordSetActivity r0, int r1) {
        return onCalendar$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean OIX0iXi(BloodGlucoseRecordSetActivity r0, int r1, int r2, int r3) {
        return onStartDate$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean X0O(BloodGlucoseRecordSetActivity r0, int r1, int r2, int r3) {
        return onEndDate$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ AbhSettingsItem X1ii(BloodGlucoseRecordSetActivity r0) {
        return itemEndDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem XXI(BloodGlucoseRecordSetActivity r0) {
        return itemStartDate_delegate$lambda$0(r0);
    }

    private final AbhSettingsItem getItemCalendar() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemEndDate() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemStartDate() {
        return (AbhSettingsItem) getValue();
    }

    private static final AbhSettingsItem itemCalendar_delegate$lambda$0(BloodGlucoseRecordSetActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_calendar);
    }

    private static final AbhSettingsItem itemEndDate_delegate$lambda$0(BloodGlucoseRecordSetActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_end_date);
    }

    private static final AbhSettingsItem itemStartDate_delegate$lambda$0(BloodGlucoseRecordSetActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_start_date);
    }

    private static final boolean onCalendar$lambda$0$0(BloodGlucoseRecordSetActivity r1, int r2) {
        r1.mSetting.setCalendar(r2);
        r1.updateUI();
        return true;
    }

    private static final boolean onEndDate$lambda$0$0(BloodGlucoseRecordSetActivity r1, int r2, int r3, int r4) {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, r2);
        OIi1iX.OII(r0, r3);
        OIi1iX.IIX1OXO(r0, r4);
        OIi1iX.iIiiO(r0, 0);
        OIi1iX.OiIIX101O(r0, 0);
        OIi1iX.I1(r0, 0);
        OIi1iX.XX0(r0, 0);
        r1.mSetting.setEndDate(r0.getTimeInMillis());
        r1.updateUI();
        return true;
    }

    private static final boolean onStartDate$lambda$0$0(BloodGlucoseRecordSetActivity r1, int r2, int r3, int r4) {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, r2);
        OIi1iX.OII(r0, r3);
        OIi1iX.IIX1OXO(r0, r4);
        OIi1iX.iIiiO(r0, 0);
        OIi1iX.OiIIX101O(r0, 0);
        OIi1iX.I1(r0, 0);
        OIi1iX.XX0(r0, 0);
        r1.mSetting.setStartDate(r0.getTimeInMillis());
        r1.updateUI();
        return true;
    }

    private final void updateUI() {
        AbhSettingsItem r0 = getItemCalendar();
        String r1 = getResources().getStringArray(R.array.by_calendars)[this.mSetting.getCalendar()];
        Intrinsics.O10IXXX0X(r1, "get(...)");
        r0.setMRightText(r1);
        AbhSettingsItem r2 = getItemStartDate();
        String r3 = "";
        if (this.mSetting.getStartDate() == 0) goto L5;
        String r4 = O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(this.mSetting.getStartDate()));
        Intrinsics.O10IXXX0X(r4, "format(...)");
    L6:
        r2.setMRightText(r4);
        AbhSettingsItem r5 = getItemEndDate();
        if (this.mSetting.getEndDate() == 0) goto L9;
        r3 = O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(this.mSetting.getEndDate()));
        Intrinsics.O10IXXX0X(r3, "format(...)");
    L9:
        r5.setMRightText(r3);
        return;
    L5:
        r4 = "";
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measurement_logs);
        updateUI();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_record_set;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        SPUtils r5 = a01.OXO1.IiI10X();
        BGEMRecordSet r0 = this.mSetting;
        r5.put(BGEMRecordSet.class.getName(), new Gson().toJson(r0));
        I01XX0.XIi00iiXO(I01XX0.IX0iIX, null, 2, null);
        finish();
    }

    public final void onCalendar(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r3 = R.array.by_calendars;
        int r4 = 0;
        dj4 r1 = new dj4(this, r3, r4, 4, null);
        r1.iX(R.string.by_calendar);
        r1.i010I(new Oi1IOII11(this));
        r1.II1Xi0(this.mSetting.getCalendar());
        r1.IIX1OXO();
    }

    public final void onEndDate(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        O1100iXOX r4 = new O1100iXOX(this);
        r4.iX(R.string.end_date);
        r4.i010I(new iOXiIIiX(this));
        r4.iOO1ii1(this.mSetting.getEndDate());
        r4.IIX1OXO();
    }

    public final void onReset(@aa1 View r10) {
        Intrinsics.X0O(r10, "view");
        this.mSetting = new BGEMRecordSet(0, 0, 0, 7, null);
        SPUtils r11 = a01.OXO1.IiI10X();
        BGEMRecordSet r0 = this.mSetting;
        r11.put(BGEMRecordSet.class.getName(), new Gson().toJson(r0));
        I01XX0.XIi00iiXO(I01XX0.IX0iIX, null, 2, null);
        updateUI();
    }

    public final void onStartDate(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        O1100iXOX r4 = new O1100iXOX(this);
        r4.iX(R.string.start_date);
        r4.i010I(new OIOOXii(this));
        r4.iOO1ii1(this.mSetting.getStartDate());
        r4.IIX1OXO();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
