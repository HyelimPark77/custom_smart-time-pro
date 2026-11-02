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
        int i = R.id.item_definition_tip;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_definition_tip);
        if (pFMedium != null) {
            i = R.id.item_definition_title;
            PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_definition_title);
            if (pFBold != null) {
                i = R.id.sbv;
                CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv);
                if (circleThumbSegmentedBarView != null) {
                    return new ItemHeathDefinitionListBinding((LinearLayout) rootView, pFMedium, pFBold, circleThumbSegmentedBarView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHeathDefinitionListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemHeathDefinitionListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_heath_definition_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
