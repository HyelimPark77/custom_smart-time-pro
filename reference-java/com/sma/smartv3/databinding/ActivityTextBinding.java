package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTextBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium textTv;

    private ActivityTextBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull PFMedium textTv) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.textTv = textTv;
    }

    @NonNull
    public static ActivityTextBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.text_tv);
        if (pFMedium != null) {
            return new ActivityTextBinding(linearLayout, linearLayout, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.text_tv)));
    }

    @NonNull
    public static ActivityTextBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_text, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
