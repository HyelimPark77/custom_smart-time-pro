package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportNavigatorRecordBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemBackwardMon;

    @NonNull
    public final PFMedium itemBackwardNum;

    @NonNull
    public final PFMedium itemFlatMon;

    @NonNull
    public final PFMedium itemFlatNum;

    @NonNull
    public final LinearLayout itemLastRecord;

    @NonNull
    public final PFMedium itemLeadingMon;

    @NonNull
    public final PFMedium itemLeadingNum;

    @NonNull
    public final PFMedium itemLinChartRecordActual;

    @NonNull
    public final PFMedium itemLinChartRecordDifference;

    @NonNull
    public final PFMedium itemLinChartRecordTarget;

    @NonNull
    public final PFMedium itemLinChartRecordTime;

    @NonNull
    public final PFMedium itemLinChartRecordType;

    @NonNull
    public final PFMedium itemListRecordMore;

    @NonNull
    public final PFMedium itemModeName;

    @NonNull
    public final PFMedium itemSpeedTv;

    @NonNull
    public final PFMedium itemTimeTv;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final PFMedium recordSportsDuration;

    @NonNull
    public final AppCompatImageView recordSportsIcon;

    @NonNull
    public final PFMedium recordSportsTime;

    @NonNull
    public final PFMedium recordSportsTitle;

    @NonNull
    public final PFMedium recordSportsValue;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ItemSportNavigatorRecordBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemBackwardMon, @NonNull PFMedium itemBackwardNum, @NonNull PFMedium itemFlatMon, @NonNull PFMedium itemFlatNum, @NonNull LinearLayout itemLastRecord, @NonNull PFMedium itemLeadingMon, @NonNull PFMedium itemLeadingNum, @NonNull PFMedium itemLinChartRecordActual, @NonNull PFMedium itemLinChartRecordDifference, @NonNull PFMedium itemLinChartRecordTarget, @NonNull PFMedium itemLinChartRecordTime, @NonNull PFMedium itemLinChartRecordType, @NonNull PFMedium itemListRecordMore, @NonNull PFMedium itemModeName, @NonNull PFMedium itemSpeedTv, @NonNull PFMedium itemTimeTv, @NonNull LineChart lineChart, @NonNull PFMedium recordSportsDuration, @NonNull AppCompatImageView recordSportsIcon, @NonNull PFMedium recordSportsTime, @NonNull PFMedium recordSportsTitle, @NonNull PFMedium recordSportsValue, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemBackwardMon = itemBackwardMon;
        this.itemBackwardNum = itemBackwardNum;
        this.itemFlatMon = itemFlatMon;
        this.itemFlatNum = itemFlatNum;
        this.itemLastRecord = itemLastRecord;
        this.itemLeadingMon = itemLeadingMon;
        this.itemLeadingNum = itemLeadingNum;
        this.itemLinChartRecordActual = itemLinChartRecordActual;
        this.itemLinChartRecordDifference = itemLinChartRecordDifference;
        this.itemLinChartRecordTarget = itemLinChartRecordTarget;
        this.itemLinChartRecordTime = itemLinChartRecordTime;
        this.itemLinChartRecordType = itemLinChartRecordType;
        this.itemListRecordMore = itemListRecordMore;
        this.itemModeName = itemModeName;
        this.itemSpeedTv = itemSpeedTv;
        this.itemTimeTv = itemTimeTv;
        this.lineChart = lineChart;
        this.recordSportsDuration = recordSportsDuration;
        this.recordSportsIcon = recordSportsIcon;
        this.recordSportsTime = recordSportsTime;
        this.recordSportsTitle = recordSportsTitle;
        this.recordSportsValue = recordSportsValue;
        this.root = root;
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding bind(@NonNull View rootView) {
        int r1 = R.id.item_backward_mon;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_backward_mon);
        if (r5 == null) goto L49;
        r1 = R.id.item_backward_num;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_backward_num);
        if (r6 == null) goto L49;
        r1 = R.id.item_flat_mon;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_flat_mon);
        if (r7 == null) goto L49;
        r1 = R.id.item_flat_num;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_flat_num);
        if (r8 == null) goto L49;
        r1 = R.id.item_last_record;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_last_record);
        if (r9 == null) goto L49;
        r1 = R.id.item_leading_mon;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_leading_mon);
        if (r10 == null) goto L49;
        r1 = R.id.item_leading_num;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_leading_num);
        if (r11 == null) goto L49;
        r1 = R.id.item_lin_chart_record_actual;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_actual);
        if (r12 == null) goto L49;
        r1 = R.id.item_lin_chart_record_difference;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_difference);
        if (r13 == null) goto L49;
        r1 = R.id.item_lin_chart_record_target;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_target);
        if (r14 == null) goto L49;
        r1 = R.id.item_lin_chart_record_time;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_time);
        if (r15 == null) goto L49;
        r1 = R.id.item_lin_chart_record_type;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lin_chart_record_type);
        if (r16 == null) goto L49;
        r1 = R.id.item_list_record_more;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_list_record_more);
        if (r17 == null) goto L49;
        r1 = R.id.item_mode_name;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_mode_name);
        if (r18 == null) goto L49;
        r1 = R.id.item_speed_tv;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_speed_tv);
        if (r19 == null) goto L49;
        r1 = R.id.item_time_tv;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_time_tv);
        if (r20 == null) goto L49;
        r1 = R.id.line_chart;
        LineChart r21 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
        if (r21 == null) goto L49;
        r1 = R.id.record_sports_duration;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
        if (r22 == null) goto L49;
        r1 = R.id.record_sports_icon;
        AppCompatImageView r23 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
        if (r23 == null) goto L49;
        r1 = R.id.record_sports_time;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
        if (r24 == null) goto L49;
        r1 = R.id.record_sports_title;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
        if (r25 == null) goto L49;
        r1 = R.id.record_sports_value;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
        if (r26 == null) goto L49;
        LinearLayout r4 = (LinearLayout) rootView;
        return new ItemSportNavigatorRecordBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r4);
    L49:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportNavigatorRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_navigator_record, parent, false);
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
