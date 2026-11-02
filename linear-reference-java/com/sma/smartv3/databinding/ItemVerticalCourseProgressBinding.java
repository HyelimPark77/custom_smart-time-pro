package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemVerticalCourseProgressBinding implements ViewBinding {

    @NonNull
    public final TextView courseActionName;

    @NonNull
    public final TextView courseNumber;

    @NonNull
    public final TextView courseTime;

    @NonNull
    private final LinearLayout rootView;

    private ItemVerticalCourseProgressBinding(@NonNull LinearLayout rootView, @NonNull TextView courseActionName, @NonNull TextView courseNumber, @NonNull TextView courseTime) {
        this.rootView = rootView;
        this.courseActionName = courseActionName;
        this.courseNumber = courseNumber;
        this.courseTime = courseTime;
    }

    @NonNull
    public static ItemVerticalCourseProgressBinding bind(@NonNull View rootView) {
        int r0 = R.id.course_action_name;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_action_name);
        if (r1 == null) goto L11;
        r0 = R.id.course_number;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_number);
        if (r2 == null) goto L11;
        r0 = R.id.course_time;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_time);
        if (r3 == null) goto L11;
        return new ItemVerticalCourseProgressBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemVerticalCourseProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemVerticalCourseProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_vertical_course_progress, parent, false);
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
