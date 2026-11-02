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
        int i = R.id.clear_edit_tv_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.clear_edit_tv_img);
        if (imageView != null) {
            i = R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
            if (textView != null) {
                i = R.id.list_view;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                if (listView != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    i = R.id.stock_add_edit;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.stock_add_edit);
                    if (editText != null) {
                        i = R.id.stock_search_btn;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.stock_search_btn);
                        if (button != null) {
                            return new ActivityStockAddBinding(linearLayout, imageView, textView, listView, linearLayout, editText, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStockAddBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStockAddBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_stock_add, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
