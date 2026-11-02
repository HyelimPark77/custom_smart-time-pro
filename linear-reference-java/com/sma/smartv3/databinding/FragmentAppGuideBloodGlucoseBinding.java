package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideBloodGlucoseBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvNo;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final PFMedium tvYes;

    private FragmentAppGuideBloodGlucoseBinding(@NonNull LinearLayout rootView_, @NonNull ImageView iv, @NonNull LinearLayout rootView, @NonNull PFMedium tvNo, @NonNull PFMedium tvTitle, @NonNull PFMedium tvYes) {
        this.rootView_ = rootView_;
        this.iv = iv;
        this.rootView = rootView;
        this.tvNo = tvNo;
        this.tvTitle = tvTitle;
        this.tvYes = tvYes;
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r4 == null) goto L13;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_no;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no);
        if (r6 == null) goto L13;
        r0 = R.id.tv_title;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r7 == null) goto L13;
        r0 = R.id.tv_yes;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_yes);
        if (r8 == null) goto L13;
        return new FragmentAppGuideBloodGlucoseBinding(r3, r4, r3, r6, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_app_guide_blood_glucose, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
