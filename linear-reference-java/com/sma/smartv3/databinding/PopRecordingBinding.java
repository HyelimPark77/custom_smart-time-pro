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
        int r0 = R.id.pop_recording_clear_img;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_clear_img);
        if (r1 == null) goto L9;
        r0 = R.id.pop_recording_img;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
        if (r2 == null) goto L9;
        return new PopRecordingBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_recording, parent, false);
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
