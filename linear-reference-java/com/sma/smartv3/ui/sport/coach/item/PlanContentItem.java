package com.sma.smartv3.ui.sport.coach.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class PlanContentItem extends BaseDslItem {
    private ImageView currentImg;
    private TextView currentName;
    private TextView currentTitle;
    private View exerciseLayout;
    private TextView exerciseNull;
    private TextView exerciseTime;
    private final boolean isReachedTarget;

    @aa1
    private final AICoachManage.VitalityDayLesson mVitalityDayLesson;

    public PlanContentItem(@aa1 AICoachManage.VitalityDayLesson r2, boolean r3) {
        Intrinsics.X0O(r2, "mVitalityDayLesson");
        this.mVitalityDayLesson = r2;
        this.isReachedTarget = r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.coach_content_title);
        Intrinsics.XXI(r0);
        this.currentTitle = (TextView) r0;
        View r1 = r2.v(R.id.coach_content_name);
        Intrinsics.XXI(r1);
        this.currentName = (TextView) r1;
        View r3 = r2.v(R.id.coach_content_time);
        Intrinsics.XXI(r3);
        this.exerciseTime = (TextView) r3;
        View r4 = r2.v(R.id.coach_content_iv);
        Intrinsics.XXI(r4);
        this.currentImg = (ImageView) r4;
        View r5 = r2.v(R.id.coach_content_no_title);
        Intrinsics.XXI(r5);
        this.exerciseNull = (TextView) r5;
        View r6 = r2.v(R.id.content_lesson_layout);
        Intrinsics.XXI(r6);
        this.exerciseLayout = r6;
    }

    @aa1
    public final AICoachManage.VitalityDayLesson getMVitalityDayLesson() {
        return this.mVitalityDayLesson;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView r5 = null;
        if (this.mVitalityDayLesson.getLessonName().length() != 0) goto L36;
        TextView r0 = this.exerciseNull;
        if (r0 != null) goto L7;
        Intrinsics.XXO("exerciseNull");
        r0 = null;
    L7:
        r0.setVisibility(0);
        View r1 = this.exerciseLayout;
        if (r1 != null) goto L10;
        Intrinsics.XXO("exerciseLayout");
        r1 = null;
    L10:
        r1.setVisibility(4);
        if (this.isReachedTarget == false) goto L24;
        TextView r2 = this.exerciseNull;
        if (r2 != null) goto L15;
        Intrinsics.XXO("exerciseNull");
        r2 = null;
    L15:
        TextView r3 = this.exerciseNull;
        if (r3 != null) goto L18;
        Intrinsics.XXO("exerciseNull");
        r3 = null;
    L18:
        r2.setTextColor(gk4.iO(r3.getContext(), R.color.order_text_orange));
        TextView r4 = this.exerciseNull;
        if (r4 != null) goto L21;
        Intrinsics.XXO("exerciseNull");
    L22:
        r5.setText(UtilsKt.XXO(R.string.abh_reached_day));
        return;
    L21:
        r5 = r4;
        goto L22
    L24:
        TextView r6 = this.exerciseNull;
        if (r6 != null) goto L27;
        Intrinsics.XXO("exerciseNull");
        r6 = null;
    L27:
        TextView r7 = this.exerciseNull;
        if (r7 != null) goto L30;
        Intrinsics.XXO("exerciseNull");
        r7 = null;
    L30:
        r6.setTextColor(gk4.iO(r7.getContext(), R.color.line_color));
        TextView r8 = this.exerciseNull;
        if (r8 != null) goto L33;
        Intrinsics.XXO("exerciseNull");
    L34:
        r5.setText(UtilsKt.XXO(R.string.abh_rest_day));
        return;
    L33:
        r5 = r8;
        goto L34
    L36:
        TextView r9 = this.exerciseNull;
        if (r9 != null) goto L39;
        Intrinsics.XXO("exerciseNull");
        r9 = null;
    L39:
        r9.setVisibility(4);
        View r10 = this.exerciseLayout;
        if (r10 != null) goto L42;
        Intrinsics.XXO("exerciseLayout");
        r10 = null;
    L42:
        r10.setVisibility(0);
        TextView r11 = this.currentName;
        if (r11 != null) goto L45;
        Intrinsics.XXO("currentName");
        r11 = null;
    L45:
        r11.setText(this.mVitalityDayLesson.getLessonName());
        TextView r12 = this.currentTitle;
        if (r12 != null) goto L48;
        Intrinsics.XXO("currentTitle");
        r12 = null;
    L48:
        r12.setText(this.mVitalityDayLesson.getLessonTitle());
        TextView r13 = this.exerciseTime;
        if (r13 != null) goto L51;
        Intrinsics.XXO("exerciseTime");
    L52:
        r5.setText(this.mVitalityDayLesson.getLessonTime() + " " + UtilsKt.XXO(R.string.min));
        return;
    L51:
        r5 = r13;
        goto L52
    }

    public final boolean isReachedTarget() {
        return this.isReachedTarget;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_content_plan;
    }

    public /* synthetic */ PlanContentItem(AICoachManage.VitalityDayLesson r1, boolean r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        this(r1, r2);
    }
}
