package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sma.smartv3.model.EnergyRatingDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.EnergyRatingDao;
import com.sma.smartv3.p608db.entity.EnergyRating;
import com.sma.smartv3.p610ui.status.EnergyRatingRecordActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.ProgressCalendarView;
import com.sma.smartv3.view.text.PFMedium;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EnergyRatingRecordActivity extends BaseActivity implements ProgressCalendarView.OXO1 {
    public Calendar mCalendar;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIii0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingRecordActivity.abhTitleCenter_delegate$lambda$0(this.f1702IO);
        }
    });

    @aa1
    private final Lazy tvLest$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OiiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingRecordActivity.tvLest_delegate$lambda$0(this.f7655IO);
        }
    });

    @aa1
    private final Lazy tvNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0X1i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingRecordActivity.tvNext_delegate$lambda$0(this.f4030IO);
        }
    });

    @aa1
    private final Lazy tvTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XOXi0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingRecordActivity.tvTitle_delegate$lambda$0(this.f1227IO);
        }
    });

    @aa1
    private final Lazy mCalendarView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i00XOX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingRecordActivity.mCalendarView_delegate$lambda$0(this.f7284IO);
        }
    });

    @aa1
    private final EnergyRatingDao mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity) {
        return (PFMedium) energyRatingRecordActivity.findViewById(R.id.abh_title_center);
    }

    private final void addCurMonthHashMap(Calendar calendar) {
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(calendar, TimePeriod.MONTH, 0, 4, null);
        List<EnergyRating> energyRating = this.mEnergyRatingDao.getEnergyRating(jArrIOOX010X[0], jArrIOOX010X[1]);
        HashMap map = new HashMap();
        List<Integer> energyRatingColorLevel = EnergyRatingDataKt.getEnergyRatingColorLevel(this);
        for (EnergyRating energyRating2 : energyRating) {
            long dayStartTimestamp = getDayStartTimestamp(energyRating2.getMTime());
            ProgressCalendarView.XIi00iiXO xIi00iiXO = map.get(Long.valueOf(dayStartTimestamp));
            if (xIi00iiXO == null) {
                int energyRatingLevel = EnergyRatingDataKt.getEnergyRatingLevel(energyRating2.getMScore());
                map.put(Long.valueOf(dayStartTimestamp), new ProgressCalendarView.XIi00iiXO(energyRating2.getMScore(), ((Number) (energyRatingLevel < energyRatingColorLevel.size() ? energyRatingColorLevel.get(energyRatingLevel) : CollectionsKt___CollectionsKt.Xi1XO00(energyRatingColorLevel))).intValue()));
            } else if (xIi00iiXO.OXO1 < energyRating2.getMScore()) {
                int energyRatingLevel2 = EnergyRatingDataKt.getEnergyRatingLevel(energyRating2.getMScore());
                map.put(Long.valueOf(dayStartTimestamp), new ProgressCalendarView.XIi00iiXO(energyRating2.getMScore(), ((Number) (energyRatingLevel2 < energyRatingColorLevel.size() ? energyRatingColorLevel.get(energyRatingLevel2) : CollectionsKt___CollectionsKt.Xi1XO00(energyRatingColorLevel))).intValue()));
            }
        }
        getMCalendarView().m38908iO(map);
    }

    private final String formatCalendar(Calendar calendar, String str) {
        String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(calendar.getTime());
        Intrinsics.O10IXXX0X(str2, "format(...)");
        return str2;
    }

    private final long getDayStartTimestamp(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final ProgressCalendarView getMCalendarView() {
        return (ProgressCalendarView) this.mCalendarView$delegate.getValue();
    }

    private final ImageButton getTvLest() {
        return (ImageButton) this.tvLest$delegate.getValue();
    }

    private final ImageButton getTvNext() {
        return (ImageButton) this.tvNext$delegate.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity, View view) {
        energyRatingRecordActivity.getMCalendarView().I0iXXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(EnergyRatingRecordActivity energyRatingRecordActivity, View view) {
        energyRatingRecordActivity.getMCalendarView().XXI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressCalendarView mCalendarView_delegate$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity) {
        return (ProgressCalendarView) energyRatingRecordActivity.findViewById(R.id.ac_calendar_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton tvLest_delegate$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity) {
        return (ImageButton) energyRatingRecordActivity.findViewById(R.id.beforeTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton tvNext_delegate$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity) {
        return (ImageButton) energyRatingRecordActivity.findViewById(R.id.nextTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTitle_delegate$lambda$0(EnergyRatingRecordActivity energyRatingRecordActivity) {
        return (TextView) energyRatingRecordActivity.findViewById(R.id.nowTime);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    @aa1
    public final Calendar getMCalendar() {
        Calendar calendar = this.mCalendar;
        if (calendar != null) {
            return calendar;
        }
        Intrinsics.XXO("mCalendar");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        setMCalendar(calendar);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        long longExtra = getIntent().getLongExtra("curTime", 0L);
        if (longExtra != 0) {
            getMCalendar().setTimeInMillis(longExtra);
            getMCalendarView().setDate(getMCalendar());
            addCurMonthHashMap(getMCalendar());
        }
        getAbhTitleCenter().setText(getString(R.string.status_body_energy));
        getMCalendarView().setOnDateSelectedListener(this);
        getTvLest().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOIOO1IO1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnergyRatingRecordActivity.initView$lambda$0(this.f8074IO, view);
            }
        });
        getTvNext().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1iI0Ii1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnergyRatingRecordActivity.initView$lambda$1(this.f2840IO, view);
            }
        });
        getTvTitle().setText(formatCalendar(getMCalendar(), "yyyy-MM"));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_energy_rating_record;
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onDateSelected(@aa1 Calendar calendar, int i, int i2, int i3) {
        Intrinsics.X0O(calendar, "calendar");
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(calendar, TimePeriod.DAY, 0, 4, null);
        Intent intent = new Intent();
        intent.putExtra("startTime", jArrIOOX010X[0]);
        intent.putExtra(SDKConstants.PARAM_END_TIME, jArrIOOX010X[1]);
        setResult(-1, intent);
        finish();
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onInteractivePrompts(@aa1 String msg) {
        Intrinsics.X0O(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onMonthChange(@aa1 Calendar calendar, int i, int i2, int i3) {
        Intrinsics.X0O(calendar, "calendar");
        getTvTitle().setText(formatCalendar(calendar, "yyyy-MM"));
        setMCalendar(calendar);
        addCurMonthHashMap(getMCalendar());
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setMCalendar(@aa1 Calendar calendar) {
        Intrinsics.X0O(calendar, "<set-?>");
        this.mCalendar = calendar;
    }
}
