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
        int i = R.id.abh_sport_source_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_sport_source_icon);
        if (imageView != null) {
            i = R.id.bt_delete_sport_record;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
            if (imageButton != null) {
                i = R.id.ll_item_panel;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_item_panel);
                if (relativeLayout != null) {
                    i = R.id.menu_wrap_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
                    if (linearLayout != null) {
                        i = R.id.record_sports_duration;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
                        if (textView != null) {
                            i = R.id.record_sports_icon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
                            if (appCompatImageView != null) {
                                i = R.id.record_sports_time;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
                                if (textView2 != null) {
                                    i = R.id.record_sports_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
                                    if (textView3 != null) {
                                        i = R.id.record_sports_value;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
                                        if (textView4 != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) rootView;
                                            return new StatusItemSportRecordDetailV3Binding(relativeLayout2, imageView, imageButton, relativeLayout, linearLayout, textView, appCompatImageView, textView2, textView3, textView4, relativeLayout2);
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
    public static StatusItemSportRecordDetailV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSportRecordDetailV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sport_record_detail_v3, parent, false);
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
