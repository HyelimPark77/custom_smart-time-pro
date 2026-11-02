package com.sma.smartv3.model;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightMeasureItemHolder(@aa1 View view) {
        super(view);
        Intrinsics.X0O(view, "view");
        this.mExpandedPositionSet = new HashSet<>();
        View viewFindViewById = view.findViewById(R.id.expandable_layout);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.expandableLayout = (ExpandableLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_icon);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.ivIcom = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_name);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.tvName = (PFMedium) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_value);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.tvValue = (PFMedium) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_level);
        Intrinsics.O10IXXX0X(viewFindViewById5, "findViewById(...)");
        this.tvLevel = (PFMedium) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.sbv);
        Intrinsics.O10IXXX0X(viewFindViewById6, "findViewById(...)");
        this.sbv = (CircleThumbSegmentedBarView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_tips);
        Intrinsics.O10IXXX0X(viewFindViewById7, "findViewById(...)");
        this.tvTips = (DINCondBold) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.switcher);
        Intrinsics.O10IXXX0X(viewFindViewById8, "findViewById(...)");
        this.ivSwitcher = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.recyclerView);
        Intrinsics.O10IXXX0X(viewFindViewById9, "findViewById(...)");
        this.recyclerView = (RecyclerView) viewFindViewById9;
    }

    private final void addExpand(int i) {
        this.mExpandedPositionSet.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerExpand(int i) {
        if (this.mExpandedPositionSet.contains(Integer.valueOf(i))) {
            removeExpand(i);
        } else {
            addExpand(i);
        }
    }

    private final void removeExpand(int i) {
        this.mExpandedPositionSet.remove(Integer.valueOf(i));
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

    public final void updateItem(final int i) {
        this.expandableLayout.setOnExpandListener(new ExpandableLayout.InterfaceC19064iO() { // from class: com.android.mltcode.paycertificationapi.c07
            @Override // com.sma.smartv3.view.ExpandableLayout.InterfaceC19064iO
            public final void OXO1(boolean z) {
                this.OXO1.registerExpand(i);
            }
        });
        this.expandableLayout.setExpand(this.mExpandedPositionSet.contains(Integer.valueOf(i)));
    }
}
