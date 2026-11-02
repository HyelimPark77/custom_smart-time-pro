package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBinauralTranslationRecordBinding implements ViewBinding {

    @NonNull
    public final ImageView imgRecordPlay;

    @NonNull
    public final LinearLayout main;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50971rv;

    @NonNull
    public final SeekBar seekbar;

    @NonNull
    public final TextView tvCurrentTime;

    @NonNull
    public final TextView tvTotalTime;

    private ActivityBinauralTranslationRecordBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgRecordPlay, @NonNull LinearLayout main, @NonNull RecyclerView rv, @NonNull SeekBar seekbar, @NonNull TextView tvCurrentTime, @NonNull TextView tvTotalTime) {
        this.rootView = rootView;
        this.imgRecordPlay = imgRecordPlay;
        this.main = main;
        this.f50971rv = rv;
        this.seekbar = seekbar;
        this.tvCurrentTime = tvCurrentTime;
        this.tvTotalTime = tvTotalTime;
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding bind(@NonNull View rootView) {
        int i = R.id.img_record_play;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_record_play);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.seekbar;
                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar);
                if (seekBar != null) {
                    i = R.id.tv_currentTime;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_currentTime);
                    if (textView != null) {
                        i = R.id.tv_totalTime;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_totalTime);
                        if (textView2 != null) {
                            return new ActivityBinauralTranslationRecordBinding(linearLayout, imageView, linearLayout, recyclerView, seekBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_binaural_translation_record, parent, false);
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
