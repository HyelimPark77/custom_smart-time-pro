package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutSportRecordItemBinding implements ViewBinding {

    @NonNull
    public final ImageView gpsStatusIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final PFMedium sportName;

    @NonNull
    public final ImageView sportSourceIv;

    @NonNull
    public final DINCondBold sportStartTime;

    @NonNull
    public final ImageView sportTypeIv;

    private LayoutSportRecordItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView gpsStatusIv, @NonNull RecyclerView rv, @NonNull PFMedium sportName, @NonNull ImageView sportSourceIv, @NonNull DINCondBold sportStartTime, @NonNull ImageView sportTypeIv) {
        this.rootView = rootView;
        this.gpsStatusIv = gpsStatusIv;
        this.rv = rv;
        this.sportName = sportName;
        this.sportSourceIv = sportSourceIv;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
    }

    @NonNull
    public static LayoutSportRecordItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.gpsStatusIv;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.gpsStatusIv);
        if (r4 == null) goto L17;
        r0 = R.id.rv;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r5 == null) goto L17;
        r0 = R.id.sportName;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r6 == null) goto L17;
        r0 = R.id.sportSourceIv;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
        if (r7 == null) goto L17;
        r0 = R.id.sportStartTime;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r8 == null) goto L17;
        r0 = R.id.sportTypeIv;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
        if (r9 == null) goto L17;
        return new LayoutSportRecordItemBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutSportRecordItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutSportRecordItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_sport_record_item, parent, false);
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
