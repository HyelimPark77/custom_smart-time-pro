package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XOXO0X00I;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesCalculationMethod;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.p610ui.device.QiblaSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleQiblaSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaSettingsActivity.kt\ncom/sma/smartv3/ui/device/QiblaSettingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n18#2,2:257\n15#2:259\n11#2,2:260\n18#2,2:311\n15#2:313\n140#3,5:262\n145#3,5:268\n69#3,3:273\n72#3,5:277\n69#3,3:282\n72#3,5:286\n69#3,3:292\n72#3,5:296\n69#3,3:301\n72#3,5:305\n1#4:267\n1#4:276\n1#4:285\n1#4:291\n1#4:295\n1#4:304\n1#4:310\n*S KotlinDebug\n*F\n+ 1 QiblaSettingsActivity.kt\ncom/sma/smartv3/ui/device/QiblaSettingsActivity\n*L\n56#1:257,2\n56#1:259\n94#1:260,2\n231#1:311,2\n231#1:313\n138#1:262,5\n138#1:268,5\n142#1:273,3\n142#1:277,5\n146#1:282,3\n146#1:286,5\n174#1:292,3\n174#1:296,5\n200#1:301,3\n200#1:305,5\n138#1:267\n142#1:276\n146#1:285\n174#1:295\n200#1:304\n*E\n"})
public final class QiblaSettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int DEF_REMINDER = 5;

    @tb1
    private dj4 mArsJuristicMethodPopup;

    @tb1
    private qv1 mHijriDateAdjustmentPopup;

    @aa1
    private CustomLocation mLocation;

    @aa1
    private PrayerTimeSettings mPrayerTimeSettings;

    @tb1
    private qv1 mReminderPopup;

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemHeader_delegate$lambda$0(this.f9126IO);
        }
    });

    @aa1
    private final Lazy itemMethodSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemMethodSet_delegate$lambda$0(this.f10088IO);
        }
    });

    @aa1
    private final Lazy itemTimeCorrect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemTimeCorrect_delegate$lambda$0(this.f10313IO);
        }
    });

    @aa1
    private final Lazy itemJuristicSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemJuristicSet_delegate$lambda$0(this.f10558IO);
        }
    });

    @aa1
    private final Lazy itemHijriDateCorrrectSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemHijriDateCorrrectSet_delegate$lambda$0(this.f10771IO);
        }
    });

    @aa1
    private final Lazy itemReminder$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemReminder_delegate$lambda$0(this.f10988IO);
        }
    });

    @aa1
    private final Lazy itemRenewal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaSettingsActivity.itemRenewal_delegate$lambda$0(this.f11215IO);
        }
    });

    @aa1
    private final BleQiblaSettings mSettings = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.QIBLA_SET, BleQiblaSettings.class, null, null, 12, null);

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int OXO1() {
            return QiblaSettingsActivity.DEF_REMINDER;
        }

        public OXO1() {
        }
    }

    public QiblaSettingsActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        this.mPrayerTimeSettings = (PrayerTimeSettings) (objFromJson == null ? PrayerTimeSettings.class.newInstance() : objFromJson);
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    private final String getAsrMethod(int i) {
        String str = getResources().getStringArray(R.array.asr_juristic_method)[i];
        Intrinsics.O10IXXX0X(str, "get(...)");
        return str;
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemHijriDateCorrrectSet() {
        return (AbhSettingsItem) this.itemHijriDateCorrrectSet$delegate.getValue();
    }

    private final AbhSettingsItem getItemJuristicSet() {
        return (AbhSettingsItem) this.itemJuristicSet$delegate.getValue();
    }

    private final AbhSettingsItem getItemMethodSet() {
        return (AbhSettingsItem) this.itemMethodSet$delegate.getValue();
    }

    private final AbhSettingsItem getItemReminder() {
        return (AbhSettingsItem) this.itemReminder$delegate.getValue();
    }

    private final AbhSettingsItem getItemRenewal() {
        return (AbhSettingsItem) this.itemRenewal$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeCorrect() {
        return (AbhSettingsItem) this.itemTimeCorrect$delegate.getValue();
    }

    private final String getTimeCorrectString() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        if (objFromJson == null) {
            objFromJson = PrayerTimeSettings.class.newInstance();
        }
        PrayerTimeSettings prayerTimeSettings = (PrayerTimeSettings) objFromJson;
        this.mPrayerTimeSettings = prayerTimeSettings;
        return O0X11OiO.XOO0ii0(prayerTimeSettings.getFajrAdjustment(), 0, 2, null) + I000IiI1O.C2156iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getSunriseAdjustment(), 0, 2, null) + I000IiI1O.C2156iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getDhuhrAdjustment(), 0, 2, null) + I000IiI1O.C2156iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getAsrAdjustment(), 0, 2, null) + I000IiI1O.C2156iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getMaghribAdjustment(), 0, 2, null) + I000IiI1O.C2156iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getIshaAdjustment(), 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final QiblaSettingsActivity qiblaSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.w92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return QiblaSettingsActivity.initView$lambda$0$0$0(this.f11908IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            qiblaSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(QiblaSettingsActivity qiblaSettingsActivity, boolean z, BleConnector it) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(it, "it");
        qiblaSettingsActivity.mSettings.setMEnabled(OiOX0i.m1037iO(z));
        qiblaSettingsActivity.onInfoChange(new Object());
        I01XX0.XIi00iiXO(I01XX0.XXIIO1i11, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsHeader) qiblaSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemHijriDateCorrrectSet_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_hijri_date_correct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemJuristicSet_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_juristic_set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemMethodSet_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_method_set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemReminder_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemRenewal_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_renewal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeCorrect_delegate$lambda$0(QiblaSettingsActivity qiblaSettingsActivity) {
        return (AbhSettingsItem) qiblaSettingsActivity.findViewById(R.id.item_time_correct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onHijriDateCorrect$lambda$1$0(QiblaSettingsActivity qiblaSettingsActivity, int i) throws IllegalAccessException, InstantiationException {
        qiblaSettingsActivity.mPrayerTimeSettings.setHijriDateAdjustment(i - 30);
        qiblaSettingsActivity.getItemHijriDateCorrrectSet().setMRightText(O0X11OiO.IiI10X(qiblaSettingsActivity.mPrayerTimeSettings.getHijriDateAdjustment(), R.string.day));
        qiblaSettingsActivity.onInfoChange(new Object());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onJuristicSet$lambda$0$0(QiblaSettingsActivity qiblaSettingsActivity, int i) throws IllegalAccessException, InstantiationException {
        qiblaSettingsActivity.mPrayerTimeSettings.setArsJuristicMethod(i);
        qiblaSettingsActivity.getItemJuristicSet().setMRightText(qiblaSettingsActivity.getAsrMethod(qiblaSettingsActivity.mPrayerTimeSettings.getArsJuristicMethod()));
        qiblaSettingsActivity.onInfoChange(new Object());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onReminder$lambda$1$0(final QiblaSettingsActivity qiblaSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.v92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return QiblaSettingsActivity.onReminder$lambda$1$0$0(this.f11678IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReminder$lambda$1$0$0(QiblaSettingsActivity qiblaSettingsActivity, int i, BleConnector it) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(it, "it");
        qiblaSettingsActivity.mSettings.setMReminderMinute(i + 1);
        AbhSettingsItem itemReminder = qiblaSettingsActivity.getItemReminder();
        String string = qiblaSettingsActivity.getString(R.string.d_minutes, Integer.valueOf(qiblaSettingsActivity.mSettings.getMReminderMinute()));
        Intrinsics.O10IXXX0X(string, "getString(...)");
        itemReminder.setMRightText(string);
        qiblaSettingsActivity.onInfoChange(new Object());
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        if (q62.OXO1.XIi()) {
            getItemRenewal().setVisibility(0);
        }
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_set);
        LogUtils.m11128d(this.mSettings);
        if (this.mSettings.getMReminderMinute() == 0) {
            this.mSettings.setMReminderMinute(DEF_REMINDER);
        }
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.l92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return QiblaSettingsActivity.initView$lambda$0$0(this.f9389IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemMethodSet().setMRightText(PrayerTimesCalculationMethod.Companion.getMethodName(this.mSettings.getMMethod()));
        getItemJuristicSet().setMRightText(getAsrMethod(this.mPrayerTimeSettings.getArsJuristicMethod()));
        getItemHijriDateCorrrectSet().setMRightText(O0X11OiO.IiI10X(this.mPrayerTimeSettings.getHijriDateAdjustment(), R.string.day));
        AbhSettingsItem itemReminder = getItemReminder();
        String string = getString(R.string.d_minutes, Integer.valueOf(this.mSettings.getMReminderMinute()));
        Intrinsics.O10IXXX0X(string, "getString(...)");
        itemReminder.setMRightText(string);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qibla_settings;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IllegalAccessException, InstantiationException {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 99) {
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("method") : null;
            Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type com.sma.smartv3.model.PrayerTimesCalculationMethod");
            PrayerTimesCalculationMethod prayerTimesCalculationMethod = (PrayerTimesCalculationMethod) serializableExtra;
            getItemMethodSet().setMRightText(PrayerTimesCalculationMethod.Companion.getMethodName(prayerTimesCalculationMethod.getMethod()));
            this.mPrayerTimeSettings.setCalculationMethod(prayerTimesCalculationMethod.getMethod());
            onInfoChange(new Object());
        }
    }

    public final void onHijriDateCorrect(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mHijriDateAdjustmentPopup == null) {
            ArrayList arrayList = new ArrayList(61);
            for (int i = 0; i < 61; i++) {
                arrayList.add(String.valueOf(i - 30));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.hijri_date_correct);
            qv1Var.iOO1ii1(R.string.day);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.u92
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(QiblaSettingsActivity.onHijriDateCorrect$lambda$1$0(this.f11445IO, ((Integer) obj).intValue()));
                }
            });
            this.mHijriDateAdjustmentPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mHijriDateAdjustmentPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mPrayerTimeSettings.getHijriDateAdjustment() + 30);
            qv1Var2.IIX1OXO();
        }
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onInfoChange");
        a01.OXO1.OXO1().put(PrayerTimeSettings.class.getName(), new Gson().toJson(this.mPrayerTimeSettings));
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long jXiOIii1 = O0X11OiO.XiOIii1(calendar);
        this.mSettings.setMMethod(this.mPrayerTimeSettings.getCalculationMethod());
        this.mSettings.setMStartTime((int) (System.currentTimeMillis() / ((long) 1000)));
        this.mSettings.setMPrayerTimes(PrayerTimesKt.toBlePrayerTimes(PrayerTimesKt.getPrayerTimeMap(this.mPrayerTimeSettings, this.mLocation.XO0O10(), this.mLocation.IiI10X(), jXiOIii1, (16 & 16) != 0 ? 31 : 0)));
        AbhSettingsItem itemHijriDateCorrrectSet = getItemHijriDateCorrrectSet();
        String string = getString(R.string.hijri_date_correct);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        itemHijriDateCorrrectSet.setMLeftText(string);
        XOXO0X00I xoxo0x00iO10IXXX0X = O0X11OiO.O10IXXX0X(jXiOIii1, 0, 2, null);
        this.mSettings.setMHijriYear(xoxo0x00iO10IXXX0X.I0IIOi());
        this.mSettings.setMHijriMonth(xoxo0x00iO10IXXX0X.XOO0ii0());
        this.mSettings.setMHijriDay(xoxo0x00iO10IXXX0X.IiI10X());
        if (this.mPrayerTimeSettings.getHijriDateAdjustment() != 0) {
            getItemHijriDateCorrrectSet().setMLeftText(getString(R.string.hijri_date_correct) + "\n" + getString(R.string.hijri_date_corrected, O0X11OiO.I1XOi1(jXiOIii1, 0, 2, null)));
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.QIBLA_SET, BleKeyFlag.UPDATE, this.mSettings, false, false, 24, null);
    }

    public final void onJuristicSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mArsJuristicMethodPopup == null) {
            dj4 dj4Var = new dj4(this, R.array.asr_juristic_method, R.layout.pop_choice_asrmethod_set);
            dj4Var.m1671iX(R.string.asr_juristic_method);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.n92
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(QiblaSettingsActivity.onJuristicSet$lambda$0$0(this.f9890IO, ((Integer) obj).intValue()));
                }
            });
            this.mArsJuristicMethodPopup = dj4Var;
        }
        dj4 dj4Var2 = this.mArsJuristicMethodPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(this.mPrayerTimeSettings.getArsJuristicMethod());
            dj4Var2.IIX1OXO();
        }
    }

    public final void onMethodSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivityForResult(new Intent(this, (Class<?>) QiblaMethodActivity.class), 99);
    }

    public final void onOrientaiton(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) QiblaOrientationActivity.class));
    }

    public final void onReminder(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mReminderPopup == null) {
            ArrayList arrayList = new ArrayList(30);
            int i = 0;
            while (i < 30) {
                i++;
                arrayList.add(String.valueOf(i));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.qibla_prayer_reminder);
            qv1Var.iOO1ii1(R.string.minute);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.m92
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(QiblaSettingsActivity.onReminder$lambda$1$0(this.f9652IO, ((Integer) obj).intValue()));
                }
            });
            this.mReminderPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mReminderPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mSettings.getMReminderMinute() - 1);
            qv1Var2.IIX1OXO();
        }
    }

    public final void onRenewal(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) ResourceRenewalActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, InstantiationException {
        super.onResume();
        String timeCorrectString = getTimeCorrectString();
        i1O0OXO1O.OXO1.OXO1("onResume -> " + getItemTimeCorrect().getMRightText() + ", " + timeCorrectString);
        if (!TextUtils.isEmpty(getItemTimeCorrect().getMRightText()) && !Intrinsics.XOO0ii0(getItemTimeCorrect().getMRightText(), timeCorrectString)) {
            onInfoChange(new Object());
        }
        getItemTimeCorrect().setMRightText(timeCorrectString);
    }

    public final void onTime(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) QiblaTimeActivity.class));
    }

    public final void onTimeCorrect(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) QiblaTimeCorrectActivity.class));
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
