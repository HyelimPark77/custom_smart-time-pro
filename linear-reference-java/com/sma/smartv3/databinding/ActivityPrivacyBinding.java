package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityPrivacyBinding implements ViewBinding {

    @NonNull
    public final Button btAgree;

    @NonNull
    public final Button btDeny;

    @NonNull
    public final AppCompatCheckBox privacyAppCheck;

    @NonNull
    public final PFMedium privacyAppTv;

    @NonNull
    public final PFMedium privacyContentTv;

    @NonNull
    private final LinearLayout rootView;

    private ActivityPrivacyBinding(@NonNull LinearLayout rootView, @NonNull Button btAgree, @NonNull Button btDeny, @NonNull AppCompatCheckBox privacyAppCheck, @NonNull PFMedium privacyAppTv, @NonNull PFMedium privacyContentTv) {
        this.rootView = rootView;
        this.btAgree = btAgree;
        this.btDeny = btDeny;
        this.privacyAppCheck = privacyAppCheck;
        this.privacyAppTv = privacyAppTv;
        this.privacyContentTv = privacyContentTv;
    }

    @NonNull
    public static ActivityPrivacyBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_agree;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_agree);
        if (r4 == null) goto L15;
        r0 = R.id.bt_deny;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_deny);
        if (r5 == null) goto L15;
        r0 = R.id.privacyAppCheck;
        AppCompatCheckBox r6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.privacyAppCheck);
        if (r6 == null) goto L15;
        r0 = R.id.privacyAppTv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyAppTv);
        if (r7 == null) goto L15;
        r0 = R.id.privacyContentTv;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyContentTv);
        if (r8 == null) goto L15;
        return new ActivityPrivacyBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityPrivacyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_privacy, parent, false);
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
