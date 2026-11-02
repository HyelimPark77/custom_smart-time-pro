package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseFragmentDetailIntroduceBinding implements ViewBinding {

    @NonNull
    public final PFMedium courseDetailIntroduce;

    @NonNull
    private final NestedScrollView rootView;

    private CourseFragmentDetailIntroduceBinding(@NonNull NestedScrollView rootView, @NonNull PFMedium courseDetailIntroduce) {
        this.rootView = rootView;
        this.courseDetailIntroduce = courseDetailIntroduce;
    }

    @NonNull
    public static CourseFragmentDetailIntroduceBinding bind(@NonNull View rootView) {
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_detail_introduce);
        if (r1 == null) goto L7;
        return new CourseFragmentDetailIntroduceBinding((NestedScrollView) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.course_detail_introduce)));
    }

    @NonNull
    public static CourseFragmentDetailIntroduceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CourseFragmentDetailIntroduceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.course_fragment_detail_introduce, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
