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
        int i = R.id.course_cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.course_cardView);
        if (cardView != null) {
            i = R.id.course_details_btn;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.course_details_btn);
            if (button != null) {
                i = R.id.course_details_diff;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_diff);
                if (pFMedium != null) {
                    i = R.id.course_details_heat;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_heat);
                    if (pFMedium2 != null) {
                        i = R.id.course_details_hot;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_hot);
                        if (pFMedium3 != null) {
                            i = R.id.course_details_name;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_details_name);
                            if (textView != null) {
                                i = R.id.course_details_pic;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_details_pic);
                                if (imageView != null) {
                                    i = R.id.course_details_time;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_time);
                                    if (pFMedium4 != null) {
                                        i = R.id.table;
                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
                                        if (tabLayout != null) {
                                            i = R.id.view_pager;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                                            if (viewPager != null) {
                                                return new ActivityCourseDetailsBinding((LinearLayout) rootView, cardView, button, pFMedium, pFMedium2, pFMedium3, textView, imageView, pFMedium4, tabLayout, viewPager);
                                            }
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
    public static ActivityCourseDetailsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCourseDetailsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_course_details, parent, false);
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
