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
        int r0 = R.id.time1Et;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time1Et);
        if (r4 == null) goto L13;
        r0 = R.id.time2Et;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time2Et);
        if (r5 == null) goto L13;
        r0 = R.id.time3Et;
        EditText r6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time3Et);
        if (r6 == null) goto L13;
        r0 = R.id.time4Et;
        EditText r7 = (EditText) ViewBindings.findChildViewById(rootView, R.id.time4Et);
        if (r7 == null) goto L13;
        return new ActivityCustomSportTimeGoalBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCustomSportTimeGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCustomSportTimeGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_custom_sport_time_goal, parent, false);
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
