package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityFeedbackBinding implements ViewBinding {

    @NonNull
    public final EditText edtContact;

    @NonNull
    public final EditText edtFeedback;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final DINCondBold tvCount;

    private ActivityFeedbackBinding(@NonNull LinearLayout rootView_, @NonNull EditText edtContact, @NonNull EditText edtFeedback, @NonNull LinearLayout rootView, @NonNull DINCondBold tvCount) {
        this.rootView_ = rootView_;
        this.edtContact = edtContact;
        this.edtFeedback = edtFeedback;
        this.rootView = rootView;
        this.tvCount = tvCount;
    }

    @NonNull
    public static ActivityFeedbackBinding bind(@NonNull View rootView) {
        int r0 = R.id.edt_contact;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_contact);
        if (r4 == null) goto L11;
        r0 = R.id.edt_feedback;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_feedback);
        if (r5 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_count;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_count);
        if (r7 == null) goto L11;
        return new ActivityFeedbackBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_feedback, parent, false);
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
