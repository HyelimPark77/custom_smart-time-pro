package com.sma.smartv3.model;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c07;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ExpandableLayout;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightMeasureItemHolder extends RecyclerView.ViewHolder {

    @aa1
    private final ExpandableLayout expandableLayout;

    @aa1
    private final ImageView ivIcom;

    @aa1
    private final ImageView ivSwitcher;

    @aa1
    private final HashSet<Integer> mExpandedPositionSet;

    @aa1
    private final RecyclerView recyclerView;

    @aa1
    private final CircleThumbSegmentedBarView sbv;

    @aa1
    private final PFMedium tvLevel;

    @aa1
    private final PFMedium tvName;

    @aa1
    private final DINCondBold tvTips;

    @aa1
    private final PFMedium tvValue;

    public WeightMeasureItemHolder(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        super(r3);
        this.mExpandedPositionSet = new HashSet();
        View r0 = r3.findViewById(R.id.expandable_layout);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        this.expandableLayout = (ExpandableLayout) r0;
        View r1 = r3.findViewById(R.id.iv_icon);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.ivIcom = (ImageView) r1;
        View r2 = r3.findViewById(R.id.tv_name);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        this.tvName = (PFMedium) r2;
        View r4 = r3.findViewById(R.id.tv_value);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.tvValue = (PFMedium) r4;
        View r5 = r3.findViewById(R.id.tv_level);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.tvLevel = (PFMedium) r5;
        View r6 = r3.findViewById(R.id.sbv);
        Intrinsics.O10IXXX0X(r6, "findViewById(...)");
        this.sbv = (CircleThumbSegmentedBarView) r6;
        View r7 = r3.findViewById(R.id.tv_tips);
        Intrinsics.O10IXXX0X(r7, "findViewById(...)");
        this.tvTips = (DINCondBold) r7;
        View r8 = r3.findViewById(R.id.switcher);
        Intrinsics.O10IXXX0X(r8, "findViewById(...)");
        this.ivSwitcher = (ImageView) r8;
        View r9 = r3.findViewById(R.id.recyclerView);
        Intrinsics.O10IXXX0X(r9, "findViewById(...)");
        this.recyclerView = (RecyclerView) r9;
    }

    public static /* synthetic */ void OXO1(WeightMeasureItemHolder r0, int r1, boolean r2) {
        updateItem$lambda$0(r0, r1, r2);
    }

    private final void addExpand(int r2) {
        this.mExpandedPositionSet.add(Integer.valueOf(r2));
    }

    private final void registerExpand(int r3) {
        if (this.mExpandedPositionSet.contains(Integer.valueOf(r3)) == false) goto L6;
        removeExpand(r3);
        return;
    L6:
        addExpand(r3);
    }

    private final void removeExpand(int r2) {
        this.mExpandedPositionSet.remove(Integer.valueOf(r2));
    }

    private static final void updateItem$lambda$0(WeightMeasureItemHolder r0, int r1, boolean r2) {
        r0.registerExpand(r1);
    }

    @aa1
    public final ExpandableLayout getExpandableLayout() {
        return this.expandableLayout;
    }

    @aa1
    public final ImageView getIvIcom() {
        return this.ivIcom;
    }

    @aa1
    public final ImageView getIvSwitcher() {
        return this.ivSwitcher;
    }

    @aa1
    public final HashSet<Integer> getMExpandedPositionSet() {
        return this.mExpandedPositionSet;
    }

    @aa1
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @aa1
    public final CircleThumbSegmentedBarView getSbv() {
        return this.sbv;
    }

    @aa1
    public final PFMedium getTvLevel() {
        return this.tvLevel;
    }

    @aa1
    public final PFMedium getTvName() {
        return this.tvName;
    }

    @aa1
    public final DINCondBold getTvTips() {
        return this.tvTips;
    }

    @aa1
    public final PFMedium getTvValue() {
        return this.tvValue;
    }

    public final void updateItem(final int r3) {
        this.expandableLayout.setOnExpandListener(new c07(this, r3));
        this.expandableLayout.setExpand(this.mExpandedPositionSet.contains(Integer.valueOf(r3)));
    }
}
