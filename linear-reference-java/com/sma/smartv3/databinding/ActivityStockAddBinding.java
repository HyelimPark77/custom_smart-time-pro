package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStockAddBinding implements ViewBinding {

    @NonNull
    public final ImageView clearEditTvImg;

    @NonNull
    public final TextView empty;

    @NonNull
    public final ListView listView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final EditText stockAddEdit;

    @NonNull
    public final Button stockSearchBtn;

    private ActivityStockAddBinding(@NonNull LinearLayout rootView_, @NonNull ImageView clearEditTvImg, @NonNull TextView empty, @NonNull ListView listView, @NonNull LinearLayout rootView, @NonNull EditText stockAddEdit, @NonNull Button stockSearchBtn) {
        this.rootView_ = rootView_;
        this.clearEditTvImg = clearEditTvImg;
        this.empty = empty;
        this.listView = listView;
        this.rootView = rootView;
        this.stockAddEdit = stockAddEdit;
        this.stockSearchBtn = stockSearchBtn;
    }

    @NonNull
    public static ActivityStockAddBinding bind(@NonNull View rootView) {
        int r0 = R.id.clear_edit_tv_img;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.clear_edit_tv_img);
        if (r4 == null) goto L15;
        r0 = R.id.empty;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r5 == null) goto L15;
        r0 = R.id.list_view;
        ListView r6 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r6 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.stock_add_edit;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.stock_add_edit);
        if (r8 == null) goto L15;
        r0 = R.id.stock_search_btn;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.stock_search_btn);
        if (r9 == null) goto L15;
        return new ActivityStockAddBinding(r3, r4, r5, r6, r3, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityStockAddBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStockAddBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_stock_add, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
