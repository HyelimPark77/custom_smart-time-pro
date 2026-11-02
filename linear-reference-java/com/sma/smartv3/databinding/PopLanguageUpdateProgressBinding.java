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
        int r0 = R.id.pb_progress;
        ProgressBar r4 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
        if (r4 == null) goto L17;
        r0 = R.id.task_panel_music_layout;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel_music_layout);
        if (r5 == null) goto L17;
        r0 = R.id.tv_name;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r6 == null) goto L17;
        r0 = R.id.tv_progress;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
        if (r7 == null) goto L17;
        r0 = R.id.tv_progress_tip;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
        if (r8 == null) goto L17;
        r0 = R.id.tv_total_progress;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
        if (r9 == null) goto L17;
        return new PopLanguageUpdateProgressBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopLanguageUpdateProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopLanguageUpdateProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_language_update_progress, parent, false);
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
