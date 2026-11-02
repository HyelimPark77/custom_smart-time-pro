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
        int r0 = R.id.coach_content_iv;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.coach_content_iv);
        if (r4 == null) goto L17;
        r0 = R.id.coach_content_name;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_name);
        if (r5 == null) goto L17;
        r0 = R.id.coach_content_no_title;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_no_title);
        if (r6 == null) goto L17;
        r0 = R.id.coach_content_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_time);
        if (r7 == null) goto L17;
        r0 = R.id.coach_content_title;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.coach_content_title);
        if (r8 == null) goto L17;
        r0 = R.id.content_lesson_layout;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.content_lesson_layout);
        if (r9 == null) goto L17;
        return new CoachItemContentPlanBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static CoachItemContentPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CoachItemContentPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.coach_item_content_plan, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
