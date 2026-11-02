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
public final class AiItemFunctionLeftBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvDesc;

    @NonNull
    public final PFMedium tvTitle;

    private AiItemFunctionLeftBinding(@NonNull RelativeLayout rootView, @NonNull ImageView iv, @NonNull PFMedium tvDesc, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.iv = iv;
        this.tvDesc = tvDesc;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static AiItemFunctionLeftBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L11;
        r0 = R.id.tv_desc;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
        if (r2 == null) goto L11;
        r0 = R.id.tv_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r3 == null) goto L11;
        return new AiItemFunctionLeftBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiItemFunctionLeftBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiItemFunctionLeftBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_item_function_left, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
