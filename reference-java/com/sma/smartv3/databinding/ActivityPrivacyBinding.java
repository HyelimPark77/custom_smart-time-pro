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
        int i = R.id.bt_agree;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_agree);
        if (button != null) {
            i = R.id.bt_deny;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_deny);
            if (button2 != null) {
                i = R.id.privacyAppCheck;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.privacyAppCheck);
                if (appCompatCheckBox != null) {
                    i = R.id.privacyAppTv;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyAppTv);
                    if (pFMedium != null) {
                        i = R.id.privacyContentTv;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.privacyContentTv);
                        if (pFMedium2 != null) {
                            return new ActivityPrivacyBinding((LinearLayout) rootView, button, button2, appCompatCheckBox, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPrivacyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_privacy, parent, false);
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
