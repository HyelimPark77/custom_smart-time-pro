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
        int i = R.id.start_list_icon_im;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.start_list_icon_im);
        if (appCompatImageView != null) {
            i = R.id.start_list_icon_im_type;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.start_list_icon_im_type);
            if (appCompatImageView2 != null) {
                i = R.id.start_list_tv_name;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_list_tv_name);
                if (pFMedium != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    return new SportStartListItemBinding(relativeLayout, appCompatImageView, appCompatImageView2, pFMedium, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportStartListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportStartListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_start_list_item, parent, false);
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
