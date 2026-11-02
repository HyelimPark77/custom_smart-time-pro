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
public final class ActivityGoogleFitAuthBinding implements ViewBinding {

    @NonNull
    public final Button btnRevoke;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvVersion;

    private ActivityGoogleFitAuthBinding(@NonNull LinearLayout rootView_, @NonNull Button btnRevoke, @NonNull LinearLayout rootView, @NonNull PFMedium tvVersion) {
        this.rootView_ = rootView_;
        this.btnRevoke = btnRevoke;
        this.rootView = rootView;
        this.tvVersion = tvVersion;
    }

    @NonNull
    public static ActivityGoogleFitAuthBinding bind(@NonNull View rootView) {
        int i = R.id.btn_revoke;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_revoke);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
            if (pFMedium != null) {
                return new ActivityGoogleFitAuthBinding(linearLayout, button, linearLayout, pFMedium);
            }
            i = R.id.tvVersion;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGoogleFitAuthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGoogleFitAuthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_google_fit_auth, parent, false);
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
