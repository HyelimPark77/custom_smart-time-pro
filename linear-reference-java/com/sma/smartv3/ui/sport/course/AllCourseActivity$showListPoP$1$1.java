package com.sma.smartv3.ui.sport.course;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.X1I00OX0;
import com.android.mltcode.paycertificationapi.fp;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.CourSelectByType;
import com.sma.smartv3.network.GetCourSelectByType;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AllCourseActivity$showListPoP$1$1 extends CommonAdapter<CourSelectByType> {
    final /* synthetic */ String $type;
    final /* synthetic */ AllCourseActivity this$0;

    public AllCourseActivity$showListPoP$1$1(List<CourSelectByType> r1, String r2, AllCourseActivity r3, Activity r4) {
        this.$type = r2;
        this.this$0 = r3;
        super(r4, R.layout.item_all_pop_tv, r1);
    }

    public static /* synthetic */ void OXO1(String r0, AllCourseActivity r1, CourSelectByType r2, View r3) {
        convert$lambda$0(r0, r1, r2, r3);
    }

    private static final void convert$lambda$0(String r1, AllCourseActivity r2, CourSelectByType r3, View r4) {
        String r0 = null;
        if (Intrinsics.XOO0ii0(r1, GetCourSelectByType.COURSE_DIFF) == false) goto L8;
        if (r3 == null) goto L6;
        r0 = r3.getDictValue();
    L6:
        r2.setCourseDiff(r0);
    L15:
        r2.getOnLineCourseList();
        fp r5 = AllCourseActivity.access$getMListPop$p(r2);
        if (r5 == null) goto L19;
        r5.dismiss();
        return;
    L19:
        return;
    L8:
        if (Intrinsics.XOO0ii0(r1, GetCourSelectByType.COURSE_PART) == false) goto L12;
        if (r3 == null) goto L11;
        r0 = r3.getDictValue();
    L11:
        r2.setCoursePart(r0);
        goto L15
    L12:
        if (r3 == null) goto L14;
        r0 = r3.getDictValue();
    L14:
        r2.setCourseSortType(r0);
        goto L15
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, CourSelectByType r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r4, final CourSelectByType r5, int r6) {
        Intrinsics.X0O(r4, "viewHolder");
        if (r5 == null) goto L5;
        String r7 = r5.getDictLabel();
    L6:
        r4.setText(R.id.course_type_tv, r7 + "   ");
        final String r8 = this.$type;
        final AllCourseActivity r1 = this.this$0;
        r4.setOnClickListener(R.id.course_type_tv, new X1I00OX0(r8, r1, r5));
        return;
    L5:
        r7 = null;
        goto L6
    }
}
