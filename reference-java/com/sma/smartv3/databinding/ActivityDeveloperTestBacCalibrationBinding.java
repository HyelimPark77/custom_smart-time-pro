package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestBacCalibrationBinding implements ViewBinding {

    @NonNull
    public final EditText editText;

    @NonNull
    public final ListView listView;

    @NonNull
    public final AppCompatButton press1Btn;

    @NonNull
    public final AppCompatButton press2Btn;

    @NonNull
    public final AppCompatButton readTv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final AppCompatButton startTv1;

    @NonNull
    public final AppCompatButton startTv2;

    @NonNull
    public final AppCompatButton value1Btn;

    @NonNull
    public final AppCompatButton value2Btn;

    private ActivityDeveloperTestBacCalibrationBinding(@NonNull LinearLayout rootView_, @NonNull EditText editText, @NonNull ListView listView, @NonNull AppCompatButton press1Btn, @NonNull AppCompatButton press2Btn, @NonNull AppCompatButton readTv, @NonNull LinearLayout rootView, @NonNull AppCompatButton startTv1, @NonNull AppCompatButton startTv2, @NonNull AppCompatButton value1Btn, @NonNull AppCompatButton value2Btn) {
        this.rootView_ = rootView_;
        this.editText = editText;
        this.listView = listView;
        this.press1Btn = press1Btn;
        this.press2Btn = press2Btn;
        this.readTv = readTv;
        this.rootView = rootView;
        this.startTv1 = startTv1;
        this.startTv2 = startTv2;
        this.value1Btn = value1Btn;
        this.value2Btn = value2Btn;
    }

    @NonNull
    public static ActivityDeveloperTestBacCalibrationBinding bind(@NonNull View rootView) {
        int i = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
        if (editText != null) {
            i = R.id.list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (listView != null) {
                i = R.id.press1_btn;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.press1_btn);
                if (appCompatButton != null) {
                    i = R.id.press2_btn;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.press2_btn);
                    if (appCompatButton2 != null) {
                        i = R.id.read_tv;
                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.read_tv);
                        if (appCompatButton3 != null) {
                            LinearLayout linearLayout = (LinearLayout) rootView;
                            i = R.id.start_tv1;
                            AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.start_tv1);
                            if (appCompatButton4 != null) {
                                i = R.id.start_tv2;
                                AppCompatButton appCompatButton5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.start_tv2);
                                if (appCompatButton5 != null) {
                                    i = R.id.value1_btn;
                                    AppCompatButton appCompatButton6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.value1_btn);
                                    if (appCompatButton6 != null) {
                                        i = R.id.value2_btn;
                                        AppCompatButton appCompatButton7 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.value2_btn);
                                        if (appCompatButton7 != null) {
                                            return new ActivityDeveloperTestBacCalibrationBinding(linearLayout, editText, listView, appCompatButton, appCompatButton2, appCompatButton3, linearLayout, appCompatButton4, appCompatButton5, appCompatButton6, appCompatButton7);
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
    public static ActivityDeveloperTestBacCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestBacCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_bac_calibration, parent, false);
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
