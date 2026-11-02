package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightMeasureHistoryItemBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteWeightRecord;

    @NonNull
    public final ImageView ivMeasureItemRight;

    @NonNull
    public final ImageView ivMeasureType;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final DINCondBold tvBfrValue;

    @NonNull
    public final DINCondBold tvBmiValue;

    @NonNull
    public final DINCondBold tvWeightValue;

    private WeightMeasureHistoryItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteWeightRecord, @NonNull ImageView ivMeasureItemRight, @NonNull ImageView ivMeasureType, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull DINCondBold tvBfrValue, @NonNull DINCondBold tvBmiValue, @NonNull DINCondBold tvWeightValue) {
        this.rootView = rootView;
        this.btDeleteWeightRecord = btDeleteWeightRecord;
        this.ivMeasureItemRight = ivMeasureItemRight;
        this.ivMeasureType = ivMeasureType;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.tvBfrValue = tvBfrValue;
        this.tvBmiValue = tvBmiValue;
        this.tvWeightValue = tvWeightValue;
    }

    @NonNull
    public static WeightMeasureHistoryItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_delete_weight_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_weight_record);
        if (r4 == null) goto L21;
        r0 = R.id.iv_measure_item_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_measure_item_right);
        if (r5 == null) goto L21;
        r0 = R.id.iv_measure_type;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_measure_type);
        if (r6 == null) goto L21;
        r0 = R.id.ll_item_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r7 == null) goto L21;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r8 == null) goto L21;
        r0 = R.id.tv_bfrValue;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bfrValue);
        if (r9 == null) goto L21;
        r0 = R.id.tv_bmiValue;
        DINCondBold r10 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bmiValue);
        if (r10 == null) goto L21;
        r0 = R.id.tv_weightValue;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
        if (r11 == null) goto L21;
        return new WeightMeasureHistoryItemBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static WeightMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static WeightMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.weight_measure_history_item, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
