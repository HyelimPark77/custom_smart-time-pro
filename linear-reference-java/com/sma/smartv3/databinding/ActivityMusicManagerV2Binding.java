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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMusicManagerV2Binding implements ViewBinding {

    @NonNull
    public final Button btnBottomServer;

    @NonNull
    public final Button btnBottomTeraBox;

    @NonNull
    public final TextView empty;

    @NonNull
    public final LinearLayout musicV2RecyclerLayout;

    @NonNull
    public final ProgressBar pbProgress;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final LinearLayout taskPanel;

    @NonNull
    public final PFMedium taskPanelMusicDownloadingTv;

    @NonNull
    public final LinearLayout taskPanelMusicLayout;

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

    private ActivityMusicManagerV2Binding(@NonNull LinearLayout rootView, @NonNull Button btnBottomServer, @NonNull Button btnBottomTeraBox, @NonNull TextView empty, @NonNull LinearLayout musicV2RecyclerLayout, @NonNull ProgressBar pbProgress, @NonNull RecyclerView rv, @NonNull LinearLayout taskPanel, @NonNull PFMedium taskPanelMusicDownloadingTv, @NonNull LinearLayout taskPanelMusicLayout, @NonNull PFMedium tvCancel, @NonNull PFMedium tvFreeSpace, @NonNull PFMedium tvName, @NonNull PFMedium tvProgress, @NonNull PFMedium tvProgressTip, @NonNull PFMedium tvRetry, @NonNull PFMedium tvTip, @NonNull PFMedium tvTotalProgress) {
        this.rootView = rootView;
        this.btnBottomServer = btnBottomServer;
        this.btnBottomTeraBox = btnBottomTeraBox;
        this.empty = empty;
        this.musicV2RecyclerLayout = musicV2RecyclerLayout;
        this.pbProgress = pbProgress;
        this.rv = rv;
        this.taskPanel = taskPanel;
        this.taskPanelMusicDownloadingTv = taskPanelMusicDownloadingTv;
        this.taskPanelMusicLayout = taskPanelMusicLayout;
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
    public static ActivityMusicManagerV2Binding bind(@NonNull View rootView) {
        int r1 = R.id.btn_bottom_server;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom_server);
        if (r5 == null) goto L39;
        r1 = R.id.btn_bottom_tera_box;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom_tera_box);
        if (r6 == null) goto L39;
        r1 = R.id.empty;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r7 == null) goto L39;
        r1 = R.id.music_v2_recycler_layout;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.music_v2_recycler_layout);
        if (r8 == null) goto L39;
        r1 = R.id.pb_progress;
        ProgressBar r9 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
        if (r9 == null) goto L39;
        r1 = R.id.rv;
        RecyclerView r10 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r10 == null) goto L39;
        r1 = R.id.task_panel;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel);
        if (r11 == null) goto L39;
        r1 = R.id.task_panel_music_downloading_tv;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.task_panel_music_downloading_tv);
        if (r12 == null) goto L39;
        r1 = R.id.task_panel_music_layout;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel_music_layout);
        if (r13 == null) goto L39;
        r1 = R.id.tv_cancel;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cancel);
        if (r14 == null) goto L39;
        r1 = R.id.tv_free_space;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
        if (r15 == null) goto L39;
        r1 = R.id.tv_name;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r16 == null) goto L39;
        r1 = R.id.tv_progress;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
        if (r17 == null) goto L39;
        r1 = R.id.tv_progress_tip;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
        if (r18 == null) goto L39;
        r1 = R.id.tv_retry;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
        if (r19 == null) goto L39;
        r1 = R.id.tv_tip;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r20 == null) goto L39;
        r1 = R.id.tv_total_progress;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
        if (r21 == null) goto L39;
        return new ActivityMusicManagerV2Binding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityMusicManagerV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMusicManagerV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_music_manager_v2, parent, false);
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
