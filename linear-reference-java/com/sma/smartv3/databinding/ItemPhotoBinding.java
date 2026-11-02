package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPhotoBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    private final ImageView rootView;

    private ItemPhotoBinding(@NonNull ImageView rootView, @NonNull ImageView iv) {
        this.rootView = rootView;
        this.iv = iv;
    }

    @NonNull
    public static ItemPhotoBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        ImageView r1 = (ImageView) rootView;
        return new ItemPhotoBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_photo, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
