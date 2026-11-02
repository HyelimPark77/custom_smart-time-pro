package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySparkchainMultideviceBinding implements ViewBinding {

    @NonNull
    public final PFMedium leftRecordDetail;

    @NonNull
    public final ImageView leftRecordingImg;

    @NonNull
    public final ImageView popRecordingImg;

    @NonNull
    public final PFMedium rightRecordDetail;

    @NonNull
    public final ImageView rightRecordingImg;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50999rv;

    private ActivitySparkchainMultideviceBinding(@NonNull LinearLayout rootView, @NonNull PFMedium leftRecordDetail, @NonNull ImageView leftRecordingImg, @NonNull ImageView popRecordingImg, @NonNull PFMedium rightRecordDetail, @NonNull ImageView rightRecordingImg, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.leftRecordDetail = leftRecordDetail;
        this.leftRecordingImg = leftRecordingImg;
        this.popRecordingImg = popRecordingImg;
        this.rightRecordDetail = rightRecordDetail;
        this.rightRecordingImg = rightRecordingImg;
        this.f50999rv = rv;
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding bind(@NonNull View rootView) {
        int i = R.id.left_record_detail;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.left_record_detail);
        if (pFMedium != null) {
            i = R.id.left_recording_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_recording_img);
            if (imageView != null) {
                i = R.id.pop_recording_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
                if (imageView2 != null) {
                    i = R.id.right_record_detail;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.right_record_detail);
                    if (pFMedium2 != null) {
                        i = R.id.right_recording_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_recording_img);
                        if (imageView3 != null) {
                            i = R.id.f51422rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                            if (recyclerView != null) {
                                return new ActivitySparkchainMultideviceBinding((LinearLayout) rootView, pFMedium, imageView, imageView2, pFMedium2, imageView3, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sparkchain_multidevice, parent, false);
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
