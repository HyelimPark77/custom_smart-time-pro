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
        int i = R.id.tv_name;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (pFMedium != null) {
            i = R.id.tv_title;
            MyDigitalClock myDigitalClock = (MyDigitalClock) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (myDigitalClock != null) {
                return new ItemWorldClockBinding((RelativeLayout) rootView, pFMedium, myDigitalClock);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_world_clock, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
