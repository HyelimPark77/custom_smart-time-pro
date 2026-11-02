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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCustomSportCaloriesGoalBinding implements ViewBinding {

    @NonNull
    public final EditText calEt;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCustomSportCaloriesGoalBinding(@NonNull LinearLayout rootView, @NonNull EditText calEt) {
        this.rootView = rootView;
        this.calEt = calEt;
    }

    @NonNull
    public static ActivityCustomSportCaloriesGoalBinding bind(@NonNull View rootView) {
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.calEt);
        if (editText != null) {
            return new ActivityCustomSportCaloriesGoalBinding((LinearLayout) rootView, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.calEt)));
    }

    @NonNull
    public static ActivityCustomSportCaloriesGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomSportCaloriesGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_sport_calories_goal, parent, false);
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
