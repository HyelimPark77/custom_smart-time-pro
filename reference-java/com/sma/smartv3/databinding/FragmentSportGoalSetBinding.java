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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51121rv;

    @NonNull
    public final Button startExerciseBt;

    private FragmentSportGoalSetBinding(@NonNull LinearLayout rootView, @NonNull Button customerGoalBt, @NonNull PFMedium nowGoalUnit, @NonNull DINCondBold nowGoalValue, @NonNull RecyclerView rv, @NonNull Button startExerciseBt) {
        this.rootView = rootView;
        this.customerGoalBt = customerGoalBt;
        this.nowGoalUnit = nowGoalUnit;
        this.nowGoalValue = nowGoalValue;
        this.f51121rv = rv;
        this.startExerciseBt = startExerciseBt;
    }

    @NonNull
    public static FragmentSportGoalSetBinding bind(@NonNull View rootView) {
        int i = R.id.customerGoalBt;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.customerGoalBt);
        if (button != null) {
            i = R.id.nowGoalUnit;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
            if (pFMedium != null) {
                i = R.id.nowGoalValue;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowGoalValue);
                if (dINCondBold != null) {
                    i = R.id.f51422rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                    if (recyclerView != null) {
                        i = R.id.startExerciseBt;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.startExerciseBt);
                        if (button2 != null) {
                            return new FragmentSportGoalSetBinding((LinearLayout) rootView, button, pFMedium, dINCondBold, recyclerView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportGoalSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportGoalSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_goal_set, parent, false);
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
