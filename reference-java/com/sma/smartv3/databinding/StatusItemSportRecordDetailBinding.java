package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordDetailBinding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteSportRecord;

    @NonNull
    public final ImageView gpsStatusIv;

    @NonNull
    public final LinearLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51190rv;

    @NonNull
    public final PFMedium sportName;

    @NonNull
    public final ImageView sportSourceIv;

    @NonNull
    public final DINCondBold sportStartTime;

    @NonNull
    public final ImageView sportTypeIv;

    @NonNull
    public final FrameLayout wrapLayout;

    private StatusItemSportRecordDetailBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteSportRecord, @NonNull ImageView gpsStatusIv, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull RecyclerView rv, @NonNull PFMedium sportName, @NonNull ImageView sportSourceIv, @NonNull DINCondBold sportStartTime, @NonNull ImageView sportTypeIv, @NonNull FrameLayout wrapLayout) {
        this.rootView = rootView;
        this.btDeleteSportRecord = btDeleteSportRecord;
        this.gpsStatusIv = gpsStatusIv;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.f51190rv = rv;
        this.sportName = sportName;
        this.sportSourceIv = sportSourceIv;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
        this.wrapLayout = wrapLayout;
    }

    @NonNull
    public static StatusItemSportRecordDetailBinding bind(@NonNull View rootView) {
        int i = R.id.bt_delete_sport_record;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (imageButton != null) {
            i = R.id.gpsStatusIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.gpsStatusIv);
            if (imageView != null) {
                i = R.id.ll_item_panel;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                if (linearLayout != null) {
                    i = R.id.menu_wrap_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                    if (linearLayout2 != null) {
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
                                            i = R.id.wrap_layout;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.wrap_layout);
                                            if (frameLayout != null) {
                                                return new StatusItemSportRecordDetailBinding((RelativeLayout) rootView, imageButton, imageView, linearLayout, linearLayout2, recyclerView, pFMedium, imageView2, dINCondBold, imageView3, frameLayout);
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
    public static StatusItemSportRecordDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_detail, parent, false);
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
