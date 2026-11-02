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
public final class PopLoadBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvContent;

    @NonNull
    public final PFMedium tvTitle;

    private PopLoadBinding(@NonNull LinearLayout rootView, @NonNull PFMedium tvContent, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.tvContent = tvContent;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static PopLoadBinding bind(@NonNull View rootView) {
        int i = R.id.tv_content;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_content);
        if (pFMedium != null) {
            i = R.id.tv_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (pFMedium2 != null) {
                return new PopLoadBinding((LinearLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopLoadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopLoadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_load, parent, false);
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
