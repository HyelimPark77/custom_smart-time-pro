package com.sma.smartv3.p610ui.sport.coach.guide;

import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanGoalFragment;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PlanGoalFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final Lazy llChoices$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gx1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanGoalFragment.llChoices_delegate$lambda$0(this.f6985IO);
        }
    });

    @tb1
    private CommonAdapter<String> mAdapter;

    private final RecyclerView getLlChoices() {
        return (RecyclerView) this.llChoices$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView llChoices_delegate$lambda$0(PlanGoalFragment planGoalFragment) {
        return (RecyclerView) planGoalFragment.getMView().findViewById(R.id.ll_choices);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_plan_goal;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        Pair<List<String>, List<String>> pairO10IXXX0X = AICoachManage.IiI10X.OXO1().O10IXXX0X();
        final List<String> listComponent1 = pairO10IXXX0X.component1();
        final List<String> listComponent2 = pairO10IXXX0X.component2();
        getLlChoices().setLayoutManager(new LinearLayoutManager(requireContext()));
        CommonAdapter<String> commonAdapter = new CommonAdapter<String>(getLlChoices().getContext(), CollectionsKt___CollectionsKt.i0I0O111I(listComponent1)) { // from class: com.sma.smartv3.ui.sport.coach.guide.PlanGoalFragment.onSlideSelected.1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return listComponent1.size();
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, String item, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
                viewHolder.getView(R.id.item_line_view).setVisibility(i == 0 ? 4 : 0);
                ((TextView) viewHolder.getView(R.id.tv_time)).setText(listComponent1.get(i));
                TextView textView = (TextView) viewHolder.getView(R.id.tv_value);
                textView.setText(listComponent2.get(i));
                String str = listComponent2.get(i);
                String string = this.getString(R.string.abh_mets_unit);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                if (StringsKt__StringsKt.iIi011O(str, string, false, 2, null)) {
                    textView.setTextColor(gk4.O00(this.requireActivity(), R.color.text_color));
                } else {
                    textView.setTextColor(this.getResources().getColor(R.color.line_color));
                }
            }
        };
        getLlChoices().setAdapter(commonAdapter);
        this.mAdapter = commonAdapter;
    }
}
