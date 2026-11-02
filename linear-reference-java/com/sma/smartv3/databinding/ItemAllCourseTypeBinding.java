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
        int r0 = R.id.course_type_tv;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_type_tv);
        if (r1 == null) goto L9;
        r0 = R.id.course_type_view;
        View r2 = ViewBindings.findChildViewById(rootView, R.id.course_type_view);
        if (r2 == null) goto L9;
        return new ItemAllCourseTypeBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAllCourseTypeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAllCourseTypeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_all_course_type, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
