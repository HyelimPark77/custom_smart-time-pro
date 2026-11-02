package com.sma.smartv3.ui.sport.coach.guide;

import android.os.Bundle;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hx1;
import com.android.mltcode.paycertificationapi.jx1;
import com.android.mltcode.paycertificationapi.kx1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import com.sma.smartv3.view.ChooseStartCalendarView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PlanStartTimeFragment extends BaseFragment implements SlideSelectionListener {
    private final Calendar mCalendar;

    @aa1
    private final Lazy mCalendarTitle$delegate;

    @aa1
    private final Lazy mCalendarView$delegate;

    @aa1
    private final Lazy mTodayTime$delegate;
    private long startTimeLong;
    private int startTimeOfWeek;

    public static final class OXO1 implements ChooseStartCalendarView.OXO1 {
        public final /* synthetic */ PlanStartTimeFragment OXO1;

        public OXO1(PlanStartTimeFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onDateSelected(Calendar r1, int r2, int r3, int r4) {
            TextView r5 = this.OXO1.getMCalendarTitle();
            PlanStartTimeFragment r6 = this.OXO1;
            Intrinsics.XXI(r1);
            r5.setText(PlanStartTimeFragment.access$formatCalendar(r6, r1, "MMMM yyyy"));
            PlanStartTimeFragment.access$setStartTimeLong$p(this.OXO1, r1.getTimeInMillis());
            PlanStartTimeFragment.access$setStartTimeOfWeek$p(this.OXO1, AICoachManage.IiI10X.OXO1().I1(r1));
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onInteractivePrompts(String r1) {
        }

        @Override // com.sma.smartv3.view.ChooseStartCalendarView.OXO1
        public void onMonthChange(Calendar r1, int r2, int r3, int r4) {
        }
    }

    public PlanStartTimeFragment() {
        this.mCalendarView$delegate = LazyKt__LazyJVMKt.iO(new hx1(this));
        this.mCalendar = Calendar.getInstance();
        this.mTodayTime$delegate = LazyKt__LazyJVMKt.iO(new jx1(this));
        this.mCalendarTitle$delegate = LazyKt__LazyJVMKt.iO(new kx1(this));
    }

    public static /* synthetic */ ChooseStartCalendarView XIi00iiXO(PlanStartTimeFragment r0) {
        return mCalendarView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(PlanStartTimeFragment r0) {
        return mTodayTime_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ String access$formatCalendar(PlanStartTimeFragment r0, Calendar r1, String r2) {
        return r0.formatCalendar(r1, r2);
    }

    public static final /* synthetic */ void access$setStartTimeLong$p(PlanStartTimeFragment r0, long r1) {
        r0.startTimeLong = r1;
    }

    public static final /* synthetic */ void access$setStartTimeOfWeek$p(PlanStartTimeFragment r0, int r1) {
        r0.startTimeOfWeek = r1;
    }

    private final String formatCalendar(Calendar r3, String r4) {
        String r5 = new SimpleDateFormat(r4, Locale.getDefault()).format(r3.getTime());
        Intrinsics.O10IXXX0X(r5, "format(...)");
        return r5;
    }

    public static /* synthetic */ TextView iO(PlanStartTimeFragment r0) {
        return mCalendarTitle_delegate$lambda$0(r0);
    }

    private static final TextView mCalendarTitle_delegate$lambda$0(PlanStartTimeFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.calendar_view_title);
    }

    private static final ChooseStartCalendarView mCalendarView_delegate$lambda$0(PlanStartTimeFragment r1) {
        return (ChooseStartCalendarView) r1.getMView().findViewById(R.id.calendar_view);
    }

    private static final TextView mTodayTime_delegate$lambda$0(PlanStartTimeFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.today_is_time);
    }

    public final Calendar getMCalendar() {
        return this.mCalendar;
    }

    public final TextView getMCalendarTitle() {
        return (TextView) getValue();
    }

    public final ChooseStartCalendarView getMCalendarView() {
        return (ChooseStartCalendarView) getValue();
    }

    public final TextView getMTodayTime() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMCalendarView().setOnDateSelectedListener(new OXO1(this));
        Calendar r0 = Calendar.getInstance();
        r0.add(5, 7);
        getMCalendarView().setMax(r0);
        TextView r1 = getMTodayTime();
        String r2 = getString(R.string.plan_start_time_tip);
        Calendar r3 = this.mCalendar;
        Intrinsics.O10IXXX0X(r3, "mCalendar");
        r1.setText(r2 + " " + formatCalendar(r3, O0X11OiO.OII));
        getMCalendarView().setMin(this.mCalendar);
        getMCalendarView().setDate(this.mCalendar);
        TextView r4 = getMCalendarTitle();
        Calendar r5 = this.mCalendar;
        Intrinsics.O10IXXX0X(r5, "mCalendar");
        r4.setText(formatCalendar(r5, "MMMM yyyy"));
        this.startTimeLong = this.mCalendar.getTimeInMillis();
        AICoachManage r6 = AICoachManage.IiI10X.OXO1();
        Calendar r7 = this.mCalendar;
        Intrinsics.O10IXXX0X(r7, "mCalendar");
        this.startTimeOfWeek = r6.I1(r7);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_start_time;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        ArrayList r0 = new ArrayList();
        AICoachManage.OXO1 r1 = AICoachManage.IiI10X;
        r0.addAll(r1.OXO1().X0O().getDailySchedule().subList(0, 7));
        r0.add(Integer.valueOf(this.startTimeOfWeek));
        r1.OXO1().X0O().setStartTime(this.startTimeLong);
        r1.OXO1().OIi0();
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
