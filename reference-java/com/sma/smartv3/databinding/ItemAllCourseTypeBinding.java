package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAllCourseTypeBinding implements ViewBinding {

    @NonNull
    public final TextView courseTypeTv;

    @NonNull
    public final View courseTypeView;

    @NonNull
    private final RelativeLayout rootView;

    private ItemAllCourseTypeBinding(@NonNull RelativeLayout rootView, @NonNull TextView courseTypeTv, @NonNull View courseTypeView) {
        this.rootView = rootView;
        this.courseTypeTv = courseTypeTv;
        this.courseTypeView = courseTypeView;
    }

    @NonNull
    public static ItemAllCourseTypeBinding bind(@NonNull View rootView) {
        int i = R.id.course_type_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_type_tv);
        if (textView != null) {
            i = R.id.course_type_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.course_type_view);
            if (viewFindChildViewById != null) {
                return new ItemAllCourseTypeBinding((RelativeLayout) rootView, textView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAllCourseTypeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAllCourseTypeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_all_course_type, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
