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
        int i = R.id.sportItemDetail;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportItemDetail);
        if (linearLayout != null) {
            i = R.id.sportName;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
            if (pFMedium != null) {
                i = R.id.sportRecordList;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordList);
                if (linearLayout2 != null) {
                    i = R.id.sportStartTime;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
                    if (pFMedium2 != null) {
                        i = R.id.sportTypeIv;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
                        if (imageView != null) {
                            i = R.id.tv_time;
                            MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                            if (mHFont != null) {
                                i = R.id.tv_unit;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_value;
                                    MHFont mHFont2 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                                    if (mHFont2 != null) {
                                        return new V2StatusItemSportRecordBinding((LinearLayout) rootView, linearLayout, pFMedium, linearLayout2, pFMedium2, imageView, mHFont, pFMedium3, mHFont2);
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
    public static V2StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_sport_record, parent, false);
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
