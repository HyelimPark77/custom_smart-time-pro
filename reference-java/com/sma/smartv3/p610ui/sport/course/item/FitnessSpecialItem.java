package com.sma.smartv3.p610ui.sport.course.item;

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
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.p610ui.sport.course.CourseDetailsActivity;
import com.sma.smartv3.p610ui.sport.course.item.FitnessSpecialItem;
import com.sma.smartv3.pro.R;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.item.FitnessSpecialItem$bindView$1 */
    @SourceDebugExtension({"SMAP\nFitnessSpecialItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessSpecialItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem$bindView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n87#2,7:90\n94#2,3:98\n70#2,7:101\n97#2:108\n1#3:97\n*S KotlinDebug\n*F\n+ 1 FitnessSpecialItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem$bindView$1\n*L\n76#1:90,7\n76#1:98,3\n76#1:101,7\n76#1:108\n76#1:97\n*E\n"})
    public static final class C189751 extends CommonAdapter<CourseList> {
        public C189751(Context context, List<CourseList> list) {
            super(context, R.layout.item_special_course, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C189751 c189751, CourseList courseList, View view) {
            Context context = ((CommonAdapter) c189751).mContext;
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
            if (i == 0) {
                viewHolder.getView(R.id.item_special_course_view).setVisibility(8);
            }
            Glide.with(((CommonAdapter) this).mContext).load(item.getCoursePic2()).into((ImageView) viewHolder.getView(R.id.item_special_course_pic));
            viewHolder.setText(R.id.item_special_course_name, item.getCourseName());
            viewHolder.setText(R.id.tv_course_class, item.getCourseClass() + UtilsKt.XXO(R.string.people_join));
            viewHolder.setText(R.id.item_special_course_intro, item.getCourseDiff() + ((CommonAdapter) this).mContext.getString(R.string.d_minutes, Integer.valueOf(Integer.parseInt(item.getCourseTime()))) + "  " + item.getCourseHeat() + ((CommonAdapter) this).mContext.getString(R.string.kcal));
            viewHolder.setOnClickListener(R.id.item_special_course_layout, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiXXII1O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FitnessSpecialItem.C189751.convert$lambda$0(this.f8650IO, item, view);
                }
            });
        }
    }

    public FitnessSpecialItem(@tb1 List<CourseList> list) {
        if (list != null && list.isEmpty()) {
            this.mListData = new ArrayList();
        } else {
            Intrinsics.XXI(list);
            this.mListData = list;
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.fitness_item_special_recycler);
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
        recyclerView3.setLayoutManager(new LinearLayoutManager(getMContext()));
        C189751 c189751 = new C189751(getMContext(), this.mListData);
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.XXO("mRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setAdapter(c189751);
        this.mAdapter = c189751;
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
    public final void setData(@aa1 List<CourseList> list) {
        Intrinsics.X0O(list, "list");
        this.mListData = list;
        CommonAdapter<CourseList> commonAdapter = this.mAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMListData(@aa1 List<CourseList> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mListData = list;
    }
}
