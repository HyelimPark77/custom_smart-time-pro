package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordDetailV2Binding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteSportRecord;

    @NonNull
    public final RelativeLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium sportDistance;

    @NonNull
    public final PFMedium sportDistanceTimeTv;

    @NonNull
    public final PFMedium sportDistanceUnit;

    @NonNull
    public final PFMedium sportName;

    @NonNull
    public final PFMedium sportPace;

    @NonNull
    public final PFMedium sportPaceUnit;

    @NonNull
    public final DINCondBold sportStartTime;

    @NonNull
    public final ImageView sportTypeIv;

    private StatusItemSportRecordDetailV2Binding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteSportRecord, @NonNull RelativeLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull PFMedium sportDistance, @NonNull PFMedium sportDistanceTimeTv, @NonNull PFMedium sportDistanceUnit, @NonNull PFMedium sportName, @NonNull PFMedium sportPace, @NonNull PFMedium sportPaceUnit, @NonNull DINCondBold sportStartTime, @NonNull ImageView sportTypeIv) {
        this.rootView = rootView;
        this.btDeleteSportRecord = btDeleteSportRecord;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.sportDistance = sportDistance;
        this.sportDistanceTimeTv = sportDistanceTimeTv;
        this.sportDistanceUnit = sportDistanceUnit;
        this.sportName = sportName;
        this.sportPace = sportPace;
        this.sportPaceUnit = sportPaceUnit;
        this.sportStartTime = sportStartTime;
        this.sportTypeIv = sportTypeIv;
    }

    @NonNull
    public static StatusItemSportRecordDetailV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.bt_delete_sport_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (r4 == null) goto L27;
        r0 = R.id.ll_item_panel;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r5 == null) goto L27;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r6 == null) goto L27;
        r0 = R.id.sportDistance;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistance);
        if (r7 == null) goto L27;
        r0 = R.id.sportDistanceTimeTv;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistanceTimeTv);
        if (r8 == null) goto L27;
        r0 = R.id.sportDistance_unit;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistance_unit);
        if (r9 == null) goto L27;
        r0 = R.id.sportName;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
        if (r10 == null) goto L27;
        r0 = R.id.sportPace;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportPace);
        if (r11 == null) goto L27;
        r0 = R.id.sportPaceUnit;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportPaceUnit);
        if (r12 == null) goto L27;
        r0 = R.id.sportStartTime;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
        if (r13 == null) goto L27;
        r0 = R.id.sportTypeIv;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
        if (r14 == null) goto L27;
        return new StatusItemSportRecordDetailV2Binding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSportRecordDetailV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordDetailV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_detail_v2, parent, false);
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
