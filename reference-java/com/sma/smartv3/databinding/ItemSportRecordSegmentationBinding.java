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
public final class ItemSportRecordSegmentationBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold segmentationItemAvgPace;

    @NonNull
    public final DINCondBold segmentationItemDistance;

    @NonNull
    public final DINCondBold segmentationItemDuration;

    @NonNull
    public final DINCondBold segmentationItemNumber;

    private ItemSportRecordSegmentationBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold segmentationItemAvgPace, @NonNull DINCondBold segmentationItemDistance, @NonNull DINCondBold segmentationItemDuration, @NonNull DINCondBold segmentationItemNumber) {
        this.rootView = rootView;
        this.segmentationItemAvgPace = segmentationItemAvgPace;
        this.segmentationItemDistance = segmentationItemDistance;
        this.segmentationItemDuration = segmentationItemDuration;
        this.segmentationItemNumber = segmentationItemNumber;
    }

    @NonNull
    public static ItemSportRecordSegmentationBinding bind(@NonNull View rootView) {
        int i = R.id.segmentation_item_avgPace;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_avgPace);
        if (dINCondBold != null) {
            i = R.id.segmentation_item_distance;
            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_distance);
            if (dINCondBold2 != null) {
                i = R.id.segmentation_item_duration;
                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_duration);
                if (dINCondBold3 != null) {
                    i = R.id.segmentation_item_number;
                    DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_number);
                    if (dINCondBold4 != null) {
                        return new ItemSportRecordSegmentationBinding((LinearLayout) rootView, dINCondBold, dINCondBold2, dINCondBold3, dINCondBold4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportRecordSegmentationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportRecordSegmentationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_record_segmentation, parent, false);
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
