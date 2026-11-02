package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.PaceProgressBarV2;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportRecordDetailPaceContentV2Binding implements ViewBinding {

    @NonNull
    public final DINCondBold number;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final PaceProgressBarV2 f51165pb;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final DINCondBold tvPace;

    private ItemSportRecordDetailPaceContentV2Binding(@NonNull RelativeLayout rootView, @NonNull DINCondBold number, @NonNull PaceProgressBarV2 pb, @NonNull DINCondBold tvPace) {
        this.rootView = rootView;
        this.number = number;
        this.f51165pb = pb;
        this.tvPace = tvPace;
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding bind(@NonNull View rootView) {
        int i = R.id.number;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.number);
        if (dINCondBold != null) {
            i = R.id.f51421pb;
            PaceProgressBarV2 paceProgressBarV2 = (PaceProgressBarV2) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
            if (paceProgressBarV2 != null) {
                i = R.id.tvPace;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvPace);
                if (dINCondBold2 != null) {
                    return new ItemSportRecordDetailPaceContentV2Binding((RelativeLayout) rootView, dINCondBold, paceProgressBarV2, dINCondBold2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_record_detail_pace_content_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
