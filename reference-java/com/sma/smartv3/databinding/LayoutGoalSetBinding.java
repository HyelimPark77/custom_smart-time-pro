package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutGoalSetBinding implements ViewBinding {

    @NonNull
    public final PFMedium approximatelyEqualTo;

    @NonNull
    public final Button btGoalDone;

    @NonNull
    public final DINCondBold caloriesGoal;

    @NonNull
    public final DINCondBold distanceGoal;

    @NonNull
    public final RelativeLayout llMovingTarget;

    @NonNull
    public final PFMedium nowGoalUnit;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: wv */
    @NonNull
    public final WheelView f51174wv;

    private LayoutGoalSetBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium approximatelyEqualTo, @NonNull Button btGoalDone, @NonNull DINCondBold caloriesGoal, @NonNull DINCondBold distanceGoal, @NonNull RelativeLayout llMovingTarget, @NonNull PFMedium nowGoalUnit, @NonNull WheelView wv) {
        this.rootView = rootView;
        this.approximatelyEqualTo = approximatelyEqualTo;
        this.btGoalDone = btGoalDone;
        this.caloriesGoal = caloriesGoal;
        this.distanceGoal = distanceGoal;
        this.llMovingTarget = llMovingTarget;
        this.nowGoalUnit = nowGoalUnit;
        this.f51174wv = wv;
    }

    @NonNull
    public static LayoutGoalSetBinding bind(@NonNull View rootView) {
        int i = R.id.approximatelyEqualTo;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.approximatelyEqualTo);
        if (pFMedium != null) {
            i = R.id.btGoalDone;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btGoalDone);
            if (button != null) {
                i = R.id.caloriesGoal;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.caloriesGoal);
                if (dINCondBold != null) {
                    i = R.id.distanceGoal;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.distanceGoal);
                    if (dINCondBold2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                        i = R.id.nowGoalUnit;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
                        if (pFMedium2 != null) {
                            i = R.id.f51425wv;
                            WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.f51425wv);
                            if (wheelView != null) {
                                return new LayoutGoalSetBinding(relativeLayout, pFMedium, button, dINCondBold, dINCondBold2, relativeLayout, pFMedium2, wheelView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutGoalSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutGoalSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_goal_set, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
