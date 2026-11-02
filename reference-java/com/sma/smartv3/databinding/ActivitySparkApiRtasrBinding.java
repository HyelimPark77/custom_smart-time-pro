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
        int i = R.id.chat_output_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_output_text);
        if (textView != null) {
            i = R.id.start_init;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.start_init);
            if (button != null) {
                i = R.id.test_btn;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.test_btn);
                if (button2 != null) {
                    i = R.id.test_btn2;
                    Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.test_btn2);
                    if (button3 != null) {
                        return new ActivitySparkApiRtasrBinding((ConstraintLayout) rootView, textView, button, button2, button3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySparkApiRtasrBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySparkApiRtasrBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_spark_api_rtasr, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
