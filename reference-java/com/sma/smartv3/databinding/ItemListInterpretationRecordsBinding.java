package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemListInterpretationRecordsBinding implements ViewBinding {

    @NonNull
    public final PFMedium interpretationRecordsContent;

    @NonNull
    public final PFMedium interpretationRecordsDuration;

    @NonNull
    public final PFMedium interpretationRecordsLanguage;

    @NonNull
    public final PFMedium interpretationRecordsLanguageLeftTv;

    @NonNull
    public final PFMedium interpretationRecordsLocation;

    @NonNull
    public final PFMedium interpretationRecordsTime;

    @NonNull
    public final PFMedium interpretationRecordsTitle;

    @NonNull
    public final PFMedium interpretationRecordsToLanguage;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView transformLanguageImg;

    private ItemListInterpretationRecordsBinding(@NonNull LinearLayout rootView, @NonNull PFMedium interpretationRecordsContent, @NonNull PFMedium interpretationRecordsDuration, @NonNull PFMedium interpretationRecordsLanguage, @NonNull PFMedium interpretationRecordsLanguageLeftTv, @NonNull PFMedium interpretationRecordsLocation, @NonNull PFMedium interpretationRecordsTime, @NonNull PFMedium interpretationRecordsTitle, @NonNull PFMedium interpretationRecordsToLanguage, @NonNull ImageView transformLanguageImg) {
        this.rootView = rootView;
        this.interpretationRecordsContent = interpretationRecordsContent;
        this.interpretationRecordsDuration = interpretationRecordsDuration;
        this.interpretationRecordsLanguage = interpretationRecordsLanguage;
        this.interpretationRecordsLanguageLeftTv = interpretationRecordsLanguageLeftTv;
        this.interpretationRecordsLocation = interpretationRecordsLocation;
        this.interpretationRecordsTime = interpretationRecordsTime;
        this.interpretationRecordsTitle = interpretationRecordsTitle;
        this.interpretationRecordsToLanguage = interpretationRecordsToLanguage;
        this.transformLanguageImg = transformLanguageImg;
    }

    @NonNull
    public static ItemListInterpretationRecordsBinding bind(@NonNull View rootView) {
        int i = R.id.interpretation_records_content;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_content);
        if (pFMedium != null) {
            i = R.id.interpretation_records_duration;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_duration);
            if (pFMedium2 != null) {
                i = R.id.interpretation_records_language;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language);
                if (pFMedium3 != null) {
                    i = R.id.interpretation_records_language_left_tv;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language_left_tv);
                    if (pFMedium4 != null) {
                        i = R.id.interpretation_records_location;
                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_location);
                        if (pFMedium5 != null) {
                            i = R.id.interpretation_records_time;
                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_time);
                            if (pFMedium6 != null) {
                                i = R.id.interpretation_records_title;
                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_title);
                                if (pFMedium7 != null) {
                                    i = R.id.interpretation_records_to_language;
                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_to_language);
                                    if (pFMedium8 != null) {
                                        i = R.id.transform_language_img;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                        if (imageView != null) {
                                            return new ItemListInterpretationRecordsBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, imageView);
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
    public static ItemListInterpretationRecordsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemListInterpretationRecordsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_list_interpretation_records, parent, false);
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
