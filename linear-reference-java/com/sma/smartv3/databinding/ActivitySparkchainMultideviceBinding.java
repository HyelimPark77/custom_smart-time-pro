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

    @NonNull
    public final RecyclerView rv;

    private ActivitySparkchainMultideviceBinding(@NonNull LinearLayout rootView, @NonNull PFMedium leftRecordDetail, @NonNull ImageView leftRecordingImg, @NonNull ImageView popRecordingImg, @NonNull PFMedium rightRecordDetail, @NonNull ImageView rightRecordingImg, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.leftRecordDetail = leftRecordDetail;
        this.leftRecordingImg = leftRecordingImg;
        this.popRecordingImg = popRecordingImg;
        this.rightRecordDetail = rightRecordDetail;
        this.rightRecordingImg = rightRecordingImg;
        this.rv = rv;
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding bind(@NonNull View rootView) {
        int r0 = R.id.left_record_detail;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.left_record_detail);
        if (r4 == null) goto L17;
        r0 = R.id.left_recording_img;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_recording_img);
        if (r5 == null) goto L17;
        r0 = R.id.pop_recording_img;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
        if (r6 == null) goto L17;
        r0 = R.id.right_record_detail;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.right_record_detail);
        if (r7 == null) goto L17;
        r0 = R.id.right_recording_img;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_recording_img);
        if (r8 == null) goto L17;
        r0 = R.id.rv;
        RecyclerView r9 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r9 == null) goto L17;
        return new ActivitySparkchainMultideviceBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySparkchainMultideviceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sparkchain_multidevice, parent, false);
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
