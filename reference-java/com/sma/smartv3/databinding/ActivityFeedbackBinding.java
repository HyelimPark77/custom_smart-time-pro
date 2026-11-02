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
        int i = R.id.edt_contact;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_contact);
        if (editText != null) {
            i = R.id.edt_feedback;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_feedback);
            if (editText2 != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.tv_count;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_count);
                if (dINCondBold != null) {
                    return new ActivityFeedbackBinding(linearLayout, editText, editText2, linearLayout, dINCondBold);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_feedback, parent, false);
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
