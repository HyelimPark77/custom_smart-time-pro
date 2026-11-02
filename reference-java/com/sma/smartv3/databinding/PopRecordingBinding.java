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
public final class PopRecordingBinding implements ViewBinding {

    @NonNull
    public final ImageView popRecordingClearImg;

    @NonNull
    public final ImageView popRecordingImg;

    @NonNull
    private final LinearLayout rootView;

    private PopRecordingBinding(@NonNull LinearLayout rootView, @NonNull ImageView popRecordingClearImg, @NonNull ImageView popRecordingImg) {
        this.rootView = rootView;
        this.popRecordingClearImg = popRecordingClearImg;
        this.popRecordingImg = popRecordingImg;
    }

    @NonNull
    public static PopRecordingBinding bind(@NonNull View rootView) {
        int i = R.id.pop_recording_clear_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_clear_img);
        if (imageView != null) {
            i = R.id.pop_recording_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
            if (imageView2 != null) {
                return new PopRecordingBinding((LinearLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_recording, parent, false);
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
