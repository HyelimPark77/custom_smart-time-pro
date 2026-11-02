package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemSportRecordBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sportItemDetail;

    @NonNull
    public final PFMedium sportName;

    @NonNull
    public final LinearLayout sportRecordList;

    @NonNull
    public final PFMedium sportStartTime;

    @NonNull
    public final ImageView sportTypeIv;

    @NonNull
    public final MHFont tvTime;

    @NonNull
    public final PFMedium tvUnit;

    @NonNull
    public final MHFont tvValue;

    private V2StatusItemSportRecordBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout sportItemDetail, @NonNull PFMedium sportName, @NonNull LinearLayout sportRecordList, @NonNull PFMedium sportStartTime, @NonNull ImageView sportTypeIv, @NonNull MHFont tvTime, @NonNull PFMedium tvUnit, @NonNull MHFont tvValue) {
        this.rootView = rootView;
        this.sportItemDetail = sportItemDetail;
        this.sportName = sportName;
        this.sportRecordList = sportRecordList;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
        this.tvTime = tvTime;
        this.tvUnit = tvUnit;
        this.tvValue = tvValue;
    }

    @NonNull
    public static V2StatusItemSportRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.sportItemDetail;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportItemDetail);
        if (r4 == null) goto L21;
        r0 = R.id.sportName;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r5 == null) goto L21;
        r0 = R.id.sportRecordList;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordList);
        if (r6 == null) goto L21;
        r0 = R.id.sportStartTime;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r7 == null) goto L21;
        r0 = R.id.sportTypeIv;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
        if (r8 == null) goto L21;
        r0 = R.id.tv_time;
        MHFont r9 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r9 == null) goto L21;
        r0 = R.id.tv_unit;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
        if (r10 == null) goto L21;
        r0 = R.id.tv_value;
        MHFont r11 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r11 == null) goto L21;
        return new V2StatusItemSportRecordBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_sport_record, parent, false);
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
