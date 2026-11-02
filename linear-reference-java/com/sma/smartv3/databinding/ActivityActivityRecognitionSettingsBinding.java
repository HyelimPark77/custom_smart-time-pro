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
import com.sma.smartv3.view.AbhSettingsHeader;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityActivityRecognitionSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemActivityRecognition;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityActivityRecognitionSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemActivityRecognition, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemActivityRecognition = itemActivityRecognition;
        this.root = root;
    }

    @NonNull
    public static ActivityActivityRecognitionSettingsBinding bind(@NonNull View rootView) {
        AbhSettingsHeader r1 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_activity_recognition);
        if (r1 == null) goto L7;
        LinearLayout r2 = (LinearLayout) rootView;
        return new ActivityActivityRecognitionSettingsBinding(r2, r1, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item_activity_recognition)));
    }

    @NonNull
    public static ActivityActivityRecognitionSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityActivityRecognitionSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_activity_recognition_settings, parent, false);
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
