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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51059iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemMusicControlBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv) {
        this.rootView = rootView;
        this.f51059iv = iv;
    }

    @NonNull
    public static DeviceItemMusicControlBinding bind(@NonNull View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            return new DeviceItemMusicControlBinding((LinearLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51417iv)));
    }

    @NonNull
    public static DeviceItemMusicControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemMusicControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_music_control, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
