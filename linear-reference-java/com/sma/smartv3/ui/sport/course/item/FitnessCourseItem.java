package com.sma.smartv3.ui.sport.course.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.OX10OO11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i11I11I1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.AllCourseActivity;
import com.sma.smartv3.ui.sport.course.MyCourseActivity;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFitnessCourseItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessCourseItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessCourseItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public class FitnessCourseItem extends BaseDslItem {
    public Context mContext;
    private RecyclerView mRecyclerView;

    public FitnessCourseItem() {
    }

    public static /* synthetic */ void IiI10X(FitnessCourseItem r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void O00(FitnessCourseItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    private static final void bindView$lambda$1(FitnessCourseItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), MyCourseActivity.class));
    }

    private static final void bindView$lambda$2(FitnessCourseItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), AllCourseActivity.class));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r8) {
        Intrinsics.X0O(r8, "itemHolder");
        View r0 = r8.v(R.id.my_course_recyclerView);
        Intrinsics.XXI(r0);
        RecyclerView r1 = (RecyclerView) r0;
        this.mRecyclerView = r1;
        RecyclerView r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mRecyclerView");
        r1 = null;
    L5:
        Context r3 = r1.getContext();
        Intrinsics.O10IXXX0X(r3, "getContext(...)");
        setMContext(r3);
        RecyclerView r4 = this.mRecyclerView;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mRecyclerView");
        r4 = null;
    L8:
        r4.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        final Context r5 = getMContext();
        final ArrayList r6 = CollectionsKt__CollectionsKt.iIiiO(new String[]{"111", "222", "333", "444"});
        CommonAdapter<String> r7 = new FitnessCourseItem$bindView$mAdapter$1(r5, r6);
        RecyclerView r9 = this.mRecyclerView;
        if (r9 != null) goto L11;
        Intrinsics.XXO("mRecyclerView");
    L12:
        r2.setAdapter(r7);
        r8.click(R.id.go_to_my_course, new i11I11I1(this));
        r8.click(R.id.fitness_item_all_course, new OX10OO11(this));
        return;
    L11:
        r2 = r9;
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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.fitness_item_course;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
