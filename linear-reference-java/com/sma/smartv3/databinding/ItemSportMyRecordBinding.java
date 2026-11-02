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
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.sport_my_record_icon;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_icon);
        if (r3 == null) goto L13;
        r0 = R.id.sport_my_record_time;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_time);
        if (r4 == null) goto L13;
        r0 = R.id.sport_my_record_title;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_title);
        if (r5 == null) goto L13;
        r0 = R.id.sport_my_record_value;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_my_record_value);
        if (r6 == null) goto L13;
        return new ItemSportMyRecordBinding(r1, r1, r3, r4, r5, r6);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportMyRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportMyRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_my_record, parent, false);
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
