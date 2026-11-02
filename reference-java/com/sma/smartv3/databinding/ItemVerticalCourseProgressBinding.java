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
        int i = R.id.course_action_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_action_name);
        if (textView != null) {
            i = R.id.course_number;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_number);
            if (textView2 != null) {
                i = R.id.course_time;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.course_time);
                if (textView3 != null) {
                    return new ItemVerticalCourseProgressBinding((LinearLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemVerticalCourseProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemVerticalCourseProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_vertical_course_progress, parent, false);
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
