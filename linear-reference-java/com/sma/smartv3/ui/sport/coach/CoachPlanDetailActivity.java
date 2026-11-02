package com.sma.smartv3.ui.sport.coach;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O1O1I0X;
import com.android.mltcode.paycertificationapi.X1O1iX;
import com.android.mltcode.paycertificationapi.XOiX1I0I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0iIiX;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.otherdevice.jl.view.CommonDecoration;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoachPlanDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachPlanDetailActivity.kt\ncom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class CoachPlanDetailActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitle$delegate;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy detailRecycler$delegate;

    @aa1
    private final Lazy detailValue$delegate;
    private AICoachManage.VitalityDayLesson mVitalityDayLesson;

    public CoachPlanDetailActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new XOiX1I0I(this));
        this.abhTitle$delegate = LazyKt__LazyJVMKt.iO(new O1O1I0X(this));
        this.detailValue$delegate = LazyKt__LazyJVMKt.iO(new i0iIiX(this));
        this.detailRecycler$delegate = LazyKt__LazyJVMKt.iO(new X1O1iX(this));
    }

    public static /* synthetic */ TextView I0iXXO(CoachPlanDetailActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(CoachPlanDetailActivity r0) {
        return abhTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(CoachPlanDetailActivity r0) {
        return detailValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XXI(CoachPlanDetailActivity r0) {
        return detailRecycler_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(CoachPlanDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final TextView abhTitle_delegate$lambda$0(CoachPlanDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.plan_detail_title);
    }

    public static final /* synthetic */ AICoachManage.VitalityDayLesson access$getMVitalityDayLesson$p(CoachPlanDetailActivity r0) {
        return r0.mVitalityDayLesson;
    }

    private static final RecyclerView detailRecycler_delegate$lambda$0(CoachPlanDetailActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.plan_detail_recycler);
    }

    private static final TextView detailValue_delegate$lambda$0(CoachPlanDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.plan_detail_value);
    }

    private final TextView getAbhTitle() {
        return (TextView) getValue();
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final RecyclerView getDetailRecycler() {
        return (RecyclerView) getValue();
    }

    private final TextView getDetailValue() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.coach.AICoachManage.VitalityDayLesson");
        this.mVitalityDayLesson = (AICoachManage.VitalityDayLesson) r3;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = getAbhTitle();
        AICoachManage.VitalityDayLesson r1 = this.mVitalityDayLesson;
        AICoachManage.VitalityDayLesson r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mVitalityDayLesson");
        r1 = null;
    L5:
        r0.setText(r1.getLessonTitle());
        TextView r3 = getAbhTitleCenter();
        AICoachManage.VitalityDayLesson r4 = this.mVitalityDayLesson;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mVitalityDayLesson");
        r4 = null;
    L8:
        r3.setText(r4.getLessonName());
        TextView r5 = getDetailValue();
        AICoachManage.VitalityDayLesson r6 = this.mVitalityDayLesson;
        if (r6 != null) goto L11;
        Intrinsics.XXO("mVitalityDayLesson");
        r6 = null;
    L11:
        r5.setText(String.valueOf((int) r6.getLessonTarget()));
        getDetailRecycler().setLayoutManager(new LinearLayoutManager(this));
        getDetailRecycler().addItemDecoration(new CommonDecoration(this, 1, getResources().getColor(R.color.transparent), 32));
        AICoachManage.VitalityDayLesson r7 = this.mVitalityDayLesson;
        if (r7 != null) goto L15;
        Intrinsics.XXO("mVitalityDayLesson");
        r7 = null;
    L15:
        if (r7.getLessonCode() != 1) goto L40;
        AICoachManage.VitalityDayLesson r8 = this.mVitalityDayLesson;
        if (r8 != null) goto L19;
        Intrinsics.XXO("mVitalityDayLesson");
        r8 = null;
    L19:
        List<AICoachManage.VitalityLessonIntervalLessons> r9 = r8.getMIntervalLessons();
        Intrinsics.XXI(r9);
        if (r9.isEmpty() == true) goto L40;
        AICoachManage.VitalityDayLesson r10 = this.mVitalityDayLesson;
        if (r10 != null) goto L24;
        Intrinsics.XXO("mVitalityDayLesson");
        r10 = null;
    L24:
        List<AICoachManage.VitalityLessonIntervalLessons> r11 = r10.getMIntervalLessons();
        Intrinsics.XXI(r11);
        if (r11.get(0).getTarget() == (-1.0f)) goto L31;
        TextView r12 = getDetailValue();
        AICoachManage.VitalityDayLesson r13 = this.mVitalityDayLesson;
        if (r13 != null) goto L30;
        Intrinsics.XXO("mVitalityDayLesson");
        r13 = null;
    L30:
        List<AICoachManage.VitalityLessonIntervalLessons> r14 = r13.getMIntervalLessons();
        Intrinsics.XXI(r14);
        r12.setText(String.valueOf((int) r14.get(0).getTarget()));
    L31:
        final List r15 = new ArrayList();
        AICoachManage.VitalityDayLesson r16 = this.mVitalityDayLesson;
        if (r16 != null) goto L34;
        Intrinsics.XXO("mVitalityDayLesson");
        r16 = null;
    L34:
        List<AICoachManage.VitalityLessonIntervalLessons> r17 = r16.getMIntervalLessons();
        Intrinsics.XXI(r17);
        int r18 = r17.get(0).getRepeatTimes() * 2;
        int r19 = 0;
    L35:
        if (r19 >= r18) goto L45;
        AICoachManage.VitalityDayLesson r20 = this.mVitalityDayLesson;
        if (r20 != null) goto L39;
        Intrinsics.XXO("mVitalityDayLesson");
        r20 = null;
    L39:
        List<AICoachManage.VitalityLessonIntervalLessons> r21 = r20.getMIntervalLessons();
        Intrinsics.XXI(r21);
        r15.add(r21.get(0));
        r19 = r19 + 1;
    L45:
        final Activity r22 = getMContext();
        getDetailRecycler().setAdapter(new CoachPlanDetailActivity$initView$mAdapter$1(r15, this, r22));
        return;
    L40:
        AICoachManage.VitalityDayLesson r23 = this.mVitalityDayLesson;
        if (r23 != null) goto L43;
        Intrinsics.XXO("mVitalityDayLesson");
    L44:
        r15 = r2.getMIntervalLessons();
        goto L45
    L43:
        r2 = r23;
        goto L44
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_coach_plan_detail;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }
}
