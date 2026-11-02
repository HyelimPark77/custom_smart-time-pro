package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestFontrepairStartBinding implements ViewBinding {

    @NonNull
    public final EditText etSignal;

    @NonNull
    public final ListView listView;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final TextView tvFile;

    private ActivityDeveloperTestFontrepairStartBinding(@NonNull RelativeLayout rootView_, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvFile) {
        this.rootView_ = rootView_;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvFile = tvFile;
    }

    @NonNull
    public static ActivityDeveloperTestFontrepairStartBinding bind(@NonNull View rootView) {
        int i = R.id.et_signal;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (editText != null) {
            i = R.id.list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (listView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i = R.id.tv_file;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_file);
                if (textView != null) {
                    return new ActivityDeveloperTestFontrepairStartBinding(relativeLayout, editText, listView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestFontrepairStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestFontrepairStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_fontrepair_start, parent, false);
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
