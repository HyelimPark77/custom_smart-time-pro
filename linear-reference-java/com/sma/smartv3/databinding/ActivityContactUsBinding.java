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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityContactUsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout facebookLl;

    @NonNull
    public final View facebookLlLine;

    @NonNull
    public final LinearLayout lineLl;

    @NonNull
    public final View lineLlLine;

    @NonNull
    public final View qqLine;

    @NonNull
    public final LinearLayout qqLl;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final LinearLayout whatsAppLl;

    @NonNull
    public final View whatsAppLlLine;

    @NonNull
    public final View wxLine;

    @NonNull
    public final LinearLayout wxLl;

    private ActivityContactUsBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout facebookLl, @NonNull View facebookLlLine, @NonNull LinearLayout lineLl, @NonNull View lineLlLine, @NonNull View qqLine, @NonNull LinearLayout qqLl, @NonNull LinearLayout rootView, @NonNull LinearLayout whatsAppLl, @NonNull View whatsAppLlLine, @NonNull View wxLine, @NonNull LinearLayout wxLl) {
        this.rootView_ = rootView_;
        this.facebookLl = facebookLl;
        this.facebookLlLine = facebookLlLine;
        this.lineLl = lineLl;
        this.lineLlLine = lineLlLine;
        this.qqLine = qqLine;
        this.qqLl = qqLl;
        this.rootView = rootView;
        this.whatsAppLl = whatsAppLl;
        this.whatsAppLlLine = whatsAppLlLine;
        this.wxLine = wxLine;
        this.wxLl = wxLl;
    }

    @NonNull
    public static ActivityContactUsBinding bind(@NonNull View rootView) {
        int r0 = R.id.facebookLl;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.facebookLl);
        if (r4 == null) goto L25;
        r0 = R.id.facebookLlLine;
        View r5 = ViewBindings.findChildViewById(rootView, R.id.facebookLlLine);
        if (r5 == null) goto L25;
        r0 = R.id.lineLl;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lineLl);
        if (r6 == null) goto L25;
        r0 = R.id.lineLlLine;
        View r7 = ViewBindings.findChildViewById(rootView, R.id.lineLlLine);
        if (r7 == null) goto L25;
        r0 = R.id.qqLine;
        View r8 = ViewBindings.findChildViewById(rootView, R.id.qqLine);
        if (r8 == null) goto L25;
        r0 = R.id.qqLl;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.qqLl);
        if (r9 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.whatsAppLl;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.whatsAppLl);
        if (r11 == null) goto L25;
        r0 = R.id.whatsAppLlLine;
        View r12 = ViewBindings.findChildViewById(rootView, R.id.whatsAppLlLine);
        if (r12 == null) goto L25;
        r0 = R.id.wxLine;
        View r13 = ViewBindings.findChildViewById(rootView, R.id.wxLine);
        if (r13 == null) goto L25;
        r0 = R.id.wxLl;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wxLl);
        if (r14 == null) goto L25;
        return new ActivityContactUsBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_contact_us, parent, false);
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
