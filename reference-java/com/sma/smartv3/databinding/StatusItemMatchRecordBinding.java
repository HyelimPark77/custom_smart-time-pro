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
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemMatchRecordBinding implements ViewBinding {

    @NonNull
    public final LinearLayout matchItemDetail;

    @NonNull
    public final LinearLayout matchRecordList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold statusMatchCalorieValue;

    @NonNull
    public final DINCondBold statusMatchHrValue;

    @NonNull
    public final DINCondBold statusMatchTime;

    private StatusItemMatchRecordBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout matchItemDetail, @NonNull LinearLayout matchRecordList, @NonNull DINCondBold statusMatchCalorieValue, @NonNull DINCondBold statusMatchHrValue, @NonNull DINCondBold statusMatchTime) {
        this.rootView = rootView;
        this.matchItemDetail = matchItemDetail;
        this.matchRecordList = matchRecordList;
        this.statusMatchCalorieValue = statusMatchCalorieValue;
        this.statusMatchHrValue = statusMatchHrValue;
        this.statusMatchTime = statusMatchTime;
    }

    @NonNull
    public static StatusItemMatchRecordBinding bind(@NonNull View rootView) {
        int i = R.id.matchItemDetail;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.matchItemDetail);
        if (linearLayout != null) {
            i = R.id.matchRecordList;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.matchRecordList);
            if (linearLayout2 != null) {
                i = R.id.status_match_calorie_value;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_calorie_value);
                if (dINCondBold != null) {
                    i = R.id.status_match_hr_value;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_hr_value);
                    if (dINCondBold2 != null) {
                        i = R.id.status_match_time;
                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_time);
                        if (dINCondBold3 != null) {
                            return new StatusItemMatchRecordBinding((LinearLayout) rootView, linearLayout, linearLayout2, dINCondBold, dINCondBold2, dINCondBold3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemMatchRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemMatchRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_match_record, parent, false);
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
