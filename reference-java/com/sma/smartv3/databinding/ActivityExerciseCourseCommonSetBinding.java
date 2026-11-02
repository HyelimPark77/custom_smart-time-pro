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
        int i = R.id.btRemove;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btRemove);
        if (button != null) {
            i = R.id.exerciseL1;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL1);
            if (linearLayout != null) {
                i = R.id.exerciseL2Amf;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL2Amf);
                if (linearLayout2 != null) {
                    i = R.id.exerciseL2Easy;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL2Easy);
                    if (linearLayout3 != null) {
                        i = R.id.exerciseL3;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.exerciseL3);
                        if (linearLayout4 != null) {
                            i = R.id.ivExerciseBg;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ivExerciseBg);
                            if (relativeLayout != null) {
                                LinearLayout linearLayout5 = (LinearLayout) rootView;
                                i = R.id.syncRl;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.syncRl);
                                if (relativeLayout2 != null) {
                                    i = R.id.syncTv;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.syncTv);
                                    if (pFMedium != null) {
                                        i = R.id.tvExerciseDesc;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvExerciseDesc);
                                        if (pFMedium2 != null) {
                                            return new ActivityExerciseCourseCommonSetBinding(linearLayout5, button, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, linearLayout5, relativeLayout2, pFMedium, pFMedium2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityExerciseCourseCommonSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityExerciseCourseCommonSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_exercise_course_common_set, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
