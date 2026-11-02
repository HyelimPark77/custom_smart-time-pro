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
        int i = R.id.bt_delete_sport_record;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (imageButton != null) {
            i = R.id.ll_item_panel;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
            if (relativeLayout != null) {
                i = R.id.menu_wrap_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                if (linearLayout != null) {
                    i = R.id.sportDistance;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistance);
                    if (pFMedium != null) {
                        i = R.id.sportDistanceTimeTv;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistanceTimeTv);
                        if (pFMedium2 != null) {
                            i = R.id.sportDistance_unit;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportDistance_unit);
                            if (pFMedium3 != null) {
                                i = R.id.sportName;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportName);
                                if (pFMedium4 != null) {
                                    i = R.id.sportPace;
                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportPace);
                                    if (pFMedium5 != null) {
                                        i = R.id.sportPaceUnit;
                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportPaceUnit);
                                        if (pFMedium6 != null) {
                                            i = R.id.sportStartTime;
                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportStartTime);
                                            if (dINCondBold != null) {
                                                i = R.id.sportTypeIv;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportTypeIv);
                                                if (imageView != null) {
                                                    return new StatusItemSportRecordDetailV2Binding((RelativeLayout) rootView, imageButton, relativeLayout, linearLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, dINCondBold, imageView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemSportRecordDetailV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordDetailV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_detail_v2, parent, false);
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
