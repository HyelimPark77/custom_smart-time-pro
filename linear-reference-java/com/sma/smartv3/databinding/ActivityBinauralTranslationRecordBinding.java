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

    @NonNull
    public final RecyclerView rv;

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
        this.rv = rv;
        this.seekbar = seekbar;
        this.tvCurrentTime = tvCurrentTime;
        this.tvTotalTime = tvTotalTime;
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.img_record_play;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_record_play);
        if (r4 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L15;
        r0 = R.id.seekbar;
        SeekBar r7 = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar);
        if (r7 == null) goto L15;
        r0 = R.id.tv_currentTime;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_currentTime);
        if (r8 == null) goto L15;
        r0 = R.id.tv_totalTime;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_totalTime);
        if (r9 == null) goto L15;
        return new ActivityBinauralTranslationRecordBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBinauralTranslationRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_binaural_translation_record, parent, false);
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
