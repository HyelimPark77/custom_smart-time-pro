package com.sma.smartv3.ui.sport.course;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.X1OII0;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n87#2,7:301\n94#2,3:309\n70#2,7:312\n97#2:319\n1#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n*L\n174#1:301,7\n174#1:309,3\n174#1:312,7\n174#1:319\n174#1:308\n*E\n"})
public final class AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1 extends CommonAdapter<CourseList> {
    public AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1(List<CourseList> r2, Activity r3) {
        super(r3, R.layout.item_all_course_layout, r2);
    }

    public static /* synthetic */ void OXO1(AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1 r0, CourseList r1, View r2) {
        convert$lambda$0(r0, r1, r2);
    }

    private static final void convert$lambda$0(AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1 r2, CourseList r3, View r4) {
        Context r5 = r2.mContext;
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.app.Activity");
        Activity r6 = (Activity) r5;
        String r7 = r3.getId();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r7);
        r0.putInt("mArg1", 0);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r3);
        Intent r8 = new Intent(r6, CourseDetailsActivity.class);
        r8.putExtras(r0);
        r6.startActivity(r8);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, CourseList r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r6, final CourseList r7, int r8) {
        Intrinsics.X0O(r6, "viewHolder");
        Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
        Glide.with(this.mContext).load(r7.getCoursePic1()).into((ImageView) r6.getView(R.id.course_pic));
        r6.setText(R.id.course_name, r7.getCourseName());
        r6.setText(R.id.course_course_intro, r7.getCourseDiff() + "  " + Integer.parseInt(r7.getCourseTime()) + this.mContext.getString(R.string.minute) + "  " + r7.getCourseHeat() + this.mContext.getString(R.string.kcal));
        r6.setOnClickListener(R.id.course_recommend_layout, new X1OII0(this, r7));
    }
}
