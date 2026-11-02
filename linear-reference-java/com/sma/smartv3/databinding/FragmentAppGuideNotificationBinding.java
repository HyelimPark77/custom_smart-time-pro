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

    @NonNull
    public final LinearLayout ll;

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
        this.ll = ll;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvName = tvName;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentAppGuideNotificationBinding bind(@NonNull View rootView) {
        int r0 = R.id.check_call;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
        if (r4 == null) goto L21;
        r0 = R.id.check_sms;
        AppCompatCheckBox r5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_sms);
        if (r5 == null) goto L21;
        r0 = R.id.default_list_view;
        MyListView r6 = (MyListView) ViewBindings.findChildViewById(rootView, R.id.default_list_view);
        if (r6 == null) goto L21;
        r0 = R.id.ll;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll);
        if (r7 == null) goto L21;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.scrollView;
        NestedScrollView r9 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r9 == null) goto L21;
        r0 = R.id.tv_name;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r10 == null) goto L21;
        r0 = R.id.tv_tip;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r11 == null) goto L21;
        r0 = R.id.tv_title;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r12 == null) goto L21;
        return new FragmentAppGuideNotificationBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentAppGuideNotificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentAppGuideNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_app_guide_notification, parent, false);
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
