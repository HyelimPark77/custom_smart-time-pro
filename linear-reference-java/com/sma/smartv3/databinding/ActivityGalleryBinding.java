package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGalleryBinding implements ViewBinding {

    @NonNull
    private final ViewPager rootView;

    @NonNull
    public final ViewPager viewPager;

    private ActivityGalleryBinding(@NonNull ViewPager rootView, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityGalleryBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        ViewPager r1 = (ViewPager) rootView;
        return new ActivityGalleryBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_gallery, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ViewPager getRoot() {
        return this.rootView;
    }
}
