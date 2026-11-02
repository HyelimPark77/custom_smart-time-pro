package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusSleepDayBinding implements ViewBinding {

    @NonNull
    public final DINCondBold awakeValue;

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final DINCondBold deepValue;

    @NonNull
    public final ImageView image;

    @NonNull
    public final DINCondBold lightValue;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final TextView sleepEndTime;

    @NonNull
    public final TextView sleepStartTime;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusSleepDayBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold awakeValue, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull DINCondBold deepValue, @NonNull ImageView image, @NonNull DINCondBold lightValue, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull TextView sleepEndTime, @NonNull TextView sleepStartTime, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.awakeValue = awakeValue;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.deepValue = deepValue;
        this.image = image;
        this.lightValue = lightValue;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.sleepEndTime = sleepEndTime;
        this.sleepStartTime = sleepStartTime;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusSleepDayBinding bind(@NonNull View rootView) {
        int r1 = R.id.awakeValue;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.awakeValue);
        if (r5 == null) goto L37;
        r1 = R.id.barChart;
        BarChart r6 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r6 == null) goto L37;
        r1 = R.id.beforeTime;
        ImageButton r7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r7 == null) goto L37;
        r1 = R.id.dataContent;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r8 == null) goto L37;
        r1 = R.id.deepValue;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.deepValue);
        if (r9 == null) goto L37;
        r1 = R.id.image;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r10 == null) goto L37;
        r1 = R.id.lightValue;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.lightValue);
        if (r11 == null) goto L37;
        r1 = R.id.loading;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r12 == null) goto L37;
        r1 = R.id.nextTime;
        ImageButton r13 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r13 == null) goto L37;
        r1 = R.id.nowTime;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r14 == null) goto L37;
        r1 = R.id.nowTimeDetails;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r15 == null) goto L37;
        r1 = R.id.nowValue;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r16 == null) goto L37;
        r1 = R.id.scrollView;
        NestedScrollView r17 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r17 == null) goto L37;
        r1 = R.id.sleepEndTime;
        TextView r18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
        if (r18 == null) goto L37;
        r1 = R.id.sleepStartTime;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
        if (r19 == null) goto L37;
        r1 = R.id.valueUnit;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r20 == null) goto L37;
        return new FragmentStatusSleepDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    L37:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusSleepDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusSleepDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_sleep_day, parent, false);
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
