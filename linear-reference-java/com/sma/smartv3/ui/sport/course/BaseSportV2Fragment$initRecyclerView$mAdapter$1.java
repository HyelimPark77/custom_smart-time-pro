package com.sma.smartv3.ui.sport.course;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IX111O0IO;
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
@SourceDebugExtension({"SMAP\nBaseSportV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment$initRecyclerView$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n87#2,7:224\n94#2,3:232\n70#2,7:235\n97#2:242\n1#3:231\n*S KotlinDebug\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment$initRecyclerView$mAdapter$1\n*L\n212#1:224,7\n212#1:232,3\n212#1:235,7\n212#1:242\n212#1:231\n*E\n"})
public final class BaseSportV2Fragment$initRecyclerView$mAdapter$1 extends CommonAdapter<CourseList> {
    final /* synthetic */ BaseSportV2Fragment this$0;

    public BaseSportV2Fragment$initRecyclerView$mAdapter$1(BaseSportV2Fragment r1, FragmentActivity r2, List<CourseList> r3) {
        this.this$0 = r1;
        super(r2, R.layout.item_special_course, r3);
    }

    public static /* synthetic */ void OXO1(BaseSportV2Fragment$initRecyclerView$mAdapter$1 r0, CourseList r1, View r2) {
        convert$lambda$0(r0, r1, r2);
    }

    private static final void convert$lambda$0(BaseSportV2Fragment$initRecyclerView$mAdapter$1 r2, CourseList r3, View r4) {
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
        if (r8 != 0) goto L6;
        r6.getView(R.id.item_special_course_view).setVisibility(8);
    L6:
        if (r7.getCoursePic2().length() <= 0) goto L8;
        Glide.with(this.mContext).load(r7.getCoursePic2()).into((ImageView) r6.getView(R.id.item_special_course_pic));
    L8:
        r6.setText(R.id.item_special_course_name, r7.getCourseName());
        r6.setText(R.id.item_special_course_intro, r7.getCourseDiff() + "  " + (Integer.parseInt(r7.getCourseTime()) / 60) + this.this$0.getString(R.string.minute) + "  " + r7.getCourseHeat() + this.this$0.getString(R.string.kcal));
        r6.setOnClickListener(R.id.item_special_course_layout, new IX111O0IO(this, r7));
    }
}
