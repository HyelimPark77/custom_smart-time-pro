package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.k92;
import com.android.mltcode.paycertificationapi.l92;
import com.android.mltcode.paycertificationapi.m92;
import com.android.mltcode.paycertificationapi.n92;
import com.android.mltcode.paycertificationapi.o92;
import com.android.mltcode.paycertificationapi.p92;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.q92;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.r92;
import com.android.mltcode.paycertificationapi.s92;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t92;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u92;
import com.android.mltcode.paycertificationapi.v92;
import com.android.mltcode.paycertificationapi.w92;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesCalculationMethod;
import com.sma.smartv3.model.PrayerTimesKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaSettingsActivity.kt\ncom/sma/smartv3/ui/device/QiblaSettingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n18#2,2:257\n15#2:259\n11#2,2:260\n18#2,2:311\n15#2:313\n140#3,5:262\n145#3,5:268\n69#3,3:273\n72#3,5:277\n69#3,3:282\n72#3,5:286\n69#3,3:292\n72#3,5:296\n69#3,3:301\n72#3,5:305\n1#4:267\n1#4:276\n1#4:285\n1#4:291\n1#4:295\n1#4:304\n1#4:310\n*S KotlinDebug\n*F\n+ 1 QiblaSettingsActivity.kt\ncom/sma/smartv3/ui/device/QiblaSettingsActivity\n*L\n56#1:257,2\n56#1:259\n94#1:260,2\n231#1:311,2\n231#1:313\n138#1:262,5\n138#1:268,5\n142#1:273,3\n142#1:277,5\n146#1:282,3\n146#1:286,5\n174#1:292,3\n174#1:296,5\n200#1:301,3\n200#1:305,5\n138#1:267\n142#1:276\n146#1:285\n174#1:295\n200#1:304\n*E\n"})
public final class QiblaSettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int DEF_REMINDER = 0;

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemHijriDateCorrrectSet$delegate;

    @aa1
    private final Lazy itemJuristicSet$delegate;

    @aa1
    private final Lazy itemMethodSet$delegate;

    @aa1
    private final Lazy itemReminder$delegate;

    @aa1
    private final Lazy itemRenewal$delegate;

    @aa1
    private final Lazy itemTimeCorrect$delegate;

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
    private final BleQiblaSettings mSettings;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final int OXO1() {
            return QiblaSettingsActivity.access$getDEF_REMINDER$cp();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
        DEF_REMINDER = 5;
    }

    public QiblaSettingsActivity() {
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new k92(this));
        this.itemMethodSet$delegate = LazyKt__LazyJVMKt.iO(new o92(this));
        this.itemTimeCorrect$delegate = LazyKt__LazyJVMKt.iO(new p92(this));
        this.itemJuristicSet$delegate = LazyKt__LazyJVMKt.iO(new q92(this));
        this.itemHijriDateCorrrectSet$delegate = LazyKt__LazyJVMKt.iO(new r92(this));
        this.itemReminder$delegate = LazyKt__LazyJVMKt.iO(new s92(this));
        this.itemRenewal$delegate = LazyKt__LazyJVMKt.iO(new t92(this));
        this.mSettings = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.QIBLA_SET, BleQiblaSettings.class, null, null, 12, null);
        SPUtils r1 = a01.OXO1.OXO1();
        Object r2 = new Gson().fromJson(r1.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r2 != null) goto L5;
        r2 = PrayerTimeSettings.class.newInstance();
    L5:
        this.mPrayerTimeSettings = (PrayerTimeSettings) r2;
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ AbhSettingsItem I0iXXO(QiblaSettingsActivity r0) {
        return itemRenewal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem I1XOi1(QiblaSettingsActivity r0) {
        return itemReminder_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(QiblaSettingsActivity r0, int r1, BleConnector r2) {
        return onReminder$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem O10IXXX0X(QiblaSettingsActivity r0) {
        return itemTimeCorrect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem OIX0iXi(QiblaSettingsActivity r0) {
        return itemMethodSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader OiIIX101O(QiblaSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X0O(QiblaSettingsActivity r0) {
        return itemHijriDateCorrrectSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X1ii(QiblaSettingsActivity r0, int r1) {
        return onJuristicSet$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(QiblaSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(QiblaSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIO(QiblaSettingsActivity r0, int r1) {
        return onReminder$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIii1(QiblaSettingsActivity r0, int r1) {
        return onHijriDateCorrect$lambda$1$0(r0, r1);
    }

    public static final /* synthetic */ int access$getDEF_REMINDER$cp() {
        return DEF_REMINDER;
    }

    private final String getAsrMethod(int r3) {
        String r4 = getResources().getStringArray(R.array.asr_juristic_method)[r3];
        Intrinsics.O10IXXX0X(r4, "get(...)");
        return r4;
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemHijriDateCorrrectSet() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemJuristicSet() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemMethodSet() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemReminder() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRenewal() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTimeCorrect() {
        return (AbhSettingsItem) getValue();
    }

    private final String getTimeCorrectString() {
        Object r0 = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r0 != null) goto L5;
        r0 = PrayerTimeSettings.class.newInstance();
    L5:
        PrayerTimeSettings r1 = (PrayerTimeSettings) r0;
        this.mPrayerTimeSettings = r1;
        return O0X11OiO.XOO0ii0(r1.getFajrAdjustment(), 0, 2, null) + I000IiI1O.iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getSunriseAdjustment(), 0, 2, null) + I000IiI1O.iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getDhuhrAdjustment(), 0, 2, null) + I000IiI1O.iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getAsrAdjustment(), 0, 2, null) + I000IiI1O.iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getMaghribAdjustment(), 0, 2, null) + I000IiI1O.iO.XO0O10 + O0X11OiO.XOO0ii0(this.mPrayerTimeSettings.getIshaAdjustment(), 0, 2, null);
    }

    public static /* synthetic */ AbhSettingsItem iIiiO(QiblaSettingsActivity r0) {
        return itemJuristicSet_delegate$lambda$0(r0);
    }

    private static final Unit initView$lambda$0$0(final QiblaSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new w92(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(QiblaSettingsActivity r1, boolean r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r1.mSettings.setMEnabled(OiOX0i.iO(r2));
        r1.onInfoChange(new Object());
        I01XX0.XIi00iiXO(I01XX0.XXIIO1i11, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemHijriDateCorrrectSet_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_hijri_date_correct);
    }

    private static final AbhSettingsItem itemJuristicSet_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_juristic_set);
    }

    private static final AbhSettingsItem itemMethodSet_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_method_set);
    }

    private static final AbhSettingsItem itemReminder_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_reminder);
    }

    private static final AbhSettingsItem itemRenewal_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_renewal);
    }

    private static final AbhSettingsItem itemTimeCorrect_delegate$lambda$0(QiblaSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_correct);
    }

    private static final boolean onHijriDateCorrect$lambda$1$0(QiblaSettingsActivity r2, int r3) {
        r2.mPrayerTimeSettings.setHijriDateAdjustment(r3 - 30);
        r2.getItemHijriDateCorrrectSet().setMRightText(O0X11OiO.IiI10X(r2.mPrayerTimeSettings.getHijriDateAdjustment(), R.string.day));
        r2.onInfoChange(new Object());
        return true;
    }

    private static final boolean onJuristicSet$lambda$0$0(QiblaSettingsActivity r1, int r2) {
        r1.mPrayerTimeSettings.setArsJuristicMethod(r2);
        r1.getItemJuristicSet().setMRightText(r1.getAsrMethod(r1.mPrayerTimeSettings.getArsJuristicMethod()));
        r1.onInfoChange(new Object());
        return true;
    }

    private static final boolean onReminder$lambda$1$0(final QiblaSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new v92(r2, r3), 1, null);
    }

    private static final Unit onReminder$lambda$1$0$0(QiblaSettingsActivity r1, int r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r1.mSettings.setMReminderMinute(r2 + 1);
        AbhSettingsItem r4 = r1.getItemReminder();
        String r5 = r1.getString(R.string.d_minutes, new Object[]{Integer.valueOf(r1.mSettings.getMReminderMinute())});
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r4.setMRightText(r5);
        r1.onInfoChange(new Object());
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (q62.OXO1.XIi() == false) goto L5;
        getItemRenewal().setVisibility(0);
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_set);
        LogUtils.d(new Object[]{this.mSettings});
        if (this.mSettings.getMReminderMinute() != 0) goto L8;
        this.mSettings.setMReminderMinute(DEF_REMINDER);
    L8:
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        r0.setMListener(new l92(this));
        getItemMethodSet().setMRightText(PrayerTimesCalculationMethod.Companion.getMethodName(this.mSettings.getMMethod()));
        getItemJuristicSet().setMRightText(getAsrMethod(this.mPrayerTimeSettings.getArsJuristicMethod()));
        getItemHijriDateCorrrectSet().setMRightText(O0X11OiO.IiI10X(this.mPrayerTimeSettings.getHijriDateAdjustment(), R.string.day));
        AbhSettingsItem r1 = getItemReminder();
        String r2 = getString(R.string.d_minutes, new Object[]{Integer.valueOf(this.mSettings.getMReminderMinute())});
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r1.setMRightText(r2);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qibla_settings;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, @tb1 Intent r4) {
        super.onActivityResult(r2, r3, r4);
        if (r3 == (-1)) goto L5;
        return;
    L5:
        if (r2 != 99) goto L12;
        if (r4 == null) goto L8;
        Serializable r5 = r4.getSerializableExtra("method");
    L9:
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.model.PrayerTimesCalculationMethod");
        PrayerTimesCalculationMethod r6 = (PrayerTimesCalculationMethod) r5;
        getItemMethodSet().setMRightText(PrayerTimesCalculationMethod.Companion.getMethodName(r6.getMethod()));
        this.mPrayerTimeSettings.setCalculationMethod(r6.getMethod());
        onInfoChange(new Object());
        return;
    L8:
        r5 = null;
        goto L9
    }

    public final void onHijriDateCorrect(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mHijriDateAdjustmentPopup != null) goto L8;
        ArrayList r5 = new ArrayList(61);
        int r1 = 0;
    L5:
        if (r1 >= 61) goto L7;
        r5.add(String.valueOf(r1 - 30));
        r1 = r1 + 1;
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.hijri_date_correct);
        r0.iOO1ii1(R.string.day);
        r0.iX(new u92(this));
        this.mHijriDateAdjustmentPopup = r0;
    L8:
        qv1 r6 = this.mHijriDateAdjustmentPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mPrayerTimeSettings.getHijriDateAdjustment() + 30);
        r6.IIX1OXO();
        return;
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object r13) {
        Intrinsics.X0O(r13, "data");
        i1O0OXO1O.OXO1.OXO1("onInfoChange");
        a01.OXO1.OXO1().put(PrayerTimeSettings.class.getName(), new Gson().toJson(this.mPrayerTimeSettings));
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar r14 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r14, "getInstance(...)");
        long r6 = O0X11OiO.XiOIii1(r14);
        this.mSettings.setMMethod(this.mPrayerTimeSettings.getCalculationMethod());
        this.mSettings.setMStartTime((int) (System.currentTimeMillis() / ((long) 1000)));
        this.mSettings.setMPrayerTimes(PrayerTimesKt.toBlePrayerTimes(PrayerTimesKt.getPrayerTimeMap$default(this.mPrayerTimeSettings, this.mLocation.XO0O10(), this.mLocation.IiI10X(), r6, 0, 16, null)));
        AbhSettingsItem r15 = getItemHijriDateCorrrectSet();
        String r1 = getString(R.string.hijri_date_correct);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        r15.setMLeftText(r1);
        XOXO0X00I r3 = O0X11OiO.O10IXXX0X(r6, 0, 2, null);
        this.mSettings.setMHijriYear(r3.I0IIOi());
        this.mSettings.setMHijriMonth(r3.XOO0ii0());
        this.mSettings.setMHijriDay(r3.IiI10X());
        if (this.mPrayerTimeSettings.getHijriDateAdjustment() == 0) goto L5;
        getItemHijriDateCorrrectSet().setMLeftText(getString(R.string.hijri_date_correct) + "\n" + getString(R.string.hijri_date_corrected, new Object[]{O0X11OiO.I1XOi1(r6, 0, 2, null)}));
    L5:
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.QIBLA_SET, BleKeyFlag.UPDATE, this.mSettings, false, false, 24, null);
    }

    public final void onJuristicSet(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mArsJuristicMethodPopup != null) goto L5;
        dj4 r4 = new dj4(this, R.array.asr_juristic_method, R.layout.pop_choice_asrmethod_set);
        r4.iX(R.string.asr_juristic_method);
        r4.i010I(new n92(this));
        this.mArsJuristicMethodPopup = r4;
    L5:
        dj4 r5 = this.mArsJuristicMethodPopup;
        if (r5 == null) goto L9;
        r5.II1Xi0(this.mPrayerTimeSettings.getArsJuristicMethod());
        r5.IIX1OXO();
        return;
    }

    public final void onMethodSet(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivityForResult(new Intent(this, QiblaMethodActivity.class), 99);
    }

    public final void onOrientaiton(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, QiblaOrientationActivity.class));
    }

    public final void onReminder(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mReminderPopup != null) goto L8;
        ArrayList r5 = new ArrayList(30);
        int r1 = 0;
    L5:
        if (r1 >= 30) goto L7;
        r1 = r1 + 1;
        r5.add(String.valueOf(r1));
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.qibla_prayer_reminder);
        r0.iOO1ii1(R.string.minute);
        r0.iX(new m92(this));
        this.mReminderPopup = r0;
    L8:
        qv1 r6 = this.mReminderPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mSettings.getMReminderMinute() - 1);
        r6.IIX1OXO();
        return;
    }

    public final void onRenewal(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, ResourceRenewalActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String r0 = getTimeCorrectString();
        i1O0OXO1O.OXO1.OXO1("onResume -> " + getItemTimeCorrect().getMRightText() + ", " + r0);
        if (TextUtils.isEmpty(getItemTimeCorrect().getMRightText()) == false) goto L5;
    L7:
        getItemTimeCorrect().setMRightText(r0);
        return;
    L5:
        if (Intrinsics.XOO0ii0(getItemTimeCorrect().getMRightText(), r0) == true) goto L7;
        onInfoChange(new Object());
        goto L7
    }

    public final void onTime(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, QiblaTimeActivity.class));
    }

    public final void onTimeCorrect(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, QiblaTimeCorrectActivity.class));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
