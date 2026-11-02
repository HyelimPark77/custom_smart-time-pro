package com.sma.smartv3.p610ui.sport.course;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.p610ui.sport.course.AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n87#2,7:301\n94#2,3:309\n70#2,7:312\n97#2:319\n1#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n*L\n174#1:301,7\n174#1:309,3\n174#1:312,7\n174#1:319\n174#1:308\n*E\n"})
public final class AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1 extends CommonAdapter<CourseList> {
    public AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1(List<CourseList> list, Activity activity) {
        super(activity, R.layout.item_all_course_layout, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1 allCourseActivity$addRecyclerCourseAdapter$mAdapter$1, CourseList courseList, View view) {
        Context context = ((CommonAdapter) allCourseActivity$addRecyclerCourseAdapter$mAdapter$1).mContext;
        Intrinsics.X1ii(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        String id = courseList.getId();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", id);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", courseList);
        Intent intent = new Intent(activity, (Class<?>) CourseDetailsActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final CourseList item, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        Glide.with(((CommonAdapter) this).mContext).load(item.getCoursePic1()).into((ImageView) viewHolder.getView(R.id.course_pic));
        viewHolder.setText(R.id.course_name, item.getCourseName());
        viewHolder.setText(R.id.course_course_intro, item.getCourseDiff() + "  " + Integer.parseInt(item.getCourseTime()) + ((CommonAdapter) this).mContext.getString(R.string.minute) + "  " + item.getCourseHeat() + ((CommonAdapter) this).mContext.getString(R.string.kcal));
        viewHolder.setOnClickListener(R.id.course_recommend_layout, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1OII0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1.convert$lambda$0(this.f4304IO, item, view);
            }
        });
    }
}
