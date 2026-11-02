package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCameraBinding implements ViewBinding {

    @NonNull
    public final ImageButton btnAlbum;

    @NonNull
    public final ImageButton btnCapture;

    @NonNull
    public final ImageButton btnSwitchCamera;

    @NonNull
    public final CameraView cameraView;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityCameraBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btnAlbum, @NonNull ImageButton btnCapture, @NonNull ImageButton btnSwitchCamera, @NonNull CameraView cameraView, @NonNull ImageView ivBack) {
        this.rootView = rootView;
        this.btnAlbum = btnAlbum;
        this.btnCapture = btnCapture;
        this.btnSwitchCamera = btnSwitchCamera;
        this.cameraView = cameraView;
        this.ivBack = ivBack;
    }

    @NonNull
    public static ActivityCameraBinding bind(@NonNull View rootView) {
        int i = R.id.btn_album;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_album);
        if (imageButton != null) {
            i = R.id.btn_capture;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_capture);
            if (imageButton2 != null) {
                i = R.id.btn_switch_camera;
                ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_switch_camera);
                if (imageButton3 != null) {
                    i = R.id.camera_view;
                    CameraView cameraView = (CameraView) ViewBindings.findChildViewById(rootView, R.id.camera_view);
                    if (cameraView != null) {
                        i = R.id.iv_back;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_back);
                        if (imageView != null) {
                            return new ActivityCameraBinding((RelativeLayout) rootView, imageButton, imageButton2, imageButton3, cameraView, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_camera, parent, false);
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
