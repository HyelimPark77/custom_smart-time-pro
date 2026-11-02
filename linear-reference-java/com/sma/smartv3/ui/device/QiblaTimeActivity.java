package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aa2;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ba2;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.x92;
import com.android.mltcode.paycertificationapi.y92;
import com.android.mltcode.paycertificationapi.z92;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayerTime;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CountDownView;
import com.sma.smartv3.view.FutureCalendarView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,129:1\n1#2:130\n18#3,2:131\n15#3:133\n*S KotlinDebug\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n*L\n100#1:131,2\n100#1:133\n*E\n"})
public final class QiblaTimeActivity extends BaseActivity {

    @aa1
    private final Lazy calendarView$delegate;

    @aa1
    private CustomLocation mLocation;

    @tb1
    private PrayerTime mNextPrayerTime;
    private Map<Long, ? extends List<PrayerTime>> mPrayerTimeData;

    @aa1
    private final Lazy recycleView$delegate;

    @aa1
    private final Lazy tvCountDownView$delegate;

    @aa1
    private final Lazy tvNextTimeName$delegate;

    @aa1
    private final Lazy tvNextTimeValue$delegate;

    @SourceDebugExtension({"SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class OXO1 implements FutureCalendarView.OXO1 {
        public final /* synthetic */ QiblaTimeActivity OXO1;

        public OXO1(QiblaTimeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.FutureCalendarView.OXO1
        public void onDateSelected(Calendar r1, int r2, int r3, int r4) {
            if (r1 == null) goto L5;
            long r5 = r1.getTimeInMillis();
            QiblaTimeActivity.access$showPrayerTime(this.OXO1, r5);
            return;
        }
    }

    public QiblaTimeActivity() {
        this.calendarView$delegate = LazyKt__LazyJVMKt.iO(new x92(this));
        this.recycleView$delegate = LazyKt__LazyJVMKt.iO(new y92(this));
        this.tvNextTimeName$delegate = LazyKt__LazyJVMKt.iO(new z92(this));
        this.tvNextTimeValue$delegate = LazyKt__LazyJVMKt.iO(new aa2(this));
        this.tvCountDownView$delegate = LazyKt__LazyJVMKt.iO(new ba2(this));
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ CountDownView I0iXXO(QiblaTimeActivity r0) {
        return tvCountDownView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(QiblaTimeActivity r0) {
        return tvNextTimeName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView OIX0iXi(QiblaTimeActivity r0) {
        return recycleView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FutureCalendarView X1ii(QiblaTimeActivity r0) {
        return calendarView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(QiblaTimeActivity r0) {
        return tvNextTimeValue_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ PrayerTime access$getMNextPrayerTime$p(QiblaTimeActivity r0) {
        return r0.mNextPrayerTime;
    }

    public static final /* synthetic */ void access$showPrayerTime(QiblaTimeActivity r0, long r1) {
        r0.showPrayerTime(r1);
    }

    private static final FutureCalendarView calendarView_delegate$lambda$0(QiblaTimeActivity r1) {
        return (FutureCalendarView) r1.findViewById(R.id.calendarView);
    }

    private final FutureCalendarView getCalendarView() {
        return (FutureCalendarView) getValue();
    }

    private final RecyclerView getRecycleView() {
        return (RecyclerView) getValue();
    }

    private final CountDownView getTvCountDownView() {
        return (CountDownView) getValue();
    }

    private final TextView getTvNextTimeName() {
        return (TextView) getValue();
    }

    private final TextView getTvNextTimeValue() {
        return (TextView) getValue();
    }

    private static final RecyclerView recycleView_delegate$lambda$0(QiblaTimeActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recyclerView);
    }

    private final void showPrayerTime(long r2) {
        Map<Long, ? extends List<PrayerTime>> r0 = this.mPrayerTimeData;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mPrayerTimeData");
        r0 = null;
    L5:
        List<PrayerTime> r3 = r0.get(Long.valueOf(r2));
        if (r3 != null) goto L8;
        r3 = CollectionsKt__CollectionsKt.iI();
    L8:
        final List<PrayerTime> r4 = r3;
        getRecycleView().setLayoutManager(new LinearLayoutManager(this));
        getRecycleView().setAdapter(new AnonymousClass1(this, r4));
    }

    private static final CountDownView tvCountDownView_delegate$lambda$0(QiblaTimeActivity r1) {
        return (CountDownView) r1.findViewById(R.id.tv_count_down);
    }

    private static final TextView tvNextTimeName_delegate$lambda$0(QiblaTimeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_next_time_name);
    }

    private static final TextView tvNextTimeValue_delegate$lambda$0(QiblaTimeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_next_time_value);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @RequiresApi(26)
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.prayer_time);
        getCalendarView().setOnDateSelectedListener(new OXO1(this));
        getCalendarView().iO(true);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qibla_time;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getTvCountDownView().cancelCountDown();
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object r14) {
        Intrinsics.X0O(r14, "data");
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar r15 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r15, "getInstance(...)");
        long r6 = O0X11OiO.XiOIii1(r15);
        Object r16 = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r16 != null) goto L5;
        r16 = PrayerTimeSettings.class.newInstance();
    L5:
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap$default((PrayerTimeSettings) r16, this.mLocation.XO0O10(), this.mLocation.IiI10X(), r6, 0, 16, null);
        long r0 = System.currentTimeMillis();
        PrayerTime.Companion r17 = PrayerTime.Companion;
        Map<Long, ? extends List<PrayerTime>> r2 = this.mPrayerTimeData;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mPrayerTimeData");
        r2 = null;
    L8:
        PrayerTime r18 = r17.findNextTime(r2, r0);
        this.mNextPrayerTime = r18;
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        CustomLocation r5 = this.mLocation;
        Map<Long, ? extends List<PrayerTime>> r8 = this.mPrayerTimeData;
        if (r8 != null) goto L11;
        Intrinsics.XXO("mPrayerTimeData");
        r8 = null;
    L11:
        r3.OXO1("onLocationInfoChange " + r5 + " " + r18 + ", " + r8);
        showPrayerTime(r6);
        if (this.mNextPrayerTime == null) goto L15;
        TextView r19 = getTvNextTimeName();
        PrayerTime r4 = this.mNextPrayerTime;
        Intrinsics.XXI(r4);
        r19.setText(r4.getTimeName(getMContext()));
        TextView r110 = getTvNextTimeValue();
        SimpleDateFormat r7 = O0X11OiO.i0X000X0O(false, false, 3, null);
        PrayerTime r9 = this.mNextPrayerTime;
        Intrinsics.XXI(r9);
        r110.setText(r7.format(Long.valueOf(r9.getTime())));
        CountDownView r10 = getTvCountDownView();
        Intrinsics.O10IXXX0X(r10, "<get-tvCountDownView>(...)");
        PrayerTime r111 = this.mNextPrayerTime;
        Intrinsics.XXI(r111);
        CountDownView.startCountDown$default(r10, r111.getTime() - r0, 0, 2, null);
        TextView r112 = getTvNextTimeValue();
        String r1 = O0X11OiO.iI().format(Long.valueOf(r0));
        PrayerTime r11 = this.mNextPrayerTime;
        Intrinsics.XXI(r11);
        String r12 = O0X11OiO.I1XOi1(r11.getTime(), 0, 2, null);
        SimpleDateFormat r13 = O0X11OiO.X0i1O(null, 1, null);
        PrayerTime r20 = this.mNextPrayerTime;
        Intrinsics.XXI(r20);
        r112.setText(r1 + " " + r12 + " (" + r13.format(Long.valueOf(r20.getTime())) + I000IiI1O.iO.iO);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
