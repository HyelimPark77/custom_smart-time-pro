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
public final class ActivityContactPickerBinding implements ViewBinding {

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
    public final TextView tvNoContacts;

    @NonNull
    public final TextView tvSelect;

    @NonNull
    public final TextView tvSelectAll;

    @NonNull
    public final TextView tvSelectTip;

    private ActivityContactPickerBinding(@NonNull LinearLayout rootView, @NonNull View borderView, @NonNull LinearLayout controlPanel, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBarAsync, @NonNull FastScrollRecyclerView recyclerView, @NonNull MaterialSearchView searchView, @NonNull Toolbar toolbar, @NonNull FrameLayout toolbarContainer, @NonNull TextView tvNoContacts, @NonNull TextView tvSelect, @NonNull TextView tvSelectAll, @NonNull TextView tvSelectTip) {
        this.rootView = rootView;
        this.borderView = borderView;
        this.controlPanel = controlPanel;
        this.progressBar = progressBar;
        this.progressBarAsync = progressBarAsync;
        this.recyclerView = recyclerView;
        this.searchView = searchView;
        this.toolbar = toolbar;
        this.toolbarContainer = toolbarContainer;
        this.tvNoContacts = tvNoContacts;
        this.tvSelect = tvSelect;
        this.tvSelectAll = tvSelectAll;
        this.tvSelectTip = tvSelectTip;
    }

    @NonNull
    public static ActivityContactPickerBinding bind(@NonNull View rootView) {
        int r0 = R.id.borderView;
        View r3 = ViewBindings.findChildViewById(rootView, R.id.borderView);
        if (r3 == null) goto L29;
        r0 = R.id.controlPanel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.controlPanel);
        if (r4 == null) goto L29;
        r0 = R.id.progressBar;
        ProgressBar r5 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
        if (r5 == null) goto L29;
        r0 = R.id.progressBar_async;
        ProgressBar r6 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar_async);
        if (r6 == null) goto L29;
        r0 = R.id.recyclerView;
        FastScrollRecyclerView r7 = (FastScrollRecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (r7 == null) goto L29;
        r0 = R.id.search_view;
        MaterialSearchView r8 = (MaterialSearchView) ViewBindings.findChildViewById(rootView, R.id.search_view);
        if (r8 == null) goto L29;
        r0 = R.id.toolbar;
        Toolbar r9 = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
        if (r9 == null) goto L29;
        r0 = R.id.toolbar_container;
        FrameLayout r10 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.toolbar_container);
        if (r10 == null) goto L29;
        r0 = R.id.tvNoContacts;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvNoContacts);
        if (r11 == null) goto L29;
        r0 = R.id.tvSelect;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSelect);
        if (r12 == null) goto L29;
        r0 = R.id.tvSelectAll;
        TextView r13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSelectAll);
        if (r13 == null) goto L29;
        r0 = R.id.tvSelectTip;
        TextView r14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSelectTip);
        if (r14 == null) goto L29;
        return new ActivityContactPickerBinding((LinearLayout) rootView, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityContactPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityContactPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_contact_picker, parent, false);
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
