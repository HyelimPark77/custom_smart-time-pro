package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStartBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout QQRl;

    @NonNull
    public final RelativeLayout faceBookRl;

    @NonNull
    public final RelativeLayout googleRl;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final NestedScrollView rv;

    @NonNull
    public final RelativeLayout twitterRl;

    @NonNull
    public final RelativeLayout weChatRl;

    @NonNull
    public final RelativeLayout weiBoRl;

    private ActivityStartBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout QQRl, @NonNull RelativeLayout faceBookRl, @NonNull RelativeLayout googleRl, @NonNull NestedScrollView rv, @NonNull RelativeLayout twitterRl, @NonNull RelativeLayout weChatRl, @NonNull RelativeLayout weiBoRl) {
        this.rootView = rootView;
        this.QQRl = QQRl;
        this.faceBookRl = faceBookRl;
        this.googleRl = googleRl;
        this.rv = rv;
        this.twitterRl = twitterRl;
        this.weChatRl = weChatRl;
        this.weiBoRl = weiBoRl;
    }

    @NonNull
    public static ActivityStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.QQRl;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.QQRl);
        if (r4 == null) goto L19;
        r0 = R.id.faceBookRl;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.faceBookRl);
        if (r5 == null) goto L19;
        r0 = R.id.googleRl;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.googleRl);
        if (r6 == null) goto L19;
        r0 = R.id.rv;
        NestedScrollView r7 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r7 == null) goto L19;
        r0 = R.id.twitterRl;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.twitterRl);
        if (r8 == null) goto L19;
        r0 = R.id.weChatRl;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weChatRl);
        if (r9 == null) goto L19;
        r0 = R.id.weiBoRl;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weiBoRl);
        if (r10 == null) goto L19;
        return new ActivityStartBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_start, parent, false);
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
