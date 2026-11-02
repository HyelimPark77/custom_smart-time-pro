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
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.flContent);
        if (frameLayout != null) {
            return new ActivityPhoneBindGuideBinding((LinearLayout) rootView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.flContent)));
    }

    @NonNull
    public static ActivityPhoneBindGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPhoneBindGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_phone_bind_guide, parent, false);
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
