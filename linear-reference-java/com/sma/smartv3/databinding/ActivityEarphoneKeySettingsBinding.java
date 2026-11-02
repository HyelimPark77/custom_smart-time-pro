package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityEarphoneKeySettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeaderLeftClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderLeftDoubleClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderLeftLongClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderLeftTripleClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderRightClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderRightDoubleClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderRightLongClick;

    @NonNull
    public final AbhSettingsHeader itemHeaderRightTripleClick;

    @NonNull
    public final AbhSettingsItem itemLeftClick;

    @NonNull
    public final AbhSettingsItem itemLeftDoubleClick;

    @NonNull
    public final AbhSettingsItem itemLeftLongClick;

    @NonNull
    public final AbhSettingsItem itemLeftTripleClick;

    @NonNull
    public final AbhSettingsItem itemRightClick;

    @NonNull
    public final AbhSettingsItem itemRightDoubleClick;

    @NonNull
    public final AbhSettingsItem itemRightLongClick;

    @NonNull
    public final AbhSettingsItem itemRightTripleClick;

    @NonNull
    public final LinearLayout llLeftPanel;

    @NonNull
    public final LinearLayout llRightPanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityEarphoneKeySettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeaderLeftClick, @NonNull AbhSettingsHeader itemHeaderLeftDoubleClick, @NonNull AbhSettingsHeader itemHeaderLeftLongClick, @NonNull AbhSettingsHeader itemHeaderLeftTripleClick, @NonNull AbhSettingsHeader itemHeaderRightClick, @NonNull AbhSettingsHeader itemHeaderRightDoubleClick, @NonNull AbhSettingsHeader itemHeaderRightLongClick, @NonNull AbhSettingsHeader itemHeaderRightTripleClick, @NonNull AbhSettingsItem itemLeftClick, @NonNull AbhSettingsItem itemLeftDoubleClick, @NonNull AbhSettingsItem itemLeftLongClick, @NonNull AbhSettingsItem itemLeftTripleClick, @NonNull AbhSettingsItem itemRightClick, @NonNull AbhSettingsItem itemRightDoubleClick, @NonNull AbhSettingsItem itemRightLongClick, @NonNull AbhSettingsItem itemRightTripleClick, @NonNull LinearLayout llLeftPanel, @NonNull LinearLayout llRightPanel, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeaderLeftClick = itemHeaderLeftClick;
        this.itemHeaderLeftDoubleClick = itemHeaderLeftDoubleClick;
        this.itemHeaderLeftLongClick = itemHeaderLeftLongClick;
        this.itemHeaderLeftTripleClick = itemHeaderLeftTripleClick;
        this.itemHeaderRightClick = itemHeaderRightClick;
        this.itemHeaderRightDoubleClick = itemHeaderRightDoubleClick;
        this.itemHeaderRightLongClick = itemHeaderRightLongClick;
        this.itemHeaderRightTripleClick = itemHeaderRightTripleClick;
        this.itemLeftClick = itemLeftClick;
        this.itemLeftDoubleClick = itemLeftDoubleClick;
        this.itemLeftLongClick = itemLeftLongClick;
        this.itemLeftTripleClick = itemLeftTripleClick;
        this.itemRightClick = itemRightClick;
        this.itemRightDoubleClick = itemRightDoubleClick;
        this.itemRightLongClick = itemRightLongClick;
        this.itemRightTripleClick = itemRightTripleClick;
        this.llLeftPanel = llLeftPanel;
        this.llRightPanel = llRightPanel;
        this.root = root;
    }

    @NonNull
    public static ActivityEarphoneKeySettingsBinding bind(@NonNull View rootView) {
        int r1 = R.id.item_header_left_click;
        AbhSettingsHeader r5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_click);
        if (r5 == null) goto L41;
        r1 = R.id.item_header_left_double_click;
        AbhSettingsHeader r6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_double_click);
        if (r6 == null) goto L41;
        r1 = R.id.item_header_left_long_click;
        AbhSettingsHeader r7 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_long_click);
        if (r7 == null) goto L41;
        r1 = R.id.item_header_left_triple_click;
        AbhSettingsHeader r8 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_triple_click);
        if (r8 == null) goto L41;
        r1 = R.id.item_header_right_click;
        AbhSettingsHeader r9 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_click);
        if (r9 == null) goto L41;
        r1 = R.id.item_header_right_double_click;
        AbhSettingsHeader r10 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_double_click);
        if (r10 == null) goto L41;
        r1 = R.id.item_header_right_long_click;
        AbhSettingsHeader r11 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_long_click);
        if (r11 == null) goto L41;
        r1 = R.id.item_header_right_triple_click;
        AbhSettingsHeader r12 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_triple_click);
        if (r12 == null) goto L41;
        r1 = R.id.item_left_click;
        AbhSettingsItem r13 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_click);
        if (r13 == null) goto L41;
        r1 = R.id.item_left_double_click;
        AbhSettingsItem r14 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_double_click);
        if (r14 == null) goto L41;
        r1 = R.id.item_left_long_click;
        AbhSettingsItem r15 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_long_click);
        if (r15 == null) goto L41;
        r1 = R.id.item_left_triple_click;
        AbhSettingsItem r16 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_triple_click);
        if (r16 == null) goto L41;
        r1 = R.id.item_right_click;
        AbhSettingsItem r17 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_click);
        if (r17 == null) goto L41;
        r1 = R.id.item_right_double_click;
        AbhSettingsItem r18 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_double_click);
        if (r18 == null) goto L41;
        r1 = R.id.item_right_long_click;
        AbhSettingsItem r19 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_long_click);
        if (r19 == null) goto L41;
        r1 = R.id.item_right_triple_click;
        AbhSettingsItem r20 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_triple_click);
        if (r20 == null) goto L41;
        r1 = R.id.ll_left_panel;
        LinearLayout r21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_panel);
        if (r21 == null) goto L41;
        r1 = R.id.ll_right_panel;
        LinearLayout r22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_panel);
        if (r22 == null) goto L41;
        LinearLayout r4 = (LinearLayout) rootView;
        return new ActivityEarphoneKeySettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r4);
    L41:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityEarphoneKeySettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityEarphoneKeySettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_earphone_key_settings, parent, false);
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
