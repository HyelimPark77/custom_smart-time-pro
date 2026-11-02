package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.MyListView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideNotificationBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkCall;

    @NonNull
    public final AppCompatCheckBox checkSms;

    @NonNull
    public final MyListView defaultListView;

    /* JADX INFO: renamed from: ll */
    @NonNull
    public final LinearLayout f51113ll;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvTitle;

    private FragmentAppGuideNotificationBinding(@NonNull LinearLayout rootView_, @NonNull AppCompatCheckBox checkCall, @NonNull AppCompatCheckBox checkSms, @NonNull MyListView defaultListView, @NonNull LinearLayout ll, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvName, @NonNull PFMedium tvTip, @NonNull PFMedium tvTitle) {
        this.rootView_ = rootView_;
        this.checkCall = checkCall;
        this.checkSms = checkSms;
        this.defaultListView = defaultListView;
        this.f51113ll = ll;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvName = tvName;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentAppGuideNotificationBinding bind(@NonNull View rootView) {
        int i = R.id.check_call;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
        if (appCompatCheckBox != null) {
            i = R.id.check_sms;
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_sms);
            if (appCompatCheckBox2 != null) {
                i = R.id.default_list_view;
                MyListView myListView = (MyListView) ViewBindings.findChildViewById(rootView, R.id.default_list_view);
                if (myListView != null) {
                    i = R.id.f51418ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.f51418ll);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                        i = R.id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                        if (nestedScrollView != null) {
                            i = R.id.tv_name;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                            if (pFMedium != null) {
                                i = R.id.tv_tip;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                if (pFMedium2 != null) {
                                    i = R.id.tv_title;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                                    if (pFMedium3 != null) {
                                        return new FragmentAppGuideNotificationBinding(linearLayout2, appCompatCheckBox, appCompatCheckBox2, myListView, linearLayout, linearLayout2, nestedScrollView, pFMedium, pFMedium2, pFMedium3);
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
    public static FragmentAppGuideNotificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAppGuideNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_app_guide_notification, parent, false);
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
