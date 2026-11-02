package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWatchfaceTimeBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout dialSelect0;

    @NonNull
    public final ImageView dialSelectStatus0;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView tv0;

    @NonNull
    public final TextView tv1;

    @NonNull
    public final TextView tv2;

    private LayoutWatchfaceTimeBinding(@NonNull LinearLayout rootView, @NonNull RelativeLayout dialSelect0, @NonNull ImageView dialSelectStatus0, @NonNull RecyclerView rv, @NonNull TextView tv0, @NonNull TextView tv1, @NonNull TextView tv2) {
        this.rootView = rootView;
        this.dialSelect0 = dialSelect0;
        this.dialSelectStatus0 = dialSelectStatus0;
        this.rv = rv;
        this.tv0 = tv0;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    @NonNull
    public static LayoutWatchfaceTimeBinding bind(@NonNull View rootView) {
        int r0 = R.id.dialSelect0;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
        if (r4 == null) goto L17;
        r0 = R.id.dialSelectStatus0;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus0);
        if (r5 == null) goto L17;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L17;
        r0 = R.id.tv0;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv0);
        if (r7 == null) goto L17;
        r0 = R.id.tv1;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv1);
        if (r8 == null) goto L17;
        r0 = R.id.tv2;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv2);
        if (r9 == null) goto L17;
        return new LayoutWatchfaceTimeBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutWatchfaceTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutWatchfaceTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_watchface_time, parent, false);
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
