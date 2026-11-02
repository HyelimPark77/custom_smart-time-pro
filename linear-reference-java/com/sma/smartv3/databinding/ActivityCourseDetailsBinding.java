package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCourseDetailsBinding implements ViewBinding {

    @NonNull
    public final CardView courseCardView;

    @NonNull
    public final Button courseDetailsBtn;

    @NonNull
    public final PFMedium courseDetailsDiff;

    @NonNull
    public final PFMedium courseDetailsHeat;

    @NonNull
    public final PFMedium courseDetailsHot;

    @NonNull
    public final TextView courseDetailsName;

    @NonNull
    public final ImageView courseDetailsPic;

    @NonNull
    public final PFMedium courseDetailsTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final ViewPager viewPager;

    private ActivityCourseDetailsBinding(@NonNull LinearLayout rootView, @NonNull CardView courseCardView, @NonNull Button courseDetailsBtn, @NonNull PFMedium courseDetailsDiff, @NonNull PFMedium courseDetailsHeat, @NonNull PFMedium courseDetailsHot, @NonNull TextView courseDetailsName, @NonNull ImageView courseDetailsPic, @NonNull PFMedium courseDetailsTime, @NonNull TabLayout table, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.courseCardView = courseCardView;
        this.courseDetailsBtn = courseDetailsBtn;
        this.courseDetailsDiff = courseDetailsDiff;
        this.courseDetailsHeat = courseDetailsHeat;
        this.courseDetailsHot = courseDetailsHot;
        this.courseDetailsName = courseDetailsName;
        this.courseDetailsPic = courseDetailsPic;
        this.courseDetailsTime = courseDetailsTime;
        this.table = table;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityCourseDetailsBinding bind(@NonNull View rootView) {
        int r0 = R.id.course_cardView;
        CardView r4 = (CardView) ViewBindings.findChildViewById(rootView, R.id.course_cardView);
        if (r4 == null) goto L25;
        r0 = R.id.course_details_btn;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.course_details_btn);
        if (r5 == null) goto L25;
        r0 = R.id.course_details_diff;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_diff);
        if (r6 == null) goto L25;
        r0 = R.id.course_details_heat;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_heat);
        if (r7 == null) goto L25;
        r0 = R.id.course_details_hot;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_hot);
        if (r8 == null) goto L25;
        r0 = R.id.course_details_name;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_details_name);
        if (r9 == null) goto L25;
        r0 = R.id.course_details_pic;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_details_pic);
        if (r10 == null) goto L25;
        r0 = R.id.course_details_time;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_time);
        if (r11 == null) goto L25;
        r0 = R.id.table;
        TabLayout r12 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r12 == null) goto L25;
        r0 = R.id.view_pager;
        ViewPager r13 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r13 == null) goto L25;
        return new ActivityCourseDetailsBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCourseDetailsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCourseDetailsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_course_details, parent, false);
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
