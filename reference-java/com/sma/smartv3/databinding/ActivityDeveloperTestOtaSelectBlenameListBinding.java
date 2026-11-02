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
        int i = R.id.bt_next;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_next);
        if (appCompatButton != null) {
            i = R.id.list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (listView != null) {
                i = R.id.recyclerView;
                FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
                if (fastScrollRecyclerView != null) {
                    i = R.id.search_view;
                    MaterialSearchView materialSearchView = (MaterialSearchView) ViewBindings.findChildViewById(rootView, R.id.search_view);
                    if (materialSearchView != null) {
                        i = R.id.select_group_ll;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_group_ll);
                        if (linearLayout != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
                            if (toolbar != null) {
                                i = R.id.toolbar_container;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.toolbar_container);
                                if (frameLayout != null) {
                                    i = R.id.tv_select;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.tv_select);
                                    if (editText != null) {
                                        i = R.id.tv_select_remind;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select_remind);
                                        if (textView != null) {
                                            return new ActivityDeveloperTestOtaSelectBlenameListBinding((LinearLayout) rootView, appCompatButton, listView, fastScrollRecyclerView, materialSearchView, linearLayout, toolbar, frameLayout, editText, textView);
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
    public static ActivityDeveloperTestOtaSelectBlenameListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectBlenameListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_ota_select_blename_list, parent, false);
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
