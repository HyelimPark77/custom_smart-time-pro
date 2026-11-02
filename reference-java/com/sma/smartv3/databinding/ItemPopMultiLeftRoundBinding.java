package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPopMultiLeftRoundBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkbox;

    @NonNull
    public final View itemLineView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvValue;

    private ItemPopMultiLeftRoundBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkbox, @NonNull View itemLineView, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.checkbox = checkbox;
        this.itemLineView = itemLineView;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ItemPopMultiLeftRoundBinding bind(@NonNull View rootView) {
        int i = R.id.checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.checkbox);
        if (appCompatCheckBox != null) {
            i = R.id.item_line_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.item_line_view);
            if (viewFindChildViewById != null) {
                i = R.id.tv_value;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                if (pFMedium != null) {
                    return new ItemPopMultiLeftRoundBinding((LinearLayout) rootView, appCompatCheckBox, viewFindChildViewById, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPopMultiLeftRoundBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemPopMultiLeftRoundBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_pop_multi_left_round, parent, false);
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
