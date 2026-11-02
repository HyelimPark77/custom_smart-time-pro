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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAboutBinding implements ViewBinding {

    @NonNull
    public final LinearLayout abhPartyPersonalList;

    @NonNull
    public final LinearLayout abhThirdPartyPersonalList;

    @NonNull
    public final LinearLayout llIcp;

    @NonNull
    public final LinearLayout llOpenSource;

    @NonNull
    public final LinearLayout llUploadLog;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvVersion;

    private ActivityAboutBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout abhPartyPersonalList, @NonNull LinearLayout abhThirdPartyPersonalList, @NonNull LinearLayout llIcp, @NonNull LinearLayout llOpenSource, @NonNull LinearLayout llUploadLog, @NonNull LinearLayout rootView, @NonNull PFMedium tvVersion) {
        this.rootView_ = rootView_;
        this.abhPartyPersonalList = abhPartyPersonalList;
        this.abhThirdPartyPersonalList = abhThirdPartyPersonalList;
        this.llIcp = llIcp;
        this.llOpenSource = llOpenSource;
        this.llUploadLog = llUploadLog;
        this.rootView = rootView;
        this.tvVersion = tvVersion;
    }

    @NonNull
    public static ActivityAboutBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_party_personal_list;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_party_personal_list);
        if (r4 == null) goto L17;
        r0 = R.id.abh_third_party_personal_list;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_third_party_personal_list);
        if (r5 == null) goto L17;
        r0 = R.id.ll_icp;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_icp);
        if (r6 == null) goto L17;
        r0 = R.id.ll_open_source;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_open_source);
        if (r7 == null) goto L17;
        r0 = R.id.ll_upload_log;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_upload_log);
        if (r8 == null) goto L17;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tvVersion;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
        if (r10 == null) goto L17;
        return new ActivityAboutBinding(r3, r4, r5, r6, r7, r8, r3, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_about, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
