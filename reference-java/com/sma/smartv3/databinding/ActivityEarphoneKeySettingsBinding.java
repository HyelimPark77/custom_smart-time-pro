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
        int i = R.id.item_header_left_click;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_click);
        if (abhSettingsHeader != null) {
            i = R.id.item_header_left_double_click;
            AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_double_click);
            if (abhSettingsHeader2 != null) {
                i = R.id.item_header_left_long_click;
                AbhSettingsHeader abhSettingsHeader3 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_long_click);
                if (abhSettingsHeader3 != null) {
                    i = R.id.item_header_left_triple_click;
                    AbhSettingsHeader abhSettingsHeader4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_left_triple_click);
                    if (abhSettingsHeader4 != null) {
                        i = R.id.item_header_right_click;
                        AbhSettingsHeader abhSettingsHeader5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_click);
                        if (abhSettingsHeader5 != null) {
                            i = R.id.item_header_right_double_click;
                            AbhSettingsHeader abhSettingsHeader6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_double_click);
                            if (abhSettingsHeader6 != null) {
                                i = R.id.item_header_right_long_click;
                                AbhSettingsHeader abhSettingsHeader7 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_long_click);
                                if (abhSettingsHeader7 != null) {
                                    i = R.id.item_header_right_triple_click;
                                    AbhSettingsHeader abhSettingsHeader8 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_right_triple_click);
                                    if (abhSettingsHeader8 != null) {
                                        i = R.id.item_left_click;
                                        AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_click);
                                        if (abhSettingsItem != null) {
                                            i = R.id.item_left_double_click;
                                            AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_double_click);
                                            if (abhSettingsItem2 != null) {
                                                i = R.id.item_left_long_click;
                                                AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_long_click);
                                                if (abhSettingsItem3 != null) {
                                                    i = R.id.item_left_triple_click;
                                                    AbhSettingsItem abhSettingsItem4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_left_triple_click);
                                                    if (abhSettingsItem4 != null) {
                                                        i = R.id.item_right_click;
                                                        AbhSettingsItem abhSettingsItem5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_click);
                                                        if (abhSettingsItem5 != null) {
                                                            i = R.id.item_right_double_click;
                                                            AbhSettingsItem abhSettingsItem6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_double_click);
                                                            if (abhSettingsItem6 != null) {
                                                                i = R.id.item_right_long_click;
                                                                AbhSettingsItem abhSettingsItem7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_long_click);
                                                                if (abhSettingsItem7 != null) {
                                                                    i = R.id.item_right_triple_click;
                                                                    AbhSettingsItem abhSettingsItem8 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_right_triple_click);
                                                                    if (abhSettingsItem8 != null) {
                                                                        i = R.id.ll_left_panel;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_panel);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.ll_right_panel;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_panel);
                                                                            if (linearLayout2 != null) {
                                                                                LinearLayout linearLayout3 = (LinearLayout) rootView;
                                                                                return new ActivityEarphoneKeySettingsBinding(linearLayout3, abhSettingsHeader, abhSettingsHeader2, abhSettingsHeader3, abhSettingsHeader4, abhSettingsHeader5, abhSettingsHeader6, abhSettingsHeader7, abhSettingsHeader8, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, abhSettingsItem4, abhSettingsItem5, abhSettingsItem6, abhSettingsItem7, abhSettingsItem8, linearLayout, linearLayout2, linearLayout3);
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
    public static ActivityEarphoneKeySettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEarphoneKeySettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_earphone_key_settings, parent, false);
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
