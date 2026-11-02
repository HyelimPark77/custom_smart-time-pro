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
public final class DeviceItemGameStoreBinding implements ViewBinding {

    @NonNull
    public final ImageView gameStoreIcon;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemGameStoreBinding(@NonNull LinearLayout rootView, @NonNull ImageView gameStoreIcon) {
        this.rootView = rootView;
        this.gameStoreIcon = gameStoreIcon;
    }

    @NonNull
    public static DeviceItemGameStoreBinding bind(@NonNull View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.game_store_icon);
        if (imageView != null) {
            return new DeviceItemGameStoreBinding((LinearLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.game_store_icon)));
    }

    @NonNull
    public static DeviceItemGameStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemGameStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_game_store, parent, false);
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
