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
        int i = R.id.abh_sport_source_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_sport_source_icon);
        if (imageView != null) {
            i = R.id.data_workout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.data_workout);
            if (relativeLayout != null) {
                i = R.id.list_record_more;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.list_record_more);
                if (pFMedium != null) {
                    i = R.id.record_sports_duration;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_duration);
                    if (pFMedium2 != null) {
                        i = R.id.record_sports_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.record_sports_icon);
                        if (appCompatImageView != null) {
                            i = R.id.record_sports_time;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_time);
                            if (pFMedium3 != null) {
                                i = R.id.record_sports_title;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_title);
                                if (pFMedium4 != null) {
                                    i = R.id.record_sports_value;
                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.record_sports_value);
                                    if (pFMedium5 != null) {
                                        i = R.id.sport_records_ll;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_records_ll);
                                        if (linearLayout != null) {
                                            i = R.id.sport_records_more;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_records_more);
                                            if (linearLayout2 != null) {
                                                return new SportListItemRecordBinding((LinearLayout) rootView, imageView, relativeLayout, pFMedium, pFMedium2, appCompatImageView, pFMedium3, pFMedium4, pFMedium5, linearLayout, linearLayout2);
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
    public static SportListItemRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportListItemRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_list_item_record, parent, false);
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
