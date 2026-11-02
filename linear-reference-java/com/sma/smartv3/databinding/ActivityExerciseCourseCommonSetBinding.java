package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityExerciseCourseCommonSetBinding implements ViewBinding {

    @NonNull
    public final Button btRemove;

    @NonNull
    public final LinearLayout exerciseL1;

    @NonNull
    public final LinearLayout exerciseL2Amf;

    @NonNull
    public final LinearLayout exerciseL2Easy;

    @NonNull
    public final LinearLayout exerciseL3;

    @NonNull
    public final RelativeLayout ivExerciseBg;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RelativeLayout syncRl;

    @NonNull
    public final PFMedium syncTv;

    @NonNull
    public final PFMedium tvExerciseDesc;

    private ActivityExerciseCourseCommonSetBinding(@NonNull LinearLayout rootView_, @NonNull Button btRemove, @NonNull LinearLayout exerciseL1, @NonNull LinearLayout exerciseL2Amf, @NonNull LinearLayout exerciseL2Easy, @NonNull LinearLayout exerciseL3, @NonNull RelativeLayout ivExerciseBg, @NonNull LinearLayout rootView, @NonNull RelativeLayout syncRl, @NonNull PFMedium syncTv, @NonNull PFMedium tvExerciseDesc) {
        this.rootView_ = rootView_;
        this.btRemove = btRemove;
        this.exerciseL1 = exerciseL1;
        this.exerciseL2Amf = exerciseL2Amf;
        this.exerciseL2Easy = exerciseL2Easy;
        this.exerciseL3 = exerciseL3;
        this.ivExerciseBg = ivExerciseBg;
        this.rootView = rootView;
        this.syncRl = syncRl;
        this.syncTv = syncTv;
        this.tvExerciseDesc = tvExerciseDesc;
    }

    @NonNull
    public static ActivityExerciseCourseCommonSetBinding bind(@NonNull View rootView) {
        int r0 = R.id.btRemove;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btRemove);
        if (r4 == null) goto L23;
        r0 = R.id.exerciseL1;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL1);
        if (r5 == null) goto L23;
        r0 = R.id.exerciseL2Amf;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL2Amf);
        if (r6 == null) goto L23;
        r0 = R.id.exerciseL2Easy;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL2Easy);
        if (r7 == null) goto L23;
        r0 = R.id.exerciseL3;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL3);
        if (r8 == null) goto L23;
        r0 = R.id.ivExerciseBg;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ivExerciseBg);
        if (r9 == null) goto L23;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.syncRl;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.syncRl);
        if (r11 == null) goto L23;
        r0 = R.id.syncTv;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.syncTv);
        if (r12 == null) goto L23;
        r0 = R.id.tvExerciseDesc;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvExerciseDesc);
        if (r13 == null) goto L23;
        return new ActivityExerciseCourseCommonSetBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityExerciseCourseCommonSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityExerciseCourseCommonSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_exercise_course_common_set, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
