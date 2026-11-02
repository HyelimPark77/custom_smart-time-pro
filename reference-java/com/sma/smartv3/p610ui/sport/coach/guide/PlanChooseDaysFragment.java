package com.sma.smartv3.p610ui.sport.coach.guide;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanChooseDaysFragment;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlanChooseDaysFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n13854#2,2:107\n13940#2,3:109\n*S KotlinDebug\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n*L\n88#1:107,2\n97#1:109,3\n*E\n"})
public final class PlanChooseDaysFragment extends BaseFragment implements SlideSelectionListener {

    @tb1
    private CommonAdapter<String> mAdapter;

    @aa1
    private final Lazy llChoices$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanChooseDaysFragment.llChoices_delegate$lambda$0(this.f6975IO);
        }
    });

    @aa1
    private final Lazy mTipTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanChooseDaysFragment.mTipTitle_delegate$lambda$0(this.f7221IO);
        }
    });

    @aa1
    private final boolean[] mChooseActivity = {false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.coach.guide.PlanChooseDaysFragment$initView$1 */
    public static final class C189691 extends CommonAdapter<String> {
        final /* synthetic */ String[] $mChoices;
        final /* synthetic */ PlanChooseDaysFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189691(String[] strArr, PlanChooseDaysFragment planChooseDaysFragment, Context context, List<String> list) {
            super(context, R.layout.item_pop_multi_left_round, list);
            this.$mChoices = strArr;
            this.this$0 = planChooseDaysFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(PlanChooseDaysFragment planChooseDaysFragment, int i, ViewHolder viewHolder, View view) {
            if (planChooseDaysFragment.mChooseActivity[i]) {
                planChooseDaysFragment.mChooseActivity[i] = false;
                ((CheckBox) viewHolder.getView(R.id.checkbox)).setChecked(false);
            } else {
                planChooseDaysFragment.mChooseActivity[i] = true;
                ((CheckBox) viewHolder.getView(R.id.checkbox)).setChecked(true);
            }
            I01XX0.OXO1(I01XX0.IOIi00, Integer.valueOf(planChooseDaysFragment.getChoicesSize()));
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.$mChoices.length;
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(final ViewHolder viewHolder, String item, final int i) {
            Intrinsics.X0O(viewHolder, "viewHolder");
            Intrinsics.X0O(item, "item");
            viewHolder.getView(R.id.item_line_view).setVisibility(i == 0 ? 4 : 0);
            ((TextView) viewHolder.getView(R.id.tv_value)).setText(this.$mChoices[i]);
            ((CheckBox) viewHolder.getView(R.id.checkbox)).setChecked(this.this$0.mChooseActivity[i]);
            View view = viewHolder.itemView;
            final PlanChooseDaysFragment planChooseDaysFragment = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iw1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlanChooseDaysFragment.C189691.convert$lambda$0(planChooseDaysFragment, i, viewHolder, view2);
                }
            });
        }
    }

    private final RecyclerView getLlChoices() {
        return (RecyclerView) this.llChoices$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView llChoices_delegate$lambda$0(PlanChooseDaysFragment planChooseDaysFragment) {
        return (RecyclerView) planChooseDaysFragment.getMView().findViewById(R.id.ll_choices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTipTitle_delegate$lambda$0(PlanChooseDaysFragment planChooseDaysFragment) {
        return (TextView) planChooseDaysFragment.getMView().findViewById(R.id.start_title_tv);
    }

    public final int getChoicesSize() {
        int i = 0;
        for (boolean z : this.mChooseActivity) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public final TextView getMTipTitle() {
        return (TextView) this.mTipTitle$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String[] strArr = {getString(R.string.weekday7_s), getString(R.string.weekday1_s), getString(R.string.weekday2_s), getString(R.string.weekday3_s), getString(R.string.weekday4_s), getString(R.string.weekday5_s), getString(R.string.weekday6_s)};
        getLlChoices().setLayoutManager(new LinearLayoutManager(requireContext()));
        C189691 c189691 = new C189691(strArr, this, getLlChoices().getContext(), ArraysKt___ArraysKt.iO0XiOIi(strArr));
        getLlChoices().setAdapter(c189691);
        this.mAdapter = c189691;
        CharSequence text = getMTipTitle().getText();
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(gk4.m1859iO(getMTipTitle().getContext(), R.color.text_color));
        Intrinsics.XXI(text);
        String string = getString(R.string.next);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        int iOO1101010 = StringsKt__StringsKt.OO1101010(text, string, 0, false, 6, null) - 1;
        spannableString.setSpan(foregroundColorSpan, iOO1101010, getString(R.string.next).length() + iOO1101010 + 1, 33);
        getMTipTitle().setText(spannableString);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_choose_day;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        boolean[] zArr = this.mChooseActivity;
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().set(i2, Integer.valueOf(OiOX0i.m1037iO(zArr[i])));
            i++;
            i2++;
        }
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
