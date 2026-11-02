package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutItemNationTextBinding implements ViewBinding {

    @NonNull
    public final ImageView checkSelectedIcon;

    @NonNull
    public final TextView itemContent;

    @NonNull
    private final RelativeLayout rootView;

    private LayoutItemNationTextBinding(@NonNull RelativeLayout rootView, @NonNull ImageView checkSelectedIcon, @NonNull TextView itemContent) {
        this.rootView = rootView;
        this.checkSelectedIcon = checkSelectedIcon;
        this.itemContent = itemContent;
    }

    @NonNull
    public static LayoutItemNationTextBinding bind(@NonNull View rootView) {
        int i = R.id.check_selected_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.check_selected_icon);
        if (imageView != null) {
            i = R.id.item_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_content);
            if (textView != null) {
                return new LayoutItemNationTextBinding((RelativeLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutItemNationTextBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutItemNationTextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_item_nation_text, parent, false);
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
