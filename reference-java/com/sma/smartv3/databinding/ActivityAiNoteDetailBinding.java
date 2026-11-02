package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiNoteDetailBinding implements ViewBinding {

    @NonNull
    public final TextView aiNoteDetailContentTv;

    @NonNull
    public final ImageView imgRecordPlay;

    @NonNull
    public final LinearLayout main;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final ScrollView f50966rv;

    @NonNull
    public final SeekBar seekbar;

    @NonNull
    public final TextView tvCurrentTime;

    @NonNull
    public final TextView tvTotalTime;

    private ActivityAiNoteDetailBinding(@NonNull LinearLayout rootView, @NonNull TextView aiNoteDetailContentTv, @NonNull ImageView imgRecordPlay, @NonNull LinearLayout main, @NonNull ScrollView rv, @NonNull SeekBar seekbar, @NonNull TextView tvCurrentTime, @NonNull TextView tvTotalTime) {
        this.rootView = rootView;
        this.aiNoteDetailContentTv = aiNoteDetailContentTv;
        this.imgRecordPlay = imgRecordPlay;
        this.main = main;
        this.f50966rv = rv;
        this.seekbar = seekbar;
        this.tvCurrentTime = tvCurrentTime;
        this.tvTotalTime = tvTotalTime;
    }

    @NonNull
    public static ActivityAiNoteDetailBinding bind(@NonNull View rootView) {
        int i = R.id.aiNoteDetailContentTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteDetailContentTv);
        if (textView != null) {
            i = R.id.img_record_play;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_record_play);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.f51422rv;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (scrollView != null) {
                    i = R.id.seekbar;
                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar);
                    if (seekBar != null) {
                        i = R.id.tv_currentTime;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_currentTime);
                        if (textView2 != null) {
                            i = R.id.tv_totalTime;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_totalTime);
                            if (textView3 != null) {
                                return new ActivityAiNoteDetailBinding(linearLayout, textView, imageView, linearLayout, scrollView, seekBar, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAiNoteDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiNoteDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_note_detail, parent, false);
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
