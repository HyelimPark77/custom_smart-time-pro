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
        int i = R.id.bt_delete_weight_record;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_weight_record);
        if (imageButton != null) {
            i = R.id.iv_measure_item_right;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_measure_item_right);
            if (imageView != null) {
                i = R.id.iv_measure_type;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_measure_type);
                if (imageView2 != null) {
                    i = R.id.ll_item_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                    if (linearLayout != null) {
                        i = R.id.menu_wrap_layout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                        if (linearLayout2 != null) {
                            i = R.id.tv_bfrValue;
                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bfrValue);
                            if (dINCondBold != null) {
                                i = R.id.tv_bmiValue;
                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bmiValue);
                                if (dINCondBold2 != null) {
                                    i = R.id.tv_weightValue;
                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
                                    if (dINCondBold3 != null) {
                                        return new WeightMeasureHistoryItemBinding((RelativeLayout) rootView, imageButton, imageView, imageView2, linearLayout, linearLayout2, dINCondBold, dINCondBold2, dINCondBold3);
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
    public static WeightMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WeightMeasureHistoryItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.weight_measure_history_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
