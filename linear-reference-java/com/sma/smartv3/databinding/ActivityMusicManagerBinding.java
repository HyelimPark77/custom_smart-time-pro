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

    @NonNull
    public final RecyclerView rv;

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
        this.rv = rv;
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
        int r1 = R.id.empty;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r5 == null) goto L29;
        r1 = R.id.pb_progress;
        ProgressBar r6 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
        if (r6 == null) goto L29;
        r1 = R.id.rv;
        RecyclerView r7 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r7 == null) goto L29;
        r1 = R.id.task_panel;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel);
        if (r8 == null) goto L29;
        r1 = R.id.tv_cancel;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cancel);
        if (r9 == null) goto L29;
        r1 = R.id.tv_free_space;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
        if (r10 == null) goto L29;
        r1 = R.id.tv_name;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r11 == null) goto L29;
        r1 = R.id.tv_progress;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
        if (r12 == null) goto L29;
        r1 = R.id.tv_progress_tip;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
        if (r13 == null) goto L29;
        r1 = R.id.tv_retry;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
        if (r14 == null) goto L29;
        r1 = R.id.tv_tip;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r15 == null) goto L29;
        r1 = R.id.tv_total_progress;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
        if (r16 == null) goto L29;
        return new ActivityMusicManagerBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityMusicManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMusicManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_music_manager, parent, false);
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
