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
        int i = R.id.course_recommend_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_recommend_icon);
        if (imageView != null) {
            i = R.id.course_recommend_layout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout);
            if (relativeLayout != null) {
                i = R.id.course_recommend_layout_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout_view);
                if (viewFindChildViewById != null) {
                    i = R.id.item_special_course_intro;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_special_course_intro);
                    if (pFMedium != null) {
                        i = R.id.item_special_course_name;
                        PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.item_special_course_name);
                        if (pFBold != null) {
                            i = R.id.tv_course_class;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_course_class);
                            if (pFMedium2 != null) {
                                return new ItemHorizontalCourseRecommendBinding((CardView) rootView, imageView, relativeLayout, viewFindChildViewById, pFMedium, pFBold, pFMedium2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHorizontalCourseRecommendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemHorizontalCourseRecommendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_horizontal_course_recommend, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
