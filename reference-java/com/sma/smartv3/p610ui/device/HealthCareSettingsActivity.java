package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.it5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.device.HealthCareSettingsActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHealthCareSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCareSettingsActivity.kt\ncom/sma/smartv3/ui/device/HealthCareSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class HealthCareSettingsActivity extends BaseActivity {
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
    public static final OXO1 Companion = new OXO1(null);
    private static final int PERIOD_MIN = 25;
    private static final int PERIOD_MAX = 35;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOXiXOiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.rootView_delegate$lambda$0(this.f8373IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1I10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemHeader_delegate$lambda$0(this.f2203IO);
        }
    });

    @aa1
    private final Lazy itemDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OXOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemDuration_delegate$lambda$0(this.f2759IO);
        }
    });

    @aa1
    private final Lazy itemPeriod$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXI001I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemPeriod_delegate$lambda$0(this.f5013IO);
        }
    });

    @aa1
    private final Lazy itemLast$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0II110OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemLast_delegate$lambda$0(this.f2444IO);
        }
    });

    @aa1
    private final Lazy itemPeriodReminder$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiOi01XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemPeriodReminder_delegate$lambda$0(this.f3760IO);
        }
    });

    @aa1
    private final Lazy itemOvulationReminder$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiOi1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemOvulationReminder_delegate$lambda$0(this.f1916IO);
        }
    });

    @aa1
    private final Lazy itemReminderTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0IXiOI0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthCareSettingsActivity.itemReminderTime_delegate$lambda$0(this.f3974IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int OXO1() {
            return HealthCareSettingsActivity.PERIOD_MAX;
        }

        public final int XIi00iiXO() {
            return HealthCareSettingsActivity.PERIOD_MIN;
        }

        public OXO1() {
        }
    }

    public HealthCareSettingsActivity() {
        BleGirlCareSettings bleGirlCareSettings = (BleGirlCareSettings) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.GIRL_CARE, BleGirlCareSettings.class, null, 4, null);
        this.mGirlCareSettings = bleGirlCareSettings == null ? new BleGirlCareSettings(0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2043, null) : bleGirlCareSettings;
    }

    private final AbhSettingsItem getItemDuration() {
        return (AbhSettingsItem) this.itemDuration$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemLast() {
        return (AbhSettingsItem) this.itemLast$delegate.getValue();
    }

    private final AbhSettingsItem getItemOvulationReminder() {
        return (AbhSettingsItem) this.itemOvulationReminder$delegate.getValue();
    }

    private final AbhSettingsItem getItemPeriod() {
        return (AbhSettingsItem) this.itemPeriod$delegate.getValue();
    }

    private final AbhSettingsItem getItemPeriodReminder() {
        return (AbhSettingsItem) this.itemPeriodReminder$delegate.getValue();
    }

    private final AbhSettingsItem getItemReminderTime() {
        return (AbhSettingsItem) this.itemReminderTime$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final HealthCareSettingsActivity healthCareSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OIXXIIXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.initView$lambda$0$0$0(this.f3055IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            healthCareSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(HealthCareSettingsActivity healthCareSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.f1088OX, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemDuration_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_period_length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsHeader) healthCareSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemLast_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_last);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemOvulationReminder_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_ovulation_reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemPeriodReminder_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_period_reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemPeriod_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_cycle_length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemReminderTime_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return (AbhSettingsItem) healthCareSettingsActivity.findViewById(R.id.item_reminder_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetDuration$lambda$1$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1OX1iIIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetDuration$lambda$1$0$0(this.f7637IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetDuration$lambda$1$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMMenstruationDuration(i + 2);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updateDuration();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetLast$lambda$0$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i, final int i2, final int i3) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIOO0IIiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetLast$lambda$0$0$0(this.f7876IO, i, i2, i3, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetLast$lambda$0$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, int i2, int i3, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMLatestYear(i);
        healthCareSettingsActivity.mGirlCareSettings.setMLatestMonth(i2);
        healthCareSettingsActivity.mGirlCareSettings.setMLatestDay(i3);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updateLatest();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetOvulationReminder$lambda$1$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0OXX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetOvulationReminder$lambda$1$0$0(this.f7404IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetOvulationReminder$lambda$1$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMOvulationReminderAdvance(i + 1);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updateOvulation();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetPeriod$lambda$1$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX011ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetPeriod$lambda$1$0$0(this.f4930IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetPeriod$lambda$1$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMMenstruationPeriod(i + PERIOD_MIN);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updatePeriod();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetPeriodReminder$lambda$1$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1OIiIOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetPeriodReminder$lambda$1$0$0(this.f2746IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetPeriodReminder$lambda$1$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMMenstruationReminderAdvance(i + 1);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updateMenstruation();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetReminderTime$lambda$0$0(final HealthCareSettingsActivity healthCareSettingsActivity, final int i, final int i2) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.II00IIOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.onSetReminderTime$lambda$0$0$0(this.f1515IO, i, i2, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetReminderTime$lambda$0$0$0(HealthCareSettingsActivity healthCareSettingsActivity, int i, int i2, BleConnector it) {
        Intrinsics.X0O(it, "it");
        healthCareSettingsActivity.mGirlCareSettings.setMReminderHour(i);
        healthCareSettingsActivity.mGirlCareSettings.setMReminderMinute(i2);
        BaseBleConnector.sendObject$default(it, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, healthCareSettingsActivity.mGirlCareSettings, false, false, 24, null);
        healthCareSettingsActivity.updateReminderTime();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(HealthCareSettingsActivity healthCareSettingsActivity) {
        return healthCareSettingsActivity.findViewById(R.id.root);
    }

    private final void updateDuration() {
        getItemDuration().setMRightText(this.mGirlCareSettings.getMMenstruationDuration() + " " + getString(R.string.days));
    }

    private final void updateLatest() {
        String str;
        AbhSettingsItem itemLast = getItemLast();
        if (i72.OXO1.XiOIO() == DateTimeFormat.ddMMyyyy) {
            str = this.mGirlCareSettings.getMLatestDay() + "/" + this.mGirlCareSettings.getMLatestMonth() + "/" + this.mGirlCareSettings.getMLatestYear();
        } else {
            str = this.mGirlCareSettings.getMLatestMonth() + "/" + this.mGirlCareSettings.getMLatestDay() + "/" + this.mGirlCareSettings.getMLatestYear();
        }
        itemLast.setMRightText(str);
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        LogUtils.m11128d(this.mGirlCareSettings);
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        q62 q62Var = q62.OXO1;
        textView.setText(q62Var.XX1Oi());
        getItemHeader().getTvTitle().setText(q62Var.XX1Oi());
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mGirlCareSettings.getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.OX1O0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthCareSettingsActivity.initView$lambda$0$0(this.f3435IO, ((Boolean) obj).booleanValue());
            }
        });
        if (this.mGirlCareSettings.getMMenstruationDuration() == 0) {
            this.mGirlCareSettings.setMMenstruationDuration(5);
        }
        if (this.mGirlCareSettings.getMMenstruationPeriod() == 0) {
            this.mGirlCareSettings.setMMenstruationPeriod(28);
        }
        Calendar calendar = Calendar.getInstance();
        if (this.mGirlCareSettings.getMLatestYear() == 0) {
            this.mGirlCareSettings.setMLatestYear(calendar.get(1));
        }
        if (this.mGirlCareSettings.getMLatestMonth() == 0) {
            this.mGirlCareSettings.setMLatestMonth(calendar.get(2) + 1);
        }
        if (this.mGirlCareSettings.getMLatestDay() == 0) {
            this.mGirlCareSettings.setMLatestDay(calendar.get(5));
        }
        if (this.mGirlCareSettings.getMMenstruationReminderAdvance() == 0) {
            this.mGirlCareSettings.setMMenstruationReminderAdvance(2);
        }
        if (this.mGirlCareSettings.getMOvulationReminderAdvance() == 0) {
            this.mGirlCareSettings.setMOvulationReminderAdvance(3);
        }
        updateDuration();
        updatePeriod();
        updateLatest();
        updateMenstruation();
        updateOvulation();
        updateReminderTime();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_health_care_settings;
    }

    public final void onSetDuration(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDurationPopup == null) {
            ArrayList arrayList = new ArrayList(7);
            for (int i = 0; i < 7; i++) {
                arrayList.add(String.valueOf(i + 2));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.period_length);
            qv1Var.iOO1ii1(R.string.days);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIiXO1O0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetDuration$lambda$1$0(this.f4629IO, ((Integer) obj).intValue()));
                }
            });
            this.mDurationPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mDurationPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mGirlCareSettings.getMMenstruationDuration() - 2);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetLast(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mLastPopup == null) {
            O1100iXOX o1100iXOX = new O1100iXOX(this);
            o1100iXOX.m806iX(R.string.last_menstrual_period);
            o1100iXOX.i010I(new Function3() { // from class: com.android.mltcode.paycertificationapi.O0IXiXX
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetLast$lambda$0$0(this.f2462IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                }
            });
            this.mLastPopup = o1100iXOX;
        }
        O1100iXOX o1100iXOX2 = this.mLastPopup;
        if (o1100iXOX2 != null) {
            o1100iXOX2.II1Xi0(this.mGirlCareSettings.getMLatestYear(), this.mGirlCareSettings.getMLatestMonth(), this.mGirlCareSettings.getMLatestDay());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            o1100iXOX2.I1XOi1(rootView);
        }
    }

    public final void onSetOvulationReminder(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mOvulationReminderPopup == null) {
            ArrayList arrayList = new ArrayList(3);
            int i = 0;
            while (i < 3) {
                i++;
                arrayList.add(String.valueOf(i));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.ovulation_reminder);
            qv1Var.iOO1ii1(R.string.days_in_advance);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1OiXi
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetOvulationReminder$lambda$1$0(this.f4324IO, ((Integer) obj).intValue()));
                }
            });
            this.mOvulationReminderPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mOvulationReminderPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mGirlCareSettings.getMOvulationReminderAdvance() - 1);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetPeriod(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mPeriodPopup == null) {
            int i = (PERIOD_MAX - PERIOD_MIN) + 1;
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(String.valueOf(PERIOD_MIN + i2));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.cycle_length);
            qv1Var.iOO1ii1(R.string.days);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1i10iiX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetPeriod$lambda$1$0(this.f2834IO, ((Integer) obj).intValue()));
                }
            });
            this.mPeriodPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mPeriodPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mGirlCareSettings.getMMenstruationPeriod() - PERIOD_MIN);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetPeriodReminder(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mPeriodReminderPopup == null) {
            ArrayList arrayList = new ArrayList(3);
            int i = 0;
            while (i < 3) {
                i++;
                arrayList.add(String.valueOf(i));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.period_reminder);
            qv1Var.iOO1ii1(R.string.days_in_advance);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIX11iIIi
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetPeriodReminder$lambda$1$0(this.f1643IO, ((Integer) obj).intValue()));
                }
            });
            this.mPeriodReminderPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mPeriodReminderPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mGirlCareSettings.getMMenstruationReminderAdvance() - 1);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetReminderTime(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mReminderPopup == null) {
            it5 it5Var = new it5(this, i72.OXO1.i0X000X0O());
            it5Var.i010I(R.string.reminder_time);
            it5Var.II1Xi0(new Function2() { // from class: com.android.mltcode.paycertificationapi.XI0I11O1i
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj, Object obj2) {
                    return Boolean.valueOf(HealthCareSettingsActivity.onSetReminderTime$lambda$0$0(this.f4420IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                }
            });
            this.mReminderPopup = it5Var;
        }
        it5 it5Var2 = this.mReminderPopup;
        if (it5Var2 != null) {
            it5Var2.m2313iX(this.mGirlCareSettings.getMReminderHour(), this.mGirlCareSettings.getMReminderMinute());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            it5Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
