package com.sma.smartv3.ui.sport.course.item;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiXXII1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.CourseDetailsActivity;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFitnessSpecialItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessSpecialItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public class FitnessSpecialItem extends BaseDslItem {

    @tb1
    private CommonAdapter<CourseList> mAdapter;
    public Context mContext;

    @aa1
    private List<CourseList> mListData;
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.item.FitnessSpecialItem$bindView$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nFitnessSpecialItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessSpecialItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem$bindView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n87#2,7:90\n94#2,3:98\n70#2,7:101\n97#2:108\n1#3:97\n*S KotlinDebug\n*F\n+ 1 FitnessSpecialItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem$bindView$1\n*L\n76#1:90,7\n76#1:98,3\n76#1:101,7\n76#1:108\n76#1:97\n*E\n"})
    public static final class AnonymousClass1 extends CommonAdapter<CourseList> {
        public AnonymousClass1(Context r2, List<CourseList> r3) {
            super(r2, R.layout.item_special_course, r3);
        }

        public static /* synthetic */ void OXO1(AnonymousClass1 r0, CourseList r1, View r2) {
            convert$lambda$0(r0, r1, r2);
        }

        private static final void convert$lambda$0(AnonymousClass1 r2, CourseList r3, View r4) {
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
        public void convert2(ViewHolder r5, final CourseList r6, int r7) {
            Intrinsics.X0O(r5, "viewHolder");
            Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
            if (r7 != 0) goto L5;
            r5.getView(R.id.item_special_course_view).setVisibility(8);
        L5:
            Glide.with(this.mContext).load(r6.getCoursePic2()).into((ImageView) r5.getView(R.id.item_special_course_pic));
            r5.setText(R.id.item_special_course_name, r6.getCourseName());
            r5.setText(R.id.tv_course_class, r6.getCourseClass() + UtilsKt.XXO(R.string.people_join));
            r5.setText(R.id.item_special_course_intro, r6.getCourseDiff() + this.mContext.getString(R.string.d_minutes, new Object[]{Integer.valueOf(Integer.parseInt(r6.getCourseTime()))}) + "  " + r6.getCourseHeat() + this.mContext.getString(R.string.kcal));
            r5.setOnClickListener(R.id.item_special_course_layout, new iiXXII1O(this, r6));
        }
    }

    public FitnessSpecialItem(@tb1 List<CourseList> r3) {
        if (r3 != null) goto L5;
    L8:
        Intrinsics.XXI(r3);
        this.mListData = r3;
        return;
    L5:
        if (r3.isEmpty() != true) goto L8;
        this.mListData = new ArrayList();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        View r6 = r5.v(R.id.fitness_item_special_recycler);
        Intrinsics.XXI(r6);
        RecyclerView r7 = (RecyclerView) r6;
        this.mRecyclerView = r7;
        RecyclerView r0 = null;
        if (r7 != null) goto L5;
        Intrinsics.XXO("mRecyclerView");
        r7 = null;
    L5:
        Context r8 = r7.getContext();
        Intrinsics.O10IXXX0X(r8, "getContext(...)");
        setMContext(r8);
        RecyclerView r9 = this.mRecyclerView;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mRecyclerView");
        r9 = null;
    L8:
        r9.setLayoutManager(new LinearLayoutManager(getMContext()));
        AnonymousClass1 r3 = new AnonymousClass1(getMContext(), this.mListData);
        RecyclerView r10 = this.mRecyclerView;
        if (r10 != null) goto L11;
        Intrinsics.XXO("mRecyclerView");
    L12:
        r0.setAdapter(r3);
        this.mAdapter = r3;
        return;
    L11:
        r0 = r10;
        goto L12
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final List<CourseList> getMListData() {
        return this.mListData;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.fitness_item_special;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@aa1 List<CourseList> r2) {
        Intrinsics.X0O(r2, "list");
        this.mListData = r2;
        CommonAdapter<CourseList> r3 = this.mAdapter;
        if (r3 == null) goto L6;
        r3.notifyDataSetChanged();
        return;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setMListData(@aa1 List<CourseList> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mListData = r2;
    }
}
