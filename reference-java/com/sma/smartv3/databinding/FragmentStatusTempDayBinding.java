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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51124rv;

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
        this.f51124rv = rv;
        this.scrollView = scrollView;
        this.tempPb = tempPb;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusTempDayBinding bind(@NonNull View rootView) {
        int i = R.id.beforeTime;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (imageButton != null) {
            i = R.id.dataContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
            if (linearLayout != null) {
                i = R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                if (imageView != null) {
                    i = R.id.ll_hrv_info;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hrv_info);
                    if (linearLayout2 != null) {
                        i = R.id.loading;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                        if (relativeLayout != null) {
                            i = R.id.nextTime;
                            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                            if (imageButton2 != null) {
                                i = R.id.noData;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.noData);
                                if (relativeLayout2 != null) {
                                    i = R.id.nowTime;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                                    if (pFMedium != null) {
                                        i = R.id.nowTimeDetails;
                                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                        if (dINCondBold != null) {
                                            i = R.id.nowValue;
                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                            if (dINCondBold2 != null) {
                                                i = R.id.f51422rv;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                                if (recyclerView != null) {
                                                    i = R.id.scrollView;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.tempPb;
                                                        TempProgressBar tempProgressBar = (TempProgressBar) ViewBindings.findChildViewById(rootView, R.id.tempPb);
                                                        if (tempProgressBar != null) {
                                                            i = R.id.valueUnit;
                                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                            if (pFMedium2 != null) {
                                                                return new FragmentStatusTempDayBinding((LinearLayout) rootView, imageButton, linearLayout, imageView, linearLayout2, relativeLayout, imageButton2, relativeLayout2, pFMedium, dINCondBold, dINCondBold2, recyclerView, nestedScrollView, tempProgressBar, pFMedium2);
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
    public static FragmentStatusTempDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusTempDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_temp_day, parent, false);
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
