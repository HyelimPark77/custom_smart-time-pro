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
        int r0 = R.id.edt_description;
        FontEditText r1 = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_description);
        if (r1 == null) goto L11;
        r0 = R.id.edt_name;
        FontEditText r2 = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_name);
        if (r2 == null) goto L11;
        r0 = R.id.tv_repeat;
        FontTextView r3 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_repeat);
        if (r3 == null) goto L11;
        return new ActivityCoachingEditBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCoachingEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCoachingEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_coaching_edit, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
