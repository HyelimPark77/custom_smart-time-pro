package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSearchMapDistrictBinding implements ViewBinding {

    @NonNull
    public final TextView offLineMapDis;

    @NonNull
    public final AppCompatImageView offLineMapIcon;

    @NonNull
    public final TextView offLineMapTitle;

    @NonNull
    private final RelativeLayout rootView;

    private ItemSearchMapDistrictBinding(@NonNull RelativeLayout rootView, @NonNull TextView offLineMapDis, @NonNull AppCompatImageView offLineMapIcon, @NonNull TextView offLineMapTitle) {
        this.rootView = rootView;
        this.offLineMapDis = offLineMapDis;
        this.offLineMapIcon = offLineMapIcon;
        this.offLineMapTitle = offLineMapTitle;
    }

    @NonNull
    public static ItemSearchMapDistrictBinding bind(@NonNull View rootView) {
        int i = R.id.off_line_map_dis;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_dis);
        if (textView != null) {
            i = R.id.off_line_map_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_icon);
            if (appCompatImageView != null) {
                i = R.id.off_line_map_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_title);
                if (textView2 != null) {
                    return new ItemSearchMapDistrictBinding((RelativeLayout) rootView, textView, appCompatImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSearchMapDistrictBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSearchMapDistrictBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_search_map_district, parent, false);
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
