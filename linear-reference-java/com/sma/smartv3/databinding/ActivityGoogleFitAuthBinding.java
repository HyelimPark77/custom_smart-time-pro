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
        int r0 = R.id.btn_revoke;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_revoke);
        if (r1 == null) goto L10;
        LinearLayout r2 = (LinearLayout) rootView;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
        if (r3 != null) goto L7;
        r0 = R.id.tvVersion;
        goto L10
    L7:
        return new ActivityGoogleFitAuthBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityGoogleFitAuthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityGoogleFitAuthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_google_fit_auth, parent, false);
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
