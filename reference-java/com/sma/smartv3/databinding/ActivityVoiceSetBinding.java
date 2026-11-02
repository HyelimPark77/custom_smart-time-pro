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
        int i = R.id.btn_active;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_active);
        if (button != null) {
            i = R.id.tv_tip;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
            if (pFMedium != null) {
                return new ActivityVoiceSetBinding((LinearLayout) rootView, button, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityVoiceSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityVoiceSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_voice_set, parent, false);
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
