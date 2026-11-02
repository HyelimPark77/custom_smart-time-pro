package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemHistoryReportBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat llContext;

    @NonNull
    private final LinearLayoutCompat rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51196rv;

    @NonNull
    public final TextView tvItemName;

    private V2StatusItemHistoryReportBinding(@NonNull LinearLayoutCompat rootView, @NonNull LinearLayoutCompat llContext, @NonNull RecyclerView rv, @NonNull TextView tvItemName) {
        this.rootView = rootView;
        this.llContext = llContext;
        this.f51196rv = rv;
        this.tvItemName = tvItemName;
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding bind(@NonNull View rootView) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) rootView;
        int i = R.id.f51422rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
        if (recyclerView != null) {
            i = R.id.tv_item_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_item_name);
            if (textView != null) {
                return new V2StatusItemHistoryReportBinding(linearLayoutCompat, linearLayoutCompat, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_history_report, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
