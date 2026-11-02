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
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.sma.smartv3.view.SettingsPanel;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTouchSettingsBinding implements ViewBinding {

    @NonNull
    public final SettingsPanel itemContainer;

    @NonNull
    public final AbhSettingsItem itemDouble;

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsHeader itemHeaderCustom;

    @NonNull
    public final AbhSettingsHeader itemHeaderMusic;

    @NonNull
    public final AbhSettingsHeader itemHeaderPhoto;

    @NonNull
    public final AbhSettingsHeader itemHeaderSlide;

    @NonNull
    public final AbhSettingsHeader itemHeaderTouchRepair;

    @NonNull
    public final AbhSettingsItem itemLong;

    @NonNull
    public final AbhSettingsItem itemSingle;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityTouchSettingsBinding(@NonNull LinearLayout rootView, @NonNull SettingsPanel itemContainer, @NonNull AbhSettingsItem itemDouble, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsHeader itemHeaderCustom, @NonNull AbhSettingsHeader itemHeaderMusic, @NonNull AbhSettingsHeader itemHeaderPhoto, @NonNull AbhSettingsHeader itemHeaderSlide, @NonNull AbhSettingsHeader itemHeaderTouchRepair, @NonNull AbhSettingsItem itemLong, @NonNull AbhSettingsItem itemSingle, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemContainer = itemContainer;
        this.itemDouble = itemDouble;
        this.itemHeader = itemHeader;
        this.itemHeaderCustom = itemHeaderCustom;
        this.itemHeaderMusic = itemHeaderMusic;
        this.itemHeaderPhoto = itemHeaderPhoto;
        this.itemHeaderSlide = itemHeaderSlide;
        this.itemHeaderTouchRepair = itemHeaderTouchRepair;
        this.itemLong = itemLong;
        this.itemSingle = itemSingle;
        this.root = root;
    }

    @NonNull
    public static ActivityTouchSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.item_container;
        SettingsPanel settingsPanel = (SettingsPanel) ViewBindings.findChildViewById(rootView, R.id.item_container);
        if (settingsPanel != null) {
            i = R.id.item_double;
            AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_double);
            if (abhSettingsItem != null) {
                i = R.id.item_header;
                AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
                if (abhSettingsHeader != null) {
                    i = R.id.item_header_custom;
                    AbhSettingsHeader abhSettingsHeader2 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_custom);
                    if (abhSettingsHeader2 != null) {
                        i = R.id.item_header_music;
                        AbhSettingsHeader abhSettingsHeader3 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_music);
                        if (abhSettingsHeader3 != null) {
                            i = R.id.item_header_photo;
                            AbhSettingsHeader abhSettingsHeader4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_photo);
                            if (abhSettingsHeader4 != null) {
                                i = R.id.item_header_slide;
                                AbhSettingsHeader abhSettingsHeader5 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_slide);
                                if (abhSettingsHeader5 != null) {
                                    i = R.id.item_header_touch_repair;
                                    AbhSettingsHeader abhSettingsHeader6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_touch_repair);
                                    if (abhSettingsHeader6 != null) {
                                        i = R.id.item_long;
                                        AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_long);
                                        if (abhSettingsItem2 != null) {
                                            i = R.id.item_single;
                                            AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_single);
                                            if (abhSettingsItem3 != null) {
                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                return new ActivityTouchSettingsBinding(linearLayout, settingsPanel, abhSettingsItem, abhSettingsHeader, abhSettingsHeader2, abhSettingsHeader3, abhSettingsHeader4, abhSettingsHeader5, abhSettingsHeader6, abhSettingsItem2, abhSettingsItem3, linearLayout);
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
    public static ActivityTouchSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTouchSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_touch_settings, parent, false);
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
