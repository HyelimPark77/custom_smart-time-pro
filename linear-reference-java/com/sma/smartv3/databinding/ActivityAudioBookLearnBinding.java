package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAudioBookLearnBinding implements ViewBinding {

    @NonNull
    public final Button audioBookLeftBtn;

    @NonNull
    public final PFMedium audioBookOpenDeleteBtn;

    @NonNull
    public final LinearLayout audioBookReclerviewTitle;

    @NonNull
    public final Button audioBookRightBtn;

    @NonNull
    public final Button btnBottomLinkJump;

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

    private ActivityAudioBookLearnBinding(@NonNull LinearLayout rootView, @NonNull Button audioBookLeftBtn, @NonNull PFMedium audioBookOpenDeleteBtn, @NonNull LinearLayout audioBookReclerviewTitle, @NonNull Button audioBookRightBtn, @NonNull Button btnBottomLinkJump, @NonNull ProgressBar pbProgress, @NonNull RecyclerView rv, @NonNull LinearLayout taskPanel, @NonNull PFMedium tvCancel, @NonNull PFMedium tvFreeSpace, @NonNull PFMedium tvName, @NonNull PFMedium tvProgress, @NonNull PFMedium tvProgressTip, @NonNull PFMedium tvRetry, @NonNull PFMedium tvTip, @NonNull PFMedium tvTotalProgress) {
        this.rootView = rootView;
        this.audioBookLeftBtn = audioBookLeftBtn;
        this.audioBookOpenDeleteBtn = audioBookOpenDeleteBtn;
        this.audioBookReclerviewTitle = audioBookReclerviewTitle;
        this.audioBookRightBtn = audioBookRightBtn;
        this.btnBottomLinkJump = btnBottomLinkJump;
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
    public static ActivityAudioBookLearnBinding bind(@NonNull View rootView) {
        int r1 = R.id.audio_book_left_btn;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.audio_book_left_btn);
        if (r5 == null) goto L37;
        r1 = R.id.audio_book_open_delete_btn;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_open_delete_btn);
        if (r6 == null) goto L37;
        r1 = R.id.audio_book_reclerview_title;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.audio_book_reclerview_title);
        if (r7 == null) goto L37;
        r1 = R.id.audio_book_right_btn;
        Button r8 = (Button) ViewBindings.findChildViewById(rootView, R.id.audio_book_right_btn);
        if (r8 == null) goto L37;
        r1 = R.id.btn_bottom_link_jump;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom_link_jump);
        if (r9 == null) goto L37;
        r1 = R.id.pb_progress;
        ProgressBar r10 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
        if (r10 == null) goto L37;
        r1 = R.id.rv;
        RecyclerView r11 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r11 == null) goto L37;
        r1 = R.id.task_panel;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel);
        if (r12 == null) goto L37;
        r1 = R.id.tv_cancel;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cancel);
        if (r13 == null) goto L37;
        r1 = R.id.tv_free_space;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
        if (r14 == null) goto L37;
        r1 = R.id.tv_name;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r15 == null) goto L37;
        r1 = R.id.tv_progress;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
        if (r16 == null) goto L37;
        r1 = R.id.tv_progress_tip;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
        if (r17 == null) goto L37;
        r1 = R.id.tv_retry;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
        if (r18 == null) goto L37;
        r1 = R.id.tv_tip;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r19 == null) goto L37;
        r1 = R.id.tv_total_progress;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
        if (r20 == null) goto L37;
        return new ActivityAudioBookLearnBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_audio_book_learn, parent, false);
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
