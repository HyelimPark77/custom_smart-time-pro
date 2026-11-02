package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.ll0;
import com.android.mltcode.paycertificationapi.ml0;
import com.android.mltcode.paycertificationapi.nl0;
import com.android.mltcode.paycertificationapi.ol0;
import com.android.mltcode.paycertificationapi.pl0;
import com.android.mltcode.paycertificationapi.ql0;
import com.android.mltcode.paycertificationapi.rl0;
import com.android.mltcode.paycertificationapi.sl0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tl0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import com.sma.smartv3.view.picker.TimePicker;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleMedicationAlarm;
import com.szabh.smable3.entity.BleRepeat;
import java.util.Calendar;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MedicationAlarmEditActivity extends BaseActivity {
    private boolean isEdited;

    @aa1
    private final Lazy itemRepeat$delegate;
    private BleMedicationAlarm mAlarm;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private go0 mSaveTipPopup;

    @aa1
    private final Lazy rootView$delegate;

    public MedicationAlarmEditActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new pl0(this));
        this.itemRepeat$delegate = LazyKt__LazyJVMKt.iO(new ql0(this));
    }

    public static /* synthetic */ boolean I0iXXO(MedicationAlarmEditActivity r0) {
        return onBottomClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(MedicationAlarmEditActivity r0, Set r1) {
        return onSetRepeat$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(MedicationAlarmEditActivity r0, BleConnector r1) {
        return handleComplete$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean O10IXXX0X(MedicationAlarmEditActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem OIX0iXi(MedicationAlarmEditActivity r0) {
        return itemRepeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(MedicationAlarmEditActivity r0, BleConnector r1) {
        return onBottomClick$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ View X1ii(MedicationAlarmEditActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(MedicationAlarmEditActivity r0, int r1, int r2) {
        return initView$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XiOIO(MedicationAlarmEditActivity r0) {
        return onTitleLeftClick$lambda$0$1(r0);
    }

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final boolean handleComplete() {
        return X0IOiX1O.OXO1(false, new ol0(this));
    }

    private static final Unit handleComplete$lambda$0(MedicationAlarmEditActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BleMedicationAlarm r1 = r10.mAlarm;
        if (r1 != null) goto L6;
        Intrinsics.XXO("mAlarm");
        r1 = null;
    L6:
        if (r1.getMRepeat() != 0) goto L21;
        Calendar r2 = Calendar.getInstance();
        BleMedicationAlarm r5 = r10.mAlarm;
        if (r5 != null) goto L10;
        Intrinsics.XXO("mAlarm");
        r5 = null;
    L10:
        Intrinsics.XXI(r2);
        r5.setMYear(OIi1iX.O10IXXX0X(r2));
        BleMedicationAlarm r6 = r10.mAlarm;
        if (r6 != null) goto L13;
        Intrinsics.XXO("mAlarm");
        r6 = null;
    L13:
        r6.setMMonth(OIi1iX.OIX0iXi(r2));
        BleMedicationAlarm r7 = r10.mAlarm;
        if (r7 != null) goto L16;
        Intrinsics.XXO("mAlarm");
        r7 = null;
    L16:
        r7.setMDay(OIi1iX.XIi00iiXO(r2));
        MedicationAlarmsActivity.OXO1 r3 = MedicationAlarmsActivity.Companion;
        BleMedicationAlarm r8 = r10.mAlarm;
        if (r8 != null) goto L19;
        Intrinsics.XXO("mAlarm");
        r8 = null;
    L19:
        r3.OXO1(r8);
    L21:
        if (r10.getMArg1() >= 0) goto L27;
        BleKey r4 = BleKey.MEDICATION_ALARM;
        BleKeyFlag r9 = BleKeyFlag.CREATE;
        BleMedicationAlarm r12 = r10.mAlarm;
        if (r12 != null) goto L25;
        Intrinsics.XXO("mAlarm");
        BleMedicationAlarm r13 = null;
    L26:
        BaseBleConnector.sendObject$default(r11, r4, r9, r13, false, false, 24, null);
    L32:
        r10.setResult(-1);
        r10.finish();
        return Unit.OXO1;
    L25:
        r13 = r12;
        goto L26
    L27:
        BleKey r14 = BleKey.MEDICATION_ALARM;
        BleKeyFlag r15 = BleKeyFlag.UPDATE;
        BleMedicationAlarm r16 = r10.mAlarm;
        if (r16 != null) goto L30;
        Intrinsics.XXO("mAlarm");
        BleMedicationAlarm r17 = null;
    L31:
        BaseBleConnector.sendObject$default(r11, r14, r15, r17, false, false, 24, null);
        goto L32
    L30:
        r17 = r16;
        goto L31
    }

    private static final Unit initView$lambda$1$0(MedicationAlarmEditActivity r3, int r4, int r5) {
        r3.isEdited = true;
        BleMedicationAlarm r0 = r3.mAlarm;
        BleMedicationAlarm r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r0 = null;
    L5:
        r0.setMHour(r4);
        BleMedicationAlarm r6 = r3.mAlarm;
        if (r6 != null) goto L8;
        Intrinsics.XXO("mAlarm");
    L9:
        r1.setMMinute(r5);
        return Unit.OXO1;
    L8:
        r1 = r6;
        goto L9
    }

    private static final AbhSettingsItem itemRepeat_delegate$lambda$0(MedicationAlarmEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_repeat);
    }

    private static final boolean onBottomClick$lambda$0$0(final MedicationAlarmEditActivity r1) {
        return X0IOiX1O.OXO1(false, new rl0(r1));
    }

    private static final Unit onBottomClick$lambda$0$0$0(MedicationAlarmEditActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BleKey r2 = BleKey.MEDICATION_ALARM;
        BleKeyFlag r3 = BleKeyFlag.DELETE;
        BleMedicationAlarm r0 = r9.mAlarm;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r0 = null;
    L5:
        BaseBleConnector.sendInt8$default(r10, r2, r3, r0.getMId(), false, false, 24, null);
        r9.setResult(-1);
        r9.finish();
        return Unit.OXO1;
    }

    private static final boolean onSetRepeat$lambda$0$0(MedicationAlarmEditActivity r6, Set r7) {
        Intrinsics.X0O(r7, "picked");
        r6.isEdited = true;
        BleMedicationAlarm r1 = r6.mAlarm;
        BleMedicationAlarm r3 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r1 = null;
    L5:
        r1.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, r7, null, 2, null));
        AbhSettingsItem r8 = r6.getItemRepeat();
        BleMedicationAlarm r9 = r6.mAlarm;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mAlarm");
    L9:
        r8.setMRightText(cp5.X11I(r3.getMRepeat()));
        return true;
    L8:
        r3 = r9;
        goto L9
    }

    private static final boolean onTitleLeftClick$lambda$0$0(MedicationAlarmEditActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$1(MedicationAlarmEditActivity r0) {
        return r0.handleComplete();
    }

    private static final View rootView_delegate$lambda$0(MedicationAlarmEditActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r11) {
        if (getMArg1() >= 0) goto L5;
        BleMedicationAlarm r0 = new BleMedicationAlarm(0, 0, 0, 0, 0, 0, 0, 127, null);
    L6:
        this.mAlarm = r0;
        return;
    L5:
        r0 = (BleMedicationAlarm) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.MEDICATION_ALARM, BleMedicationAlarm.class, null, 4, null).get(getMArg1());
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() >= 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_medication_alarm);
        findViewById(R.id.btn_bottom).setVisibility(8);
    L6:
        ImageView r0 = (ImageView) findViewById(R.id.abh_title_right);
        r0.setImageResource(R.drawable.ic_confirm);
        r0.setVisibility(0);
        TimePicker r1 = (TimePicker) findViewById(R.id.time_picker);
        BleMedicationAlarm r2 = this.mAlarm;
        BleMedicationAlarm r3 = null;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mAlarm");
        r2 = null;
    L9:
        int r4 = r2.getMHour();
        BleMedicationAlarm r5 = this.mAlarm;
        if (r5 != null) goto L12;
        Intrinsics.XXO("mAlarm");
        r5 = null;
    L12:
        r1.IO(r4, r5.getMMinute());
        r1.setMListener(new nl0(this));
        AbhSettingsItem r6 = getItemRepeat();
        BleMedicationAlarm r7 = this.mAlarm;
        if (r7 != null) goto L15;
        Intrinsics.XXO("mAlarm");
    L16:
        r6.setMRightText(cp5.X11I(r3.getMRepeat()));
        return;
    L15:
        r3 = r7;
        goto L16
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_medication_alarm);
        findViewById(R.id.btn_bottom).setVisibility(0);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_medication_alarm_edit;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_medication_alarm);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new ml0(this));
        this.mDeletePopup = r5;
    L5:
        go0 r6 = this.mDeletePopup;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void onSetRepeat(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mRepeatPopup != null) goto L5;
        jv0 r6 = new jv0(this, R.array.weekdays_s);
        r6.O1O(R.string.repeat);
        r6.iOO1ii1(new ll0(this));
        this.mRepeatPopup = r6;
    L5:
        jv0 r7 = this.mRepeatPopup;
        if (r7 == null) goto L12;
        BleRepeat r0 = BleRepeat.INSTANCE;
        BleMedicationAlarm r1 = this.mAlarm;
        if (r1 != null) goto L10;
        Intrinsics.XXO("mAlarm");
        r1 = null;
    L10:
        r7.IXXOO(BleRepeat.toIndices$default(r0, r1.getMRepeat(), null, 2, null));
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r7.I1XOi1(r2);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.isEdited == true) goto L5;
        finish();
        return;
    L5:
        if (this.mSaveTipPopup != null) goto L7;
        int r2 = 0;
        go0 r5 = new go0(this, r2, 2, null);
        r5.O1O(R.string.whether_to_save_change);
        r5.iX1O1(Integer.valueOf(R.string.give_up), new sl0(this));
        r5.X1IX(R.string.save, new tl0(this));
        this.mSaveTipPopup = r5;
    L7:
        go0 r6 = this.mSaveTipPopup;
        if (r6 == null) goto L13;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        handleComplete();
    }
}
