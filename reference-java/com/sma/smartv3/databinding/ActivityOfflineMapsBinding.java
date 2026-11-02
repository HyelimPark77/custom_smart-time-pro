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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50992rv;

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
        this.f50992rv = rv;
        this.stepV2GoalPbProgress = stepV2GoalPbProgress;
        this.storageDevice = storageDevice;
    }

    @NonNull
    public static ActivityOfflineMapsBinding bind(@NonNull View rootView) {
        int i = R.id.btn_bottom;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom);
        if (button != null) {
            i = R.id.null_view;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.null_view);
            if (linearLayout != null) {
                i = R.id.offline_maps_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.offline_maps_title);
                if (textView != null) {
                    LinearLayout linearLayout2 = (LinearLayout) rootView;
                    i = R.id.f51422rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                    if (recyclerView != null) {
                        i = R.id.step_v2_goal_pb_progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.step_v2_goal_pb_progress);
                        if (progressBar != null) {
                            i = R.id.storage_device;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.storage_device);
                            if (textView2 != null) {
                                return new ActivityOfflineMapsBinding(linearLayout2, button, linearLayout, textView, linearLayout2, recyclerView, progressBar, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOfflineMapsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityOfflineMapsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_offline_maps, parent, false);
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
