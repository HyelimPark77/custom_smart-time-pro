package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiItemFunctionBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51010iv;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvDesc;

    @NonNull
    public final PFMedium tvTitle;

    private AiItemFunctionBinding(@NonNull RelativeLayout rootView, @NonNull ImageView iv, @NonNull PFMedium tvDesc, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.f51010iv = iv;
        this.tvDesc = tvDesc;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static AiItemFunctionBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            i = R.id.tv_desc;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
            if (pFMedium != null) {
                i = R.id.tv_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (pFMedium2 != null) {
                    return new AiItemFunctionBinding((RelativeLayout) rootView, imageView, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiItemFunctionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiItemFunctionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_item_function, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
