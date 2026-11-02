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
        int r0 = R.id.bt_delete_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_record);
        if (r4 == null) goto L25;
        r0 = R.id.ll_item_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r5 == null) goto L25;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r6 == null) goto L25;
        r0 = R.id.order_integral_amount;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_amount);
        if (r7 == null) goto L25;
        r0 = R.id.order_integral_img;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.order_integral_img);
        if (r8 == null) goto L25;
        r0 = R.id.order_integral_orderNum;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_orderNum);
        if (r9 == null) goto L25;
        r0 = R.id.order_integral_orderNum_title;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_orderNum_title);
        if (r10 == null) goto L25;
        r0 = R.id.order_integral_pay_status;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_pay_status);
        if (r11 == null) goto L25;
        r0 = R.id.order_integral_remark;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_remark);
        if (r12 == null) goto L25;
        r0 = R.id.order_integral_time;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.order_integral_time);
        if (r13 == null) goto L25;
        return new ItemOrderIntegralBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemOrderIntegralBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemOrderIntegralBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_order_integral, parent, false);
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
