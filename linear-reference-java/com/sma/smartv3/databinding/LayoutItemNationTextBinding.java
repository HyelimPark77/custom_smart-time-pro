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
        int r0 = R.id.check_selected_icon;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.check_selected_icon);
        if (r1 == null) goto L9;
        r0 = R.id.item_content;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_content);
        if (r2 == null) goto L9;
        return new LayoutItemNationTextBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutItemNationTextBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutItemNationTextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_item_nation_text, parent, false);
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
