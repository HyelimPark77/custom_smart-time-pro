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

    /* JADX INFO: renamed from: ll */
    @NonNull
    public final LinearLayout f50991ll;

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
        this.f50991ll = ll;
        this.notificationSearch = notificationSearch;
        this.otherPanel = otherPanel;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvName = tvName;
    }

    @NonNull
    public static ActivityNotificationSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.check_call;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
        if (appCompatCheckBox != null) {
            i = R.id.check_mirror_phone;
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_mirror_phone);
            if (appCompatCheckBox2 != null) {
                i = R.id.check_sms;
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_sms);
                if (appCompatCheckBox3 != null) {
                    i = R.id.default_list_view;
                    MyListView myListView = (MyListView) ViewBindings.findChildViewById(rootView, R.id.default_list_view);
                    if (myListView != null) {
                        i = R.id.empty;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
                        if (textView != null) {
                            i = R.id.list_view;
                            MyListView myListView2 = (MyListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                            if (myListView2 != null) {
                                i = R.id.f51418ll;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.f51418ll);
                                if (linearLayout != null) {
                                    i = R.id.notification_search;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.notification_search);
                                    if (editText != null) {
                                        i = R.id.other_panel;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.other_panel);
                                        if (frameLayout != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) rootView;
                                            i = R.id.scrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                            if (nestedScrollView != null) {
                                                i = R.id.tv_name;
                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                                if (pFMedium != null) {
                                                    return new ActivityNotificationSettingsBinding(linearLayout2, appCompatCheckBox, appCompatCheckBox2, appCompatCheckBox3, myListView, textView, myListView2, linearLayout, editText, frameLayout, linearLayout2, nestedScrollView, pFMedium);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityNotificationSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNotificationSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_notification_settings, parent, false);
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
