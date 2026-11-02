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

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sportItemDetail;

    @NonNull
    public final LinearLayout sportRecordList;

    private StatusItemSportRecordBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout sportItemDetail, @NonNull LinearLayout sportRecordList) {
        this.rootView = rootView;
        this.sportItemDetail = sportItemDetail;
        this.sportRecordList = sportRecordList;
    }

    @NonNull
    public static StatusItemSportRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.sportItemDetail;
        LinearLayout r1 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportItemDetail);
        if (r1 == null) goto L9;
        r0 = R.id.sportRecordList;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordList);
        if (r2 == null) goto L9;
        return new StatusItemSportRecordBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record, parent, false);
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
