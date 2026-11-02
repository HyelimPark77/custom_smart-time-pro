package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemHeathDefinitionListBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemDefinitionTip;

    @NonNull
    public final PFBold itemDefinitionTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbv;

    private ItemHeathDefinitionListBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemDefinitionTip, @NonNull PFBold itemDefinitionTitle, @NonNull CircleThumbSegmentedBarView sbv) {
        this.rootView = rootView;
        this.itemDefinitionTip = itemDefinitionTip;
        this.itemDefinitionTitle = itemDefinitionTitle;
        this.sbv = sbv;
    }

    @NonNull
    public static ItemHeathDefinitionListBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_definition_tip;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_definition_tip);
        if (r1 == null) goto L11;
        r0 = R.id.item_definition_title;
        PFBold r2 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_definition_title);
        if (r2 == null) goto L11;
        r0 = R.id.sbv;
        CircleThumbSegmentedBarView r3 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv);
        if (r3 == null) goto L11;
        return new ItemHeathDefinitionListBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemHeathDefinitionListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemHeathDefinitionListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_heath_definition_list, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
