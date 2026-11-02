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
public final class ItemAllCourseLayoutBinding implements ViewBinding {

    @NonNull
    public final CardView courseCardView;

    @NonNull
    public final PFMedium courseCourseIntro;

    @NonNull
    public final PFBold courseName;

    @NonNull
    public final ImageView coursePic;

    @NonNull
    public final RelativeLayout courseRecommendLayout;

    @NonNull
    private final CardView rootView;

    private ItemAllCourseLayoutBinding(@NonNull CardView rootView, @NonNull CardView courseCardView, @NonNull PFMedium courseCourseIntro, @NonNull PFBold courseName, @NonNull ImageView coursePic, @NonNull RelativeLayout courseRecommendLayout) {
        this.rootView = rootView;
        this.courseCardView = courseCardView;
        this.courseCourseIntro = courseCourseIntro;
        this.courseName = courseName;
        this.coursePic = coursePic;
        this.courseRecommendLayout = courseRecommendLayout;
    }

    @NonNull
    public static ItemAllCourseLayoutBinding bind(@NonNull View rootView) {
        CardView cardView = (CardView) rootView;
        int i = R.id.course_course_intro;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_course_intro);
        if (pFMedium != null) {
            i = R.id.course_name;
            PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.course_name);
            if (pFBold != null) {
                i = R.id.course_pic;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_pic);
                if (imageView != null) {
                    i = R.id.course_recommend_layout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout);
                    if (relativeLayout != null) {
                        return new ItemAllCourseLayoutBinding(cardView, cardView, pFMedium, pFBold, imageView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAllCourseLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAllCourseLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_all_course_layout, parent, false);
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
