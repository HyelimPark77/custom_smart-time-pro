package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityPhoneBindGuideBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flContent;

    @NonNull
    private final LinearLayout rootView;

    private ActivityPhoneBindGuideBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout flContent) {
        this.rootView = rootView;
        this.flContent = flContent;
    }

    @NonNull
    public static ActivityPhoneBindGuideBinding bind(@NonNull View rootView) {
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.flContent);
        if (r1 == null) goto L7;
        return new ActivityPhoneBindGuideBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.flContent)));
    }

    @NonNull
    public static ActivityPhoneBindGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityPhoneBindGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_phone_bind_guide, parent, false);
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
