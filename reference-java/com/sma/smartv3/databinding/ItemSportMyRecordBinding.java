package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportMyRecordBinding implements ViewBinding {

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView sportMyRecordIcon;

    @NonNull
    public final PFMedium sportMyRecordTime;

    @NonNull
    public final PFMedium sportMyRecordTitle;

    @NonNull
    public final PFMedium sportMyRecordValue;

    private ItemSportMyRecordBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout root, @NonNull TextView sportMyRecordIcon, @NonNull PFMedium sportMyRecordTime, @NonNull PFMedium sportMyRecordTitle, @NonNull PFMedium sportMyRecordValue) {
        this.rootView = rootView;
        this.root = root;
        this.sportMyRecordIcon = sportMyRecordIcon;
        this.sportMyRecordTime = sportMyRecordTime;
        this.sportMyRecordTitle = sportMyRecordTitle;
        this.sportMyRecordValue = sportMyRecordValue;
    }

    @NonNull
    public static ItemSportMyRecordBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.sport_my_record_icon;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_icon);
        if (textView != null) {
            i = R.id.sport_my_record_time;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_time);
            if (pFMedium != null) {
                i = R.id.sport_my_record_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_title);
                if (pFMedium2 != null) {
                    i = R.id.sport_my_record_value;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_value);
                    if (pFMedium3 != null) {
                        return new ItemSportMyRecordBinding(linearLayout, linearLayout, textView, pFMedium, pFMedium2, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportMyRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportMyRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_my_record, parent, false);
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
