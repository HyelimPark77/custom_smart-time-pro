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
        int i = R.id.off_line_map_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_icon);
        if (appCompatImageView != null) {
            i = R.id.off_line_map_more;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_more);
            if (appCompatImageView2 != null) {
                i = R.id.off_line_map_size;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_size);
                if (textView != null) {
                    i = R.id.off_line_map_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_title);
                    if (textView2 != null) {
                        i = R.id.off_line_map_type;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.off_line_map_type);
                        if (textView3 != null) {
                            return new ItemOffLineMapBinding((RelativeLayout) rootView, appCompatImageView, appCompatImageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOffLineMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemOffLineMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_off_line_map, parent, false);
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
