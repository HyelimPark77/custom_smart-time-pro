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
import com.sma.smartv3.view.TempProgressBar;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusTempDayBinding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LinearLayout llHrvInfo;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final RelativeLayout noData;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final TempProgressBar tempPb;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusTempDayBinding(@NonNull LinearLayout rootView, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LinearLayout llHrvInfo, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull RelativeLayout noData, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull RecyclerView rv, @NonNull NestedScrollView scrollView, @NonNull TempProgressBar tempPb, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.llHrvInfo = llHrvInfo;
        this.loading = loading;
        this.nextTime = nextTime;
        this.noData = noData;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.rv = rv;
        this.scrollView = scrollView;
        this.tempPb = tempPb;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusTempDayBinding bind(@NonNull View rootView) {
        int r1 = R.id.beforeTime;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r5 == null) goto L33;
        r1 = R.id.dataContent;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r6 == null) goto L33;
        r1 = R.id.image;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r7 == null) goto L33;
        r1 = R.id.ll_hrv_info;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hrv_info);
        if (r8 == null) goto L33;
        r1 = R.id.loading;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r9 == null) goto L33;
        r1 = R.id.nextTime;
        ImageButton r10 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r10 == null) goto L33;
        r1 = R.id.noData;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r11 == null) goto L33;
        r1 = R.id.nowTime;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r12 == null) goto L33;
        r1 = R.id.nowTimeDetails;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r13 == null) goto L33;
        r1 = R.id.nowValue;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r14 == null) goto L33;
        r1 = R.id.rv;
        RecyclerView r15 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r15 == null) goto L33;
        r1 = R.id.scrollView;
        NestedScrollView r16 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r16 == null) goto L33;
        r1 = R.id.tempPb;
        TempProgressBar r17 = (TempProgressBar) ViewBindings.findChildViewById(rootView, R.id.tempPb);
        if (r17 == null) goto L33;
        r1 = R.id.valueUnit;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r18 == null) goto L33;
        return new FragmentStatusTempDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
    L33:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusTempDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusTempDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_temp_day, parent, false);
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
