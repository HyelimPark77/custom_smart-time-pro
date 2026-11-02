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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusHrDayBinding implements ViewBinding {

    @NonNull
    public final PFMedium avHrTV;

    @NonNull
    public final PFMedium avHrUnit;

    @NonNull
    public final DINCondBold avHrValue;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final PFMedium maxHrTV;

    @NonNull
    public final PFMedium maxHrUnit;

    @NonNull
    public final DINCondBold maxHrValue;

    @NonNull
    public final PFMedium minHrTV;

    @NonNull
    public final PFMedium minHrUnit;

    @NonNull
    public final DINCondBold minHrValue;

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
    public final PFMedium valueUnit;

    private FragmentStatusHrDayBinding(@NonNull LinearLayout rootView, @NonNull PFMedium avHrTV, @NonNull PFMedium avHrUnit, @NonNull DINCondBold avHrValue, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull RelativeLayout loading, @NonNull PFMedium maxHrTV, @NonNull PFMedium maxHrUnit, @NonNull DINCondBold maxHrValue, @NonNull PFMedium minHrTV, @NonNull PFMedium minHrUnit, @NonNull DINCondBold minHrValue, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.avHrTV = avHrTV;
        this.avHrUnit = avHrUnit;
        this.avHrValue = avHrValue;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.lineChart = lineChart;
        this.loading = loading;
        this.maxHrTV = maxHrTV;
        this.maxHrUnit = maxHrUnit;
        this.maxHrValue = maxHrValue;
        this.minHrTV = minHrTV;
        this.minHrUnit = minHrUnit;
        this.minHrValue = minHrValue;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusHrDayBinding bind(@NonNull View rootView) {
        int i = R.id.avHrTV;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avHrTV);
        if (pFMedium != null) {
            i = R.id.avHrUnit;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avHrUnit);
            if (pFMedium2 != null) {
                i = R.id.avHrValue;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.avHrValue);
                if (dINCondBold != null) {
                    i = R.id.beforeTime;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
                    if (imageButton != null) {
                        i = R.id.dataContent;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
                        if (linearLayout != null) {
                            i = R.id.image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                            if (imageView != null) {
                                i = R.id.lineChart;
                                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
                                if (lineChart != null) {
                                    i = R.id.loading;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                                    if (relativeLayout != null) {
                                        i = R.id.maxHrTV;
                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxHrTV);
                                        if (pFMedium3 != null) {
                                            i = R.id.maxHrUnit;
                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxHrUnit);
                                            if (pFMedium4 != null) {
                                                i = R.id.maxHrValue;
                                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxHrValue);
                                                if (dINCondBold2 != null) {
                                                    i = R.id.minHrTV;
                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrTV);
                                                    if (pFMedium5 != null) {
                                                        i = R.id.minHrUnit;
                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minHrUnit);
                                                        if (pFMedium6 != null) {
                                                            i = R.id.minHrValue;
                                                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minHrValue);
                                                            if (dINCondBold3 != null) {
                                                                i = R.id.nextTime;
                                                                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                                                                if (imageButton2 != null) {
                                                                    i = R.id.nowTime;
                                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                                                    if (pFMedium7 != null) {
                                                                        i = R.id.nowTimeDetails;
                                                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                                                        if (dINCondBold4 != null) {
                                                                            i = R.id.nowValue;
                                                                            DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                                                            if (dINCondBold5 != null) {
                                                                                i = R.id.scrollView;
                                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                                                if (nestedScrollView != null) {
                                                                                    i = R.id.valueUnit;
                                                                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                    if (pFMedium8 != null) {
                                                                                        return new FragmentStatusHrDayBinding((LinearLayout) rootView, pFMedium, pFMedium2, dINCondBold, imageButton, linearLayout, imageView, lineChart, relativeLayout, pFMedium3, pFMedium4, dINCondBold2, pFMedium5, pFMedium6, dINCondBold3, imageButton2, pFMedium7, dINCondBold4, dINCondBold5, nestedScrollView, pFMedium8);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStatusHrDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusHrDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_hr_day, parent, false);
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
