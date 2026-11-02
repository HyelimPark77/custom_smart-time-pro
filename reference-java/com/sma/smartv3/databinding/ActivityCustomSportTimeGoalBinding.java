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
public final class ActivityCustomSportTimeGoalBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final EditText time1Et;

    @NonNull
    public final EditText time2Et;

    @NonNull
    public final EditText time3Et;

    @NonNull
    public final EditText time4Et;

    private ActivityCustomSportTimeGoalBinding(@NonNull LinearLayout rootView, @NonNull EditText time1Et, @NonNull EditText time2Et, @NonNull EditText time3Et, @NonNull EditText time4Et) {
        this.rootView = rootView;
        this.time1Et = time1Et;
        this.time2Et = time2Et;
        this.time3Et = time3Et;
        this.time4Et = time4Et;
    }

    @NonNull
    public static ActivityCustomSportTimeGoalBinding bind(@NonNull View rootView) {
        int i = R.id.time1Et;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.time1Et);
        if (editText != null) {
            i = R.id.time2Et;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time2Et);
            if (editText2 != null) {
                i = R.id.time3Et;
                EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time3Et);
                if (editText3 != null) {
                    i = R.id.time4Et;
                    EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time4Et);
                    if (editText4 != null) {
                        return new ActivityCustomSportTimeGoalBinding((LinearLayout) rootView, editText, editText2, editText3, editText4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCustomSportTimeGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomSportTimeGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_sport_time_goal, parent, false);
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
