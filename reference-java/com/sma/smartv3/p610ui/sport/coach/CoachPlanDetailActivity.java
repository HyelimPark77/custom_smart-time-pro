package com.sma.smartv3.p610ui.sport.coach;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.otherdevice.p609jl.view.CommonDecoration;
import com.sma.smartv3.p610ui.sport.coach.CoachPlanDetailActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoachPlanDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachPlanDetailActivity.kt\ncom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class CoachPlanDetailActivity extends BaseActivity {
    private AICoachManage.VitalityDayLesson mVitalityDayLesson;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOiX1I0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachPlanDetailActivity.abhTitleCenter_delegate$lambda$0(this.f4910IO);
        }
    });

    @aa1
    private final Lazy abhTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1O1I0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachPlanDetailActivity.abhTitle_delegate$lambda$0(this.f2740IO);
        }
    });

    @aa1
    private final Lazy detailValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iIiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachPlanDetailActivity.detailValue_delegate$lambda$0(this.f7481IO);
        }
    });

    @aa1
    private final Lazy detailRecycler$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1O1iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachPlanDetailActivity.detailRecycler_delegate$lambda$0(this.f4295IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(CoachPlanDetailActivity coachPlanDetailActivity) {
        return (TextView) coachPlanDetailActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitle_delegate$lambda$0(CoachPlanDetailActivity coachPlanDetailActivity) {
        return (TextView) coachPlanDetailActivity.findViewById(R.id.plan_detail_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView detailRecycler_delegate$lambda$0(CoachPlanDetailActivity coachPlanDetailActivity) {
        return (RecyclerView) coachPlanDetailActivity.findViewById(R.id.plan_detail_recycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView detailValue_delegate$lambda$0(CoachPlanDetailActivity coachPlanDetailActivity) {
        return (TextView) coachPlanDetailActivity.findViewById(R.id.plan_detail_value);
    }

    private final TextView getAbhTitle() {
        return (TextView) this.abhTitle$delegate.getValue();
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final RecyclerView getDetailRecycler() {
        return (RecyclerView) this.detailRecycler$delegate.getValue();
    }

    private final TextView getDetailValue() {
        return (TextView) this.detailValue$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.coach.AICoachManage.VitalityDayLesson");
        this.mVitalityDayLesson = (AICoachManage.VitalityDayLesson) mArg3;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        AICoachManage.VitalityDayLesson vitalityDayLesson;
        final List mIntervalLessons;
        TextView abhTitle = getAbhTitle();
        AICoachManage.VitalityDayLesson vitalityDayLesson2 = this.mVitalityDayLesson;
        AICoachManage.VitalityDayLesson vitalityDayLesson3 = null;
        if (vitalityDayLesson2 == null) {
            Intrinsics.XXO("mVitalityDayLesson");
            vitalityDayLesson2 = null;
        }
        abhTitle.setText(vitalityDayLesson2.getLessonTitle());
        TextView abhTitleCenter = getAbhTitleCenter();
        AICoachManage.VitalityDayLesson vitalityDayLesson4 = this.mVitalityDayLesson;
        if (vitalityDayLesson4 == null) {
            Intrinsics.XXO("mVitalityDayLesson");
            vitalityDayLesson4 = null;
        }
        abhTitleCenter.setText(vitalityDayLesson4.getLessonName());
        TextView detailValue = getDetailValue();
        AICoachManage.VitalityDayLesson vitalityDayLesson5 = this.mVitalityDayLesson;
        if (vitalityDayLesson5 == null) {
            Intrinsics.XXO("mVitalityDayLesson");
            vitalityDayLesson5 = null;
        }
        detailValue.setText(String.valueOf((int) vitalityDayLesson5.getLessonTarget()));
        getDetailRecycler().setLayoutManager(new LinearLayoutManager(this));
        getDetailRecycler().addItemDecoration(new CommonDecoration(this, 1, getResources().getColor(R.color.transparent), 32));
        AICoachManage.VitalityDayLesson vitalityDayLesson6 = this.mVitalityDayLesson;
        if (vitalityDayLesson6 == null) {
            Intrinsics.XXO("mVitalityDayLesson");
            vitalityDayLesson6 = null;
        }
        if (vitalityDayLesson6.getLessonCode() != 1) {
            vitalityDayLesson = this.mVitalityDayLesson;
            if (vitalityDayLesson == null) {
                Intrinsics.XXO("mVitalityDayLesson");
            } else {
                vitalityDayLesson3 = vitalityDayLesson;
            }
            mIntervalLessons = vitalityDayLesson3.getMIntervalLessons();
        } else {
            AICoachManage.VitalityDayLesson vitalityDayLesson7 = this.mVitalityDayLesson;
            if (vitalityDayLesson7 == null) {
                Intrinsics.XXO("mVitalityDayLesson");
                vitalityDayLesson7 = null;
            }
            List<AICoachManage.VitalityLessonIntervalLessons> mIntervalLessons2 = vitalityDayLesson7.getMIntervalLessons();
            Intrinsics.XXI(mIntervalLessons2);
            if (mIntervalLessons2.isEmpty()) {
                vitalityDayLesson = this.mVitalityDayLesson;
                if (vitalityDayLesson == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                } else {
                    vitalityDayLesson3 = vitalityDayLesson;
                }
                mIntervalLessons = vitalityDayLesson3.getMIntervalLessons();
            } else {
                AICoachManage.VitalityDayLesson vitalityDayLesson8 = this.mVitalityDayLesson;
                if (vitalityDayLesson8 == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                    vitalityDayLesson8 = null;
                }
                List<AICoachManage.VitalityLessonIntervalLessons> mIntervalLessons3 = vitalityDayLesson8.getMIntervalLessons();
                Intrinsics.XXI(mIntervalLessons3);
                if (mIntervalLessons3.get(0).getTarget() != -1.0f) {
                    TextView detailValue2 = getDetailValue();
                    AICoachManage.VitalityDayLesson vitalityDayLesson9 = this.mVitalityDayLesson;
                    if (vitalityDayLesson9 == null) {
                        Intrinsics.XXO("mVitalityDayLesson");
                        vitalityDayLesson9 = null;
                    }
                    List<AICoachManage.VitalityLessonIntervalLessons> mIntervalLessons4 = vitalityDayLesson9.getMIntervalLessons();
                    Intrinsics.XXI(mIntervalLessons4);
                    detailValue2.setText(String.valueOf((int) mIntervalLessons4.get(0).getTarget()));
                }
                mIntervalLessons = new ArrayList();
                AICoachManage.VitalityDayLesson vitalityDayLesson10 = this.mVitalityDayLesson;
                if (vitalityDayLesson10 == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                    vitalityDayLesson10 = null;
                }
                List<AICoachManage.VitalityLessonIntervalLessons> mIntervalLessons5 = vitalityDayLesson10.getMIntervalLessons();
                Intrinsics.XXI(mIntervalLessons5);
                int repeatTimes = mIntervalLessons5.get(0).getRepeatTimes() * 2;
                for (int i = 0; i < repeatTimes; i++) {
                    AICoachManage.VitalityDayLesson vitalityDayLesson11 = this.mVitalityDayLesson;
                    if (vitalityDayLesson11 == null) {
                        Intrinsics.XXO("mVitalityDayLesson");
                        vitalityDayLesson11 = null;
                    }
                    List<AICoachManage.VitalityLessonIntervalLessons> mIntervalLessons6 = vitalityDayLesson11.getMIntervalLessons();
                    Intrinsics.XXI(mIntervalLessons6);
                    mIntervalLessons.add(mIntervalLessons6.get(0));
                }
            }
        }
        final Activity mContext = getMContext();
        getDetailRecycler().setAdapter(new CommonAdapter<AICoachManage.VitalityLessonIntervalLessons>(mIntervalLessons, mContext) { // from class: com.sma.smartv3.ui.sport.coach.CoachPlanDetailActivity$initView$mAdapter$1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, AICoachManage.VitalityLessonIntervalLessons item, int i2) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
                AICoachManage.VitalityDayLesson vitalityDayLesson12 = this.mVitalityDayLesson;
                AICoachManage.VitalityDayLesson vitalityDayLesson13 = null;
                if (vitalityDayLesson12 == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                    vitalityDayLesson12 = null;
                }
                viewHolder.setText(R.id.item_detail_item_time_tv, vitalityDayLesson12.getLessonTime() + ":00");
                if (item.getLowerBoundHR() == -1 || item.getUpperBoundHR() == -1) {
                    viewHolder.setText(R.id.item_detail_item_hr_tv, HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                } else {
                    viewHolder.setText(R.id.item_detail_item_hr_tv, item.getLowerBoundHR() + " - " + item.getUpperBoundHR() + " " + this.getString(R.string.bpm));
                }
                AICoachManage.VitalityDayLesson vitalityDayLesson14 = this.mVitalityDayLesson;
                if (vitalityDayLesson14 == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                    vitalityDayLesson14 = null;
                }
                viewHolder.setText(R.id.item_detail_item_title, vitalityDayLesson14.getLessonName());
                AICoachManage.VitalityDayLesson vitalityDayLesson15 = this.mVitalityDayLesson;
                if (vitalityDayLesson15 == null) {
                    Intrinsics.XXO("mVitalityDayLesson");
                } else {
                    vitalityDayLesson13 = vitalityDayLesson15;
                }
                int lessonCode = vitalityDayLesson13.getLessonCode();
                if (lessonCode == 0) {
                    viewHolder.setText(R.id.item_detail_item_title, this.getString(R.string.workout7));
                    viewHolder.setImageResource(R.id.item_detail_item_icon, R.drawable.plan_detail_interval_run_icon);
                    return;
                }
                if (lessonCode != 1) {
                    return;
                }
                if (i2 % 2 != 0) {
                    viewHolder.setText(R.id.item_detail_item_time_tv, item.getRestMinutes() + ":00");
                    viewHolder.setText(R.id.item_detail_item_title, this.getString(R.string.rest));
                    viewHolder.setText(R.id.item_detail_item_hr_tv, HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                    viewHolder.setImageResource(R.id.item_detail_item_icon, R.drawable.plan_detail_lsd_rest_icon);
                    return;
                }
                viewHolder.setText(R.id.item_detail_item_time_tv, item.getIntenseMinutes() + ":00");
                viewHolder.setText(R.id.item_detail_item_title, this.getString(R.string.workout7));
                viewHolder.setText(R.id.item_detail_item_hr_tv, item.getLowerBoundHR() + " - " + item.getUpperBoundHR() + " " + this.getString(R.string.bpm));
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_coach_plan_detail;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }
}
