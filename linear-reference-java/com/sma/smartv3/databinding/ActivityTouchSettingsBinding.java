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
        int r0 = R.id.item_container;
        SettingsPanel r4 = (SettingsPanel) ViewBindings.findChildViewById(rootView, R.id.item_container);
        if (r4 == null) goto L25;
        r0 = R.id.item_double;
        AbhSettingsItem r5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_double);
        if (r5 == null) goto L25;
        r0 = R.id.item_header;
        AbhSettingsHeader r6 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r6 == null) goto L25;
        r0 = R.id.item_header_custom;
        AbhSettingsHeader r7 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_custom);
        if (r7 == null) goto L25;
        r0 = R.id.item_header_music;
        AbhSettingsHeader r8 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_music);
        if (r8 == null) goto L25;
        r0 = R.id.item_header_photo;
        AbhSettingsHeader r9 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_photo);
        if (r9 == null) goto L25;
        r0 = R.id.item_header_slide;
        AbhSettingsHeader r10 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_slide);
        if (r10 == null) goto L25;
        r0 = R.id.item_header_touch_repair;
        AbhSettingsHeader r11 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header_touch_repair);
        if (r11 == null) goto L25;
        r0 = R.id.item_long;
        AbhSettingsItem r12 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_long);
        if (r12 == null) goto L25;
        r0 = R.id.item_single;
        AbhSettingsItem r13 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_single);
        if (r13 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityTouchSettingsBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r3);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityTouchSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityTouchSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_touch_settings, parent, false);
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
