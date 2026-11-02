package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemMusicControlBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemMusicControlBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv) {
        this.rootView = rootView;
        this.iv = iv;
    }

    @NonNull
    public static DeviceItemMusicControlBinding bind(@NonNull View rootView) {
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L7;
        return new DeviceItemMusicControlBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv)));
    }

    @NonNull
    public static DeviceItemMusicControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemMusicControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_music_control, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
