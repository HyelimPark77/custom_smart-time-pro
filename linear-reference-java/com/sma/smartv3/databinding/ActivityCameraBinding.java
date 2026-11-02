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
        int r0 = R.id.btn_album;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_album);
        if (r4 == null) goto L15;
        r0 = R.id.btn_capture;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_capture);
        if (r5 == null) goto L15;
        r0 = R.id.btn_switch_camera;
        ImageButton r6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_switch_camera);
        if (r6 == null) goto L15;
        r0 = R.id.camera_view;
        CameraView r7 = (CameraView) ViewBindings.findChildViewById(rootView, R.id.camera_view);
        if (r7 == null) goto L15;
        r0 = R.id.iv_back;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_back);
        if (r8 == null) goto L15;
        return new ActivityCameraBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_camera, parent, false);
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
