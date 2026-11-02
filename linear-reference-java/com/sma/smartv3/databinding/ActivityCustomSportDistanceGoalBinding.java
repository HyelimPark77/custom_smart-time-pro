package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCustomSportDistanceGoalBinding implements ViewBinding {

    @NonNull
    public final EditText distance1Et;

    @NonNull
    public final EditText distance2Et;

    @NonNull
    public final EditText distance3Et;

    @NonNull
    public final LinearLayout distanceLl;

    @NonNull
    public final PFMedium distanceUnit;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCustomSportDistanceGoalBinding(@NonNull LinearLayout rootView, @NonNull EditText distance1Et, @NonNull EditText distance2Et, @NonNull EditText distance3Et, @NonNull LinearLayout distanceLl, @NonNull PFMedium distanceUnit) {
        this.rootView = rootView;
        this.distance1Et = distance1Et;
        this.distance2Et = distance2Et;
        this.distance3Et = distance3Et;
        this.distanceLl = distanceLl;
        this.distanceUnit = distanceUnit;
    }

    @NonNull
    public static ActivityCustomSportDistanceGoalBinding bind(@NonNull View rootView) {
        int r0 = R.id.distance1Et;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance1Et);
        if (r4 == null) goto L15;
        r0 = R.id.distance2Et;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance2Et);
        if (r5 == null) goto L15;
        r0 = R.id.distance3Et;
        EditText r6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance3Et);
        if (r6 == null) goto L15;
        r0 = R.id.distanceLl;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.distanceLl);
        if (r7 == null) goto L15;
        r0 = R.id.distanceUnit;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (r8 == null) goto L15;
        return new ActivityCustomSportDistanceGoalBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCustomSportDistanceGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCustomSportDistanceGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_custom_sport_distance_goal, parent, false);
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
