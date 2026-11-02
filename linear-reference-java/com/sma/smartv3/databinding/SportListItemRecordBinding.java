package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class SportListItemRecordBinding implements ViewBinding {

    @NonNull
    public final ImageView abhSportSourceIcon;

    @NonNull
    public final RelativeLayout dataWorkout;

    @NonNull
    public final PFMedium listRecordMore;

    @NonNull
    public final PFMedium recordSportsDuration;

    @NonNull
    public final AppCompatImageView recordSportsIcon;

    @NonNull
    public final PFMedium recordSportsTime;

    @NonNull
    public final PFMedium recordSportsTitle;

    @NonNull
    public final PFMedium recordSportsValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sportRecordsLl;

    @NonNull
    public final LinearLayout sportRecordsMore;

    private SportListItemRecordBinding(@NonNull LinearLayout rootView, @NonNull ImageView abhSportSourceIcon, @NonNull RelativeLayout dataWorkout, @NonNull PFMedium listRecordMore, @NonNull PFMedium recordSportsDuration, @NonNull AppCompatImageView recordSportsIcon, @NonNull PFMedium recordSportsTime, @NonNull PFMedium recordSportsTitle, @NonNull PFMedium recordSportsValue, @NonNull LinearLayout sportRecordsLl, @NonNull LinearLayout sportRecordsMore) {
        this.rootView = rootView;
        this.abhSportSourceIcon = abhSportSourceIcon;
        this.dataWorkout = dataWorkout;
        this.listRecordMore = listRecordMore;
        this.recordSportsDuration = recordSportsDuration;
        this.recordSportsIcon = recordSportsIcon;
        this.recordSportsTime = recordSportsTime;
        this.recordSportsTitle = recordSportsTitle;
        this.recordSportsValue = recordSportsValue;
        this.sportRecordsLl = sportRecordsLl;
        this.sportRecordsMore = sportRecordsMore;
    }

    @NonNull
    public static SportListItemRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_sport_source_icon;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_sport_source_icon);
        if (r4 == null) goto L25;
        r0 = R.id.data_workout;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.data_workout);
        if (r5 == null) goto L25;
        r0 = R.id.list_record_more;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.list_record_more);
        if (r6 == null) goto L25;
        r0 = R.id.record_sports_duration;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
        if (r7 == null) goto L25;
        r0 = R.id.record_sports_icon;
        AppCompatImageView r8 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
        if (r8 == null) goto L25;
        r0 = R.id.record_sports_time;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
        if (r9 == null) goto L25;
        r0 = R.id.record_sports_title;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
        if (r10 == null) goto L25;
        r0 = R.id.record_sports_value;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
        if (r11 == null) goto L25;
        r0 = R.id.sport_records_ll;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_records_ll);
        if (r12 == null) goto L25;
        r0 = R.id.sport_records_more;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_records_more);
        if (r13 == null) goto L25;
        return new SportListItemRecordBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static SportListItemRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static SportListItemRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.sport_list_item_record, parent, false);
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
