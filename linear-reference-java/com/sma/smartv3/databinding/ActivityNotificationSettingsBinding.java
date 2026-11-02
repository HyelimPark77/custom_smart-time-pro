package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
public final class ActivityNotificationSettingsBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkCall;

    @NonNull
    public final AppCompatCheckBox checkMirrorPhone;

    @NonNull
    public final AppCompatCheckBox checkSms;

    @NonNull
    public final MyListView defaultListView;

    @NonNull
    public final TextView empty;

    @NonNull
    public final MyListView listView;

    @NonNull
    public final LinearLayout ll;

    @NonNull
    public final EditText notificationSearch;

    @NonNull
    public final FrameLayout otherPanel;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvName;

    private ActivityNotificationSettingsBinding(@NonNull LinearLayout rootView_, @NonNull AppCompatCheckBox checkCall, @NonNull AppCompatCheckBox checkMirrorPhone, @NonNull AppCompatCheckBox checkSms, @NonNull MyListView defaultListView, @NonNull TextView empty, @NonNull MyListView listView, @NonNull LinearLayout ll, @NonNull EditText notificationSearch, @NonNull FrameLayout otherPanel, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvName) {
        this.rootView_ = rootView_;
        this.checkCall = checkCall;
        this.checkMirrorPhone = checkMirrorPhone;
        this.checkSms = checkSms;
        this.defaultListView = defaultListView;
        this.empty = empty;
        this.listView = listView;
        this.ll = ll;
        this.notificationSearch = notificationSearch;
        this.otherPanel = otherPanel;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvName = tvName;
    }

    @NonNull
    public static ActivityNotificationSettingsBinding bind(@NonNull View rootView) {
        int r1 = R.id.check_call;
        AppCompatCheckBox r5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
        if (r5 == null) goto L27;
        r1 = R.id.check_mirror_phone;
        AppCompatCheckBox r6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_mirror_phone);
        if (r6 == null) goto L27;
        r1 = R.id.check_sms;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_sms);
        if (r7 == null) goto L27;
        r1 = R.id.default_list_view;
        MyListView r8 = (MyListView) ViewBindings.findChildViewById(rootView, R.id.default_list_view);
        if (r8 == null) goto L27;
        r1 = R.id.empty;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r9 == null) goto L27;
        r1 = R.id.list_view;
        MyListView r10 = (MyListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r10 == null) goto L27;
        r1 = R.id.ll;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll);
        if (r11 == null) goto L27;
        r1 = R.id.notification_search;
        EditText r12 = (EditText) ViewBindings.findChildViewById(rootView, R.id.notification_search);
        if (r12 == null) goto L27;
        r1 = R.id.other_panel;
        FrameLayout r13 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.other_panel);
        if (r13 == null) goto L27;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.scrollView;
        NestedScrollView r15 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r15 == null) goto L27;
        r1 = R.id.tv_name;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r16 == null) goto L27;
        return new ActivityNotificationSettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r4, r15, r16);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityNotificationSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityNotificationSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_notification_settings, parent, false);
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
