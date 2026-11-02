package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cw3;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.ScheduleEditActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ScheduleEditActivity extends BaseActivity {
    private boolean isEdited;

    @tb1
    private pv1 mAdvancePopup;

    @tb1
    private OXIOI1 mDateTimePopup;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private go0 mSaveTipPopup;
    private BleSchedule mSchedule;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.rootView_delegate$lambda$0(this.f8766IO);
        }
    });

    @aa1
    private final Lazy itemTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.itemTitle_delegate$lambda$0(this.f9051IO);
        }
    });

    @aa1
    private final Lazy itemTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.itemTime_delegate$lambda$0(this.f9288IO);
        }
    });

    @aa1
    private final Lazy itemAdvance$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.itemAdvance_delegate$lambda$0(this.f9529IO);
        }
    });

    @aa1
    private final Lazy edtContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.edtContent_delegate$lambda$0(this.f9795IO);
        }
    });

    @aa1
    private final Lazy edtTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ScheduleEditActivity.edtTip_delegate$lambda$0(this.f5830IO);
        }
    });

    @aa1
    private final SimpleDateFormat mDateFormat = O0X11OiO.i0X000X0O(i72.OXO1.i0X000X0O(), false, 2, null);

    public static final class OXO1 extends O0iXOO {
        public OXO1() {
            super(32);
        }

        @Override // com.android.mltcode.paycertificationapi.O0iXOO, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            super.afterTextChanged(editable);
            ScheduleEditActivity.this.isEdited = true;
            BleSchedule bleSchedule = ScheduleEditActivity.this.mSchedule;
            if (bleSchedule == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule = null;
            }
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            bleSchedule.setMTitle(string);
        }
    }

    public static final class XIi00iiXO extends O0iXOO {
        public XIi00iiXO() {
            super(250);
        }

        @Override // com.android.mltcode.paycertificationapi.O0iXOO, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            super.afterTextChanged(editable);
            ScheduleEditActivity.this.isEdited = true;
            BleSchedule bleSchedule = ScheduleEditActivity.this.mSchedule;
            if (bleSchedule == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule = null;
            }
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            bleSchedule.setMContent(string);
            ScheduleEditActivity.this.getEdtTip().setText(ScheduleEditActivity.this.m48120getEdtTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText edtContent_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return (EditText) scheduleEditActivity.findViewById(R.id.edt_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView edtTip_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return (TextView) scheduleEditActivity.findViewById(R.id.edt_tip);
    }

    private final EditText getEdtContent() {
        return (EditText) this.edtContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getEdtTip() {
        return (TextView) this.edtTip$delegate.getValue();
    }

    private final AbhSettingsItem getItemAdvance() {
        return (AbhSettingsItem) this.itemAdvance$delegate.getValue();
    }

    private final AbhSettingsItem getItemTime() {
        return (AbhSettingsItem) this.itemTime$delegate.getValue();
    }

    private final AbhSettingsItem getItemTitle() {
        return (AbhSettingsItem) this.itemTitle$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleComplete() {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.hv3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScheduleEditActivity.handleComplete$lambda$0(this.f7213IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleComplete$lambda$0(ScheduleEditActivity scheduleEditActivity, BleConnector it) {
        BleSchedule bleSchedule;
        BleSchedule bleSchedule2;
        Intrinsics.X0O(it, "it");
        if (scheduleEditActivity.getMArg1() < 0) {
            BleKey bleKey = BleKey.SCHEDULE;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            BleSchedule bleSchedule3 = scheduleEditActivity.mSchedule;
            if (bleSchedule3 == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule2 = null;
            } else {
                bleSchedule2 = bleSchedule3;
            }
            BaseBleConnector.sendObject$default(it, bleKey, bleKeyFlag, bleSchedule2, false, false, 24, null);
        } else {
            BleKey bleKey2 = BleKey.SCHEDULE;
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            BleSchedule bleSchedule4 = scheduleEditActivity.mSchedule;
            if (bleSchedule4 == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule = null;
            } else {
                bleSchedule = bleSchedule4;
            }
            BaseBleConnector.sendObject$default(it, bleKey2, bleKeyFlag2, bleSchedule, false, false, 24, null);
        }
        scheduleEditActivity.setResult(-1);
        scheduleEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemAdvance_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return (AbhSettingsItem) scheduleEditActivity.findViewById(R.id.item_advance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTime_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return (AbhSettingsItem) scheduleEditActivity.findViewById(R.id.item_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTitle_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return (AbhSettingsItem) scheduleEditActivity.findViewById(R.id.item_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBottomClick$lambda$0$0(final ScheduleEditActivity scheduleEditActivity) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ev3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScheduleEditActivity.onBottomClick$lambda$0$0$0(this.f6495IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$0$0$0(ScheduleEditActivity scheduleEditActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleKey bleKey = BleKey.SCHEDULE;
        BleKeyFlag bleKeyFlag = BleKeyFlag.DELETE;
        BleSchedule bleSchedule = scheduleEditActivity.mSchedule;
        if (bleSchedule == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule = null;
        }
        BaseBleConnector.sendInt8$default(it, bleKey, bleKeyFlag, bleSchedule.getMId(), false, false, 24, null);
        scheduleEditActivity.setResult(-1);
        scheduleEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetAdvance$lambda$0$0(ScheduleEditActivity scheduleEditActivity, int i) {
        scheduleEditActivity.isEdited = true;
        BleSchedule bleSchedule = scheduleEditActivity.mSchedule;
        BleSchedule bleSchedule2 = null;
        if (bleSchedule == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule = null;
        }
        bleSchedule.setMAdvance(cp5.XO0O10(i));
        AbhSettingsItem itemAdvance = scheduleEditActivity.getItemAdvance();
        BleSchedule bleSchedule3 = scheduleEditActivity.mSchedule;
        if (bleSchedule3 == null) {
            Intrinsics.XXO("mSchedule");
        } else {
            bleSchedule2 = bleSchedule3;
        }
        itemAdvance.setMRightText(cp5.IiI10X(bleSchedule2.getMAdvance()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetDateTime$lambda$0$0(ScheduleEditActivity scheduleEditActivity, int i, int i2, int i3, int i4, int i5) {
        scheduleEditActivity.isEdited = true;
        BleSchedule bleSchedule = scheduleEditActivity.mSchedule;
        BleSchedule bleSchedule2 = null;
        if (bleSchedule == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule = null;
        }
        bleSchedule.setMYear(i);
        BleSchedule bleSchedule3 = scheduleEditActivity.mSchedule;
        if (bleSchedule3 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule3 = null;
        }
        bleSchedule3.setMMonth(i2);
        BleSchedule bleSchedule4 = scheduleEditActivity.mSchedule;
        if (bleSchedule4 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule4 = null;
        }
        bleSchedule4.setMDay(i3);
        BleSchedule bleSchedule5 = scheduleEditActivity.mSchedule;
        if (bleSchedule5 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule5 = null;
        }
        bleSchedule5.setMHour(i4);
        BleSchedule bleSchedule6 = scheduleEditActivity.mSchedule;
        if (bleSchedule6 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule6 = null;
        }
        bleSchedule6.setMMinute(i5);
        AbhSettingsItem itemTime = scheduleEditActivity.getItemTime();
        SimpleDateFormat simpleDateFormat = scheduleEditActivity.mDateFormat;
        BleSchedule bleSchedule7 = scheduleEditActivity.mSchedule;
        if (bleSchedule7 == null) {
            Intrinsics.XXO("mSchedule");
        } else {
            bleSchedule2 = bleSchedule7;
        }
        String str = simpleDateFormat.format(cw3.OXO1(bleSchedule2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        itemTime.setMRightText(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(ScheduleEditActivity scheduleEditActivity) {
        scheduleEditActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(ScheduleEditActivity scheduleEditActivity) {
        return scheduleEditActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleSchedule bleSchedule;
        if (getMArg1() < 0) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.XXI(calendar);
            bleSchedule = new BleSchedule(OIi1iX.O10IXXX0X(calendar), OIi1iX.OIX0iXi(calendar), OIi1iX.XIi00iiXO(calendar), OIi1iX.XOO0ii0(calendar), OIi1iX.OIi0(calendar), 0, null, null, 224, null);
        } else {
            bleSchedule = (BleSchedule) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null).get(getMArg1());
        }
        this.mSchedule = bleSchedule;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (getMArg1() < 0) {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_schedule);
            findViewById(R.id.btn_bottom).setVisibility(8);
        } else {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_schedule);
            findViewById(R.id.btn_bottom).setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.abh_title_right);
        imageView.setImageResource(R.drawable.ic_confirm);
        imageView.setVisibility(0);
        AbhSettingsItem itemTitle = getItemTitle();
        BleSchedule bleSchedule = this.mSchedule;
        BleSchedule bleSchedule2 = null;
        if (bleSchedule == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule = null;
        }
        itemTitle.setMRightText(bleSchedule.getMTitle());
        itemTitle.getEdtValue().addTextChangedListener(new OXO1());
        AbhSettingsItem itemTime = getItemTime();
        SimpleDateFormat simpleDateFormat = this.mDateFormat;
        BleSchedule bleSchedule3 = this.mSchedule;
        if (bleSchedule3 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule3 = null;
        }
        String str = simpleDateFormat.format(cw3.OXO1(bleSchedule3));
        Intrinsics.O10IXXX0X(str, "format(...)");
        itemTime.setMRightText(str);
        AbhSettingsItem itemAdvance = getItemAdvance();
        BleSchedule bleSchedule4 = this.mSchedule;
        if (bleSchedule4 == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule4 = null;
        }
        itemAdvance.setMRightText(cp5.IiI10X(bleSchedule4.getMAdvance()));
        EditText edtContent = getEdtContent();
        BleSchedule bleSchedule5 = this.mSchedule;
        if (bleSchedule5 == null) {
            Intrinsics.XXO("mSchedule");
        } else {
            bleSchedule2 = bleSchedule5;
        }
        edtContent.setText(bleSchedule2.getMContent());
        getEdtTip().setText(m48120getEdtTip());
        edtContent.addTextChangedListener(new XIi00iiXO());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_schedule_edit;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_schedule);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.av3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(ScheduleEditActivity.onBottomClick$lambda$0$0(this.f5581IO));
                }
            });
            this.mDeletePopup = go0Var;
        }
        go0 go0Var2 = this.mDeletePopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void onSetAdvance(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mAdvancePopup == null) {
            pv1 pv1Var = new pv1(getMContext(), R.array.schedule_advance);
            pv1Var.m2858iX(R.string.remind);
            pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.gv3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(ScheduleEditActivity.onSetAdvance$lambda$0$0(this.f6969IO, ((Integer) obj).intValue()));
                }
            });
            this.mAdvancePopup = pv1Var;
        }
        pv1 pv1Var2 = this.mAdvancePopup;
        if (pv1Var2 != null) {
            BleSchedule bleSchedule = this.mSchedule;
            if (bleSchedule == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule = null;
            }
            pv1Var2.iOO1ii1(cp5.O00(bleSchedule.getMAdvance()));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            pv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetDateTime(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDateTimePopup == null) {
            OXIOI1 oxioi1 = new OXIOI1(getMContext(), i72.OXO1.i0X000X0O());
            oxioi1.i010I(new Function5() { // from class: com.android.mltcode.paycertificationapi.fv3
                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return Boolean.valueOf(ScheduleEditActivity.onSetDateTime$lambda$0$0(this.f6742IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue()));
                }
            });
            this.mDateTimePopup = oxioi1;
        }
        OXIOI1 oxioi2 = this.mDateTimePopup;
        if (oxioi2 != null) {
            BleSchedule bleSchedule = this.mSchedule;
            BleSchedule bleSchedule2 = null;
            if (bleSchedule == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule = null;
            }
            int mYear = bleSchedule.getMYear();
            BleSchedule bleSchedule3 = this.mSchedule;
            if (bleSchedule3 == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule3 = null;
            }
            int mMonth = bleSchedule3.getMMonth();
            BleSchedule bleSchedule4 = this.mSchedule;
            if (bleSchedule4 == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule4 = null;
            }
            int mDay = bleSchedule4.getMDay();
            BleSchedule bleSchedule5 = this.mSchedule;
            if (bleSchedule5 == null) {
                Intrinsics.XXO("mSchedule");
                bleSchedule5 = null;
            }
            int mHour = bleSchedule5.getMHour();
            BleSchedule bleSchedule6 = this.mSchedule;
            if (bleSchedule6 == null) {
                Intrinsics.XXO("mSchedule");
            } else {
                bleSchedule2 = bleSchedule6;
            }
            oxioi2.II1Xi0(mYear, mMonth, mDay, mHour, bleSchedule2.getMMinute());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            oxioi2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!this.isEdited) {
            finish();
            return;
        }
        if (this.mSaveTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.whether_to_save_change);
            go0Var.iX1O1(Integer.valueOf(R.string.give_up), new Function0() { // from class: com.android.mltcode.paycertificationapi.cv3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(ScheduleEditActivity.onTitleLeftClick$lambda$0$0(this.f6059IO));
                }
            });
            go0Var.X1IX(R.string.save, new Function0() { // from class: com.android.mltcode.paycertificationapi.dv3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(this.f6276IO.handleComplete());
                }
            });
            this.mSaveTipPopup = go0Var;
        }
        go0 go0Var2 = this.mSaveTipPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        handleComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getEdtTip */
    public final String m48120getEdtTip() {
        BleSchedule bleSchedule = this.mSchedule;
        if (bleSchedule == null) {
            Intrinsics.XXO("mSchedule");
            bleSchedule = null;
        }
        String mContent = bleSchedule.getMContent();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(UTF_8, "UTF_8");
        byte[] bytes = mContent.getBytes(UTF_8);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return bytes.length + "/250";
    }
}
