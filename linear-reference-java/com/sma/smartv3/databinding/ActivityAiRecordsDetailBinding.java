package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiRecordsDetailBinding implements ViewBinding {

    @NonNull
    public final Button btnShare;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final SwipeRefreshLayout srf;

    private ActivityAiRecordsDetailBinding(@NonNull LinearLayout rootView, @NonNull Button btnShare, @NonNull RecyclerView rv, @NonNull SwipeRefreshLayout srf) {
        this.rootView = rootView;
        this.btnShare = btnShare;
        this.rv = rv;
        this.srf = srf;
    }

    @NonNull
    public static ActivityAiRecordsDetailBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_share;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
        if (r1 == null) goto L11;
        r0 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L11;
        r0 = R.id.srf;
        SwipeRefreshLayout r3 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r3 == null) goto L11;
        return new ActivityAiRecordsDetailBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAiRecordsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiRecordsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_records_detail, parent, false);
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
