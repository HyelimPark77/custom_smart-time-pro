package com.sma.smartv3.ui.sport.course.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IIXiiXIX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.RecommendSearch;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.model.CourseViewModel;
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

    @aa1
    private final List<Integer> mFirstColors;
    private RecyclerView mRecyclerViewFirst;
    private RecyclerView mRecyclerViewSecond;

    @aa1
    private final List<Integer> mSecondColors;
    private PFMedium tvTitle;
    private PFMedium tvTitle2;

    @aa1
    private final CourseViewModel viewModel;

    public static final class OXO1 implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 IO;

        public OXO1(Function1 r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof Observer) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object r2) {
            invoke(r2);
        }
    }

    public FitnessRecommendItem() {
        this.viewModel = (CourseViewModel) new ViewModelProvider.NewInstanceFactory().create(CourseViewModel.class);
        this.mFirstColors = CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(Color.parseColor("#444444")), Integer.valueOf(Color.parseColor("#E9BC6A")), Integer.valueOf(Color.parseColor("#8C6EB2"))});
        this.mSecondColors = CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(Color.parseColor("#8C6EB2")), Integer.valueOf(Color.parseColor("#FF882B")), Integer.valueOf(Color.parseColor("#444444"))});
    }

    public static /* synthetic */ Unit O00(FitnessRecommendItem r0, DslViewHolder r1, ArrayList r2) {
        return bindView$lambda$0(r0, r1, r2);
    }

    private static final Unit bindView$lambda$0(FitnessRecommendItem r7, DslViewHolder r8, ArrayList r9) {
        if (r9 == null) goto L32;
        PFMedium r4 = null;
        if (r9.size() <= 0) goto L12;
        RecyclerView r10 = r7.mRecyclerViewFirst;
        if (r10 != null) goto L8;
        Intrinsics.XXO("mRecyclerViewFirst");
        r10 = null;
    L8:
        Object r5 = r9.get(0);
        Intrinsics.O10IXXX0X(r5, "get(...)");
        RecommendSearch r6 = (RecommendSearch) r5;
        PFMedium r11 = r7.tvTitle;
        if (r11 != null) goto L11;
        Intrinsics.XXO("tvTitle");
        r11 = null;
    L11:
        r7.addRecyclerAdapter(r10, 0, r6, r11);
    L17:
        if (r9.size() <= 1) goto L26;
        RecyclerView r12 = r7.mRecyclerViewSecond;
        if (r12 != null) goto L21;
        Intrinsics.XXO("mRecyclerViewSecond");
        r12 = null;
    L21:
        Object r13 = r9.get(1);
        Intrinsics.O10IXXX0X(r13, "get(...)");
        RecommendSearch r14 = (RecommendSearch) r13;
        PFMedium r2 = r7.tvTitle2;
        if (r2 != null) goto L24;
        Intrinsics.XXO("tvTitle2");
    L25:
        r7.addRecyclerAdapter(r12, 1, r14, r4);
        goto L32
    L24:
        r4 = r2;
        goto L25
    L26:
        PFMedium r15 = r7.tvTitle2;
        if (r15 != null) goto L29;
        Intrinsics.XXO("tvTitle2");
    L30:
        r4.setVisibility(8);
        goto L32
    L29:
        r4 = r15;
        goto L30
    L12:
        PFMedium r0 = r7.tvTitle;
        if (r0 != null) goto L15;
        Intrinsics.XXO("tvTitle");
        r0 = null;
    L15:
        r0.setVisibility(8);
        r8.itemView.setVisibility(8);
    L32:
        return Unit.OXO1;
    }

    public final void addRecyclerAdapter(@aa1 RecyclerView r3, int r4, @aa1 RecommendSearch r5, @aa1 PFMedium r6) {
        Intrinsics.X0O(r3, "mRecyclerView");
        Intrinsics.X0O(r5, "recommendSearch");
        Intrinsics.X0O(r6, "tvTitle");
        r6.setText(r5.getRecommendTitle());
        r3.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        r3.setAdapter(new FitnessRecommendItem$addRecyclerAdapter$mAdapter$1(this, r4, getMContext(), r5.getCourseRecommendList()));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        TextView r0 = r3.tv(R.id.tv_title);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.view.text.PFMedium");
        this.tvTitle = (PFMedium) r0;
        TextView r1 = r3.tv(R.id.tv_title2);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.text.PFMedium");
        this.tvTitle2 = (PFMedium) r1;
        View r2 = r3.v(R.id.item_recommend_recycler_first);
        Intrinsics.XXI(r2);
        this.mRecyclerViewFirst = (RecyclerView) r2;
        View r4 = r3.v(R.id.item_recommend_recycler_second);
        Intrinsics.XXI(r4);
        this.mRecyclerViewSecond = (RecyclerView) r4;
        RecyclerView r5 = this.mRecyclerViewFirst;
        if (r5 != null) goto L5;
        Intrinsics.XXO("mRecyclerViewFirst");
        r5 = null;
    L5:
        Context r6 = r5.getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        setMContext(r6);
        this.viewModel.getData();
        this.viewModel.getCourseLiveData().observe(this, new OXO1(new IIXiiXIX(this, r3)));
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
    public final GradientDrawable setBackgroundResource(int r3, int r4) {
        if (r4 != 0) goto L5;
        List<Integer> r5 = this.mFirstColors;
    L4:
        int r6 = r5.get(r3 % r5.size()).intValue();
        GradientDrawable r7 = new GradientDrawable();
        r7.setShape(0);
        r7.setColors(CollectionsKt___CollectionsKt.O011OOIO0(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(r6), 0})));
        r7.setGradientType(0);
        r7.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        r7.setGradientRadius(SizeUtils.dp2px(10.0f));
        return r7;
    L5:
        r5 = this.mSecondColors;
        goto L4
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
