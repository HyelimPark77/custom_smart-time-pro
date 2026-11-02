package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class SportStartListItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final AppCompatImageView startListIconIm;

    @NonNull
    public final AppCompatImageView startListIconImType;

    @NonNull
    public final PFMedium startListTvName;

    @NonNull
    public final RelativeLayout startOutdoorSport;

    private SportStartListItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatImageView startListIconIm, @NonNull AppCompatImageView startListIconImType, @NonNull PFMedium startListTvName, @NonNull RelativeLayout startOutdoorSport) {
        this.rootView = rootView;
        this.startListIconIm = startListIconIm;
        this.startListIconImType = startListIconImType;
        this.startListTvName = startListTvName;
        this.startOutdoorSport = startOutdoorSport;
    }

    @NonNull
    public static SportStartListItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.start_list_icon_im;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.start_list_icon_im);
        if (r4 == null) goto L11;
        r0 = R.id.start_list_icon_im_type;
        AppCompatImageView r5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.start_list_icon_im_type);
        if (r5 == null) goto L11;
        r0 = R.id.start_list_tv_name;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_list_tv_name);
        if (r6 == null) goto L11;
        RelativeLayout r3 = (RelativeLayout) rootView;
        return new SportStartListItemBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static SportStartListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static SportStartListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.sport_start_list_item, parent, false);
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
