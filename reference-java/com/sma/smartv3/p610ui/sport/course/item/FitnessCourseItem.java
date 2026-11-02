package com.sma.smartv3.p610ui.sport.course.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.p610ui.sport.course.AllCourseActivity;
import com.sma.smartv3.p610ui.sport.course.MyCourseActivity;
import com.sma.smartv3.p610ui.sport.course.item.FitnessCourseItem;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFitnessCourseItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessCourseItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessCourseItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public class FitnessCourseItem extends BaseDslItem {
    public Context mContext;
    private RecyclerView mRecyclerView;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(FitnessCourseItem fitnessCourseItem, View view) {
        fitnessCourseItem.getMContext().startActivity(new Intent(fitnessCourseItem.getMContext(), (Class<?>) MyCourseActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(FitnessCourseItem fitnessCourseItem, View view) {
        fitnessCourseItem.getMContext().startActivity(new Intent(fitnessCourseItem.getMContext(), (Class<?>) AllCourseActivity.class));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.my_course_recyclerView);
        Intrinsics.XXI(viewM3483v);
        RecyclerView recyclerView = (RecyclerView) viewM3483v;
        this.mRecyclerView = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView = null;
        }
        Context context = recyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        final Context mContext = getMContext();
        final ArrayList arrayListIIiiO = CollectionsKt__CollectionsKt.iIiiO("111", "222", "333", "444");
        CommonAdapter<String> commonAdapter = new CommonAdapter<String>(mContext, arrayListIIiiO) { // from class: com.sma.smartv3.ui.sport.course.item.FitnessCourseItem$bindView$mAdapter$1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, String item, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
            }
        };
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.XXO("mRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setAdapter(commonAdapter);
        itemHolder.click(R.id.go_to_my_course, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i11I11I1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessCourseItem.bindView$lambda$1(this.f7539IO, view);
            }
        });
        itemHolder.click(R.id.fitness_item_all_course, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OX10OO11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessCourseItem.bindView$lambda$2(this.f3425IO, view);
            }
        });
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
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

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
