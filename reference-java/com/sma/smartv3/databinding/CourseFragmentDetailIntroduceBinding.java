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
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_detail_introduce);
        if (pFMedium != null) {
            return new CourseFragmentDetailIntroduceBinding((NestedScrollView) rootView, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.course_detail_introduce)));
    }

    @NonNull
    public static CourseFragmentDetailIntroduceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CourseFragmentDetailIntroduceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.course_fragment_detail_introduce, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
