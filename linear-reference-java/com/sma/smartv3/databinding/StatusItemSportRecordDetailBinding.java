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

    @NonNull
    public final FrameLayout wrapLayout;

    private StatusItemSportRecordDetailBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteSportRecord, @NonNull ImageView gpsStatusIv, @NonNull LinearLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull RecyclerView rv, @NonNull PFMedium sportName, @NonNull ImageView sportSourceIv, @NonNull DINCondBold sportStartTime, @NonNull ImageView sportTypeIv, @NonNull FrameLayout wrapLayout) {
        this.rootView = rootView;
        this.btDeleteSportRecord = btDeleteSportRecord;
        this.gpsStatusIv = gpsStatusIv;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.rv = rv;
        this.sportName = sportName;
        this.sportSourceIv = sportSourceIv;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
        this.wrapLayout = wrapLayout;
    }

    @NonNull
    public static StatusItemSportRecordDetailBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_delete_sport_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (r4 == null) goto L25;
        r0 = R.id.gpsStatusIv;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.gpsStatusIv);
        if (r5 == null) goto L25;
        r0 = R.id.ll_item_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r6 == null) goto L25;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r7 == null) goto L25;
        r0 = R.id.rv;
        RecyclerView r8 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r8 == null) goto L25;
        r0 = R.id.sportName;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r9 == null) goto L25;
        r0 = R.id.sportSourceIv;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportSourceIv);
        if (r10 == null) goto L25;
        r0 = R.id.sportStartTime;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r11 == null) goto L25;
        r0 = R.id.sportTypeIv;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
        if (r12 == null) goto L25;
        r0 = R.id.wrap_layout;
        FrameLayout r13 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.wrap_layout);
        if (r13 == null) goto L25;
        return new StatusItemSportRecordDetailBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSportRecordDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_detail, parent, false);
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
