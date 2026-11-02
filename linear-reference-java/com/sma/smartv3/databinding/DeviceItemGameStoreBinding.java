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
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.game_store_icon);
        if (r1 == null) goto L7;
        return new DeviceItemGameStoreBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.game_store_icon)));
    }

    @NonNull
    public static DeviceItemGameStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemGameStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_game_store, parent, false);
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
