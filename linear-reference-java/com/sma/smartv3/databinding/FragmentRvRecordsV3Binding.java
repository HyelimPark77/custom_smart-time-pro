package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentRvRecordsV3Binding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final RelativeLayout nowTimeDetailsLayout;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium sportRecordTotalCalorie;

    @NonNull
    public final PFMedium sportRecordTotalCalorieUnit;

    @NonNull
    public final PFMedium sportRecordTotalDuration;

    @NonNull
    public final PFMedium sportRecordTotalDurationUnit;

    @NonNull
    public final LinearLayout sportRecordTotalLayout;

    @NonNull
    public final PFMedium sportRecordTotalSize;

    @NonNull
    public final PFMedium sportRecordTotalSizeUnit;

    @NonNull
    public final PFMedium sportRecordTotalTitle;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentRvRecordsV3Binding(@NonNull LinearLayout rootView_, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull RelativeLayout nowTimeDetailsLayout, @NonNull DINCondBold nowValue, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull NestedScrollView scrollView, @NonNull PFMedium sportRecordTotalCalorie, @NonNull PFMedium sportRecordTotalCalorieUnit, @NonNull PFMedium sportRecordTotalDuration, @NonNull PFMedium sportRecordTotalDurationUnit, @NonNull LinearLayout sportRecordTotalLayout, @NonNull PFMedium sportRecordTotalSize, @NonNull PFMedium sportRecordTotalSizeUnit, @NonNull PFMedium sportRecordTotalTitle, @NonNull PFMedium valueUnit) {
        this.rootView_ = rootView_;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowTimeDetailsLayout = nowTimeDetailsLayout;
        this.nowValue = nowValue;
        this.rootView = rootView;
        this.rv = rv;
        this.scrollView = scrollView;
        this.sportRecordTotalCalorie = sportRecordTotalCalorie;
        this.sportRecordTotalCalorieUnit = sportRecordTotalCalorieUnit;
        this.sportRecordTotalDuration = sportRecordTotalDuration;
        this.sportRecordTotalDurationUnit = sportRecordTotalDurationUnit;
        this.sportRecordTotalLayout = sportRecordTotalLayout;
        this.sportRecordTotalSize = sportRecordTotalSize;
        this.sportRecordTotalSizeUnit = sportRecordTotalSizeUnit;
        this.sportRecordTotalTitle = sportRecordTotalTitle;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentRvRecordsV3Binding bind(@NonNull View rootView) {
        int r1 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L45;
        r1 = R.id.dataContent;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r6 == null) goto L45;
        r1 = R.id.image;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r7 == null) goto L45;
        r1 = R.id.loading;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r8 == null) goto L45;
        r1 = R.id.nextTime;
        ImageButton r9 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r9 == null) goto L45;
        r1 = R.id.nowTime;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r10 == null) goto L45;
        r1 = R.id.nowTimeDetails;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r11 == null) goto L45;
        r1 = R.id.nowTimeDetails_layout;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails_layout);
        if (r12 == null) goto L45;
        r1 = R.id.nowValue;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r13 == null) goto L45;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv;
        RecyclerView r15 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r15 == null) goto L45;
        r1 = R.id.scrollView;
        NestedScrollView r16 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r16 == null) goto L45;
        r1 = R.id.sport_record_total_calorie;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_calorie);
        if (r17 == null) goto L45;
        r1 = R.id.sport_record_total_calorie_unit;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_calorie_unit);
        if (r18 == null) goto L45;
        r1 = R.id.sport_record_total_duration;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_duration);
        if (r19 == null) goto L45;
        r1 = R.id.sport_record_total_duration_unit;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_duration_unit);
        if (r20 == null) goto L45;
        r1 = R.id.sport_record_total_layout;
        LinearLayout r21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_layout);
        if (r21 == null) goto L45;
        r1 = R.id.sport_record_total_size;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_size);
        if (r22 == null) goto L45;
        r1 = R.id.sport_record_total_size_unit;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_size_unit);
        if (r23 == null) goto L45;
        r1 = R.id.sport_record_total_title;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_title);
        if (r24 == null) goto L45;
        r1 = R.id.valueUnit;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r25 == null) goto L45;
        return new FragmentRvRecordsV3Binding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r4, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    L45:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentRvRecordsV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentRvRecordsV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_rv_records_v3, parent, false);
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
