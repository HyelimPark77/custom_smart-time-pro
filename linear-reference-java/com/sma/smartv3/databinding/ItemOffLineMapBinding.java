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
public final class ItemOffLineMapBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView offLineMapIcon;

    @NonNull
    public final AppCompatImageView offLineMapMore;

    @NonNull
    public final TextView offLineMapSize;

    @NonNull
    public final TextView offLineMapTitle;

    @NonNull
    public final TextView offLineMapType;

    @NonNull
    private final RelativeLayout rootView;

    private ItemOffLineMapBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatImageView offLineMapIcon, @NonNull AppCompatImageView offLineMapMore, @NonNull TextView offLineMapSize, @NonNull TextView offLineMapTitle, @NonNull TextView offLineMapType) {
        this.rootView = rootView;
        this.offLineMapIcon = offLineMapIcon;
        this.offLineMapMore = offLineMapMore;
        this.offLineMapSize = offLineMapSize;
        this.offLineMapTitle = offLineMapTitle;
        this.offLineMapType = offLineMapType;
    }

    @NonNull
    public static ItemOffLineMapBinding bind(@NonNull View rootView) {
        int r0 = R.id.off_line_map_icon;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_icon);
        if (r4 == null) goto L15;
        r0 = R.id.off_line_map_more;
        AppCompatImageView r5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_more);
        if (r5 == null) goto L15;
        r0 = R.id.off_line_map_size;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_size);
        if (r6 == null) goto L15;
        r0 = R.id.off_line_map_title;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_title);
        if (r7 == null) goto L15;
        r0 = R.id.off_line_map_type;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_type);
        if (r8 == null) goto L15;
        return new ItemOffLineMapBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemOffLineMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemOffLineMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_off_line_map, parent, false);
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
