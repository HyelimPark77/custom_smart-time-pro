package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.MyDigitalClock;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemWorldClockBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final MyDigitalClock tvTitle;

    private ItemWorldClockBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium tvName, @NonNull MyDigitalClock tvTitle) {
        this.rootView = rootView;
        this.tvName = tvName;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemWorldClockBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv_name;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r1 == null) goto L9;
        r0 = R.id.tv_title;
        MyDigitalClock r2 = (MyDigitalClock) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r2 == null) goto L9;
        return new ItemWorldClockBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_world_clock, parent, false);
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
