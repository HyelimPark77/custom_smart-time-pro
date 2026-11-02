package com.sma.smartv3.p610ui.device;

import android.content.Context;
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
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayerTime;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.p610ui.device.QiblaTimeActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,129:1\n1#2:130\n18#3,2:131\n15#3:133\n*S KotlinDebug\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n*L\n100#1:131,2\n100#1:133\n*E\n"})
public final class QiblaTimeActivity extends BaseActivity {

    @tb1
    private PrayerTime mNextPrayerTime;
    private Map<Long, ? extends List<PrayerTime>> mPrayerTimeData;

    @aa1
    private final Lazy calendarView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeActivity.calendarView_delegate$lambda$0(this.f12133IO);
        }
    });

    @aa1
    private final Lazy recycleView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeActivity.recycleView_delegate$lambda$0(this.f12334IO);
        }
    });

    @aa1
    private final Lazy tvNextTimeName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeActivity.tvNextTimeName_delegate$lambda$0(this.f12565IO);
        }
    });

    @aa1
    private final Lazy tvNextTimeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.aa2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeActivity.tvNextTimeValue_delegate$lambda$0(this.f5451IO);
        }
    });

    @aa1
    private final Lazy tvCountDownView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ba2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeActivity.tvCountDownView_delegate$lambda$0(this.f5693IO);
        }
    });

    @aa1
    private CustomLocation mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);

    @SourceDebugExtension({"SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class OXO1 implements FutureCalendarView.OXO1 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.FutureCalendarView.OXO1
        public void onDateSelected(Calendar calendar, int i, int i2, int i3) {
            if (calendar != null) {
                QiblaTimeActivity.this.showPrayerTime(calendar.getTimeInMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FutureCalendarView calendarView_delegate$lambda$0(QiblaTimeActivity qiblaTimeActivity) {
        return (FutureCalendarView) qiblaTimeActivity.findViewById(R.id.calendarView);
    }

    private final FutureCalendarView getCalendarView() {
        return (FutureCalendarView) this.calendarView$delegate.getValue();
    }

    private final RecyclerView getRecycleView() {
        return (RecyclerView) this.recycleView$delegate.getValue();
    }

    private final CountDownView getTvCountDownView() {
        return (CountDownView) this.tvCountDownView$delegate.getValue();
    }

    private final TextView getTvNextTimeName() {
        return (TextView) this.tvNextTimeName$delegate.getValue();
    }

    private final TextView getTvNextTimeValue() {
        return (TextView) this.tvNextTimeValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView recycleView_delegate$lambda$0(QiblaTimeActivity qiblaTimeActivity) {
        return (RecyclerView) qiblaTimeActivity.findViewById(R.id.recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPrayerTime(long j) {
        Map<Long, ? extends List<PrayerTime>> map = this.mPrayerTimeData;
        if (map == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map = null;
        }
        List<PrayerTime> listM39402iI = map.get(Long.valueOf(j));
        if (listM39402iI == null) {
            listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        getRecycleView().setLayoutManager(new LinearLayoutManager(this));
        getRecycleView().setAdapter(new CommonAdapter<PrayerTime>(listM39402iI) { // from class: com.sma.smartv3.ui.device.QiblaTimeActivity.showPrayerTime.1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder holder, PrayerTime item, int i) throws IllegalAccessException, InstantiationException {
                Intrinsics.X0O(holder, "holder");
                Intrinsics.X0O(item, "item");
                TextView textView = (TextView) holder.getView(R.id.tv_name);
                Context mContext = ((CommonAdapter) this).mContext;
                Intrinsics.O10IXXX0X(mContext, "mContext");
                textView.setText(item.getTimeName(mContext));
                ((TextView) holder.getView(R.id.tv_time)).setText(item.getTimeString());
                int adjustmentMin = item.getAdjustmentMin();
                ((TextView) holder.getView(R.id.tv_min)).setText(adjustmentMin != 0 ? O0X11OiO.IiI10X(adjustmentMin, R.string.minute) : "");
                View view = holder.getView(R.id.ll_content);
                Intrinsics.O10IXXX0X(view, "getView(...)");
                UtilsKt.IX1XiI(view, 200.0f);
                View view2 = holder.getView(R.id.container);
                QiblaTimeActivity qiblaTimeActivity = QiblaTimeActivity.this;
                Intrinsics.XXI(view2);
                UtilsKt.IX1XiI(view2, 200.0f);
                PrayerTime prayerTime = qiblaTimeActivity.mNextPrayerTime;
                if (prayerTime == null || prayerTime.getTime() != item.getTime()) {
                    view2.setBackgroundDrawable(null);
                } else {
                    view2.setBackgroundResource(R.color.colorAccent);
                }
                Context mContext2 = ((CommonAdapter) this).mContext;
                Intrinsics.O10IXXX0X(mContext2, "mContext");
                holder.setImageResource(R.id.iv_icon, item.getTimeIcon(mContext2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountDownView tvCountDownView_delegate$lambda$0(QiblaTimeActivity qiblaTimeActivity) {
        return (CountDownView) qiblaTimeActivity.findViewById(R.id.tv_count_down);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNextTimeName_delegate$lambda$0(QiblaTimeActivity qiblaTimeActivity) {
        return (TextView) qiblaTimeActivity.findViewById(R.id.tv_next_time_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNextTimeValue_delegate$lambda$0(QiblaTimeActivity qiblaTimeActivity) {
        return (TextView) qiblaTimeActivity.findViewById(R.id.tv_next_time_value);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @RequiresApi(26)
    public void initView() throws IllegalAccessException, InstantiationException {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.prayer_time);
        getCalendarView().setOnDateSelectedListener(new OXO1());
        getCalendarView().m38882iO(true);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qibla_time;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getTvCountDownView().cancelCountDown();
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long jXiOIii1 = O0X11OiO.XiOIii1(calendar);
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        if (objFromJson == null) {
            objFromJson = PrayerTimeSettings.class.newInstance();
        }
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap((PrayerTimeSettings) objFromJson, this.mLocation.XO0O10(), this.mLocation.IiI10X(), jXiOIii1, (16 & 16) != 0 ? 31 : 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PrayerTime.Companion companion = PrayerTime.Companion;
        Map<Long, ? extends List<PrayerTime>> map = this.mPrayerTimeData;
        if (map == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map = null;
        }
        PrayerTime prayerTimeFindNextTime = companion.findNextTime(map, jCurrentTimeMillis);
        this.mNextPrayerTime = prayerTimeFindNextTime;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        CustomLocation customLocation = this.mLocation;
        Map<Long, ? extends List<PrayerTime>> map2 = this.mPrayerTimeData;
        if (map2 == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map2 = null;
        }
        i1o0oxo1o.OXO1("onLocationInfoChange " + customLocation + " " + prayerTimeFindNextTime + ", " + map2);
        showPrayerTime(jXiOIii1);
        if (this.mNextPrayerTime != null) {
            TextView tvNextTimeName = getTvNextTimeName();
            PrayerTime prayerTime = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime);
            tvNextTimeName.setText(prayerTime.getTimeName(getMContext()));
            TextView tvNextTimeValue = getTvNextTimeValue();
            SimpleDateFormat simpleDateFormatI0X000X0O = O0X11OiO.i0X000X0O(false, false, 3, null);
            PrayerTime prayerTime2 = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime2);
            tvNextTimeValue.setText(simpleDateFormatI0X000X0O.format(Long.valueOf(prayerTime2.getTime())));
            CountDownView tvCountDownView = getTvCountDownView();
            Intrinsics.O10IXXX0X(tvCountDownView, "<get-tvCountDownView>(...)");
            PrayerTime prayerTime3 = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime3);
            CountDownView.startCountDown$default(tvCountDownView, prayerTime3.getTime() - jCurrentTimeMillis, 0L, 2, null);
            TextView tvNextTimeValue2 = getTvNextTimeValue();
            String str = O0X11OiO.m793iI().format(Long.valueOf(jCurrentTimeMillis));
            PrayerTime prayerTime4 = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime4);
            String strI1XOi1 = O0X11OiO.I1XOi1(prayerTime4.getTime(), 0, 2, null);
            SimpleDateFormat simpleDateFormatX0i1O = O0X11OiO.X0i1O(null, 1, null);
            PrayerTime prayerTime5 = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime5);
            tvNextTimeValue2.setText(str + " " + strI1XOi1 + " (" + simpleDateFormatX0i1O.format(Long.valueOf(prayerTime5.getTime())) + I000IiI1O.C2156iO.f1007iO);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
