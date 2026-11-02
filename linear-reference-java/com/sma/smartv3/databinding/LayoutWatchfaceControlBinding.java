package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWatchfaceControlBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dialSelect0;

    @NonNull
    public final LinearLayout dialSelect1;

    @NonNull
    public final LinearLayout dialSelect2;

    @NonNull
    public final LinearLayout dialSelect3;

    @NonNull
    public final ImageView dialSelectStatus0;

    @NonNull
    public final ImageView dialSelectStatus1;

    @NonNull
    public final ImageView dialSelectStatus2;

    @NonNull
    public final ImageView dialSelectStatus3;

    @NonNull
    public final ImageView ivDialSelect0;

    @NonNull
    public final ImageView ivDialSelect1;

    @NonNull
    public final ImageView ivDialSelect2;

    @NonNull
    public final ImageView ivDialSelect3;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private LayoutWatchfaceControlBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout dialSelect0, @NonNull LinearLayout dialSelect1, @NonNull LinearLayout dialSelect2, @NonNull LinearLayout dialSelect3, @NonNull ImageView dialSelectStatus0, @NonNull ImageView dialSelectStatus1, @NonNull ImageView dialSelectStatus2, @NonNull ImageView dialSelectStatus3, @NonNull ImageView ivDialSelect0, @NonNull ImageView ivDialSelect1, @NonNull ImageView ivDialSelect2, @NonNull ImageView ivDialSelect3, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.dialSelect0 = dialSelect0;
        this.dialSelect1 = dialSelect1;
        this.dialSelect2 = dialSelect2;
        this.dialSelect3 = dialSelect3;
        this.dialSelectStatus0 = dialSelectStatus0;
        this.dialSelectStatus1 = dialSelectStatus1;
        this.dialSelectStatus2 = dialSelectStatus2;
        this.dialSelectStatus3 = dialSelectStatus3;
        this.ivDialSelect0 = ivDialSelect0;
        this.ivDialSelect1 = ivDialSelect1;
        this.ivDialSelect2 = ivDialSelect2;
        this.ivDialSelect3 = ivDialSelect3;
        this.rv = rv;
    }

    @NonNull
    public static LayoutWatchfaceControlBinding bind(@NonNull View rootView) {
        int r1 = R.id.dialSelect0;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
        if (r5 == null) goto L31;
        r1 = R.id.dialSelect1;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect1);
        if (r6 == null) goto L31;
        r1 = R.id.dialSelect2;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect2);
        if (r7 == null) goto L31;
        r1 = R.id.dialSelect3;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect3);
        if (r8 == null) goto L31;
        r1 = R.id.dialSelectStatus0;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus0);
        if (r9 == null) goto L31;
        r1 = R.id.dialSelectStatus1;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus1);
        if (r10 == null) goto L31;
        r1 = R.id.dialSelectStatus2;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus2);
        if (r11 == null) goto L31;
        r1 = R.id.dialSelectStatus3;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus3);
        if (r12 == null) goto L31;
        r1 = R.id.ivDialSelect0;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDialSelect0);
        if (r13 == null) goto L31;
        r1 = R.id.ivDialSelect1;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDialSelect1);
        if (r14 == null) goto L31;
        r1 = R.id.ivDialSelect2;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDialSelect2);
        if (r15 == null) goto L31;
        r1 = R.id.ivDialSelect3;
        ImageView r16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDialSelect3);
        if (r16 == null) goto L31;
        r1 = R.id.rv;
        RecyclerView r17 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r17 == null) goto L31;
        return new LayoutWatchfaceControlBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
    L31:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static LayoutWatchfaceControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutWatchfaceControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_watchface_control, parent, false);
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
