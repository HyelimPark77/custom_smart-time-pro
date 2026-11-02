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
        int i = R.id.empty_view;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (pFMedium != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.server_music_file_et;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.server_music_file_et);
            if (editText != null) {
                i = R.id.server_music_file_et_clear;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_et_clear);
                if (imageView != null) {
                    i = R.id.server_music_file_recycler;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_recycler);
                    if (recyclerView != null) {
                        i = R.id.server_music_file_search;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.server_music_file_search);
                        if (imageView2 != null) {
                            return new ActivityServerMusicFileManagerBinding(linearLayout, pFMedium, linearLayout, editText, imageView, recyclerView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityServerMusicFileManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityServerMusicFileManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_server_music_file_manager, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
