package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAigcBinding implements ViewBinding {

    @NonNull
    public final Button btnAgain;

    @NonNull
    public final Button btnGen;

    @NonNull
    public final Button btnGenNextStep;

    @NonNull
    public final Button btnSearch;

    @NonNull
    public final EditText edtContent;

    @NonNull
    public final ScrollView genPanel;

    @NonNull
    public final AbhSettingsItem itemStyle;

    @NonNull
    public final LinearLayout previewPanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private FragmentAigcBinding(@NonNull LinearLayout rootView, @NonNull Button btnAgain, @NonNull Button btnGen, @NonNull Button btnGenNextStep, @NonNull Button btnSearch, @NonNull EditText edtContent, @NonNull ScrollView genPanel, @NonNull AbhSettingsItem itemStyle, @NonNull LinearLayout previewPanel, @NonNull LinearLayout root, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.btnAgain = btnAgain;
        this.btnGen = btnGen;
        this.btnGenNextStep = btnGenNextStep;
        this.btnSearch = btnSearch;
        this.edtContent = edtContent;
        this.genPanel = genPanel;
        this.itemStyle = itemStyle;
        this.previewPanel = previewPanel;
        this.root = root;
        this.rv = rv;
    }

    @NonNull
    public static FragmentAigcBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_again;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_again);
        if (r4 == null) goto L23;
        r0 = R.id.btn_gen;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_gen);
        if (r5 == null) goto L23;
        r0 = R.id.btn_gen_next_step;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_gen_next_step);
        if (r6 == null) goto L23;
        r0 = R.id.btn_search;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_search);
        if (r7 == null) goto L23;
        r0 = R.id.edt_content;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_content);
        if (r8 == null) goto L23;
        r0 = R.id.gen_panel;
        ScrollView r9 = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.gen_panel);
        if (r9 == null) goto L23;
        r0 = R.id.item_style;
        AbhSettingsItem r10 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_style);
        if (r10 == null) goto L23;
        r0 = R.id.preview_panel;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.preview_panel);
        if (r11 == null) goto L23;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r13 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r13 == null) goto L23;
        return new FragmentAigcBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r3, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAigcBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAigcBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_aigc, parent, false);
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
