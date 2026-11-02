package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.MedicationAlarmEditActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MedicationAlarmEditActivity extends BaseActivity {
    private boolean isEdited;
    private BleMedicationAlarm mAlarm;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private go0 mSaveTipPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pl0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MedicationAlarmEditActivity.rootView_delegate$lambda$0(this.f10386IO);
        }
    });

    @aa1
    private final Lazy itemRepeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ql0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MedicationAlarmEditActivity.itemRepeat_delegate$lambda$0(this.f10628IO);
        }
    });

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) this.itemRepeat$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleComplete() {
        return X0IOiX1O.OXO1(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ol0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicationAlarmEditActivity.handleComplete$lambda$0(this.f10161IO, (BleConnector) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleComplete$lambda$0(MedicationAlarmEditActivity medicationAlarmEditActivity, BleConnector it) {
        BleMedicationAlarm bleMedicationAlarm;
        BleMedicationAlarm bleMedicationAlarm2;
        Intrinsics.X0O(it, "it");
        BleMedicationAlarm bleMedicationAlarm3 = medicationAlarmEditActivity.mAlarm;
        if (bleMedicationAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm3 = null;
        }
        if (bleMedicationAlarm3.getMRepeat() == 0) {
            Calendar calendar = Calendar.getInstance();
            BleMedicationAlarm bleMedicationAlarm4 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm4 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm4 = null;
            }
            Intrinsics.XXI(calendar);
            bleMedicationAlarm4.setMYear(OIi1iX.O10IXXX0X(calendar));
            BleMedicationAlarm bleMedicationAlarm5 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm5 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm5 = null;
            }
            bleMedicationAlarm5.setMMonth(OIi1iX.OIX0iXi(calendar));
            BleMedicationAlarm bleMedicationAlarm6 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm6 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm6 = null;
            }
            bleMedicationAlarm6.setMDay(OIi1iX.XIi00iiXO(calendar));
            MedicationAlarmsActivity.OXO1 oxo1 = MedicationAlarmsActivity.Companion;
            BleMedicationAlarm bleMedicationAlarm7 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm7 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm7 = null;
            }
            oxo1.OXO1(bleMedicationAlarm7);
        }
        if (medicationAlarmEditActivity.getMArg1() < 0) {
            BleKey bleKey = BleKey.MEDICATION_ALARM;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            BleMedicationAlarm bleMedicationAlarm8 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm8 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm2 = null;
            } else {
                bleMedicationAlarm2 = bleMedicationAlarm8;
            }
            BaseBleConnector.sendObject$default(it, bleKey, bleKeyFlag, bleMedicationAlarm2, false, false, 24, null);
        } else {
            BleKey bleKey2 = BleKey.MEDICATION_ALARM;
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            BleMedicationAlarm bleMedicationAlarm9 = medicationAlarmEditActivity.mAlarm;
            if (bleMedicationAlarm9 == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm = null;
            } else {
                bleMedicationAlarm = bleMedicationAlarm9;
            }
            BaseBleConnector.sendObject$default(it, bleKey2, bleKeyFlag2, bleMedicationAlarm, false, false, 24, null);
        }
        medicationAlarmEditActivity.setResult(-1);
        medicationAlarmEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0(MedicationAlarmEditActivity medicationAlarmEditActivity, int i, int i2) {
        medicationAlarmEditActivity.isEdited = true;
        BleMedicationAlarm bleMedicationAlarm = medicationAlarmEditActivity.mAlarm;
        BleMedicationAlarm bleMedicationAlarm2 = null;
        if (bleMedicationAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm = null;
        }
        bleMedicationAlarm.setMHour(i);
        BleMedicationAlarm bleMedicationAlarm3 = medicationAlarmEditActivity.mAlarm;
        if (bleMedicationAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleMedicationAlarm2 = bleMedicationAlarm3;
        }
        bleMedicationAlarm2.setMMinute(i2);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemRepeat_delegate$lambda$0(MedicationAlarmEditActivity medicationAlarmEditActivity) {
        return (AbhSettingsItem) medicationAlarmEditActivity.findViewById(R.id.item_repeat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBottomClick$lambda$0$0(final MedicationAlarmEditActivity medicationAlarmEditActivity) {
        return X0IOiX1O.OXO1(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.rl0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicationAlarmEditActivity.onBottomClick$lambda$0$0$0(this.f10841IO, (BleConnector) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$0$0$0(MedicationAlarmEditActivity medicationAlarmEditActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleKey bleKey = BleKey.MEDICATION_ALARM;
        BleKeyFlag bleKeyFlag = BleKeyFlag.DELETE;
        BleMedicationAlarm bleMedicationAlarm = medicationAlarmEditActivity.mAlarm;
        if (bleMedicationAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm = null;
        }
        BaseBleConnector.sendInt8$default(it, bleKey, bleKeyFlag, bleMedicationAlarm.getMId(), false, false, 24, null);
        medicationAlarmEditActivity.setResult(-1);
        medicationAlarmEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetRepeat$lambda$0$0(MedicationAlarmEditActivity medicationAlarmEditActivity, Set picked) {
        Intrinsics.X0O(picked, "picked");
        medicationAlarmEditActivity.isEdited = true;
        BleMedicationAlarm bleMedicationAlarm = medicationAlarmEditActivity.mAlarm;
        BleMedicationAlarm bleMedicationAlarm2 = null;
        if (bleMedicationAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm = null;
        }
        bleMedicationAlarm.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, picked, null, 2, null));
        AbhSettingsItem itemRepeat = medicationAlarmEditActivity.getItemRepeat();
        BleMedicationAlarm bleMedicationAlarm3 = medicationAlarmEditActivity.mAlarm;
        if (bleMedicationAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleMedicationAlarm2 = bleMedicationAlarm3;
        }
        itemRepeat.setMRightText(cp5.X11I(bleMedicationAlarm2.getMRepeat()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(MedicationAlarmEditActivity medicationAlarmEditActivity) {
        medicationAlarmEditActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(MedicationAlarmEditActivity medicationAlarmEditActivity) {
        return medicationAlarmEditActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mAlarm = getMArg1() < 0 ? new BleMedicationAlarm(0, 0, 0, 0, 0, 0, 0, 127, null) : (BleMedicationAlarm) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.MEDICATION_ALARM, BleMedicationAlarm.class, null, 4, null).get(getMArg1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (getMArg1() < 0) {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_medication_alarm);
            findViewById(R.id.btn_bottom).setVisibility(8);
        } else {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_medication_alarm);
            findViewById(R.id.btn_bottom).setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.abh_title_right);
        imageView.setImageResource(R.drawable.ic_confirm);
        imageView.setVisibility(0);
        TimePicker timePicker = (TimePicker) findViewById(R.id.time_picker);
        BleMedicationAlarm bleMedicationAlarm = this.mAlarm;
        BleMedicationAlarm bleMedicationAlarm2 = null;
        if (bleMedicationAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm = null;
        }
        int mHour = bleMedicationAlarm.getMHour();
        BleMedicationAlarm bleMedicationAlarm3 = this.mAlarm;
        if (bleMedicationAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
            bleMedicationAlarm3 = null;
        }
        timePicker.m38939IO(mHour, bleMedicationAlarm3.getMMinute());
        timePicker.setMListener(new Function2() { // from class: com.android.mltcode.paycertificationapi.nl0
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return MedicationAlarmEditActivity.initView$lambda$1$0(this.f9958IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        AbhSettingsItem itemRepeat = getItemRepeat();
        BleMedicationAlarm bleMedicationAlarm4 = this.mAlarm;
        if (bleMedicationAlarm4 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleMedicationAlarm2 = bleMedicationAlarm4;
        }
        itemRepeat.setMRightText(cp5.X11I(bleMedicationAlarm2.getMRepeat()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_medication_alarm_edit;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_medication_alarm);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.ml0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MedicationAlarmEditActivity.onBottomClick$lambda$0$0(this.f9728IO));
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

    public final void onSetRepeat(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mRepeatPopup == null) {
            jv0 jv0Var = new jv0(this, R.array.weekdays_s);
            jv0Var.O1O(R.string.repeat);
            jv0Var.iOO1ii1(new Function1() { // from class: com.android.mltcode.paycertificationapi.ll0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(MedicationAlarmEditActivity.onSetRepeat$lambda$0$0(this.f9459IO, (Set) obj));
                }
            });
            this.mRepeatPopup = jv0Var;
        }
        jv0 jv0Var2 = this.mRepeatPopup;
        if (jv0Var2 != null) {
            BleRepeat bleRepeat = BleRepeat.INSTANCE;
            BleMedicationAlarm bleMedicationAlarm = this.mAlarm;
            if (bleMedicationAlarm == null) {
                Intrinsics.XXO("mAlarm");
                bleMedicationAlarm = null;
            }
            jv0Var2.IXXOO(BleRepeat.toIndices$default(bleRepeat, bleMedicationAlarm.getMRepeat(), null, 2, null));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            jv0Var2.I1XOi1(rootView);
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
            go0Var.iX1O1(Integer.valueOf(R.string.give_up), new Function0() { // from class: com.android.mltcode.paycertificationapi.sl0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MedicationAlarmEditActivity.onTitleLeftClick$lambda$0$0(this.f11078IO));
                }
            });
            go0Var.X1IX(R.string.save, new Function0() { // from class: com.android.mltcode.paycertificationapi.tl0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(this.f11276IO.handleComplete());
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
}
