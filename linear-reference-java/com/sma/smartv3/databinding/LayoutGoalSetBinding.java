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

    @NonNull
    public final WheelView wv;

    private LayoutGoalSetBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium approximatelyEqualTo, @NonNull Button btGoalDone, @NonNull DINCondBold caloriesGoal, @NonNull DINCondBold distanceGoal, @NonNull RelativeLayout llMovingTarget, @NonNull PFMedium nowGoalUnit, @NonNull WheelView wv) {
        this.rootView = rootView;
        this.approximatelyEqualTo = approximatelyEqualTo;
        this.btGoalDone = btGoalDone;
        this.caloriesGoal = caloriesGoal;
        this.distanceGoal = distanceGoal;
        this.llMovingTarget = llMovingTarget;
        this.nowGoalUnit = nowGoalUnit;
        this.wv = wv;
    }

    @NonNull
    public static LayoutGoalSetBinding bind(@NonNull View rootView) {
        int r0 = R.id.approximatelyEqualTo;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.approximatelyEqualTo);
        if (r4 == null) goto L17;
        r0 = R.id.btGoalDone;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btGoalDone);
        if (r5 == null) goto L17;
        r0 = R.id.caloriesGoal;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.caloriesGoal);
        if (r6 == null) goto L17;
        r0 = R.id.distanceGoal;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.distanceGoal);
        if (r7 == null) goto L17;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.nowGoalUnit;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowGoalUnit);
        if (r9 == null) goto L17;
        r0 = R.id.wv;
        WheelView r10 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wv);
        if (r10 == null) goto L17;
        return new LayoutGoalSetBinding(r3, r4, r5, r6, r7, r3, r9, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutGoalSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutGoalSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_goal_set, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
