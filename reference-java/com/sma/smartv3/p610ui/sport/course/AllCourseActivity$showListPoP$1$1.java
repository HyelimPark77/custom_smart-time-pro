package com.sma.smartv3.p610ui.sport.course;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.C2421fp;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.CourSelectByType;
import com.sma.smartv3.network.GetCourSelectByType;
import com.sma.smartv3.p610ui.sport.course.AllCourseActivity$showListPoP$1$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AllCourseActivity$showListPoP$1$1 extends CommonAdapter<CourSelectByType> {
    final /* synthetic */ String $type;
    final /* synthetic */ AllCourseActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllCourseActivity$showListPoP$1$1(List<CourSelectByType> list, String str, AllCourseActivity allCourseActivity, Activity activity) {
        super(activity, R.layout.item_all_pop_tv, list);
        this.$type = str;
        this.this$0 = allCourseActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(String str, AllCourseActivity allCourseActivity, CourSelectByType courSelectByType, View view) {
        if (Intrinsics.XOO0ii0(str, GetCourSelectByType.COURSE_DIFF)) {
            allCourseActivity.setCourseDiff(courSelectByType != null ? courSelectByType.getDictValue() : null);
        } else if (Intrinsics.XOO0ii0(str, GetCourSelectByType.COURSE_PART)) {
            allCourseActivity.setCoursePart(courSelectByType != null ? courSelectByType.getDictValue() : null);
        } else {
            allCourseActivity.setCourseSortType(courSelectByType != null ? courSelectByType.getDictValue() : null);
        }
        allCourseActivity.getOnLineCourseList();
        C2421fp c2421fp = allCourseActivity.mListPop;
        if (c2421fp != null) {
            c2421fp.dismiss();
        }
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final CourSelectByType courSelectByType, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        viewHolder.setText(R.id.course_type_tv, (courSelectByType != null ? courSelectByType.getDictLabel() : null) + "   ");
        final String str = this.$type;
        final AllCourseActivity allCourseActivity = this.this$0;
        viewHolder.setOnClickListener(R.id.course_type_tv, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1I00OX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllCourseActivity$showListPoP$1$1.convert$lambda$0(str, allCourseActivity, courSelectByType, view);
            }
        });
    }
}
