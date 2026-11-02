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
        int r0 = R.id.editText;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
        if (r4 == null) goto L23;
        r0 = R.id.list_view;
        ListView r5 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r5 == null) goto L23;
        r0 = R.id.press1_btn;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.press1_btn);
        if (r6 == null) goto L23;
        r0 = R.id.press2_btn;
        AppCompatButton r7 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.press2_btn);
        if (r7 == null) goto L23;
        r0 = R.id.read_tv;
        AppCompatButton r8 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.read_tv);
        if (r8 == null) goto L23;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.start_tv1;
        AppCompatButton r10 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.start_tv1);
        if (r10 == null) goto L23;
        r0 = R.id.start_tv2;
        AppCompatButton r11 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.start_tv2);
        if (r11 == null) goto L23;
        r0 = R.id.value1_btn;
        AppCompatButton r12 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.value1_btn);
        if (r12 == null) goto L23;
        r0 = R.id.value2_btn;
        AppCompatButton r13 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.value2_btn);
        if (r13 == null) goto L23;
        return new ActivityDeveloperTestBacCalibrationBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11, r12, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestBacCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestBacCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_bac_calibration, parent, false);
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
