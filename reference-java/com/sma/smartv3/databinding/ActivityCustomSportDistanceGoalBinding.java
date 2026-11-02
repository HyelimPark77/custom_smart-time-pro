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
        int i = R.id.distance1Et;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance1Et);
        if (editText != null) {
            i = R.id.distance2Et;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance2Et);
            if (editText2 != null) {
                i = R.id.distance3Et;
                EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.distance3Et);
                if (editText3 != null) {
                    i = R.id.distanceLl;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.distanceLl);
                    if (linearLayout != null) {
                        i = R.id.distanceUnit;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
                        if (pFMedium != null) {
                            return new ActivityCustomSportDistanceGoalBinding((LinearLayout) rootView, editText, editText2, editText3, linearLayout, pFMedium);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCustomSportDistanceGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomSportDistanceGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_sport_distance_goal, parent, false);
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
