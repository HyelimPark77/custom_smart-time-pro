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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50969rv;

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
        this.f50969rv = rv;
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
        int i = R.id.audio_book_left_btn;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.audio_book_left_btn);
        if (button != null) {
            i = R.id.audio_book_open_delete_btn;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_open_delete_btn);
            if (pFMedium != null) {
                i = R.id.audio_book_reclerview_title;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.audio_book_reclerview_title);
                if (linearLayout != null) {
                    i = R.id.audio_book_right_btn;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.audio_book_right_btn);
                    if (button2 != null) {
                        i = R.id.btn_bottom_link_jump;
                        Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_bottom_link_jump);
                        if (button3 != null) {
                            i = R.id.pb_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_progress);
                            if (progressBar != null) {
                                i = R.id.f51422rv;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                if (recyclerView != null) {
                                    i = R.id.task_panel;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.task_panel);
                                    if (linearLayout2 != null) {
                                        i = R.id.tv_cancel;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cancel);
                                        if (pFMedium2 != null) {
                                            i = R.id.tv_free_space;
                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
                                            if (pFMedium3 != null) {
                                                i = R.id.tv_name;
                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                                if (pFMedium4 != null) {
                                                    i = R.id.tv_progress;
                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress);
                                                    if (pFMedium5 != null) {
                                                        i = R.id.tv_progress_tip;
                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_progress_tip);
                                                        if (pFMedium6 != null) {
                                                            i = R.id.tv_retry;
                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
                                                            if (pFMedium7 != null) {
                                                                i = R.id.tv_tip;
                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                                                if (pFMedium8 != null) {
                                                                    i = R.id.tv_total_progress;
                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_total_progress);
                                                                    if (pFMedium9 != null) {
                                                                        return new ActivityAudioBookLearnBinding((LinearLayout) rootView, button, pFMedium, linearLayout, button2, button3, progressBar, recyclerView, linearLayout2, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_audio_book_learn, parent, false);
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
