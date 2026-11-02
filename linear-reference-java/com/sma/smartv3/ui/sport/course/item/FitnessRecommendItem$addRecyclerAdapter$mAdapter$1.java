package com.sma.smartv3.ui.sport.course.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.OX0O1XiI;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.CourseRecommendList;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.CourseDetailsActivity;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n87#2,7:143\n94#2,3:151\n70#2,7:154\n97#2:161\n1#3:150\n*S KotlinDebug\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n*L\n105#1:143,7\n105#1:151,3\n105#1:154,7\n105#1:161\n105#1:150\n*E\n"})
public final class FitnessRecommendItem$addRecyclerAdapter$mAdapter$1 extends CommonAdapter<CourseRecommendList> {
    final /* synthetic */ int $type;
    final /* synthetic */ FitnessRecommendItem this$0;

    public FitnessRecommendItem$addRecyclerAdapter$mAdapter$1(FitnessRecommendItem r1, int r2, Context r3, ArrayList<CourseRecommendList> r4) {
        this.this$0 = r1;
        this.$type = r2;
        super(r3, R.layout.item_horizontal_course_recommend, r4);
    }

    public static /* synthetic */ void OXO1(FitnessRecommendItem$addRecyclerAdapter$mAdapter$1 r0, CourseRecommendList r1, View r2) {
        convert$lambda$0(r0, r1, r2);
    }

    private static final void convert$lambda$0(FitnessRecommendItem$addRecyclerAdapter$mAdapter$1 r2, CourseRecommendList r3, View r4) {
        Context r5 = r2.mContext;
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.app.Activity");
        Activity r6 = (Activity) r5;
        String r7 = r2.mContext.getString(R.string.featured_courses);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        r3.setCourseTitle(r7);
        String r8 = r3.getCourse().getId();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putInt("mArg1", 1);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r3);
        Intent r9 = new Intent(r6, CourseDetailsActivity.class);
        r9.putExtras(r0);
        r6.startActivity(r9);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, CourseRecommendList r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r5, final CourseRecommendList r6, int r7) {
        Intrinsics.X0O(r5, "viewHolder");
        Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
        r5.getView(R.id.course_recommend_layout_view).setBackground(this.this$0.setBackgroundResource(r7, this.$type));
        Glide.with(this.mContext).load(r6.getCourse().getCoursePic1()).into((ImageView) r5.getView(R.id.course_recommend_icon));
        r5.setText(R.id.tv_course_class, r6.getCourse().getCourseClass() + UtilsKt.XXO(R.string.people_join));
        r5.setText(R.id.item_special_course_name, r6.getCourse().getCourseName());
        r5.setText(R.id.item_special_course_intro, r6.getCourse().getCourseDiff() + this.mContext.getString(R.string.d_minutes, new Object[]{Integer.valueOf(Integer.parseInt(r6.getCourse().getCourseTime()))}) + "  " + r6.getCourse().getCourseHeat() + this.mContext.getString(R.string.kcal));
        r5.setOnClickListener(R.id.course_recommend_layout, new OX0O1XiI(this, r6));
    }
}
