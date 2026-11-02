package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I1i11;
import com.android.mltcode.paycertificationapi.IO0i0OXIX;
import com.android.mltcode.paycertificationapi.IO0iX;
import com.android.mltcode.paycertificationapi.IiXOIOOIX;
import com.android.mltcode.paycertificationapi.O0XiO10;
import com.android.mltcode.paycertificationapi.O1Xi;
import com.android.mltcode.paycertificationapi.OIX0;
import com.android.mltcode.paycertificationapi.OIXXOiii;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.OO1;
import com.android.mltcode.paycertificationapi.OOOO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0OOi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
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
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleRepeat;
import java.util.Calendar;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AlarmEditActivity extends BaseActivity {
    private boolean isEdited;

    @aa1
    private final Lazy itemLabel$delegate;

    @aa1
    private final Lazy itemRepeat$delegate;
    private BleAlarm mAlarm;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private go0 mSaveTipPopup;

    @aa1
    private final Lazy rootView$delegate;

    public AlarmEditActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new O1Xi(this));
        this.itemRepeat$delegate = LazyKt__LazyJVMKt.iO(new IO0iX(this));
        this.itemLabel$delegate = LazyKt__LazyJVMKt.iO(new IO0i0OXIX(this));
    }

    public static /* synthetic */ boolean I0iXXO(AlarmEditActivity r0) {
        return onBottomClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(AlarmEditActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(AlarmEditActivity r0) {
        return itemRepeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(AlarmEditActivity r0) {
        return onTitleLeftClick$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(AlarmEditActivity r0, int r1, int r2) {
        return initView$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ View X0O(AlarmEditActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X1ii(AlarmEditActivity r0) {
        return itemLabel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(AlarmEditActivity r0, BleConnector r1) {
        return handleComplete$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIO(AlarmEditActivity r0, Set r1) {
        return onSetRepeat$lambda$0$0(r0, r1);
    }

    private final AbhSettingsItem getItemLabel() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final boolean handleComplete() {
        return X0IOiX1O.OXO1(false, new O0XiO10(this));
    }

    private static final Unit handleComplete$lambda$0(AlarmEditActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BleAlarm r1 = r10.mAlarm;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r1 = null;
    L5:
        r1.setMTag(r10.getItemLabel().getRightText());
        BleAlarm r2 = r10.mAlarm;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mAlarm");
        r2 = null;
    L9:
        if (r2.getMRepeat() != 0) goto L24;
        Calendar r3 = Calendar.getInstance();
        BleAlarm r5 = r10.mAlarm;
        if (r5 != null) goto L13;
        Intrinsics.XXO("mAlarm");
        r5 = null;
    L13:
        Intrinsics.XXI(r3);
        r5.setMYear(OIi1iX.O10IXXX0X(r3));
        BleAlarm r6 = r10.mAlarm;
        if (r6 != null) goto L16;
        Intrinsics.XXO("mAlarm");
        r6 = null;
    L16:
        r6.setMMonth(OIi1iX.OIX0iXi(r3));
        BleAlarm r7 = r10.mAlarm;
        if (r7 != null) goto L19;
        Intrinsics.XXO("mAlarm");
        r7 = null;
    L19:
        r7.setMDay(OIi1iX.XIi00iiXO(r3));
        AlarmsActivity.OXO1 r4 = AlarmsActivity.Companion;
        BleAlarm r8 = r10.mAlarm;
        if (r8 != null) goto L22;
        Intrinsics.XXO("mAlarm");
        r8 = null;
    L22:
        r4.OXO1(r8);
    L24:
        if (r10.getMArg1() >= 0) goto L30;
        BleKey r9 = BleKey.ALARM;
        BleKeyFlag r12 = BleKeyFlag.CREATE;
        BleAlarm r13 = r10.mAlarm;
        if (r13 != null) goto L28;
        Intrinsics.XXO("mAlarm");
        BleAlarm r14 = null;
    L29:
        BaseBleConnector.sendObject$default(r11, r9, r12, r14, false, false, 24, null);
    L38:
        r10.setResult(-1);
        r10.finish();
        return Unit.OXO1;
    L28:
        r14 = r13;
        goto L29
    L30:
        BleAlarm r15 = r10.mAlarm;
        if (r15 != null) goto L33;
        Intrinsics.XXO("mAlarm");
        r15 = null;
    L33:
        r15.setMEnabled(1);
        BleKey r16 = BleKey.ALARM;
        BleKeyFlag r17 = BleKeyFlag.UPDATE;
        BleAlarm r18 = r10.mAlarm;
        if (r18 != null) goto L36;
        Intrinsics.XXO("mAlarm");
        BleAlarm r19 = null;
    L37:
        BaseBleConnector.sendObject$default(r11, r16, r17, r19, false, false, 24, null);
        goto L38
    L36:
        r19 = r18;
        goto L37
    }

    public static /* synthetic */ Unit iIiiO(AlarmEditActivity r0, BleConnector r1) {
        return onBottomClick$lambda$0$0$0(r0, r1);
    }

    private static final Unit initView$lambda$1$0(AlarmEditActivity r3, int r4, int r5) {
        r3.isEdited = true;
        BleAlarm r0 = r3.mAlarm;
        BleAlarm r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r0 = null;
    L5:
        r0.setMHour(r4);
        BleAlarm r6 = r3.mAlarm;
        if (r6 != null) goto L8;
        Intrinsics.XXO("mAlarm");
    L9:
        r1.setMMinute(r5);
        return Unit.OXO1;
    L8:
        r1 = r6;
        goto L9
    }

    private static final AbhSettingsItem itemLabel_delegate$lambda$0(AlarmEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_label);
    }

    private static final AbhSettingsItem itemRepeat_delegate$lambda$0(AlarmEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_repeat);
    }

    private static final boolean onBottomClick$lambda$0$0(final AlarmEditActivity r1) {
        return X0IOiX1O.OXO1(false, new X0OOi(r1));
    }

    private static final Unit onBottomClick$lambda$0$0$0(AlarmEditActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BleKey r2 = BleKey.ALARM;
        BleKeyFlag r3 = BleKeyFlag.DELETE;
        BleAlarm r0 = r9.mAlarm;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r0 = null;
    L5:
        BaseBleConnector.sendInt8$default(r10, r2, r3, r0.getMId(), false, false, 24, null);
        r9.setResult(-1);
        r9.finish();
        return Unit.OXO1;
    }

    private static final boolean onSetRepeat$lambda$0$0(AlarmEditActivity r6, Set r7) {
        Intrinsics.X0O(r7, "picked");
        r6.isEdited = true;
        BleAlarm r1 = r6.mAlarm;
        BleAlarm r3 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mAlarm");
        r1 = null;
    L5:
        r1.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, r7, null, 2, null));
        AbhSettingsItem r8 = r6.getItemRepeat();
        BleAlarm r9 = r6.mAlarm;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mAlarm");
    L9:
        r8.setMRightText(cp5.X11I(r3.getMRepeat()));
        return true;
    L8:
        r3 = r9;
        goto L9
    }

    private static final boolean onTitleLeftClick$lambda$0$0(AlarmEditActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$1(AlarmEditActivity r0) {
        return r0.handleComplete();
    }

    private static final View rootView_delegate$lambda$0(AlarmEditActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r12) {
        if (getMArg1() >= 0) goto L5;
        BleAlarm r0 = new BleAlarm(0, 0, 0, 0, 0, 0, 0, null, 255, null);
    L6:
        this.mAlarm = r0;
        return;
    L5:
        r0 = (BleAlarm) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.ALARM, BleAlarm.class, null, 4, null).get(getMArg1());
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() >= 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_alarm);
        findViewById(R.id.btn_bottom).setVisibility(8);
    L6:
        ImageView r0 = (ImageView) findViewById(R.id.abh_title_right);
        r0.setImageResource(R.drawable.ic_confirm);
        r0.setVisibility(0);
        TimePicker r1 = (TimePicker) findViewById(R.id.time_picker);
        BleAlarm r2 = this.mAlarm;
        BleAlarm r3 = null;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mAlarm");
        r2 = null;
    L9:
        int r4 = r2.getMHour();
        BleAlarm r6 = this.mAlarm;
        if (r6 != null) goto L12;
        Intrinsics.XXO("mAlarm");
        r6 = null;
    L12:
        r1.IO(r4, r6.getMMinute());
        r1.setMListener(new OO1(this));
        AbhSettingsItem r5 = getItemRepeat();
        BleAlarm r7 = this.mAlarm;
        if (r7 != null) goto L15;
        Intrinsics.XXO("mAlarm");
        r7 = null;
    L15:
        r5.setMRightText(cp5.X11I(r7.getMRepeat()));
        if (q62.OXO1.X1() == false) goto L23;
        getItemLabel().setVisibility(0);
        getItemLabel().getEdtValue().addTextChangedListener(new OIXXOiii(getItemLabel().getEdtValue(), 21));
        AbhSettingsItem r8 = getItemLabel();
        BleAlarm r9 = this.mAlarm;
        if (r9 != null) goto L20;
        Intrinsics.XXO("mAlarm");
    L21:
        r8.setMRightText(r3.getMTag());
        return;
    L20:
        r3 = r9;
        goto L21
    L23:
        getItemLabel().setVisibility(8);
        return;
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_alarm);
        findViewById(R.id.btn_bottom).setVisibility(0);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_alarm_edit;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_alarm);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new I1i11(this));
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
        r6.iOO1ii1(new OOOO(this));
        this.mRepeatPopup = r6;
    L5:
        jv0 r7 = this.mRepeatPopup;
        if (r7 == null) goto L12;
        BleRepeat r0 = BleRepeat.INSTANCE;
        BleAlarm r1 = this.mAlarm;
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
        r5.iX1O1(Integer.valueOf(R.string.give_up), new IiXOIOOIX(this));
        r5.X1IX(R.string.save, new OIX0(this));
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
