package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemHorizontalCourseRecommendBinding implements ViewBinding {

    @NonNull
    public final ImageView courseRecommendIcon;

    @NonNull
    public final RelativeLayout courseRecommendLayout;

    @NonNull
    public final View courseRecommendLayoutView;

    @NonNull
    public final PFMedium itemSpecialCourseIntro;

    @NonNull
    public final PFBold itemSpecialCourseName;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final PFMedium tvCourseClass;

    private ItemHorizontalCourseRecommendBinding(@NonNull CardView rootView, @NonNull ImageView courseRecommendIcon, @NonNull RelativeLayout courseRecommendLayout, @NonNull View courseRecommendLayoutView, @NonNull PFMedium itemSpecialCourseIntro, @NonNull PFBold itemSpecialCourseName, @NonNull PFMedium tvCourseClass) {
        this.rootView = rootView;
        this.courseRecommendIcon = courseRecommendIcon;
        this.courseRecommendLayout = courseRecommendLayout;
        this.courseRecommendLayoutView = courseRecommendLayoutView;
        this.itemSpecialCourseIntro = itemSpecialCourseIntro;
        this.itemSpecialCourseName = itemSpecialCourseName;
        this.tvCourseClass = tvCourseClass;
    }

    @NonNull
    public static ItemHorizontalCourseRecommendBinding bind(@NonNull View rootView) {
        int r0 = R.id.course_recommend_icon;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_recommend_icon);
        if (r4 == null) goto L17;
        r0 = R.id.course_recommend_layout;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout);
        if (r5 == null) goto L17;
        r0 = R.id.course_recommend_layout_view;
        View r6 = ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout_view);
        if (r6 == null) goto L17;
        r0 = R.id.item_special_course_intro;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
        if (r7 == null) goto L17;
        r0 = R.id.item_special_course_name;
        PFBold r8 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
        if (r8 == null) goto L17;
        r0 = R.id.tv_course_class;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_course_class);
        if (r9 == null) goto L17;
        return new ItemHorizontalCourseRecommendBinding((CardView) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemHorizontalCourseRecommendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemHorizontalCourseRecommendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_horizontal_course_recommend, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
