package com.sma.smartv3.p610ui.sport.coach.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.pro.R;
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

    public PlanContentItem(@aa1 AICoachManage.VitalityDayLesson mVitalityDayLesson, boolean z) {
        Intrinsics.X0O(mVitalityDayLesson, "mVitalityDayLesson");
        this.mVitalityDayLesson = mVitalityDayLesson;
        this.isReachedTarget = z;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.coach_content_title);
        Intrinsics.XXI(viewM3483v);
        this.currentTitle = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.coach_content_name);
        Intrinsics.XXI(viewM3483v2);
        this.currentName = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.coach_content_time);
        Intrinsics.XXI(viewM3483v3);
        this.exerciseTime = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.coach_content_iv);
        Intrinsics.XXI(viewM3483v4);
        this.currentImg = (ImageView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.coach_content_no_title);
        Intrinsics.XXI(viewM3483v5);
        this.exerciseNull = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.content_lesson_layout);
        Intrinsics.XXI(viewM3483v6);
        this.exerciseLayout = viewM3483v6;
    }

    @aa1
    public final AICoachManage.VitalityDayLesson getMVitalityDayLesson() {
        return this.mVitalityDayLesson;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView textView = null;
        if (this.mVitalityDayLesson.getLessonName().length() != 0) {
            TextView textView2 = this.exerciseNull;
            if (textView2 == null) {
                Intrinsics.XXO("exerciseNull");
                textView2 = null;
            }
            textView2.setVisibility(4);
            View view = this.exerciseLayout;
            if (view == null) {
                Intrinsics.XXO("exerciseLayout");
                view = null;
            }
            view.setVisibility(0);
            TextView textView3 = this.currentName;
            if (textView3 == null) {
                Intrinsics.XXO("currentName");
                textView3 = null;
            }
            textView3.setText(this.mVitalityDayLesson.getLessonName());
            TextView textView4 = this.currentTitle;
            if (textView4 == null) {
                Intrinsics.XXO("currentTitle");
                textView4 = null;
            }
            textView4.setText(this.mVitalityDayLesson.getLessonTitle());
            TextView textView5 = this.exerciseTime;
            if (textView5 == null) {
                Intrinsics.XXO("exerciseTime");
            } else {
                textView = textView5;
            }
            textView.setText(this.mVitalityDayLesson.getLessonTime() + " " + UtilsKt.XXO(R.string.min));
            return;
        }
        TextView textView6 = this.exerciseNull;
        if (textView6 == null) {
            Intrinsics.XXO("exerciseNull");
            textView6 = null;
        }
        textView6.setVisibility(0);
        View view2 = this.exerciseLayout;
        if (view2 == null) {
            Intrinsics.XXO("exerciseLayout");
            view2 = null;
        }
        view2.setVisibility(4);
        if (this.isReachedTarget) {
            TextView textView7 = this.exerciseNull;
            if (textView7 == null) {
                Intrinsics.XXO("exerciseNull");
                textView7 = null;
            }
            TextView textView8 = this.exerciseNull;
            if (textView8 == null) {
                Intrinsics.XXO("exerciseNull");
                textView8 = null;
            }
            textView7.setTextColor(gk4.m1859iO(textView8.getContext(), R.color.order_text_orange));
            TextView textView9 = this.exerciseNull;
            if (textView9 == null) {
                Intrinsics.XXO("exerciseNull");
            } else {
                textView = textView9;
            }
            textView.setText(UtilsKt.XXO(R.string.abh_reached_day));
            return;
        }
        TextView textView10 = this.exerciseNull;
        if (textView10 == null) {
            Intrinsics.XXO("exerciseNull");
            textView10 = null;
        }
        TextView textView11 = this.exerciseNull;
        if (textView11 == null) {
            Intrinsics.XXO("exerciseNull");
            textView11 = null;
        }
        textView10.setTextColor(gk4.m1859iO(textView11.getContext(), R.color.line_color));
        TextView textView12 = this.exerciseNull;
        if (textView12 == null) {
            Intrinsics.XXO("exerciseNull");
        } else {
            textView = textView12;
        }
        textView.setText(UtilsKt.XXO(R.string.abh_rest_day));
    }

    public final boolean isReachedTarget() {
        return this.isReachedTarget;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_content_plan;
    }

    public /* synthetic */ PlanContentItem(AICoachManage.VitalityDayLesson vitalityDayLesson, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vitalityDayLesson, (i & 2) != 0 ? false : z);
    }
}
