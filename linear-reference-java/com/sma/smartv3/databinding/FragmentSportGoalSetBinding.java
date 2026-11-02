package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportGoalSetBinding implements ViewBinding {

    @NonNull
    public final Button customerGoalBt;

    @NonNull
    public final PFMedium nowGoalUnit;

    @NonNull
    public final DINCondBold nowGoalValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final Button startExerciseBt;

    private FragmentSportGoalSetBinding(@NonNull LinearLayout rootView, @NonNull Button customerGoalBt, @NonNull PFMedium nowGoalUnit, @NonNull DINCondBold nowGoalValue, @NonNull RecyclerView rv, @NonNull Button startExerciseBt) {
        this.rootView = rootView;
        this.customerGoalBt = customerGoalBt;
        this.nowGoalUnit = nowGoalUnit;
        this.nowGoalValue = nowGoalValue;
        this.rv = rv;
        this.startExerciseBt = startExerciseBt;
    }

    @NonNull
    public static FragmentSportGoalSetBinding bind(@NonNull View rootView) {
        int r0 = R.id.customerGoalBt;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.customerGoalBt);
        if (r4 == null) goto L15;
        r0 = R.id.nowGoalUnit;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
        if (r5 == null) goto L15;
        r0 = R.id.nowGoalValue;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowGoalValue);
        if (r6 == null) goto L15;
        r0 = R.id.rv;
        RecyclerView r7 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r7 == null) goto L15;
        r0 = R.id.startExerciseBt;
        Button r8 = (Button) ViewBindings.findChildViewById(rootView, R.id.startExerciseBt);
        if (r8 == null) goto L15;
        return new FragmentSportGoalSetBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentSportGoalSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportGoalSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_goal_set, parent, false);
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
