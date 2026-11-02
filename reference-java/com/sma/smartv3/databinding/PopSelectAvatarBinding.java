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
        int i = R.id.btn_camera;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_camera);
        if (button != null) {
            i = R.id.btn_cancel;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_cancel);
            if (button2 != null) {
                i = R.id.btn_photo_album;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_photo_album);
                if (button3 != null) {
                    return new PopSelectAvatarBinding((LinearLayout) rootView, button, button2, button3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopSelectAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopSelectAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_select_avatar, parent, false);
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
