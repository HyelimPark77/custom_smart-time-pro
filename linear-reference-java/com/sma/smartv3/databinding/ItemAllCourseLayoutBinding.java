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
        CardView r1 = (CardView) rootView;
        int r0 = R.id.course_course_intro;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_course_intro);
        if (r3 == null) goto L13;
        r0 = R.id.course_name;
        PFBold r4 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.course_name);
        if (r4 == null) goto L13;
        r0 = R.id.course_pic;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_pic);
        if (r5 == null) goto L13;
        r0 = R.id.course_recommend_layout;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_recommend_layout);
        if (r6 == null) goto L13;
        return new ItemAllCourseLayoutBinding(r1, r1, r3, r4, r5, r6);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAllCourseLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAllCourseLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_all_course_layout, parent, false);
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
