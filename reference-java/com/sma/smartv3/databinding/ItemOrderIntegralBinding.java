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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemOrderIntegralBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteRecord;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    public final PFMedium orderIntegralAmount;

    @NonNull
    public final ImageView orderIntegralImg;

    @NonNull
    public final PFMedium orderIntegralOrderNum;

    @NonNull
    public final PFMedium orderIntegralOrderNumTitle;

    @NonNull
    public final PFMedium orderIntegralPayStatus;

    @NonNull
    public final PFMedium orderIntegralRemark;

    @NonNull
    public final PFMedium orderIntegralTime;

    @NonNull
    private final RelativeLayout rootView;

    private ItemOrderIntegralBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteRecord, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull PFMedium orderIntegralAmount, @NonNull ImageView orderIntegralImg, @NonNull PFMedium orderIntegralOrderNum, @NonNull PFMedium orderIntegralOrderNumTitle, @NonNull PFMedium orderIntegralPayStatus, @NonNull PFMedium orderIntegralRemark, @NonNull PFMedium orderIntegralTime) {
        this.rootView = rootView;
        this.btDeleteRecord = btDeleteRecord;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.orderIntegralAmount = orderIntegralAmount;
        this.orderIntegralImg = orderIntegralImg;
        this.orderIntegralOrderNum = orderIntegralOrderNum;
        this.orderIntegralOrderNumTitle = orderIntegralOrderNumTitle;
        this.orderIntegralPayStatus = orderIntegralPayStatus;
        this.orderIntegralRemark = orderIntegralRemark;
        this.orderIntegralTime = orderIntegralTime;
    }

    @NonNull
    public static ItemOrderIntegralBinding bind(@NonNull View rootView) {
        int i = R.id.bt_delete_record;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_record);
        if (imageButton != null) {
            i = R.id.ll_item_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
            if (linearLayout != null) {
                i = R.id.menu_wrap_layout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                if (linearLayout2 != null) {
                    i = R.id.order_integral_amount;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_amount);
                    if (pFMedium != null) {
                        i = R.id.order_integral_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.order_integral_img);
                        if (imageView != null) {
                            i = R.id.order_integral_orderNum;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_orderNum);
                            if (pFMedium2 != null) {
                                i = R.id.order_integral_orderNum_title;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_orderNum_title);
                                if (pFMedium3 != null) {
                                    i = R.id.order_integral_pay_status;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_pay_status);
                                    if (pFMedium4 != null) {
                                        i = R.id.order_integral_remark;
                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_remark);
                                        if (pFMedium5 != null) {
                                            i = R.id.order_integral_time;
                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_time);
                                            if (pFMedium6 != null) {
                                                return new ItemOrderIntegralBinding((RelativeLayout) rootView, imageButton, linearLayout, linearLayout2, pFMedium, imageView, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6);
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
    public static ItemOrderIntegralBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemOrderIntegralBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_order_integral, parent, false);
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
