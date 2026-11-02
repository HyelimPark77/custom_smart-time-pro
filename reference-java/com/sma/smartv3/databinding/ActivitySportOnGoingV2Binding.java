package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.CustomNestedScollView;
import com.sma.smartv3.view.NewSportButtonProgress;
import com.sma.smartv3.view.SlideLockView;
import com.sma.smartv3.view.SportEndProgress;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportOnGoingV2Binding implements ViewBinding {

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
    public final NewSportButtonProgress sportEndProgressV2;

    @NonNull
    public final DINCondBold sportFourShowValue;

    @NonNull
    public final PFMedium sportFourShowValueDesc;

    @NonNull
    public final RelativeLayout sportGoalLayout;

    @NonNull
    public final ProgressBar sportGoalPbProgress;

    @NonNull
    public final TextView sportGoalTv;

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
    public final LinearLayout sportThreeShowValueLayout;

    @NonNull
    public final DINCondBold sportTwoShowValue;

    @NonNull
    public final PFMedium sportTwoShowValueDesc;

    @NonNull
    public final LinearLayout statusPanel;

    @NonNull
    public final AppCompatImageView topBg;

    @NonNull
    public final AppCompatImageView topBgIcon;

    private ActivitySportOnGoingV2Binding(@NonNull CoordinatorLayout rootView_, @NonNull TextureMapView bMapView, @NonNull CardView cardPanel, @NonNull RelativeLayout cardPanelSub, @NonNull LinearLayout countdownRl, @NonNull DINCondBold countdownTv, @NonNull LinearLayout flHandle, @NonNull FrameLayout flMap, @NonNull CustomGoogleMapView gMapView, @NonNull CoordinatorLayout rootView, @NonNull RelativeLayout screenLockRl, @NonNull SlideLockView slideLockView, @NonNull LinearLayout sportDataLl, @NonNull SportEndProgress sportEndProgress, @NonNull NewSportButtonProgress sportEndProgressV2, @NonNull DINCondBold sportFourShowValue, @NonNull PFMedium sportFourShowValueDesc, @NonNull RelativeLayout sportGoalLayout, @NonNull ProgressBar sportGoalPbProgress, @NonNull TextView sportGoalTv, @NonNull TintImageView sportLock, @NonNull PFMedium sportModelName, @NonNull FrameLayout sportOnGoingFl, @NonNull LinearLayout sportOnGoingLeftLayout, @NonNull LinearLayout sportOnGoingRightLayout, @NonNull DINCondBold sportOneShowValue, @NonNull PFMedium sportOneShowValueDesc, @NonNull ImageButton sportPause, @NonNull LinearLayout sportPausePanel, @NonNull CustomNestedScollView sportProcess, @NonNull ImageView sportResume, @NonNull LinearLayout sportRunPanel, @NonNull TintImageView sportSet, @NonNull DINCondBold sportThreeShowValue, @NonNull PFMedium sportThreeShowValueDesc, @NonNull LinearLayout sportThreeShowValueLayout, @NonNull DINCondBold sportTwoShowValue, @NonNull PFMedium sportTwoShowValueDesc, @NonNull LinearLayout statusPanel, @NonNull AppCompatImageView topBg, @NonNull AppCompatImageView topBgIcon) {
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
        this.sportEndProgressV2 = sportEndProgressV2;
        this.sportFourShowValue = sportFourShowValue;
        this.sportFourShowValueDesc = sportFourShowValueDesc;
        this.sportGoalLayout = sportGoalLayout;
        this.sportGoalPbProgress = sportGoalPbProgress;
        this.sportGoalTv = sportGoalTv;
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
        this.sportThreeShowValueLayout = sportThreeShowValueLayout;
        this.sportTwoShowValue = sportTwoShowValue;
        this.sportTwoShowValueDesc = sportTwoShowValueDesc;
        this.statusPanel = statusPanel;
        this.topBg = topBg;
        this.topBgIcon = topBgIcon;
    }

    @NonNull
    public static ActivitySportOnGoingV2Binding bind(@NonNull View rootView) {
        int i = R.id.bMapView;
        TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (textureMapView != null) {
            i = R.id.cardPanel;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.cardPanel);
            if (cardView != null) {
                i = R.id.cardPanelSub;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.cardPanelSub);
                if (relativeLayout != null) {
                    i = R.id.countdownRl;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.countdownRl);
                    if (linearLayout != null) {
                        i = R.id.countdownTv;
                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.countdownTv);
                        if (dINCondBold != null) {
                            i = R.id.fl_handle;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fl_handle);
                            if (linearLayout2 != null) {
                                i = R.id.fl_map;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_map);
                                if (frameLayout != null) {
                                    i = R.id.gMapView;
                                    CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                                    if (customGoogleMapView != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;
                                        i = R.id.screenLockRl;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.screenLockRl);
                                        if (relativeLayout2 != null) {
                                            i = R.id.slideLockView;
                                            SlideLockView slideLockView = (SlideLockView) ViewBindings.findChildViewById(rootView, R.id.slideLockView);
                                            if (slideLockView != null) {
                                                i = R.id.sportDataLl;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportDataLl);
                                                if (linearLayout3 != null) {
                                                    i = R.id.sportEndProgress;
                                                    SportEndProgress sportEndProgress = (SportEndProgress) ViewBindings.findChildViewById(rootView, R.id.sportEndProgress);
                                                    if (sportEndProgress != null) {
                                                        i = R.id.sportEndProgressV2;
                                                        NewSportButtonProgress newSportButtonProgress = (NewSportButtonProgress) ViewBindings.findChildViewById(rootView, R.id.sportEndProgressV2);
                                                        if (newSportButtonProgress != null) {
                                                            i = R.id.sportFourShowValue;
                                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportFourShowValue);
                                                            if (dINCondBold2 != null) {
                                                                i = R.id.sportFourShowValueDesc;
                                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportFourShowValueDesc);
                                                                if (pFMedium != null) {
                                                                    i = R.id.sport_goal_layout;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sport_goal_layout);
                                                                    if (relativeLayout3 != null) {
                                                                        i = R.id.sport_goal_pb_progress;
                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.sport_goal_pb_progress);
                                                                        if (progressBar != null) {
                                                                            i = R.id.sport_goal_tv;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_goal_tv);
                                                                            if (textView != null) {
                                                                                i = R.id.sportLock;
                                                                                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportLock);
                                                                                if (tintImageView != null) {
                                                                                    i = R.id.sportModelName;
                                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportModelName);
                                                                                    if (pFMedium2 != null) {
                                                                                        i = R.id.sportOnGoingFl;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sportOnGoingFl);
                                                                                        if (frameLayout2 != null) {
                                                                                            i = R.id.sport_on_going_left_layout;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_on_going_left_layout);
                                                                                            if (linearLayout4 != null) {
                                                                                                i = R.id.sport_on_going_right_layout;
                                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_on_going_right_layout);
                                                                                                if (linearLayout5 != null) {
                                                                                                    i = R.id.sportOneShowValue;
                                                                                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportOneShowValue);
                                                                                                    if (dINCondBold3 != null) {
                                                                                                        i = R.id.sportOneShowValueDesc;
                                                                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportOneShowValueDesc);
                                                                                                        if (pFMedium3 != null) {
                                                                                                            i = R.id.sportPause;
                                                                                                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.sportPause);
                                                                                                            if (imageButton != null) {
                                                                                                                i = R.id.sportPausePanel;
                                                                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportPausePanel);
                                                                                                                if (linearLayout6 != null) {
                                                                                                                    i = R.id.sportProcess;
                                                                                                                    CustomNestedScollView customNestedScollView = (CustomNestedScollView) ViewBindings.findChildViewById(rootView, R.id.sportProcess);
                                                                                                                    if (customNestedScollView != null) {
                                                                                                                        i = R.id.sportResume;
                                                                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportResume);
                                                                                                                        if (imageView != null) {
                                                                                                                            i = R.id.sportRunPanel;
                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRunPanel);
                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                i = R.id.sportSet;
                                                                                                                                TintImageView tintImageView2 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sportSet);
                                                                                                                                if (tintImageView2 != null) {
                                                                                                                                    i = R.id.sportThreeShowValue;
                                                                                                                                    DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportThreeShowValue);
                                                                                                                                    if (dINCondBold4 != null) {
                                                                                                                                        i = R.id.sportThreeShowValueDesc;
                                                                                                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportThreeShowValueDesc);
                                                                                                                                        if (pFMedium4 != null) {
                                                                                                                                            i = R.id.sportThreeShowValueLayout;
                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportThreeShowValueLayout);
                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                i = R.id.sportTwoShowValue;
                                                                                                                                                DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportTwoShowValue);
                                                                                                                                                if (dINCondBold5 != null) {
                                                                                                                                                    i = R.id.sportTwoShowValueDesc;
                                                                                                                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportTwoShowValueDesc);
                                                                                                                                                    if (pFMedium5 != null) {
                                                                                                                                                        i = R.id.status_panel;
                                                                                                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.status_panel);
                                                                                                                                                        if (linearLayout9 != null) {
                                                                                                                                                            i = R.id.top_bg;
                                                                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.top_bg);
                                                                                                                                                            if (appCompatImageView != null) {
                                                                                                                                                                i = R.id.top_bg_icon;
                                                                                                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.top_bg_icon);
                                                                                                                                                                if (appCompatImageView2 != null) {
                                                                                                                                                                    return new ActivitySportOnGoingV2Binding(coordinatorLayout, textureMapView, cardView, relativeLayout, linearLayout, dINCondBold, linearLayout2, frameLayout, customGoogleMapView, coordinatorLayout, relativeLayout2, slideLockView, linearLayout3, sportEndProgress, newSportButtonProgress, dINCondBold2, pFMedium, relativeLayout3, progressBar, textView, tintImageView, pFMedium2, frameLayout2, linearLayout4, linearLayout5, dINCondBold3, pFMedium3, imageButton, linearLayout6, customNestedScollView, imageView, linearLayout7, tintImageView2, dINCondBold4, pFMedium4, linearLayout8, dINCondBold5, pFMedium5, linearLayout9, appCompatImageView, appCompatImageView2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportOnGoingV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportOnGoingV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_on_going_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView_;
    }
}
