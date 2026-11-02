package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportGoalBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemValue;

    @NonNull
    public final RelativeLayout rlValue;

    @NonNull
    private final LinearLayout rootView;

    private ItemSportGoalBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemValue, @NonNull RelativeLayout rlValue) {
        this.rootView = rootView;
        this.itemValue = itemValue;
        this.rlValue = rlValue;
    }

    @NonNull
    public static ItemSportGoalBinding bind(@NonNull View rootView) {
        int i = R.id.itemValue;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.itemValue);
        if (pFMedium != null) {
            i = R.id.rl_value;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_value);
            if (relativeLayout != null) {
                return new ItemSportGoalBinding((LinearLayout) rootView, pFMedium, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_goal, parent, false);
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
