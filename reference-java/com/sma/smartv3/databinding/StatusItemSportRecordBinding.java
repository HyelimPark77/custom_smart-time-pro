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
        int i = R.id.sportItemDetail;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportItemDetail);
        if (linearLayout != null) {
            i = R.id.sportRecordList;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordList);
            if (linearLayout2 != null) {
                return new StatusItemSportRecordBinding((LinearLayout) rootView, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
