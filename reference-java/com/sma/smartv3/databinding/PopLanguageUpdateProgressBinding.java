package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopLanguageUpdateProgressBinding implements ViewBinding {

    @NonNull
    public final ProgressBar pbProgress;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout taskPanelMusicLayout;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvProgress;

    @NonNull
    public final PFMedium tvProgressTip;

    @NonNull
    public final PFMedium tvTotalProgress;

    private PopLanguageUpdateProgressBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar pbProgress, @NonNull LinearLayout taskPanelMusicLayout, @NonNull PFMedium tvName, @NonNull PFMedium tvProgress, @NonNull PFMedium tvProgressTip, @NonNull PFMedium tvTotalProgress) {
        this.rootView = rootView;
        this.pbProgress = pbProgress;
        this.taskPanelMusicLayout = taskPanelMusicLayout;
        this.tvName = tvName;
        this.tvProgress = tvProgress;
        this.tvProgressTip = tvProgressTip;
        this.tvTotalProgress = tvTotalProgress;
    }

    @NonNull
    public static PopLanguageUpdateProgressBinding bind(@NonNull View rootView) {
        int i = R.id.pb_progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
        if (progressBar != null) {
            i = R.id.task_panel_music_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel_music_layout);
            if (linearLayout != null) {
                i = R.id.tv_name;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                if (pFMedium != null) {
                    i = R.id.tv_progress;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
                    if (pFMedium2 != null) {
                        i = R.id.tv_progress_tip;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
                        if (pFMedium3 != null) {
                            i = R.id.tv_total_progress;
                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
                            if (pFMedium4 != null) {
                                return new PopLanguageUpdateProgressBinding((LinearLayout) rootView, progressBar, linearLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopLanguageUpdateProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopLanguageUpdateProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_language_update_progress, parent, false);
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
