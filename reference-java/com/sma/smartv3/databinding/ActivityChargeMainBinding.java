package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ArcProgressBar;
import com.sma.smartv3.view.ScaleSeekBar;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityChargeMainBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout addScreensaver;

    @NonNull
    public final Button btnUnbind;

    @NonNull
    public final LinearLayout chargePanel;

    @NonNull
    public final LinearLayout chargePanelInfo;

    @NonNull
    public final AppCompatCheckBox checkCall;

    @NonNull
    public final AppCompatCheckBox checkFindEarphoneLeft;

    @NonNull
    public final AppCompatCheckBox checkFindEarphoneRight;

    @NonNull
    public final ViewPager deviceViewpager;

    @NonNull
    public final LinearLayout earDialogueTranslationLayout;

    @NonNull
    public final LinearLayout earSimultaneousTranslationLayout;

    @NonNull
    public final LinearLayout earTranslationLayout;

    @NonNull
    public final LinearLayout earphonePanel;

    @NonNull
    public final LinearLayout earphonePanelInfo;

    @NonNull
    public final FrameLayout indicatorContainer;

    @NonNull
    public final LinearLayout itemCustomAnc;

    @NonNull
    public final LinearLayout itemEbookManager;

    @NonNull
    public final PFMedium itemLightnessTvHigh;

    @NonNull
    public final PFMedium itemLightnessTvLow;

    @NonNull
    public final PFMedium itemLightnessTvMiddle;

    @NonNull
    public final LinearLayout itemMusicManager;

    @NonNull
    public final LinearLayout itemVoiceAssistant;

    @NonNull
    public final ImageView ivDenoise;

    @NonNull
    public final ImageView ivNoiseClose;

    @NonNull
    public final ImageView ivTransparent;

    @NonNull
    public final LinearLayout llNoiseSettings;

    @NonNull
    public final LinearLayout llScreensaver;

    @NonNull
    public final ArcProgressBar pbEarphoneL;

    @NonNull
    public final ArcProgressBar pbEarphoneR;

    @NonNull
    public final ArcProgressBar pbPower;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rvScreensaver;

    @NonNull
    public final ScaleSeekBar seekbarLightness;

    @NonNull
    public final SeekBar seekbarScreensaver;

    @NonNull
    public final SwipeRefreshLayout srf;

    @NonNull
    public final LinearLayout titleBar;

    @NonNull
    public final PFMedium tvEarphoneL;

    @NonNull
    public final PFMedium tvEarphoneR;

    @NonNull
    public final PFMedium tvNoiseModeClose;

    @NonNull
    public final PFMedium tvNoiseModeDenoise;

    @NonNull
    public final PFMedium tvNoiseModeTransparent;

    @NonNull
    public final PFMedium tvPower;

    @NonNull
    public final PFMedium tvScreensaverValue;

    @NonNull
    public final DINCondBold tvState;

    private ActivityChargeMainBinding(@NonNull LinearLayout rootView_, @NonNull RelativeLayout addScreensaver, @NonNull Button btnUnbind, @NonNull LinearLayout chargePanel, @NonNull LinearLayout chargePanelInfo, @NonNull AppCompatCheckBox checkCall, @NonNull AppCompatCheckBox checkFindEarphoneLeft, @NonNull AppCompatCheckBox checkFindEarphoneRight, @NonNull ViewPager deviceViewpager, @NonNull LinearLayout earDialogueTranslationLayout, @NonNull LinearLayout earSimultaneousTranslationLayout, @NonNull LinearLayout earTranslationLayout, @NonNull LinearLayout earphonePanel, @NonNull LinearLayout earphonePanelInfo, @NonNull FrameLayout indicatorContainer, @NonNull LinearLayout itemCustomAnc, @NonNull LinearLayout itemEbookManager, @NonNull PFMedium itemLightnessTvHigh, @NonNull PFMedium itemLightnessTvLow, @NonNull PFMedium itemLightnessTvMiddle, @NonNull LinearLayout itemMusicManager, @NonNull LinearLayout itemVoiceAssistant, @NonNull ImageView ivDenoise, @NonNull ImageView ivNoiseClose, @NonNull ImageView ivTransparent, @NonNull LinearLayout llNoiseSettings, @NonNull LinearLayout llScreensaver, @NonNull ArcProgressBar pbEarphoneL, @NonNull ArcProgressBar pbEarphoneR, @NonNull ArcProgressBar pbPower, @NonNull LinearLayout rootView, @NonNull RecyclerView rvScreensaver, @NonNull ScaleSeekBar seekbarLightness, @NonNull SeekBar seekbarScreensaver, @NonNull SwipeRefreshLayout srf, @NonNull LinearLayout titleBar, @NonNull PFMedium tvEarphoneL, @NonNull PFMedium tvEarphoneR, @NonNull PFMedium tvNoiseModeClose, @NonNull PFMedium tvNoiseModeDenoise, @NonNull PFMedium tvNoiseModeTransparent, @NonNull PFMedium tvPower, @NonNull PFMedium tvScreensaverValue, @NonNull DINCondBold tvState) {
        this.rootView_ = rootView_;
        this.addScreensaver = addScreensaver;
        this.btnUnbind = btnUnbind;
        this.chargePanel = chargePanel;
        this.chargePanelInfo = chargePanelInfo;
        this.checkCall = checkCall;
        this.checkFindEarphoneLeft = checkFindEarphoneLeft;
        this.checkFindEarphoneRight = checkFindEarphoneRight;
        this.deviceViewpager = deviceViewpager;
        this.earDialogueTranslationLayout = earDialogueTranslationLayout;
        this.earSimultaneousTranslationLayout = earSimultaneousTranslationLayout;
        this.earTranslationLayout = earTranslationLayout;
        this.earphonePanel = earphonePanel;
        this.earphonePanelInfo = earphonePanelInfo;
        this.indicatorContainer = indicatorContainer;
        this.itemCustomAnc = itemCustomAnc;
        this.itemEbookManager = itemEbookManager;
        this.itemLightnessTvHigh = itemLightnessTvHigh;
        this.itemLightnessTvLow = itemLightnessTvLow;
        this.itemLightnessTvMiddle = itemLightnessTvMiddle;
        this.itemMusicManager = itemMusicManager;
        this.itemVoiceAssistant = itemVoiceAssistant;
        this.ivDenoise = ivDenoise;
        this.ivNoiseClose = ivNoiseClose;
        this.ivTransparent = ivTransparent;
        this.llNoiseSettings = llNoiseSettings;
        this.llScreensaver = llScreensaver;
        this.pbEarphoneL = pbEarphoneL;
        this.pbEarphoneR = pbEarphoneR;
        this.pbPower = pbPower;
        this.rootView = rootView;
        this.rvScreensaver = rvScreensaver;
        this.seekbarLightness = seekbarLightness;
        this.seekbarScreensaver = seekbarScreensaver;
        this.srf = srf;
        this.titleBar = titleBar;
        this.tvEarphoneL = tvEarphoneL;
        this.tvEarphoneR = tvEarphoneR;
        this.tvNoiseModeClose = tvNoiseModeClose;
        this.tvNoiseModeDenoise = tvNoiseModeDenoise;
        this.tvNoiseModeTransparent = tvNoiseModeTransparent;
        this.tvPower = tvPower;
        this.tvScreensaverValue = tvScreensaverValue;
        this.tvState = tvState;
    }

    @NonNull
    public static ActivityChargeMainBinding bind(@NonNull View rootView) {
        int i = R.id.add_screensaver;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.add_screensaver);
        if (relativeLayout != null) {
            i = R.id.btn_unbind;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_unbind);
            if (button != null) {
                i = R.id.charge_panel;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.charge_panel);
                if (linearLayout != null) {
                    i = R.id.charge_panel_info;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.charge_panel_info);
                    if (linearLayout2 != null) {
                        i = R.id.check_call;
                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
                        if (appCompatCheckBox != null) {
                            i = R.id.check_find_earphone_left;
                            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_find_earphone_left);
                            if (appCompatCheckBox2 != null) {
                                i = R.id.check_find_earphone_right;
                                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_find_earphone_right);
                                if (appCompatCheckBox3 != null) {
                                    i = R.id.device_viewpager;
                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.device_viewpager);
                                    if (viewPager != null) {
                                        i = R.id.ear_dialogue_translation_layout;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_dialogue_translation_layout);
                                        if (linearLayout3 != null) {
                                            i = R.id.ear_simultaneous_translation_layout;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_simultaneous_translation_layout);
                                            if (linearLayout4 != null) {
                                                i = R.id.ear_translation_layout;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_translation_layout);
                                                if (linearLayout5 != null) {
                                                    i = R.id.earphone_panel;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.earphone_panel);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.earphone_panel_info;
                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.earphone_panel_info);
                                                        if (linearLayout7 != null) {
                                                            i = R.id.indicator_container;
                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
                                                            if (frameLayout != null) {
                                                                i = R.id.item_custom_anc;
                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_custom_anc);
                                                                if (linearLayout8 != null) {
                                                                    i = R.id.item_ebook_manager;
                                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_ebook_manager);
                                                                    if (linearLayout9 != null) {
                                                                        i = R.id.item_lightness_tv_high;
                                                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_high);
                                                                        if (pFMedium != null) {
                                                                            i = R.id.item_lightness_tv_low;
                                                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_low);
                                                                            if (pFMedium2 != null) {
                                                                                i = R.id.item_lightness_tv_middle;
                                                                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_middle);
                                                                                if (pFMedium3 != null) {
                                                                                    i = R.id.item_music_manager;
                                                                                    LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_music_manager);
                                                                                    if (linearLayout10 != null) {
                                                                                        i = R.id.item_voice_assistant;
                                                                                        LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_voice_assistant);
                                                                                        if (linearLayout11 != null) {
                                                                                            i = R.id.iv_denoise;
                                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_denoise);
                                                                                            if (imageView != null) {
                                                                                                i = R.id.iv_noise_close;
                                                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_noise_close);
                                                                                                if (imageView2 != null) {
                                                                                                    i = R.id.iv_transparent;
                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_transparent);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.ll_noise_settings;
                                                                                                        LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_noise_settings);
                                                                                                        if (linearLayout12 != null) {
                                                                                                            i = R.id.ll_screensaver;
                                                                                                            LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_screensaver);
                                                                                                            if (linearLayout13 != null) {
                                                                                                                i = R.id.pb_earphone_l;
                                                                                                                ArcProgressBar arcProgressBar = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_earphone_l);
                                                                                                                if (arcProgressBar != null) {
                                                                                                                    i = R.id.pb_earphone_r;
                                                                                                                    ArcProgressBar arcProgressBar2 = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_earphone_r);
                                                                                                                    if (arcProgressBar2 != null) {
                                                                                                                        i = R.id.pb_power;
                                                                                                                        ArcProgressBar arcProgressBar3 = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_power);
                                                                                                                        if (arcProgressBar3 != null) {
                                                                                                                            LinearLayout linearLayout14 = (LinearLayout) rootView;
                                                                                                                            i = R.id.rv_screensaver;
                                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_screensaver);
                                                                                                                            if (recyclerView != null) {
                                                                                                                                i = R.id.seekbar_lightness;
                                                                                                                                ScaleSeekBar scaleSeekBar = (ScaleSeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar_lightness);
                                                                                                                                if (scaleSeekBar != null) {
                                                                                                                                    i = R.id.seekbar_screensaver;
                                                                                                                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar_screensaver);
                                                                                                                                    if (seekBar != null) {
                                                                                                                                        i = R.id.srf;
                                                                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
                                                                                                                                        if (swipeRefreshLayout != null) {
                                                                                                                                            i = R.id.title_bar;
                                                                                                                                            LinearLayout linearLayout15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                                                                                                                            if (linearLayout15 != null) {
                                                                                                                                                i = R.id.tv_earphone_l;
                                                                                                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_earphone_l);
                                                                                                                                                if (pFMedium4 != null) {
                                                                                                                                                    i = R.id.tv_earphone_r;
                                                                                                                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_earphone_r);
                                                                                                                                                    if (pFMedium5 != null) {
                                                                                                                                                        i = R.id.tv_noise_mode_close;
                                                                                                                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_close);
                                                                                                                                                        if (pFMedium6 != null) {
                                                                                                                                                            i = R.id.tv_noise_mode_denoise;
                                                                                                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_denoise);
                                                                                                                                                            if (pFMedium7 != null) {
                                                                                                                                                                i = R.id.tv_noise_mode_transparent;
                                                                                                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_transparent);
                                                                                                                                                                if (pFMedium8 != null) {
                                                                                                                                                                    i = R.id.tv_power;
                                                                                                                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_power);
                                                                                                                                                                    if (pFMedium9 != null) {
                                                                                                                                                                        i = R.id.tv_screensaver_value;
                                                                                                                                                                        PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_screensaver_value);
                                                                                                                                                                        if (pFMedium10 != null) {
                                                                                                                                                                            i = R.id.tv_state;
                                                                                                                                                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
                                                                                                                                                                            if (dINCondBold != null) {
                                                                                                                                                                                return new ActivityChargeMainBinding(linearLayout14, relativeLayout, button, linearLayout, linearLayout2, appCompatCheckBox, appCompatCheckBox2, appCompatCheckBox3, viewPager, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, frameLayout, linearLayout8, linearLayout9, pFMedium, pFMedium2, pFMedium3, linearLayout10, linearLayout11, imageView, imageView2, imageView3, linearLayout12, linearLayout13, arcProgressBar, arcProgressBar2, arcProgressBar3, linearLayout14, recyclerView, scaleSeekBar, seekBar, swipeRefreshLayout, linearLayout15, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10, dINCondBold);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityChargeMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityChargeMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_charge_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
