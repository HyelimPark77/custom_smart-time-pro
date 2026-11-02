package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.I0IX1X1;
import com.android.mltcode.paycertificationapi.I0Ii0iXii;
import com.android.mltcode.paycertificationapi.IX00iOI;
import com.android.mltcode.paycertificationapi.IX1OX1;
import com.android.mltcode.paycertificationapi.Ii0XXi;
import com.android.mltcode.paycertificationapi.O1XiiO;
import com.android.mltcode.paycertificationapi.OOO0;
import com.android.mltcode.paycertificationapi.OXOOX;
import com.android.mltcode.paycertificationapi.X00i1XI;
import com.android.mltcode.paycertificationapi.X11XIXIi0;
import com.android.mltcode.paycertificationapi.Xii101;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOOiiX1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSportGoalSetFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final Lazy customerGoalBt$delegate;

    @aa1
    private final HashMap<Integer, String> distanceItemData;

    @aa1
    private final int[] goals;

    @aa1
    private final Lazy nowGoalUnit$delegate;

    @aa1
    private final Lazy nowGoalValue$delegate;

    @aa1
    private final Lazy startExerciseBt$delegate;

    public BaseSportGoalSetFragment() {
        this.nowGoalValue$delegate = LazyKt__LazyJVMKt.iO(new Xii101(this));
        this.nowGoalUnit$delegate = LazyKt__LazyJVMKt.iO(new O1XiiO(this));
        this.customerGoalBt$delegate = LazyKt__LazyJVMKt.iO(new X11XIXIi0(this));
        this.startExerciseBt$delegate = LazyKt__LazyJVMKt.iO(new IX00iOI(this));
        this.distanceItemData = new HashMap();
        this.goals = new int[3];
    }

    public static /* synthetic */ Unit I0IIOi(BaseSportGoalSetFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Button I0iXXO(BaseSportGoalSetFragment r0) {
        return customerGoalBt_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IO(BaseSportGoalSetFragment r0) {
        return nowGoalValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button IiI10X(BaseSportGoalSetFragment r0) {
        return startExerciseBt_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O00(BaseSportGoalSetFragment r0, int r1, DslAdapterItem r2) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OIX0iXi(DslAdapterItem r0, BaseSportGoalSetFragment r1, int r2, View r3) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit OIi0(BaseSportGoalSetFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit X1ii(BaseSportGoalSetFragment r0) {
        return onInitBaseLayoutAfter$lambda$0$0(r0);
    }

    public static /* synthetic */ void XO0O10(BaseSportGoalSetFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ PFMedium XOO0ii0(BaseSportGoalSetFragment r0) {
        return nowGoalUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(BaseSportGoalSetFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final Button customerGoalBt_delegate$lambda$0(BaseSportGoalSetFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.customerGoalBt);
    }

    public static /* synthetic */ Unit iO(BaseSportGoalSetFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0(r0, r1);
    }

    private static final void initView$lambda$0(BaseSportGoalSetFragment r0, View r1) {
        r0.toCustomerGoal();
    }

    private static final void initView$lambda$1(BaseSportGoalSetFragment r0, View r1) {
        r0.startExercise();
    }

    private static final PFMedium nowGoalUnit_delegate$lambda$0(BaseSportGoalSetFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.nowGoalUnit);
    }

    private static final DINCondBold nowGoalValue_delegate$lambda$0(BaseSportGoalSetFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.nowGoalValue);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(final BaseSportGoalSetFragment r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r2.getItemSelectorHelper().X11iII1O1(1);
        r1.getDslViewHolder().post(new I0IX1X1(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(final BaseSportGoalSetFragment r1) {
        r1.renderAdapter(new OOO0(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final BaseSportGoalSetFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        final int r0 = 0;
    L4:
        if (r0 >= 6) goto L7;
        DslAdapterExKt.O10IXXX0X(r4, R.layout.item_sport_goal, new iiOOiiX1(r3, r0));
        r0 = r0 + 1;
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final BaseSportGoalSetFragment r1, final int r2, final DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new I0Ii0iXii(r1, r2, r3));
        r3.setItemClick(new IX1OX1(r3, r1, r2));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(BaseSportGoalSetFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.itemValue);
        if (r7 == null) goto L5;
        r7.setText(r0.distanceItemData.get(Integer.valueOf(r1)));
    L5:
        TextView r8 = r3.tv(R.id.itemValue);
        if (r8 == null) goto L8;
        r8.setSelected(r2.getItemIsSelected());
    L8:
        View r9 = r3.view(R.id.rl_value);
        if (r9 == null) goto L16;
        if (r2.getItemIsSelected() == false) goto L13;
        int r10 = R.drawable.common_ripple_sport_bt;
    L14:
        r9.setBackgroundResource(r10);
        goto L16
    L13:
        r10 = R.drawable.common_ripple_me;
    L16:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(DslAdapterItem r3, BaseSportGoalSetFragment r4, int r5, View r6) {
        Intrinsics.X0O(r6, "it");
        if (r3.getItemIsSelected() == true) goto L6;
        DslAdapterItem.updateItemSelector$default(r3, !r3.getItemIsSelected(), false, 2, null);
        r4.updateGoalValue(r5);
    L6:
        return Unit.OXO1;
    }

    private static final Button startExerciseBt_delegate$lambda$0(BaseSportGoalSetFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.startExerciseBt);
    }

    public final Button getCustomerGoalBt() {
        return (Button) getValue();
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
        return (PFMedium) getValue();
    }

    public final DINCondBold getNowGoalValue() {
        return (DINCondBold) getValue();
    }

    public final Button getStartExerciseBt() {
        return (Button) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        setGoalValueItem();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getStartExerciseBt().setEnabled(false);
        getCustomerGoalBt().setOnClickListener(new X00i1XI(this));
        getStartExerciseBt().setOnClickListener(new OXOOX(this));
        getRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), 3));
        getRecyclerView().setHasFixedSize(false);
        setInfo();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_goal_set;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new Ii0XXi(this));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public abstract void setGoalValueItem();

    public abstract void setInfo();

    public abstract void startExercise();

    public abstract void toCustomerGoal();

    public abstract void updateGoalValue(int r1);
}
