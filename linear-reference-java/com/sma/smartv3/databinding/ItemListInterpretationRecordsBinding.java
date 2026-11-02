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
        int r0 = R.id.interpretation_records_content;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_content);
        if (r4 == null) goto L23;
        r0 = R.id.interpretation_records_duration;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_duration);
        if (r5 == null) goto L23;
        r0 = R.id.interpretation_records_language;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language);
        if (r6 == null) goto L23;
        r0 = R.id.interpretation_records_language_left_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_language_left_tv);
        if (r7 == null) goto L23;
        r0 = R.id.interpretation_records_location;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_location);
        if (r8 == null) goto L23;
        r0 = R.id.interpretation_records_time;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_time);
        if (r9 == null) goto L23;
        r0 = R.id.interpretation_records_title;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_title);
        if (r10 == null) goto L23;
        r0 = R.id.interpretation_records_to_language;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.interpretation_records_to_language);
        if (r11 == null) goto L23;
        r0 = R.id.transform_language_img;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r12 == null) goto L23;
        return new ItemListInterpretationRecordsBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemListInterpretationRecordsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemListInterpretationRecordsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_list_interpretation_records, parent, false);
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
