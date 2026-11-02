package com.sma.smartv3.ui.sport.coach.guide;

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
import com.android.mltcode.paycertificationapi.gw1;
import com.android.mltcode.paycertificationapi.hw1;
import com.android.mltcode.paycertificationapi.iw1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlanChooseDaysFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n13854#2,2:107\n13940#2,3:109\n*S KotlinDebug\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n*L\n88#1:107,2\n97#1:109,3\n*E\n"})
public final class PlanChooseDaysFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final Lazy llChoices$delegate;

    @tb1
    private CommonAdapter<String> mAdapter;

    @aa1
    private final boolean[] mChooseActivity;

    @aa1
    private final Lazy mTipTitle$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.coach.guide.PlanChooseDaysFragment$initView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends CommonAdapter<String> {
        final /* synthetic */ String[] $mChoices;
        final /* synthetic */ PlanChooseDaysFragment this$0;

        public AnonymousClass1(String[] r1, PlanChooseDaysFragment r2, Context r3, List<String> r4) {
            this.$mChoices = r1;
            this.this$0 = r2;
            super(r3, R.layout.item_pop_multi_left_round, r4);
        }

        public static /* synthetic */ void OXO1(PlanChooseDaysFragment r0, int r1, ViewHolder r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(PlanChooseDaysFragment r2, int r3, ViewHolder r4, View r5) {
            if (PlanChooseDaysFragment.access$getMChooseActivity$p(r2)[r3] == false) goto L5;
            PlanChooseDaysFragment.access$getMChooseActivity$p(r2)[r3] = false;
            ((CheckBox) r4.getView(R.id.checkbox)).setChecked(false);
        L6:
            I01XX0.OXO1(I01XX0.IOIi00, Integer.valueOf(r2.getChoicesSize()));
            return;
        L5:
            PlanChooseDaysFragment.access$getMChooseActivity$p(r2)[r3] = true;
            ((CheckBox) r4.getView(R.id.checkbox)).setChecked(true);
            goto L6
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
            convert2(r1, r2, r3);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.$mChoices.length;
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(final ViewHolder r3, String r4, final int r5) {
            Intrinsics.X0O(r3, "viewHolder");
            Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
            View r6 = r3.getView(R.id.item_line_view);
            if (r5 != 0) goto L5;
            int r0 = 4;
        L6:
            r6.setVisibility(r0);
            ((TextView) r3.getView(R.id.tv_value)).setText(this.$mChoices[r5]);
            ((CheckBox) r3.getView(R.id.checkbox)).setChecked(PlanChooseDaysFragment.access$getMChooseActivity$p(this.this$0)[r5]);
            View r7 = r3.itemView;
            final PlanChooseDaysFragment r1 = this.this$0;
            r7.setOnClickListener(new iw1(r1, r5, r3));
            return;
        L5:
            r0 = 0;
            goto L6
        }
    }

    public PlanChooseDaysFragment() {
        this.llChoices$delegate = LazyKt__LazyJVMKt.iO(new gw1(this));
        this.mTipTitle$delegate = LazyKt__LazyJVMKt.iO(new hw1(this));
        this.mChooseActivity = new boolean[]{false, false, true, false, true, true, false};
    }

    public static /* synthetic */ TextView XIi00iiXO(PlanChooseDaysFragment r0) {
        return mTipTitle_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ boolean[] access$getMChooseActivity$p(PlanChooseDaysFragment r0) {
        return r0.mChooseActivity;
    }

    private final RecyclerView getLlChoices() {
        return (RecyclerView) getValue();
    }

    public static /* synthetic */ RecyclerView iO(PlanChooseDaysFragment r0) {
        return llChoices_delegate$lambda$0(r0);
    }

    private static final RecyclerView llChoices_delegate$lambda$0(PlanChooseDaysFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.ll_choices);
    }

    private static final TextView mTipTitle_delegate$lambda$0(PlanChooseDaysFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.start_title_tv);
    }

    public final int getChoicesSize() {
        boolean[] r0 = this.mChooseActivity;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (r0[r2] == false) goto L7;
        r3 = r3 + 1;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    public final TextView getMTipTitle() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        String[] r0 = {getString(R.string.weekday7_s), getString(R.string.weekday1_s), getString(R.string.weekday2_s), getString(R.string.weekday3_s), getString(R.string.weekday4_s), getString(R.string.weekday5_s), getString(R.string.weekday6_s)};
        getLlChoices().setLayoutManager(new LinearLayoutManager(requireContext()));
        AnonymousClass1 r3 = new AnonymousClass1(r0, this, getLlChoices().getContext(), ArraysKt___ArraysKt.iO0XiOIi(r0));
        getLlChoices().setAdapter(r3);
        this.mAdapter = r3;
        CharSequence r1 = getMTipTitle().getText();
        SpannableString r2 = new SpannableString(r1);
        ForegroundColorSpan r7 = new ForegroundColorSpan(gk4.iO(getMTipTitle().getContext(), R.color.text_color));
        Intrinsics.XXI(r1);
        String r4 = getString(R.string.next);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        int r5 = StringsKt__StringsKt.OO1101010(r1, r4, 0, false, 6, null) - 1;
        r2.setSpan(r7, r5, (getString(R.string.next).length() + r5) + 1, 33);
        getMTipTitle().setText(r2);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_choose_day;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        boolean[] r0 = this.mChooseActivity;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().set(r3, Integer.valueOf(OiOX0i.iO(r0[r2])));
        r2 = r2 + 1;
        r3 = r3 + 1;
        goto L3
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }
}
