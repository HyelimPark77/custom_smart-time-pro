package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideBinding implements ViewBinding {

    @NonNull
    public final Button btnSet;

    @NonNull
    public final ImageView iv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvHighTip;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvTitle;

    private FragmentAppGuideBinding(@NonNull LinearLayout rootView_, @NonNull Button btnSet, @NonNull ImageView iv, @NonNull LinearLayout rootView, @NonNull PFMedium tvHighTip, @NonNull PFMedium tvTip, @NonNull PFMedium tvTitle) {
        this.rootView_ = rootView_;
        this.btnSet = btnSet;
        this.iv = iv;
        this.rootView = rootView;
        this.tvHighTip = tvHighTip;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentAppGuideBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_set;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_set);
        if (r4 == null) goto L15;
        r0 = R.id.iv;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_high_tip;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_high_tip);
        if (r7 == null) goto L15;
        r0 = R.id.tv_tip;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r8 == null) goto L15;
        r0 = R.id.tv_title;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r9 == null) goto L15;
        return new FragmentAppGuideBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAppGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAppGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_app_guide, parent, false);
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
