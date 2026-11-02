package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutMusicPickItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvTitle;

    private LayoutMusicPickItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox cbSelectedState, @NonNull TextView tvName, @NonNull TextView tvTitle) {
        this.rootView = rootView;
        this.cbSelectedState = cbSelectedState;
        this.tvName = tvName;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static LayoutMusicPickItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.cbSelectedState;
        AppCompatCheckBox r1 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cbSelectedState);
        if (r1 == null) goto L11;
        r0 = R.id.tvName;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvName);
        if (r2 == null) goto L11;
        r0 = R.id.tvTitle;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
        if (r3 == null) goto L11;
        return new LayoutMusicPickItemBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutMusicPickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutMusicPickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_music_pick_item, parent, false);
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
