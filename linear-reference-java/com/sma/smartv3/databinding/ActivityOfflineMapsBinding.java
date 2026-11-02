package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityOfflineMapsBinding implements ViewBinding {

    @NonNull
    public final Button btnBottom;

    @NonNull
    public final LinearLayout nullView;

    @NonNull
    public final TextView offlineMapsTitle;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final ProgressBar stepV2GoalPbProgress;

    @NonNull
    public final TextView storageDevice;

    private ActivityOfflineMapsBinding(@NonNull LinearLayout rootView, @NonNull Button btnBottom, @NonNull LinearLayout nullView, @NonNull TextView offlineMapsTitle, @NonNull LinearLayout root, @NonNull RecyclerView rv, @NonNull ProgressBar stepV2GoalPbProgress, @NonNull TextView storageDevice) {
        this.rootView = rootView;
        this.btnBottom = btnBottom;
        this.nullView = nullView;
        this.offlineMapsTitle = offlineMapsTitle;
        this.root = root;
        this.rv = rv;
        this.stepV2GoalPbProgress = stepV2GoalPbProgress;
        this.storageDevice = storageDevice;
    }

    @NonNull
    public static ActivityOfflineMapsBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_bottom;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom);
        if (r4 == null) goto L17;
        r0 = R.id.null_view;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.null_view);
        if (r5 == null) goto L17;
        r0 = R.id.offline_maps_title;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.offline_maps_title);
        if (r6 == null) goto L17;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r8 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r8 == null) goto L17;
        r0 = R.id.step_v2_goal_pb_progress;
        ProgressBar r9 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.step_v2_goal_pb_progress);
        if (r9 == null) goto L17;
        r0 = R.id.storage_device;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.storage_device);
        if (r10 == null) goto L17;
        return new ActivityOfflineMapsBinding(r3, r4, r5, r6, r3, r8, r9, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityOfflineMapsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityOfflineMapsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_offline_maps, parent, false);
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
