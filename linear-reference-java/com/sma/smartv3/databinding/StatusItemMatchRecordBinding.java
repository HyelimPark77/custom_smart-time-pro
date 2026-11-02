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
        int r0 = R.id.matchItemDetail;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.matchItemDetail);
        if (r4 == null) goto L15;
        r0 = R.id.matchRecordList;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.matchRecordList);
        if (r5 == null) goto L15;
        r0 = R.id.status_match_calorie_value;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_calorie_value);
        if (r6 == null) goto L15;
        r0 = R.id.status_match_hr_value;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_hr_value);
        if (r7 == null) goto L15;
        r0 = R.id.status_match_time;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.status_match_time);
        if (r8 == null) goto L15;
        return new StatusItemMatchRecordBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemMatchRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemMatchRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_match_record, parent, false);
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
