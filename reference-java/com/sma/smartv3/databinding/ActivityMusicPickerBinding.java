package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMusicPickerBinding implements ViewBinding {

    @NonNull
    public final View borderView;

    @NonNull
    public final LinearLayout controlPanel;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final ProgressBar progressBarAsync;

    @NonNull
    public final FastScrollRecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final MaterialSearchView searchView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final FrameLayout toolbarContainer;

    @NonNull
    public final TextView tvNoMusics;

    @NonNull
    public final TextView tvSelect;

    @NonNull
    public final TextView tvSelectAll;

    private ActivityMusicPickerBinding(@NonNull LinearLayout rootView, @NonNull View borderView, @NonNull LinearLayout controlPanel, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBarAsync, @NonNull FastScrollRecyclerView recyclerView, @NonNull MaterialSearchView searchView, @NonNull Toolbar toolbar, @NonNull FrameLayout toolbarContainer, @NonNull TextView tvNoMusics, @NonNull TextView tvSelect, @NonNull TextView tvSelectAll) {
        this.rootView = rootView;
        this.borderView = borderView;
        this.controlPanel = controlPanel;
        this.progressBar = progressBar;
        this.progressBarAsync = progressBarAsync;
        this.recyclerView = recyclerView;
        this.searchView = searchView;
        this.toolbar = toolbar;
        this.toolbarContainer = toolbarContainer;
        this.tvNoMusics = tvNoMusics;
        this.tvSelect = tvSelect;
        this.tvSelectAll = tvSelectAll;
    }

    @NonNull
    public static ActivityMusicPickerBinding bind(@NonNull View rootView) {
        int i = R.id.borderView;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.borderView);
        if (viewFindChildViewById != null) {
            i = R.id.controlPanel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.controlPanel);
            if (linearLayout != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.progressBar_async;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar_async);
                    if (progressBar2 != null) {
                        i = R.id.recyclerView;
                        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
                        if (fastScrollRecyclerView != null) {
                            i = R.id.search_view;
                            MaterialSearchView materialSearchView = (MaterialSearchView) ViewBindings.findChildViewById(rootView, R.id.search_view);
                            if (materialSearchView != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.toolbar_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.toolbar_container);
                                    if (frameLayout != null) {
                                        i = R.id.tvNoMusics;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvNoMusics);
                                        if (textView != null) {
                                            i = R.id.tvSelect;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSelect);
                                            if (textView2 != null) {
                                                i = R.id.tvSelectAll;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSelectAll);
                                                if (textView3 != null) {
                                                    return new ActivityMusicPickerBinding((LinearLayout) rootView, viewFindChildViewById, linearLayout, progressBar, progressBar2, fastScrollRecyclerView, materialSearchView, toolbar, frameLayout, textView, textView2, textView3);
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
    public static ActivityMusicPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMusicPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_music_picker, parent, false);
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
