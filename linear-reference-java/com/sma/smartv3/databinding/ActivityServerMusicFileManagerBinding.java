package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityServerMusicFileManagerBinding implements ViewBinding {

    @NonNull
    public final PFMedium emptyView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final EditText serverMusicFileEt;

    @NonNull
    public final ImageView serverMusicFileEtClear;

    @NonNull
    public final RecyclerView serverMusicFileRecycler;

    @NonNull
    public final ImageView serverMusicFileSearch;

    private ActivityServerMusicFileManagerBinding(@NonNull LinearLayout rootView_, @NonNull PFMedium emptyView, @NonNull LinearLayout rootView, @NonNull EditText serverMusicFileEt, @NonNull ImageView serverMusicFileEtClear, @NonNull RecyclerView serverMusicFileRecycler, @NonNull ImageView serverMusicFileSearch) {
        this.rootView_ = rootView_;
        this.emptyView = emptyView;
        this.rootView = rootView;
        this.serverMusicFileEt = serverMusicFileEt;
        this.serverMusicFileEtClear = serverMusicFileEtClear;
        this.serverMusicFileRecycler = serverMusicFileRecycler;
        this.serverMusicFileSearch = serverMusicFileSearch;
    }

    @NonNull
    public static ActivityServerMusicFileManagerBinding bind(@NonNull View rootView) {
        int r0 = R.id.empty_view;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (r4 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.server_music_file_et;
        EditText r6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.server_music_file_et);
        if (r6 == null) goto L15;
        r0 = R.id.server_music_file_et_clear;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_et_clear);
        if (r7 == null) goto L15;
        r0 = R.id.server_music_file_recycler;
        RecyclerView r8 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_recycler);
        if (r8 == null) goto L15;
        r0 = R.id.server_music_file_search;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_search);
        if (r9 == null) goto L15;
        return new ActivityServerMusicFileManagerBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityServerMusicFileManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityServerMusicFileManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_server_music_file_manager, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
