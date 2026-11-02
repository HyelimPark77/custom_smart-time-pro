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
        int r0 = R.id.off_line_map_dis;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_dis);
        if (r1 == null) goto L11;
        r0 = R.id.off_line_map_icon;
        AppCompatImageView r2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_icon);
        if (r2 == null) goto L11;
        r0 = R.id.off_line_map_title;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_title);
        if (r3 == null) goto L11;
        return new ItemSearchMapDistrictBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSearchMapDistrictBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSearchMapDistrictBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_search_map_district, parent, false);
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
