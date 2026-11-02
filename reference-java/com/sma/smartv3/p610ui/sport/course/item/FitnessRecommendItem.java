package com.sma.smartv3.p610ui.sport.course.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.RecommendSearch;
import com.sma.smartv3.p610ui.sport.course.item.FitnessRecommendItem;
import com.sma.smartv3.p610ui.sport.course.model.CourseViewModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public class FitnessRecommendItem extends BaseDslItem {
    public Context mContext;
    private RecyclerView mRecyclerViewFirst;
    private RecyclerView mRecyclerViewSecond;
    private PFMedium tvTitle;
    private PFMedium tvTitle2;

    @aa1
    private final CourseViewModel viewModel = (CourseViewModel) new ViewModelProvider.NewInstanceFactory().create(CourseViewModel.class);

    @aa1
    private final List<Integer> mFirstColors = CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(Color.parseColor("#444444")), Integer.valueOf(Color.parseColor("#E9BC6A")), Integer.valueOf(Color.parseColor("#8C6EB2")));

    @aa1
    private final List<Integer> mSecondColors = CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(Color.parseColor("#8C6EB2")), Integer.valueOf(Color.parseColor("#FF882B")), Integer.valueOf(Color.parseColor("#444444")));

    public static final class OXO1 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54795IO;

        public OXO1(Function1 function) {
            Intrinsics.X0O(function, "function");
            this.f54795IO = function;
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f54795IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54795IO.invoke2(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(FitnessRecommendItem fitnessRecommendItem, DslViewHolder dslViewHolder, ArrayList arrayList) {
        if (arrayList != null) {
            PFMedium pFMedium = null;
            if (arrayList.size() > 0) {
                RecyclerView recyclerView = fitnessRecommendItem.mRecyclerViewFirst;
                if (recyclerView == null) {
                    Intrinsics.XXO("mRecyclerViewFirst");
                    recyclerView = null;
                }
                Object obj = arrayList.get(0);
                Intrinsics.O10IXXX0X(obj, "get(...)");
                RecommendSearch recommendSearch = (RecommendSearch) obj;
                PFMedium pFMedium2 = fitnessRecommendItem.tvTitle;
                if (pFMedium2 == null) {
                    Intrinsics.XXO("tvTitle");
                    pFMedium2 = null;
                }
                fitnessRecommendItem.addRecyclerAdapter(recyclerView, 0, recommendSearch, pFMedium2);
            } else {
                PFMedium pFMedium3 = fitnessRecommendItem.tvTitle;
                if (pFMedium3 == null) {
                    Intrinsics.XXO("tvTitle");
                    pFMedium3 = null;
                }
                pFMedium3.setVisibility(8);
                dslViewHolder.itemView.setVisibility(8);
            }
            if (arrayList.size() > 1) {
                RecyclerView recyclerView2 = fitnessRecommendItem.mRecyclerViewSecond;
                if (recyclerView2 == null) {
                    Intrinsics.XXO("mRecyclerViewSecond");
                    recyclerView2 = null;
                }
                Object obj2 = arrayList.get(1);
                Intrinsics.O10IXXX0X(obj2, "get(...)");
                RecommendSearch recommendSearch2 = (RecommendSearch) obj2;
                PFMedium pFMedium4 = fitnessRecommendItem.tvTitle2;
                if (pFMedium4 == null) {
                    Intrinsics.XXO("tvTitle2");
                } else {
                    pFMedium = pFMedium4;
                }
                fitnessRecommendItem.addRecyclerAdapter(recyclerView2, 1, recommendSearch2, pFMedium);
            } else {
                PFMedium pFMedium5 = fitnessRecommendItem.tvTitle2;
                if (pFMedium5 == null) {
                    Intrinsics.XXO("tvTitle2");
                } else {
                    pFMedium = pFMedium5;
                }
                pFMedium.setVisibility(8);
            }
        }
        return Unit.OXO1;
    }

    public final void addRecyclerAdapter(@aa1 RecyclerView mRecyclerView, int i, @aa1 RecommendSearch recommendSearch, @aa1 PFMedium tvTitle) {
        Intrinsics.X0O(mRecyclerView, "mRecyclerView");
        Intrinsics.X0O(recommendSearch, "recommendSearch");
        Intrinsics.X0O(tvTitle, "tvTitle");
        tvTitle.setText(recommendSearch.getRecommendTitle());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        mRecyclerView.setAdapter(new FitnessRecommendItem$addRecyclerAdapter$mAdapter$1(this, i, getMContext(), recommendSearch.getCourseRecommendList()));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        Intrinsics.X1ii(textViewM3482tv, "null cannot be cast to non-null type com.sma.smartv3.view.text.PFMedium");
        this.tvTitle = (PFMedium) textViewM3482tv;
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_title2);
        Intrinsics.X1ii(textViewM3482tv2, "null cannot be cast to non-null type com.sma.smartv3.view.text.PFMedium");
        this.tvTitle2 = (PFMedium) textViewM3482tv2;
        View viewM3483v = itemHolder.m3483v(R.id.item_recommend_recycler_first);
        Intrinsics.XXI(viewM3483v);
        this.mRecyclerViewFirst = (RecyclerView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.item_recommend_recycler_second);
        Intrinsics.XXI(viewM3483v2);
        this.mRecyclerViewSecond = (RecyclerView) viewM3483v2;
        RecyclerView recyclerView = this.mRecyclerViewFirst;
        if (recyclerView == null) {
            Intrinsics.XXO("mRecyclerViewFirst");
            recyclerView = null;
        }
        Context context = recyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        this.viewModel.getData();
        this.viewModel.getCourseLiveData().observe(this, new OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIXiiXIX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FitnessRecommendItem.bindView$lambda$0(this.f1682IO, itemHolder, (ArrayList) obj);
            }
        }));
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
    public final List<Integer> getMFirstColors() {
        return this.mFirstColors;
    }

    @aa1
    public final List<Integer> getMSecondColors() {
        return this.mSecondColors;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.fitness_item_recommend;
    }

    @aa1
    public final GradientDrawable setBackgroundResource(int i, int i2) {
        List<Integer> list = i2 == 0 ? this.mFirstColors : this.mSecondColors;
        int iIntValue = list.get(i % list.size()).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(CollectionsKt___CollectionsKt.O011OOIO0(CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(iIntValue), 0)));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientRadius(SizeUtils.dp2px(10.0f));
        return gradientDrawable;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
