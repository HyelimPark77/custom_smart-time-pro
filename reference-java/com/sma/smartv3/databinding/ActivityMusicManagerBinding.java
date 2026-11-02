package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMusicManagerBinding implements ViewBinding {

    @NonNull
    public final TextView empty;

    @NonNull
    public final ProgressBar pbProgress;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50987rv;

    @NonNull
    public final LinearLayout taskPanel;

    @NonNull
    public final PFMedium tvCancel;

    @NonNull
    public final PFMedium tvFreeSpace;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvProgress;

    @NonNull
    public final PFMedium tvProgressTip;

    @NonNull
    public final PFMedium tvRetry;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvTotalProgress;

    private ActivityMusicManagerBinding(@NonNull LinearLayout rootView, @NonNull TextView empty, @NonNull ProgressBar pbProgress, @NonNull RecyclerView rv, @NonNull LinearLayout taskPanel, @NonNull PFMedium tvCancel, @NonNull PFMedium tvFreeSpace, @NonNull PFMedium tvName, @NonNull PFMedium tvProgress, @NonNull PFMedium tvProgressTip, @NonNull PFMedium tvRetry, @NonNull PFMedium tvTip, @NonNull PFMedium tvTotalProgress) {
        this.rootView = rootView;
        this.empty = empty;
        this.pbProgress = pbProgress;
        this.f50987rv = rv;
        this.taskPanel = taskPanel;
        this.tvCancel = tvCancel;
        this.tvFreeSpace = tvFreeSpace;
        this.tvName = tvName;
        this.tvProgress = tvProgress;
        this.tvProgressTip = tvProgressTip;
        this.tvRetry = tvRetry;
        this.tvTip = tvTip;
        this.tvTotalProgress = tvTotalProgress;
    }

    @NonNull
    public static ActivityMusicManagerBinding bind(@NonNull View rootView) {
        int i = R.id.empty;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (textView != null) {
            i = R.id.pb_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
            if (progressBar != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    i = R.id.task_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel);
                    if (linearLayout != null) {
                        i = R.id.tv_cancel;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cancel);
                        if (pFMedium != null) {
                            i = R.id.tv_free_space;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
                            if (pFMedium2 != null) {
                                i = R.id.tv_name;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_progress;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
                                    if (pFMedium4 != null) {
                                        i = R.id.tv_progress_tip;
                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
                                        if (pFMedium5 != null) {
                                            i = R.id.tv_retry;
                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
                                            if (pFMedium6 != null) {
                                                i = R.id.tv_tip;
                                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                                if (pFMedium7 != null) {
                                                    i = R.id.tv_total_progress;
                                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
                                                    if (pFMedium8 != null) {
                                                        return new ActivityMusicManagerBinding((LinearLayout) rootView, textView, progressBar, recyclerView, linearLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMusicManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMusicManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_music_manager, parent, false);
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
