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
import com.sma.smartv3.view.PaceProgressBar;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportRecordDetailPaceContentBinding implements ViewBinding {

    @NonNull
    public final DINCondBold number;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final PaceProgressBar f51164pb;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold tvPace;

    private ItemSportRecordDetailPaceContentBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold number, @NonNull PaceProgressBar pb, @NonNull DINCondBold tvPace) {
        this.rootView = rootView;
        this.number = number;
        this.f51164pb = pb;
        this.tvPace = tvPace;
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentBinding bind(@NonNull View rootView) {
        int i = R.id.number;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.number);
        if (dINCondBold != null) {
            i = R.id.f51421pb;
            PaceProgressBar paceProgressBar = (PaceProgressBar) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
            if (paceProgressBar != null) {
                i = R.id.tvPace;
                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvPace);
                if (dINCondBold2 != null) {
                    return new ItemSportRecordDetailPaceContentBinding((LinearLayout) rootView, dINCondBold, paceProgressBar, dINCondBold2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportRecordDetailPaceContentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_record_detail_pace_content, parent, false);
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
