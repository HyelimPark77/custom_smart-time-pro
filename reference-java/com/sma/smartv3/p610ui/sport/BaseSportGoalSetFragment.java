package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSportGoalSetFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final Lazy nowGoalValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xii101
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportGoalSetFragment.nowGoalValue_delegate$lambda$0(this.f5364IO);
        }
    });

    @aa1
    private final Lazy nowGoalUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XiiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportGoalSetFragment.nowGoalUnit_delegate$lambda$0(this.f2824IO);
        }
    });

    @aa1
    private final Lazy customerGoalBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11XIXIi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportGoalSetFragment.customerGoalBt_delegate$lambda$0(this.f4230IO);
        }
    });

    @aa1
    private final Lazy startExerciseBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX00iOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportGoalSetFragment.startExerciseBt_delegate$lambda$0(this.f1933IO);
        }
    });

    @aa1
    private final HashMap<Integer, String> distanceItemData = new HashMap<>();

    @aa1
    private final int[] goals = new int[3];

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button customerGoalBt_delegate$lambda$0(BaseSportGoalSetFragment baseSportGoalSetFragment) {
        return (Button) baseSportGoalSetFragment.getMView().findViewById(R.id.customerGoalBt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium nowGoalUnit_delegate$lambda$0(BaseSportGoalSetFragment baseSportGoalSetFragment) {
        return (PFMedium) baseSportGoalSetFragment.getMView().findViewById(R.id.nowGoalUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold nowGoalValue_delegate$lambda$0(BaseSportGoalSetFragment baseSportGoalSetFragment) {
        return (DINCondBold) baseSportGoalSetFragment.getMView().findViewById(R.id.nowGoalValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(final BaseSportGoalSetFragment baseSportGoalSetFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.getItemSelectorHelper().X11iII1O1(1);
        baseSportGoalSetFragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0IX1X1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0$0(this.f1130IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(final BaseSportGoalSetFragment baseSportGoalSetFragment) {
        baseSportGoalSetFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0$0$0(this.f3247IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final BaseSportGoalSetFragment baseSportGoalSetFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (final int i = 0; i < 6; i++) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_goal, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiOOiiX1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0$0$0$0(this.f8615IO, i, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final BaseSportGoalSetFragment baseSportGoalSetFragment, final int i, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.I0Ii0iXii
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0$0$0$0$0(this.f1134IO, i, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IX1OX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0$0$0$0$1(dslItem, baseSportGoalSetFragment, i, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(BaseSportGoalSetFragment baseSportGoalSetFragment, int i, DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.itemValue);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(baseSportGoalSetFragment.distanceItemData.get(Integer.valueOf(i)));
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.itemValue);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setSelected(dslAdapterItem.getItemIsSelected());
        }
        View view = itemHolder.view(R.id.rl_value);
        if (view != null) {
            view.setBackgroundResource(dslAdapterItem.getItemIsSelected() ? R.drawable.common_ripple_sport_bt : R.drawable.common_ripple_me);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(DslAdapterItem dslAdapterItem, BaseSportGoalSetFragment baseSportGoalSetFragment, int i, View it) {
        Intrinsics.X0O(it, "it");
        if (!dslAdapterItem.getItemIsSelected()) {
            DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
            baseSportGoalSetFragment.updateGoalValue(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button startExerciseBt_delegate$lambda$0(BaseSportGoalSetFragment baseSportGoalSetFragment) {
        return (Button) baseSportGoalSetFragment.getMView().findViewById(R.id.startExerciseBt);
    }

    public final Button getCustomerGoalBt() {
        return (Button) this.customerGoalBt$delegate.getValue();
    }

    @aa1
    public final HashMap<Integer, String> getDistanceItemData() {
        return this.distanceItemData;
    }

    @aa1
    public final int[] getGoals() {
        return this.goals;
    }

    public final PFMedium getNowGoalUnit() {
        return (PFMedium) this.nowGoalUnit$delegate.getValue();
    }

    public final DINCondBold getNowGoalValue() {
        return (DINCondBold) this.nowGoalValue$delegate.getValue();
    }

    public final Button getStartExerciseBt() {
        return (Button) this.startExerciseBt$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setGoalValueItem();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getStartExerciseBt().setEnabled(false);
        getCustomerGoalBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X00i1XI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3894IO.toCustomerGoal();
            }
        });
        getStartExerciseBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OXOOX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3515IO.startExercise();
            }
        });
        getRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), 3));
        getRecyclerView().setHasFixedSize(false);
        setInfo();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_goal_set;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii0XXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportGoalSetFragment.onInitBaseLayoutAfter$lambda$0(this.f2184IO, (DslAdapter) obj);
            }
        });
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public abstract void setGoalValueItem();

    public abstract void setInfo();

    public abstract void startExercise();

    public abstract void toCustomerGoal();

    public abstract void updateGoalValue(int i);
}
