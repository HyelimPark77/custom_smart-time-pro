package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestTuyaStartBinding implements ViewBinding {

    @NonNull
    public final EditText etOldBleName;

    @NonNull
    public final EditText etSignal;

    @NonNull
    public final ListView listView;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    private ActivityDeveloperTestTuyaStartBinding(@NonNull RelativeLayout rootView_, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView) {
        this.rootView_ = rootView_;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding bind(@NonNull View rootView) {
        int i = R.id.et_old_ble_name;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (editText != null) {
            i = R.id.et_signal;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
            if (editText2 != null) {
                i = R.id.list_view;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                if (listView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    return new ActivityDeveloperTestTuyaStartBinding(relativeLayout, editText, editText2, listView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_tuya_start, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
