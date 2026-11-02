package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopSelectAvatarBinding implements ViewBinding {

    @NonNull
    public final Button btnCamera;

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnPhotoAlbum;

    @NonNull
    private final LinearLayout rootView;

    private PopSelectAvatarBinding(@NonNull LinearLayout rootView, @NonNull Button btnCamera, @NonNull Button btnCancel, @NonNull Button btnPhotoAlbum) {
        this.rootView = rootView;
        this.btnCamera = btnCamera;
        this.btnCancel = btnCancel;
        this.btnPhotoAlbum = btnPhotoAlbum;
    }

    @NonNull
    public static PopSelectAvatarBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_camera;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_camera);
        if (r1 == null) goto L11;
        r0 = R.id.btn_cancel;
        Button r2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_cancel);
        if (r2 == null) goto L11;
        r0 = R.id.btn_photo_album;
        Button r3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_photo_album);
        if (r3 == null) goto L11;
        return new PopSelectAvatarBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopSelectAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopSelectAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_select_avatar, parent, false);
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
