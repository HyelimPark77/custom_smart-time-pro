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
        int r0 = R.id.itemValue;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.itemValue);
        if (r1 == null) goto L9;
        r0 = R.id.rl_value;
        RelativeLayout r2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_value);
        if (r2 == null) goto L9;
        return new ItemSportGoalBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_goal, parent, false);
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
