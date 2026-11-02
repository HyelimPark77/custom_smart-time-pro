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

    @NonNull
    public final PaceProgressBarV2 pb;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final DINCondBold tvPace;

    private ItemSportRecordDetailPaceContentV2Binding(@NonNull RelativeLayout rootView, @NonNull DINCondBold number, @NonNull PaceProgressBarV2 pb, @NonNull DINCondBold tvPace) {
        this.rootView = rootView;
        this.number = number;
        this.pb = pb;
        this.tvPace = tvPace;
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.number;
        DINCondBold r1 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.number);
        if (r1 == null) goto L11;
        r0 = R.id.pb;
        PaceProgressBarV2 r2 = (PaceProgressBarV2) ViewBindings.findChildViewById(rootView, R.id.pb);
        if (r2 == null) goto L11;
        r0 = R.id.tvPace;
        DINCondBold r3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvPace);
        if (r3 == null) goto L11;
        return new ItemSportRecordDetailPaceContentV2Binding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_record_detail_pace_content_v2, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
