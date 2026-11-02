package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.p610ui.trim.view.VideoTrimmerView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityVideoTrimBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final VideoTrimmerView trimmerView;

    private ActivityVideoTrimBinding(@NonNull LinearLayout rootView, @NonNull VideoTrimmerView trimmerView) {
        this.rootView = rootView;
        this.trimmerView = trimmerView;
    }

    @NonNull
    public static ActivityVideoTrimBinding bind(@NonNull View rootView) {
        VideoTrimmerView videoTrimmerView = (VideoTrimmerView) ViewBindings.findChildViewById(rootView, R.id.trimmer_view);
        if (videoTrimmerView != null) {
            return new ActivityVideoTrimBinding((LinearLayout) rootView, videoTrimmerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.trimmer_view)));
    }

    @NonNull
    public static ActivityVideoTrimBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityVideoTrimBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_video_trim, parent, false);
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
