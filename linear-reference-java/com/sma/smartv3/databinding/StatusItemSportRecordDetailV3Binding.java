package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSportRecordDetailV3Binding implements ViewBinding {

    @NonNull
    public final ImageView abhSportSourceIcon;

    @NonNull
    public final ImageButton btDeleteSportRecord;

    @NonNull
    public final RelativeLayout llItemPanel;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    public final TextView recordSportsDuration;

    @NonNull
    public final AppCompatImageView recordSportsIcon;

    @NonNull
    public final TextView recordSportsTime;

    @NonNull
    public final TextView recordSportsTitle;

    @NonNull
    public final TextView recordSportsValue;

    @NonNull
    public final RelativeLayout root;

    @NonNull
    private final RelativeLayout rootView;

    private StatusItemSportRecordDetailV3Binding(@NonNull RelativeLayout rootView, @NonNull ImageView abhSportSourceIcon, @NonNull ImageButton btDeleteSportRecord, @NonNull RelativeLayout llItemPanel, @NonNull LinearLayout menuWrapLayout, @NonNull TextView recordSportsDuration, @NonNull AppCompatImageView recordSportsIcon, @NonNull TextView recordSportsTime, @NonNull TextView recordSportsTitle, @NonNull TextView recordSportsValue, @NonNull RelativeLayout root) {
        this.rootView = rootView;
        this.abhSportSourceIcon = abhSportSourceIcon;
        this.btDeleteSportRecord = btDeleteSportRecord;
        this.llItemPanel = llItemPanel;
        this.menuWrapLayout = menuWrapLayout;
        this.recordSportsDuration = recordSportsDuration;
        this.recordSportsIcon = recordSportsIcon;
        this.recordSportsTime = recordSportsTime;
        this.recordSportsTitle = recordSportsTitle;
        this.recordSportsValue = recordSportsValue;
        this.root = root;
    }

    @NonNull
    public static StatusItemSportRecordDetailV3Binding bind(@NonNull View rootView) {
        int r0 = R.id.abh_sport_source_icon;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_sport_source_icon);
        if (r4 == null) goto L23;
        r0 = R.id.bt_delete_sport_record;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (r5 == null) goto L23;
        r0 = R.id.ll_item_panel;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
        if (r6 == null) goto L23;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r7 == null) goto L23;
        r0 = R.id.record_sports_duration;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
        if (r8 == null) goto L23;
        r0 = R.id.record_sports_icon;
        AppCompatImageView r9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
        if (r9 == null) goto L23;
        r0 = R.id.record_sports_time;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
        if (r10 == null) goto L23;
        r0 = R.id.record_sports_title;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
        if (r11 == null) goto L23;
        r0 = R.id.record_sports_value;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
        if (r12 == null) goto L23;
        RelativeLayout r3 = (RelativeLayout) rootView;
        return new StatusItemSportRecordDetailV3Binding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r3);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSportRecordDetailV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSportRecordDetailV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sport_record_detail_v3, parent, false);
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
