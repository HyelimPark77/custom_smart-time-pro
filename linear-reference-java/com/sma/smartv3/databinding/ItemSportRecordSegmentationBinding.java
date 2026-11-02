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
        int r0 = R.id.segmentation_item_avgPace;
        DINCondBold r4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_avgPace);
        if (r4 == null) goto L13;
        r0 = R.id.segmentation_item_distance;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_distance);
        if (r5 == null) goto L13;
        r0 = R.id.segmentation_item_duration;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_duration);
        if (r6 == null) goto L13;
        r0 = R.id.segmentation_item_number;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.segmentation_item_number);
        if (r7 == null) goto L13;
        return new ItemSportRecordSegmentationBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportRecordSegmentationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportRecordSegmentationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_record_segmentation, parent, false);
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
