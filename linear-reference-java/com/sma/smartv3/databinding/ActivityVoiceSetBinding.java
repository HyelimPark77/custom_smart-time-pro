package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityVoiceSetBinding implements ViewBinding {

    @NonNull
    public final Button btnActive;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTip;

    private ActivityVoiceSetBinding(@NonNull LinearLayout rootView, @NonNull Button btnActive, @NonNull PFMedium tvTip) {
        this.rootView = rootView;
        this.btnActive = btnActive;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityVoiceSetBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_active;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_active);
        if (r1 == null) goto L9;
        r0 = R.id.tv_tip;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r2 == null) goto L9;
        return new ActivityVoiceSetBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityVoiceSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityVoiceSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_voice_set, parent, false);
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
