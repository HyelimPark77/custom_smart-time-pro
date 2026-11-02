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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51175rv;

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
        this.f51175rv = rv;
        this.sportName = sportName;
        this.sportSourceIv = sportSourceIv;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
    }

    @NonNull
    public static LayoutSportRecordItemBinding bind(@NonNull View rootView) {
        int i = R.id.gpsStatusIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.gpsStatusIv);
        if (imageView != null) {
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.sportName;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
                if (pFMedium != null) {
                    i = R.id.sportSourceIv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
                    if (imageView2 != null) {
                        i = R.id.sportStartTime;
                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
                        if (dINCondBold != null) {
                            i = R.id.sportTypeIv;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
                            if (imageView3 != null) {
                                return new LayoutSportRecordItemBinding((LinearLayout) rootView, imageView, recyclerView, pFMedium, imageView2, dINCondBold, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutSportRecordItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutSportRecordItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sport_record_item, parent, false);
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
