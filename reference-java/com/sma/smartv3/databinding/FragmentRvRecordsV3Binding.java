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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51119rv;

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
        this.f51119rv = rv;
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
        int i = R.id.beforeTime;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (imageButton != null) {
            i = R.id.dataContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
            if (linearLayout != null) {
                i = R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                if (imageView != null) {
                    i = R.id.loading;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                    if (relativeLayout != null) {
                        i = R.id.nextTime;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                        if (imageButton2 != null) {
                            i = R.id.nowTime;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                            if (pFMedium != null) {
                                i = R.id.nowTimeDetails;
                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                if (dINCondBold != null) {
                                    i = R.id.nowTimeDetails_layout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails_layout);
                                    if (relativeLayout2 != null) {
                                        i = R.id.nowValue;
                                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                        if (dINCondBold2 != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) rootView;
                                            i = R.id.f51422rv;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                            if (recyclerView != null) {
                                                i = R.id.scrollView;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                if (nestedScrollView != null) {
                                                    i = R.id.sport_record_total_calorie;
                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_calorie);
                                                    if (pFMedium2 != null) {
                                                        i = R.id.sport_record_total_calorie_unit;
                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_calorie_unit);
                                                        if (pFMedium3 != null) {
                                                            i = R.id.sport_record_total_duration;
                                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_duration);
                                                            if (pFMedium4 != null) {
                                                                i = R.id.sport_record_total_duration_unit;
                                                                PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_duration_unit);
                                                                if (pFMedium5 != null) {
                                                                    i = R.id.sport_record_total_layout;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_layout);
                                                                    if (linearLayout3 != null) {
                                                                        i = R.id.sport_record_total_size;
                                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_size);
                                                                        if (pFMedium6 != null) {
                                                                            i = R.id.sport_record_total_size_unit;
                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_size_unit);
                                                                            if (pFMedium7 != null) {
                                                                                i = R.id.sport_record_total_title;
                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_record_total_title);
                                                                                if (pFMedium8 != null) {
                                                                                    i = R.id.valueUnit;
                                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                                                    if (pFMedium9 != null) {
                                                                                        return new FragmentRvRecordsV3Binding(linearLayout2, imageButton, linearLayout, imageView, relativeLayout, imageButton2, pFMedium, dINCondBold, relativeLayout2, dINCondBold2, linearLayout2, recyclerView, nestedScrollView, pFMedium2, pFMedium3, pFMedium4, pFMedium5, linearLayout3, pFMedium6, pFMedium7, pFMedium8, pFMedium9);
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
    public static FragmentRvRecordsV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentRvRecordsV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_rv_records_v3, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
