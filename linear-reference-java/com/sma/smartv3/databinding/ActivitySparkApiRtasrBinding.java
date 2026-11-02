package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySparkApiRtasrBinding implements ViewBinding {

    @NonNull
    public final TextView chatOutputText;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Button startInit;

    @NonNull
    public final Button testBtn;

    @NonNull
    public final Button testBtn2;

    private ActivitySparkApiRtasrBinding(@NonNull ConstraintLayout rootView, @NonNull TextView chatOutputText, @NonNull Button startInit, @NonNull Button testBtn, @NonNull Button testBtn2) {
        this.rootView = rootView;
        this.chatOutputText = chatOutputText;
        this.startInit = startInit;
        this.testBtn = testBtn;
        this.testBtn2 = testBtn2;
    }

    @NonNull
    public static ActivitySparkApiRtasrBinding bind(@NonNull View rootView) {
        int r0 = R.id.chat_output_text;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_output_text);
        if (r4 == null) goto L13;
        r0 = R.id.start_init;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.start_init);
        if (r5 == null) goto L13;
        r0 = R.id.test_btn;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.test_btn);
        if (r6 == null) goto L13;
        r0 = R.id.test_btn2;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.test_btn2);
        if (r7 == null) goto L13;
        return new ActivitySparkApiRtasrBinding((ConstraintLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySparkApiRtasrBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySparkApiRtasrBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_spark_api_rtasr, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
