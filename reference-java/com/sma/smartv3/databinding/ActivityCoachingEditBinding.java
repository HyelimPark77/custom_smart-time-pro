package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontEditText;
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCoachingEditBinding implements ViewBinding {

    @NonNull
    public final FontEditText edtDescription;

    @NonNull
    public final FontEditText edtName;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tvRepeat;

    private ActivityCoachingEditBinding(@NonNull LinearLayout rootView, @NonNull FontEditText edtDescription, @NonNull FontEditText edtName, @NonNull FontTextView tvRepeat) {
        this.rootView = rootView;
        this.edtDescription = edtDescription;
        this.edtName = edtName;
        this.tvRepeat = tvRepeat;
    }

    @NonNull
    public static ActivityCoachingEditBinding bind(@NonNull View rootView) {
        int i = R.id.edt_description;
        FontEditText fontEditText = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_description);
        if (fontEditText != null) {
            i = R.id.edt_name;
            FontEditText fontEditText2 = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_name);
            if (fontEditText2 != null) {
                i = R.id.tv_repeat;
                FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_repeat);
                if (fontTextView != null) {
                    return new ActivityCoachingEditBinding((LinearLayout) rootView, fontEditText, fontEditText2, fontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCoachingEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCoachingEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_coaching_edit, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
