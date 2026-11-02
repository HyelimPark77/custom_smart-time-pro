package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachItemContentPlanBinding implements ViewBinding {

    @NonNull
    public final ImageView coachContentIv;

    @NonNull
    public final PFMedium coachContentName;

    @NonNull
    public final PFMedium coachContentNoTitle;

    @NonNull
    public final PFMedium coachContentTime;

    @NonNull
    public final PFMedium coachContentTitle;

    @NonNull
    public final RelativeLayout contentLessonLayout;

    @NonNull
    private final FrameLayout rootView;

    private CoachItemContentPlanBinding(@NonNull FrameLayout rootView, @NonNull ImageView coachContentIv, @NonNull PFMedium coachContentName, @NonNull PFMedium coachContentNoTitle, @NonNull PFMedium coachContentTime, @NonNull PFMedium coachContentTitle, @NonNull RelativeLayout contentLessonLayout) {
        this.rootView = rootView;
        this.coachContentIv = coachContentIv;
        this.coachContentName = coachContentName;
        this.coachContentNoTitle = coachContentNoTitle;
        this.coachContentTime = coachContentTime;
        this.coachContentTitle = coachContentTitle;
        this.contentLessonLayout = contentLessonLayout;
    }

    @NonNull
    public static CoachItemContentPlanBinding bind(@NonNull View rootView) {
        int i = R.id.coach_content_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.coach_content_iv);
        if (imageView != null) {
            i = R.id.coach_content_name;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_name);
            if (pFMedium != null) {
                i = R.id.coach_content_no_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_no_title);
                if (pFMedium2 != null) {
                    i = R.id.coach_content_time;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_time);
                    if (pFMedium3 != null) {
                        i = R.id.coach_content_title;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_title);
                        if (pFMedium4 != null) {
                            i = R.id.content_lesson_layout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.content_lesson_layout);
                            if (relativeLayout != null) {
                                return new CoachItemContentPlanBinding((FrameLayout) rootView, imageView, pFMedium, pFMedium2, pFMedium3, pFMedium4, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static CoachItemContentPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CoachItemContentPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.coach_item_content_plan, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
