package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OIXXOiii;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.AlarmEditActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AlarmEditActivity extends BaseActivity {
    private boolean isEdited;
    private BleAlarm mAlarm;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private go0 mSaveTipPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AlarmEditActivity.rootView_delegate$lambda$0(this.f2812IO);
        }
    });

    @aa1
    private final Lazy itemRepeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AlarmEditActivity.itemRepeat_delegate$lambda$0(this.f1739IO);
        }
    });

    @aa1
    private final Lazy itemLabel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0i0OXIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AlarmEditActivity.itemLabel_delegate$lambda$0(this.f1737IO);
        }
    });

    private final AbhSettingsItem getItemLabel() {
        return (AbhSettingsItem) this.itemLabel$delegate.getValue();
    }

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) this.itemRepeat$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleComplete() {
        return X0IOiX1O.OXO1(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O0XiO10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmEditActivity.handleComplete$lambda$0(this.f2574IO, (BleConnector) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleComplete$lambda$0(AlarmEditActivity alarmEditActivity, BleConnector it) {
        BleAlarm bleAlarm;
        BleAlarm bleAlarm2;
        Intrinsics.X0O(it, "it");
        BleAlarm bleAlarm3 = alarmEditActivity.mAlarm;
        if (bleAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm3 = null;
        }
        bleAlarm3.setMTag(alarmEditActivity.getItemLabel().getRightText());
        BleAlarm bleAlarm4 = alarmEditActivity.mAlarm;
        if (bleAlarm4 == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm4 = null;
        }
        if (bleAlarm4.getMRepeat() == 0) {
            Calendar calendar = Calendar.getInstance();
            BleAlarm bleAlarm5 = alarmEditActivity.mAlarm;
            if (bleAlarm5 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm5 = null;
            }
            Intrinsics.XXI(calendar);
            bleAlarm5.setMYear(OIi1iX.O10IXXX0X(calendar));
            BleAlarm bleAlarm6 = alarmEditActivity.mAlarm;
            if (bleAlarm6 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm6 = null;
            }
            bleAlarm6.setMMonth(OIi1iX.OIX0iXi(calendar));
            BleAlarm bleAlarm7 = alarmEditActivity.mAlarm;
            if (bleAlarm7 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm7 = null;
            }
            bleAlarm7.setMDay(OIi1iX.XIi00iiXO(calendar));
            AlarmsActivity.OXO1 oxo1 = AlarmsActivity.Companion;
            BleAlarm bleAlarm8 = alarmEditActivity.mAlarm;
            if (bleAlarm8 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm8 = null;
            }
            oxo1.OXO1(bleAlarm8);
        }
        if (alarmEditActivity.getMArg1() < 0) {
            BleKey bleKey = BleKey.ALARM;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            BleAlarm bleAlarm9 = alarmEditActivity.mAlarm;
            if (bleAlarm9 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm2 = null;
            } else {
                bleAlarm2 = bleAlarm9;
            }
            BaseBleConnector.sendObject$default(it, bleKey, bleKeyFlag, bleAlarm2, false, false, 24, null);
        } else {
            BleAlarm bleAlarm10 = alarmEditActivity.mAlarm;
            if (bleAlarm10 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm10 = null;
            }
            bleAlarm10.setMEnabled(1);
            BleKey bleKey2 = BleKey.ALARM;
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            BleAlarm bleAlarm11 = alarmEditActivity.mAlarm;
            if (bleAlarm11 == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm = null;
            } else {
                bleAlarm = bleAlarm11;
            }
            BaseBleConnector.sendObject$default(it, bleKey2, bleKeyFlag2, bleAlarm, false, false, 24, null);
        }
        alarmEditActivity.setResult(-1);
        alarmEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0(AlarmEditActivity alarmEditActivity, int i, int i2) {
        alarmEditActivity.isEdited = true;
        BleAlarm bleAlarm = alarmEditActivity.mAlarm;
        BleAlarm bleAlarm2 = null;
        if (bleAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm = null;
        }
        bleAlarm.setMHour(i);
        BleAlarm bleAlarm3 = alarmEditActivity.mAlarm;
        if (bleAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleAlarm2 = bleAlarm3;
        }
        bleAlarm2.setMMinute(i2);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemLabel_delegate$lambda$0(AlarmEditActivity alarmEditActivity) {
        return (AbhSettingsItem) alarmEditActivity.findViewById(R.id.item_label);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemRepeat_delegate$lambda$0(AlarmEditActivity alarmEditActivity) {
        return (AbhSettingsItem) alarmEditActivity.findViewById(R.id.item_repeat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBottomClick$lambda$0$0(final AlarmEditActivity alarmEditActivity) {
        return X0IOiX1O.OXO1(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0OOi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmEditActivity.onBottomClick$lambda$0$0$0(this.f3997IO, (BleConnector) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$0$0$0(AlarmEditActivity alarmEditActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleKey bleKey = BleKey.ALARM;
        BleKeyFlag bleKeyFlag = BleKeyFlag.DELETE;
        BleAlarm bleAlarm = alarmEditActivity.mAlarm;
        if (bleAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm = null;
        }
        BaseBleConnector.sendInt8$default(it, bleKey, bleKeyFlag, bleAlarm.getMId(), false, false, 24, null);
        alarmEditActivity.setResult(-1);
        alarmEditActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetRepeat$lambda$0$0(AlarmEditActivity alarmEditActivity, Set picked) {
        Intrinsics.X0O(picked, "picked");
        alarmEditActivity.isEdited = true;
        BleAlarm bleAlarm = alarmEditActivity.mAlarm;
        BleAlarm bleAlarm2 = null;
        if (bleAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm = null;
        }
        bleAlarm.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, picked, null, 2, null));
        AbhSettingsItem itemRepeat = alarmEditActivity.getItemRepeat();
        BleAlarm bleAlarm3 = alarmEditActivity.mAlarm;
        if (bleAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleAlarm2 = bleAlarm3;
        }
        itemRepeat.setMRightText(cp5.X11I(bleAlarm2.getMRepeat()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(AlarmEditActivity alarmEditActivity) {
        alarmEditActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(AlarmEditActivity alarmEditActivity) {
        return alarmEditActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mAlarm = getMArg1() < 0 ? new BleAlarm(0, 0, 0, 0, 0, 0, 0, null, 255, null) : (BleAlarm) BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.ALARM, BleAlarm.class, null, 4, null).get(getMArg1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (getMArg1() < 0) {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_alarm);
            findViewById(R.id.btn_bottom).setVisibility(8);
        } else {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_alarm);
            findViewById(R.id.btn_bottom).setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.abh_title_right);
        imageView.setImageResource(R.drawable.ic_confirm);
        imageView.setVisibility(0);
        TimePicker timePicker = (TimePicker) findViewById(R.id.time_picker);
        BleAlarm bleAlarm = this.mAlarm;
        BleAlarm bleAlarm2 = null;
        if (bleAlarm == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm = null;
        }
        int mHour = bleAlarm.getMHour();
        BleAlarm bleAlarm3 = this.mAlarm;
        if (bleAlarm3 == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm3 = null;
        }
        timePicker.m38939IO(mHour, bleAlarm3.getMMinute());
        timePicker.setMListener(new Function2() { // from class: com.android.mltcode.paycertificationapi.OO1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return AlarmEditActivity.initView$lambda$1$0(this.f3163IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        AbhSettingsItem itemRepeat = getItemRepeat();
        BleAlarm bleAlarm4 = this.mAlarm;
        if (bleAlarm4 == null) {
            Intrinsics.XXO("mAlarm");
            bleAlarm4 = null;
        }
        itemRepeat.setMRightText(cp5.X11I(bleAlarm4.getMRepeat()));
        if (!q62.OXO1.m2886X1()) {
            getItemLabel().setVisibility(8);
            return;
        }
        getItemLabel().setVisibility(0);
        getItemLabel().getEdtValue().addTextChangedListener(new OIXXOiii(getItemLabel().getEdtValue(), 21));
        AbhSettingsItem itemLabel = getItemLabel();
        BleAlarm bleAlarm5 = this.mAlarm;
        if (bleAlarm5 == null) {
            Intrinsics.XXO("mAlarm");
        } else {
            bleAlarm2 = bleAlarm5;
        }
        itemLabel.setMRightText(bleAlarm2.getMTag());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_alarm_edit;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_alarm);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.I1i11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AlarmEditActivity.onBottomClick$lambda$0$0(this.f1481IO));
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
            jv0Var.iOO1ii1(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOOO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(AlarmEditActivity.onSetRepeat$lambda$0$0(this.f3262IO, (Set) obj));
                }
            });
            this.mRepeatPopup = jv0Var;
        }
        jv0 jv0Var2 = this.mRepeatPopup;
        if (jv0Var2 != null) {
            BleRepeat bleRepeat = BleRepeat.INSTANCE;
            BleAlarm bleAlarm = this.mAlarm;
            if (bleAlarm == null) {
                Intrinsics.XXO("mAlarm");
                bleAlarm = null;
            }
            jv0Var2.IXXOO(BleRepeat.toIndices$default(bleRepeat, bleAlarm.getMRepeat(), null, 2, null));
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
            go0Var.iX1O1(Integer.valueOf(R.string.give_up), new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXOIOOIX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AlarmEditActivity.onTitleLeftClick$lambda$0$0(this.f2295IO));
                }
            });
            go0Var.X1IX(R.string.save, new Function0() { // from class: com.android.mltcode.paycertificationapi.OIX0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(this.f3026IO.handleComplete());
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
