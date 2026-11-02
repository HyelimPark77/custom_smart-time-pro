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

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView tvItemName;

    private V2StatusItemHistoryReportBinding(@NonNull LinearLayoutCompat rootView, @NonNull LinearLayoutCompat llContext, @NonNull RecyclerView rv, @NonNull TextView tvItemName) {
        this.rootView = rootView;
        this.llContext = llContext;
        this.rv = rv;
        this.tvItemName = tvItemName;
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding bind(@NonNull View rootView) {
        LinearLayoutCompat r0 = (LinearLayoutCompat) rootView;
        int r1 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L9;
        r1 = R.id.tv_item_name;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_item_name);
        if (r3 == null) goto L9;
        return new V2StatusItemHistoryReportBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemHistoryReportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_history_report, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
