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
        int i = R.id.abh_party_personal_list;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_party_personal_list);
        if (linearLayout != null) {
            i = R.id.abh_third_party_personal_list;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_third_party_personal_list);
            if (linearLayout2 != null) {
                i = R.id.ll_icp;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_icp);
                if (linearLayout3 != null) {
                    i = R.id.ll_open_source;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_open_source);
                    if (linearLayout4 != null) {
                        i = R.id.ll_upload_log;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_upload_log);
                        if (linearLayout5 != null) {
                            LinearLayout linearLayout6 = (LinearLayout) rootView;
                            i = R.id.tvVersion;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
                            if (pFMedium != null) {
                                return new ActivityAboutBinding(linearLayout6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, pFMedium);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_about, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
