package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestOtaSelectBlenameListBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btNext;

    @NonNull
    public final ListView listView;

    @NonNull
    public final FastScrollRecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final MaterialSearchView searchView;

    @NonNull
    public final LinearLayout selectGroupLl;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final FrameLayout toolbarContainer;

    @NonNull
    public final EditText tvSelect;

    @NonNull
    public final TextView tvSelectRemind;

    private ActivityDeveloperTestOtaSelectBlenameListBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btNext, @NonNull ListView listView, @NonNull FastScrollRecyclerView recyclerView, @NonNull MaterialSearchView searchView, @NonNull LinearLayout selectGroupLl, @NonNull Toolbar toolbar, @NonNull FrameLayout toolbarContainer, @NonNull EditText tvSelect, @NonNull TextView tvSelectRemind) {
        this.rootView = rootView;
        this.btNext = btNext;
        this.listView = listView;
        this.recyclerView = recyclerView;
        this.searchView = searchView;
        this.selectGroupLl = selectGroupLl;
        this.toolbar = toolbar;
        this.toolbarContainer = toolbarContainer;
        this.tvSelect = tvSelect;
        this.tvSelectRemind = tvSelectRemind;
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectBlenameListBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_next;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_next);
        if (r4 == null) goto L23;
        r0 = R.id.list_view;
        ListView r5 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r5 == null) goto L23;
        r0 = R.id.recyclerView;
        FastScrollRecyclerView r6 = (FastScrollRecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (r6 == null) goto L23;
        r0 = R.id.search_view;
        MaterialSearchView r7 = (MaterialSearchView) ViewBindings.findChildViewById(rootView, R.id.search_view);
        if (r7 == null) goto L23;
        r0 = R.id.select_group_ll;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_group_ll);
        if (r8 == null) goto L23;
        r0 = R.id.toolbar;
        Toolbar r9 = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
        if (r9 == null) goto L23;
        r0 = R.id.toolbar_container;
        FrameLayout r10 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.toolbar_container);
        if (r10 == null) goto L23;
        r0 = R.id.tv_select;
        EditText r11 = (EditText) ViewBindings.findChildViewById(rootView, R.id.tv_select);
        if (r11 == null) goto L23;
        r0 = R.id.tv_select_remind;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select_remind);
        if (r12 == null) goto L23;
        return new ActivityDeveloperTestOtaSelectBlenameListBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectBlenameListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectBlenameListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_ota_select_blename_list, parent, false);
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
