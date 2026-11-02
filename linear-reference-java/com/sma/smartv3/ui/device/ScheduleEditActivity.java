package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iXOO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.OXIOI1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.av3;
import com.android.mltcode.paycertificationapi.bv3;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cv3;
import com.android.mltcode.paycertificationapi.cw3;
import com.android.mltcode.paycertificationapi.dv3;
import com.android.mltcode.paycertificationapi.ev3;
import com.android.mltcode.paycertificationapi.fv3;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gv3;
import com.android.mltcode.paycertificationapi.hv3;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iv3;
import com.android.mltcode.paycertificationapi.jv3;
import com.android.mltcode.paycertificationapi.kv3;
import com.android.mltcode.paycertificationapi.lv3;
import com.android.mltcode.paycertificationapi.mv3;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleSchedule;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ScheduleEditActivity extends BaseActivity {

    @aa1
    private final Lazy edtContent$delegate;

    @aa1
    private final Lazy edtTip$delegate;
    private boolean isEdited;

    @aa1
    private final Lazy itemAdvance$delegate;

    @aa1
    private final Lazy itemTime$delegate;

    @aa1
    private final Lazy itemTitle$delegate;

    @tb1
    private pv1 mAdvancePopup;

    @aa1
    private final SimpleDateFormat mDateFormat;

    @tb1
    private OXIOI1 mDateTimePopup;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private go0 mSaveTipPopup;
    private BleSchedule mSchedule;

    @aa1
    private final Lazy rootView$delegate;

    public static final class OXO1 extends O0iXOO {
        public final /* synthetic */ ScheduleEditActivity I1;

        public OXO1(ScheduleEditActivity r1) {
            this.I1 = r1;
            super(32);
        }

        @Override // com.android.mltcode.paycertificationapi.O0iXOO, android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
            super.afterTextChanged(r3);
            ScheduleEditActivity.access$setEdited$p(this.I1, true);
            BleSchedule r0 = ScheduleEditActivity.access$getMSchedule$p(this.I1);
            if (r0 != null) goto L5;
            Intrinsics.XXO("mSchedule");
            r0 = null;
        L5:
            if (r3 == null) goto L8;
            String r4 = r3.toString();
            if (r4 == null) goto L8;
        L9:
            r0.setMTitle(r4);
            return;
        L8:
            r4 = "";
            goto L9
        }
    }

    public static final class XIi00iiXO extends O0iXOO {
        public final /* synthetic */ ScheduleEditActivity I1;

        public XIi00iiXO(ScheduleEditActivity r1) {
            this.I1 = r1;
            super(250);
        }

        @Override // com.android.mltcode.paycertificationapi.O0iXOO, android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
            super.afterTextChanged(r3);
            ScheduleEditActivity.access$setEdited$p(this.I1, true);
            BleSchedule r0 = ScheduleEditActivity.access$getMSchedule$p(this.I1);
            if (r0 != null) goto L5;
            Intrinsics.XXO("mSchedule");
            r0 = null;
        L5:
            if (r3 == null) goto L8;
            String r4 = r3.toString();
            if (r4 == null) goto L8;
        L9:
            r0.setMContent(r4);
            ScheduleEditActivity.access$getEdtTip(this.I1).setText(ScheduleEditActivity.m6760access$getEdtTip(this.I1));
            return;
        L8:
            r4 = "";
            goto L9
        }
    }

    public ScheduleEditActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iv3(this));
        this.itemTitle$delegate = LazyKt__LazyJVMKt.iO(new jv3(this));
        this.itemTime$delegate = LazyKt__LazyJVMKt.iO(new kv3(this));
        this.itemAdvance$delegate = LazyKt__LazyJVMKt.iO(new lv3(this));
        this.edtContent$delegate = LazyKt__LazyJVMKt.iO(new mv3(this));
        this.edtTip$delegate = LazyKt__LazyJVMKt.iO(new bv3(this));
        this.mDateFormat = O0X11OiO.i0X000X0O(i72.OXO1.i0X000X0O(), false, 2, null);
    }

    public static /* synthetic */ boolean I0iXXO(ScheduleEditActivity r0) {
        return onTitleLeftClick$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean I1XOi1(ScheduleEditActivity r0) {
        return onBottomClick$lambda$0$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(ScheduleEditActivity r0) {
        return itemTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(ScheduleEditActivity r0, BleConnector r1) {
        return onBottomClick$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ TextView OIX0iXi(ScheduleEditActivity r0) {
        return edtTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OiIIX101O(ScheduleEditActivity r0) {
        return edtContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(ScheduleEditActivity r0, int r1, int r2, int r3, int r4, int r5) {
        return onSetDateTime$lambda$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ View X1ii(ScheduleEditActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XX0(ScheduleEditActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean XXI(ScheduleEditActivity r0, int r1) {
        return onSetAdvance$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem XiOIO(ScheduleEditActivity r0) {
        return itemTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem XiOIii1(ScheduleEditActivity r0) {
        return itemAdvance_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ TextView access$getEdtTip(ScheduleEditActivity r0) {
        return r0.getEdtTip();
    }

    public static final /* synthetic */ BleSchedule access$getMSchedule$p(ScheduleEditActivity r0) {
        return r0.mSchedule;
    }

    public static final /* synthetic */ void access$setEdited$p(ScheduleEditActivity r0, boolean r1) {
        r0.isEdited = r1;
    }

    private static final EditText edtContent_delegate$lambda$0(ScheduleEditActivity r1) {
        return (EditText) r1.findViewById(R.id.edt_content);
    }

    private static final TextView edtTip_delegate$lambda$0(ScheduleEditActivity r1) {
        return (TextView) r1.findViewById(R.id.edt_tip);
    }

    private final EditText getEdtContent() {
        return (EditText) getValue();
    }

    private final TextView getEdtTip() {
        return (TextView) getValue();
    }

    private final AbhSettingsItem getItemAdvance() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTime() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTitle() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final boolean handleComplete() {
        return X0IOiX1O.XIi00iiXO(false, new hv3(this), 1, null);
    }

    private static final Unit handleComplete$lambda$0(ScheduleEditActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        if (r10.getMArg1() >= 0) goto L9;
        BleKey r3 = BleKey.SCHEDULE;
        BleKeyFlag r4 = BleKeyFlag.CREATE;
        BleSchedule r6 = r10.mSchedule;
        if (r6 != null) goto L7;
        Intrinsics.XXO("mSchedule");
        BleSchedule r5 = null;
    L8:
        BaseBleConnector.sendObject$default(r11, r3, r4, r5, false, false, 24, null);
    L14:
        r10.setResult(-1);
        r10.finish();
        return Unit.OXO1;
    L7:
        r5 = r6;
        goto L8
    L9:
        BleKey r7 = BleKey.SCHEDULE;
        BleKeyFlag r8 = BleKeyFlag.UPDATE;
        BleSchedule r2 = r10.mSchedule;
        if (r2 != null) goto L12;
        Intrinsics.XXO("mSchedule");
        BleSchedule r9 = null;
    L13:
        BaseBleConnector.sendObject$default(r11, r7, r8, r9, false, false, 24, null);
        goto L14
    L12:
        r9 = r2;
        goto L13
    }

    public static /* synthetic */ Unit iIiiO(ScheduleEditActivity r0, BleConnector r1) {
        return handleComplete$lambda$0(r0, r1);
    }

    private static final AbhSettingsItem itemAdvance_delegate$lambda$0(ScheduleEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_advance);
    }

    private static final AbhSettingsItem itemTime_delegate$lambda$0(ScheduleEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time);
    }

    private static final AbhSettingsItem itemTitle_delegate$lambda$0(ScheduleEditActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_title);
    }

    private static final boolean onBottomClick$lambda$0$0(final ScheduleEditActivity r3) {
        return X0IOiX1O.XIi00iiXO(false, new ev3(r3), 1, null);
    }

    private static final Unit onBottomClick$lambda$0$0$0(ScheduleEditActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BleKey r2 = BleKey.SCHEDULE;
        BleKeyFlag r3 = BleKeyFlag.DELETE;
        BleSchedule r0 = r9.mSchedule;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mSchedule");
        r0 = null;
    L5:
        BaseBleConnector.sendInt8$default(r10, r2, r3, r0.getMId(), false, false, 24, null);
        r9.setResult(-1);
        r9.finish();
        return Unit.OXO1;
    }

    private static final boolean onSetAdvance$lambda$0$0(ScheduleEditActivity r4, int r5) {
        r4.isEdited = true;
        BleSchedule r1 = r4.mSchedule;
        BleSchedule r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mSchedule");
        r1 = null;
    L5:
        r1.setMAdvance(cp5.XO0O10(r5));
        AbhSettingsItem r6 = r4.getItemAdvance();
        BleSchedule r7 = r4.mSchedule;
        if (r7 != null) goto L8;
        Intrinsics.XXO("mSchedule");
    L9:
        r6.setMRightText(cp5.IiI10X(r2.getMAdvance()));
        return true;
    L8:
        r2 = r7;
        goto L9
    }

    private static final boolean onSetDateTime$lambda$0$0(ScheduleEditActivity r4, int r5, int r6, int r7, int r8, int r9) {
        r4.isEdited = true;
        BleSchedule r1 = r4.mSchedule;
        BleSchedule r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mSchedule");
        r1 = null;
    L5:
        r1.setMYear(r5);
        BleSchedule r10 = r4.mSchedule;
        if (r10 != null) goto L8;
        Intrinsics.XXO("mSchedule");
        r10 = null;
    L8:
        r10.setMMonth(r6);
        BleSchedule r11 = r4.mSchedule;
        if (r11 != null) goto L11;
        Intrinsics.XXO("mSchedule");
        r11 = null;
    L11:
        r11.setMDay(r7);
        BleSchedule r12 = r4.mSchedule;
        if (r12 != null) goto L14;
        Intrinsics.XXO("mSchedule");
        r12 = null;
    L14:
        r12.setMHour(r8);
        BleSchedule r13 = r4.mSchedule;
        if (r13 != null) goto L17;
        Intrinsics.XXO("mSchedule");
        r13 = null;
    L17:
        r13.setMMinute(r9);
        AbhSettingsItem r14 = r4.getItemTime();
        SimpleDateFormat r15 = r4.mDateFormat;
        BleSchedule r16 = r4.mSchedule;
        if (r16 != null) goto L20;
        Intrinsics.XXO("mSchedule");
    L21:
        String r17 = r15.format(cw3.OXO1(r2));
        Intrinsics.O10IXXX0X(r17, "format(...)");
        r14.setMRightText(r17);
        return true;
    L20:
        r2 = r16;
        goto L21
    }

    private static final boolean onTitleLeftClick$lambda$0$0(ScheduleEditActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$1(ScheduleEditActivity r0) {
        return r0.handleComplete();
    }

    private static final View rootView_delegate$lambda$0(ScheduleEditActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r12) {
        if (getMArg1() >= 0) goto L5;
        Calendar r13 = Calendar.getInstance();
        Intrinsics.XXI(r13);
        BleSchedule r0 = new BleSchedule(OIi1iX.O10IXXX0X(r13), OIi1iX.OIX0iXi(r13), OIi1iX.XIi00iiXO(r13), OIi1iX.XOO0ii0(r13), OIi1iX.OIi0(r13), 0, null, null, 224, null);
    L6:
        this.mSchedule = r0;
        return;
    L5:
        r0 = (BleSchedule) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null).get(getMArg1());
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() >= 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_schedule);
        findViewById(R.id.btn_bottom).setVisibility(8);
    L6:
        ImageView r0 = (ImageView) findViewById(R.id.abh_title_right);
        r0.setImageResource(R.drawable.ic_confirm);
        r0.setVisibility(0);
        AbhSettingsItem r1 = getItemTitle();
        BleSchedule r2 = this.mSchedule;
        BleSchedule r3 = null;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mSchedule");
        r2 = null;
    L9:
        r1.setMRightText(r2.getMTitle());
        r1.getEdtValue().addTextChangedListener(new OXO1(this));
        AbhSettingsItem r4 = getItemTime();
        SimpleDateFormat r5 = this.mDateFormat;
        BleSchedule r6 = this.mSchedule;
        if (r6 != null) goto L12;
        Intrinsics.XXO("mSchedule");
        r6 = null;
    L12:
        String r7 = r5.format(cw3.OXO1(r6));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        r4.setMRightText(r7);
        AbhSettingsItem r8 = getItemAdvance();
        BleSchedule r9 = this.mSchedule;
        if (r9 != null) goto L15;
        Intrinsics.XXO("mSchedule");
        r9 = null;
    L15:
        r8.setMRightText(cp5.IiI10X(r9.getMAdvance()));
        EditText r10 = getEdtContent();
        BleSchedule r11 = this.mSchedule;
        if (r11 != null) goto L18;
        Intrinsics.XXO("mSchedule");
    L19:
        r10.setText(r3.getMContent());
        getEdtTip().setText(m6761getEdtTip());
        r10.addTextChangedListener(new XIi00iiXO(this));
        return;
    L18:
        r3 = r11;
        goto L19
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_schedule);
        findViewById(R.id.btn_bottom).setVisibility(0);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_schedule_edit;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_schedule);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new av3(this));
        this.mDeletePopup = r5;
    L5:
        go0 r6 = this.mDeletePopup;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void onSetAdvance(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mAdvancePopup != null) goto L5;
        pv1 r4 = new pv1(getMContext(), R.array.schedule_advance);
        r4.iX(R.string.remind);
        r4.i010I(new gv3(this));
        this.mAdvancePopup = r4;
    L5:
        pv1 r5 = this.mAdvancePopup;
        if (r5 == null) goto L12;
        BleSchedule r0 = this.mSchedule;
        if (r0 != null) goto L10;
        Intrinsics.XXO("mSchedule");
        r0 = null;
    L10:
        r5.iOO1ii1(cp5.O00(r0.getMAdvance()));
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r5.I1XOi1(r1);
        return;
    }

    public final void onSetDateTime(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        if (this.mDateTimePopup != null) goto L5;
        OXIOI1 r9 = new OXIOI1(getMContext(), i72.OXO1.i0X000X0O());
        r9.i010I(new fv3(this));
        this.mDateTimePopup = r9;
    L5:
        OXIOI1 r1 = this.mDateTimePopup;
        if (r1 == null) goto L25;
        BleSchedule r10 = this.mSchedule;
        BleSchedule r0 = null;
        if (r10 != null) goto L10;
        Intrinsics.XXO("mSchedule");
        r10 = null;
    L10:
        int r11 = r10.getMYear();
        BleSchedule r3 = this.mSchedule;
        if (r3 != null) goto L13;
        Intrinsics.XXO("mSchedule");
        r3 = null;
    L13:
        int r4 = r3.getMMonth();
        BleSchedule r5 = this.mSchedule;
        if (r5 != null) goto L16;
        Intrinsics.XXO("mSchedule");
        r5 = null;
    L16:
        int r6 = r5.getMDay();
        BleSchedule r7 = this.mSchedule;
        if (r7 != null) goto L19;
        Intrinsics.XXO("mSchedule");
        r7 = null;
    L19:
        int r12 = r7.getMHour();
        BleSchedule r13 = this.mSchedule;
        if (r13 != null) goto L22;
        Intrinsics.XXO("mSchedule");
    L23:
        r1.II1Xi0(r11, r4, r6, r12, r0.getMMinute());
        View r14 = getRootView();
        Intrinsics.O10IXXX0X(r14, "<get-rootView>(...)");
        r1.I1XOi1(r14);
        return;
    L22:
        r0 = r13;
        goto L23
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
        r5.iX1O1(Integer.valueOf(R.string.give_up), new cv3(this));
        r5.X1IX(R.string.save, new dv3(this));
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

    /* JADX INFO: renamed from: access$getEdtTip, reason: collision with other method in class */
    public static final /* synthetic */ String m6760access$getEdtTip(ScheduleEditActivity r0) {
        return r0.m6761getEdtTip();
    }

    /* JADX INFO: renamed from: getEdtTip, reason: collision with other method in class */
    private final String m6761getEdtTip() {
        BleSchedule r0 = this.mSchedule;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mSchedule");
        r0 = null;
    L5:
        String r1 = r0.getMContent();
        Charset r2 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(r2, "UTF_8");
        byte[] r3 = r1.getBytes(r2);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        return r3.length + "/250";
    }
}
