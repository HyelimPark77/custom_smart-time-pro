package com.sma.smartv3.p610ui.sport.coach.guide;

import android.os.Bundle;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanStartTimeFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ChooseStartCalendarView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PlanStartTimeFragment extends BaseFragment implements SlideSelectionListener {
    private long startTimeLong;
    private int startTimeOfWeek;

    @aa1
    private final Lazy mCalendarView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hx1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanStartTimeFragment.mCalendarView_delegate$lambda$0(this.f7231IO);
        }
    });
    private final Calendar mCalendar = Calendar.getInstance();

    @aa1
    private final Lazy mTodayTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jx1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanStartTimeFragment.mTodayTime_delegate$lambda$0(this.f9061IO);
        }
    });

    @aa1
    private final Lazy mCalendarTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kx1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanStartTimeFragment.mCalendarTitle_delegate$lambda$0(this.f9303IO);
        }
    });

    public static final class OXO1 implements ChooseStartCalendarView.OXO1 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onDateSelected(Calendar calendar, int i, int i2, int i3) {
            TextView mCalendarTitle = PlanStartTimeFragment.this.getMCalendarTitle();
            PlanStartTimeFragment planStartTimeFragment = PlanStartTimeFragment.this;
            Intrinsics.XXI(calendar);
            mCalendarTitle.setText(planStartTimeFragment.formatCalendar(calendar, "MMMM yyyy"));
            PlanStartTimeFragment.this.startTimeLong = calendar.getTimeInMillis();
            PlanStartTimeFragment.this.startTimeOfWeek = AICoachManage.IiI10X.OXO1().m38664I1(calendar);
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onInteractivePrompts(String str) {
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onMonthChange(Calendar calendar, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCalendar(Calendar calendar, String str) {
        String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(calendar.getTime());
        Intrinsics.O10IXXX0X(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mCalendarTitle_delegate$lambda$0(PlanStartTimeFragment planStartTimeFragment) {
        return (TextView) planStartTimeFragment.getMView().findViewById(R.id.calendar_view_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseStartCalendarView mCalendarView_delegate$lambda$0(PlanStartTimeFragment planStartTimeFragment) {
        return (ChooseStartCalendarView) planStartTimeFragment.getMView().findViewById(R.id.calendar_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTodayTime_delegate$lambda$0(PlanStartTimeFragment planStartTimeFragment) {
        return (TextView) planStartTimeFragment.getMView().findViewById(R.id.today_is_time);
    }

    public final Calendar getMCalendar() {
        return this.mCalendar;
    }

    public final TextView getMCalendarTitle() {
        return (TextView) this.mCalendarTitle$delegate.getValue();
    }

    public final ChooseStartCalendarView getMCalendarView() {
        return (ChooseStartCalendarView) this.mCalendarView$delegate.getValue();
    }

    public final TextView getMTodayTime() {
        return (TextView) this.mTodayTime$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMCalendarView().setOnDateSelectedListener(new OXO1());
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 7);
        getMCalendarView().setMax(calendar);
        TextView mTodayTime = getMTodayTime();
        String string = getString(R.string.plan_start_time_tip);
        Calendar mCalendar = this.mCalendar;
        Intrinsics.O10IXXX0X(mCalendar, "mCalendar");
        mTodayTime.setText(string + " " + formatCalendar(mCalendar, O0X11OiO.OII));
        getMCalendarView().setMin(this.mCalendar);
        getMCalendarView().setDate(this.mCalendar);
        TextView mCalendarTitle = getMCalendarTitle();
        Calendar mCalendar2 = this.mCalendar;
        Intrinsics.O10IXXX0X(mCalendar2, "mCalendar");
        mCalendarTitle.setText(formatCalendar(mCalendar2, "MMMM yyyy"));
        this.startTimeLong = this.mCalendar.getTimeInMillis();
        AICoachManage aICoachManageOXO1 = AICoachManage.IiI10X.OXO1();
        Calendar mCalendar3 = this.mCalendar;
        Intrinsics.O10IXXX0X(mCalendar3, "mCalendar");
        this.startTimeOfWeek = aICoachManageOXO1.m38664I1(mCalendar3);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_start_time;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        ArrayList arrayList = new ArrayList();
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        arrayList.addAll(oxo1.OXO1().X0O().getDailySchedule().subList(0, 7));
        arrayList.add(Integer.valueOf(this.startTimeOfWeek));
        oxo1.OXO1().X0O().setStartTime(this.startTimeLong);
        oxo1.OXO1().OIi0();
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
