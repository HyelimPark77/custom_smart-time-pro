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
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.CustomNestedScollView;
import com.sma.smartv3.view.SlideLockView;
import com.sma.smartv3.view.SportEndProgress;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportOnGoingBinding implements ViewBinding {

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final CardView cardPanel;

    @NonNull
    public final RelativeLayout cardPanelSub;

    @NonNull
    public final LinearLayout countdownRl;

    @NonNull
    public final DINCondBold countdownTv;

    @NonNull
    public final LinearLayout flHandle;

    @NonNull
    public final FrameLayout flMap;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final CoordinatorLayout rootView;

    @NonNull
    private final CoordinatorLayout rootView_;

    @NonNull
    public final RelativeLayout screenLockRl;

    @NonNull
    public final SlideLockView slideLockView;

    @NonNull
    public final LinearLayout sportDataLl;

    @NonNull
    public final SportEndProgress sportEndProgress;

    @NonNull
    public final DINCondBold sportFourShowValue;

    @NonNull
    public final PFMedium sportFourShowValueDesc;

    @NonNull
    public final TintImageView sportLock;

    @NonNull
    public final PFMedium sportModelName;

    @NonNull
    public final FrameLayout sportOnGoingFl;

    @NonNull
    public final LinearLayout sportOnGoingLeftLayout;

    @NonNull
    public final LinearLayout sportOnGoingRightLayout;

    @NonNull
    public final DINCondBold sportOneShowValue;

    @NonNull
    public final PFMedium sportOneShowValueDesc;

    @NonNull
    public final ImageButton sportPause;

    @NonNull
    public final LinearLayout sportPausePanel;

    @NonNull
    public final CustomNestedScollView sportProcess;

    @NonNull
    public final ImageView sportResume;

    @NonNull
    public final LinearLayout sportRunPanel;

    @NonNull
    public final TintImageView sportSet;

    @NonNull
    public final DINCondBold sportThreeShowValue;

    @NonNull
    public final PFMedium sportThreeShowValueDesc;

    @NonNull
    public final DINCondBold sportTwoShowValue;

    @NonNull
    public final PFMedium sportTwoShowValueDesc;

    @NonNull
    public final LinearLayout statusPanel;

    private ActivitySportOnGoingBinding(@NonNull CoordinatorLayout rootView_, @NonNull TextureMapView bMapView, @NonNull CardView cardPanel, @NonNull RelativeLayout cardPanelSub, @NonNull LinearLayout countdownRl, @NonNull DINCondBold countdownTv, @NonNull LinearLayout flHandle, @NonNull FrameLayout flMap, @NonNull CustomGoogleMapView gMapView, @NonNull CoordinatorLayout rootView, @NonNull RelativeLayout screenLockRl, @NonNull SlideLockView slideLockView, @NonNull LinearLayout sportDataLl, @NonNull SportEndProgress sportEndProgress, @NonNull DINCondBold sportFourShowValue, @NonNull PFMedium sportFourShowValueDesc, @NonNull TintImageView sportLock, @NonNull PFMedium sportModelName, @NonNull FrameLayout sportOnGoingFl, @NonNull LinearLayout sportOnGoingLeftLayout, @NonNull LinearLayout sportOnGoingRightLayout, @NonNull DINCondBold sportOneShowValue, @NonNull PFMedium sportOneShowValueDesc, @NonNull ImageButton sportPause, @NonNull LinearLayout sportPausePanel, @NonNull CustomNestedScollView sportProcess, @NonNull ImageView sportResume, @NonNull LinearLayout sportRunPanel, @NonNull TintImageView sportSet, @NonNull DINCondBold sportThreeShowValue, @NonNull PFMedium sportThreeShowValueDesc, @NonNull DINCondBold sportTwoShowValue, @NonNull PFMedium sportTwoShowValueDesc, @NonNull LinearLayout statusPanel) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.cardPanel = cardPanel;
        this.cardPanelSub = cardPanelSub;
        this.countdownRl = countdownRl;
        this.countdownTv = countdownTv;
        this.flHandle = flHandle;
        this.flMap = flMap;
        this.gMapView = gMapView;
        this.rootView = rootView;
        this.screenLockRl = screenLockRl;
        this.slideLockView = slideLockView;
        this.sportDataLl = sportDataLl;
        this.sportEndProgress = sportEndProgress;
        this.sportFourShowValue = sportFourShowValue;
        this.sportFourShowValueDesc = sportFourShowValueDesc;
        this.sportLock = sportLock;
        this.sportModelName = sportModelName;
        this.sportOnGoingFl = sportOnGoingFl;
        this.sportOnGoingLeftLayout = sportOnGoingLeftLayout;
        this.sportOnGoingRightLayout = sportOnGoingRightLayout;
        this.sportOneShowValue = sportOneShowValue;
        this.sportOneShowValueDesc = sportOneShowValueDesc;
        this.sportPause = sportPause;
        this.sportPausePanel = sportPausePanel;
        this.sportProcess = sportProcess;
        this.sportResume = sportResume;
        this.sportRunPanel = sportRunPanel;
        this.sportSet = sportSet;
        this.sportThreeShowValue = sportThreeShowValue;
        this.sportThreeShowValueDesc = sportThreeShowValueDesc;
        this.sportTwoShowValue = sportTwoShowValue;
        this.sportTwoShowValueDesc = sportTwoShowValueDesc;
        this.statusPanel = statusPanel;
    }

    @NonNull
    public static ActivitySportOnGoingBinding bind(@NonNull View rootView) {
        int r1 = R.id.bMapView;
        TextureMapView r5 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r5 == null) goto L69;
        r1 = R.id.cardPanel;
        CardView r6 = (CardView) ViewBindings.findChildViewById(rootView, R.id.cardPanel);
        if (r6 == null) goto L69;
        r1 = R.id.cardPanelSub;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.cardPanelSub);
        if (r7 == null) goto L69;
        r1 = R.id.countdownRl;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.countdownRl);
        if (r8 == null) goto L69;
        r1 = R.id.countdownTv;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.countdownTv);
        if (r9 == null) goto L69;
        r1 = R.id.fl_handle;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fl_handle);
        if (r10 == null) goto L69;
        r1 = R.id.fl_map;
        FrameLayout r11 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_map);
        if (r11 == null) goto L69;
        r1 = R.id.gMapView;
        CustomGoogleMapView r12 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r12 == null) goto L69;
        CoordinatorLayout r4 = (CoordinatorLayout) rootView;
        r1 = R.id.screenLockRl;
        RelativeLayout r14 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.screenLockRl);
        if (r14 == null) goto L69;
        r1 = R.id.slideLockView;
        SlideLockView r15 = (SlideLockView) ViewBindings.findChildViewById(rootView, R.id.slideLockView);
        if (r15 == null) goto L69;
        r1 = R.id.sportDataLl;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportDataLl);
        if (r16 == null) goto L69;
        r1 = R.id.sportEndProgress;
        SportEndProgress r17 = (SportEndProgress) ViewBindings.findChildViewById(rootView, R.id.sportEndProgress);
        if (r17 == null) goto L69;
        r1 = R.id.sportFourShowValue;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportFourShowValue);
        if (r18 == null) goto L69;
        r1 = R.id.sportFourShowValueDesc;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportFourShowValueDesc);
        if (r19 == null) goto L69;
        r1 = R.id.sportLock;
        TintImageView r20 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportLock);
        if (r20 == null) goto L69;
        r1 = R.id.sportModelName;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportModelName);
        if (r21 == null) goto L69;
        r1 = R.id.sportOnGoingFl;
        FrameLayout r22 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sportOnGoingFl);
        if (r22 == null) goto L69;
        r1 = R.id.sport_on_going_left_layout;
        LinearLayout r23 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_on_going_left_layout);
        if (r23 == null) goto L69;
        r1 = R.id.sport_on_going_right_layout;
        LinearLayout r24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_on_going_right_layout);
        if (r24 == null) goto L69;
        r1 = R.id.sportOneShowValue;
        DINCondBold r25 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportOneShowValue);
        if (r25 == null) goto L69;
        r1 = R.id.sportOneShowValueDesc;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportOneShowValueDesc);
        if (r26 == null) goto L69;
        r1 = R.id.sportPause;
        ImageButton r27 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.sportPause);
        if (r27 == null) goto L69;
        r1 = R.id.sportPausePanel;
        LinearLayout r28 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportPausePanel);
        if (r28 == null) goto L69;
        r1 = R.id.sportProcess;
        CustomNestedScollView r29 = (CustomNestedScollView) ViewBindings.findChildViewById(rootView, R.id.sportProcess);
        if (r29 == null) goto L69;
        r1 = R.id.sportResume;
        ImageView r30 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportResume);
        if (r30 == null) goto L69;
        r1 = R.id.sportRunPanel;
        LinearLayout r31 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRunPanel);
        if (r31 == null) goto L69;
        r1 = R.id.sportSet;
        TintImageView r32 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportSet);
        if (r32 == null) goto L69;
        r1 = R.id.sportThreeShowValue;
        DINCondBold r33 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportThreeShowValue);
        if (r33 == null) goto L69;
        r1 = R.id.sportThreeShowValueDesc;
        PFMedium r34 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportThreeShowValueDesc);
        if (r34 == null) goto L69;
        r1 = R.id.sportTwoShowValue;
        DINCondBold r35 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTwoShowValue);
        if (r35 == null) goto L69;
        r1 = R.id.sportTwoShowValueDesc;
        PFMedium r36 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportTwoShowValueDesc);
        if (r36 == null) goto L69;
        r1 = R.id.status_panel;
        LinearLayout r37 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.status_panel);
        if (r37 == null) goto L69;
        return new ActivitySportOnGoingBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r4, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);
    L69:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivitySportOnGoingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportOnGoingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_on_going, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView_;
    }
}
