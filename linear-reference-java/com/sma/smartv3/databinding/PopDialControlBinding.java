package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialControlBinding implements ViewBinding {

    @NonNull
    public final Button confirmButton;

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
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private PopDialControlBinding(@NonNull LinearLayout rootView, @NonNull Button confirmButton, @NonNull LinearLayout dialSelect0, @NonNull LinearLayout dialSelect1, @NonNull LinearLayout dialSelect2, @NonNull LinearLayout dialSelect3, @NonNull ImageView dialSelectStatus0, @NonNull ImageView dialSelectStatus1, @NonNull ImageView dialSelectStatus2, @NonNull ImageView dialSelectStatus3, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.confirmButton = confirmButton;
        this.dialSelect0 = dialSelect0;
        this.dialSelect1 = dialSelect1;
        this.dialSelect2 = dialSelect2;
        this.dialSelect3 = dialSelect3;
        this.dialSelectStatus0 = dialSelectStatus0;
        this.dialSelectStatus1 = dialSelectStatus1;
        this.dialSelectStatus2 = dialSelectStatus2;
        this.dialSelectStatus3 = dialSelectStatus3;
        this.rv = rv;
    }

    @NonNull
    public static PopDialControlBinding bind(@NonNull View rootView) {
        int r0 = R.id.confirmButton;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
        if (r4 == null) goto L25;
        r0 = R.id.dialSelect0;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
        if (r5 == null) goto L25;
        r0 = R.id.dialSelect1;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect1);
        if (r6 == null) goto L25;
        r0 = R.id.dialSelect2;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect2);
        if (r7 == null) goto L25;
        r0 = R.id.dialSelect3;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect3);
        if (r8 == null) goto L25;
        r0 = R.id.dialSelectStatus0;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus0);
        if (r9 == null) goto L25;
        r0 = R.id.dialSelectStatus1;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus1);
        if (r10 == null) goto L25;
        r0 = R.id.dialSelectStatus2;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus2);
        if (r11 == null) goto L25;
        r0 = R.id.dialSelectStatus3;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus3);
        if (r12 == null) goto L25;
        r0 = R.id.rv;
        RecyclerView r13 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r13 == null) goto L25;
        return new PopDialControlBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopDialControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDialControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_dial_control, parent, false);
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
