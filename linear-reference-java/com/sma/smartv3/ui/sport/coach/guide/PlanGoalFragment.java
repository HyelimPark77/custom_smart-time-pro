package com.sma.smartv3.ui.sport.coach.guide;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gx1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PlanGoalFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final Lazy llChoices$delegate;

    @tb1
    private CommonAdapter<String> mAdapter;

    public PlanGoalFragment() {
        this.llChoices$delegate = LazyKt__LazyJVMKt.iO(new gx1(this));
    }

    public static /* synthetic */ RecyclerView XIi00iiXO(PlanGoalFragment r0) {
        return llChoices_delegate$lambda$0(r0);
    }

    private final RecyclerView getLlChoices() {
        return (RecyclerView) getValue();
    }

    private static final RecyclerView llChoices_delegate$lambda$0(PlanGoalFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.ll_choices);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_plan_goal;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        Pair<List<String>, List<String>> r0 = AICoachManage.IiI10X.OXO1().O10IXXX0X();
        final List<String> r3 = r0.component1();
        final List<String> r4 = r0.component2();
        getLlChoices().setLayoutManager(new LinearLayoutManager(requireContext()));
        final Context r6 = getLlChoices().getContext();
        final List r7 = CollectionsKt___CollectionsKt.i0I0O111I(r3);
        CommonAdapter<String> r2 = new AnonymousClass1(r3, r4, this, r6, r7);
        getLlChoices().setAdapter(r2);
        this.mAdapter = r2;
    }
}
