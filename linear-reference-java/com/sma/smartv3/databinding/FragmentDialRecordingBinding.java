package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentDialRecordingBinding implements ViewBinding {

    @NonNull
    public final PFMedium dialRecordingAigc;

    @NonNull
    public final PFMedium dialRecordingCustomFace;

    @NonNull
    public final PFMedium dialRecordingOnline;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    private final ScrollView rootView_;

    @NonNull
    public final LinearLayout synchronousLl;

    @NonNull
    public final LinearLayout synchronousLlAigc;

    @NonNull
    public final LinearLayout synchronousLlOnline;

    @NonNull
    public final RecyclerView synchronousRl;

    @NonNull
    public final RecyclerView synchronousRlAigc;

    @NonNull
    public final RecyclerView synchronousRlOnline;

    private FragmentDialRecordingBinding(@NonNull ScrollView rootView_, @NonNull PFMedium dialRecordingAigc, @NonNull PFMedium dialRecordingCustomFace, @NonNull PFMedium dialRecordingOnline, @NonNull ScrollView rootView, @NonNull LinearLayout synchronousLl, @NonNull LinearLayout synchronousLlAigc, @NonNull LinearLayout synchronousLlOnline, @NonNull RecyclerView synchronousRl, @NonNull RecyclerView synchronousRlAigc, @NonNull RecyclerView synchronousRlOnline) {
        this.rootView_ = rootView_;
        this.dialRecordingAigc = dialRecordingAigc;
        this.dialRecordingCustomFace = dialRecordingCustomFace;
        this.dialRecordingOnline = dialRecordingOnline;
        this.rootView = rootView;
        this.synchronousLl = synchronousLl;
        this.synchronousLlAigc = synchronousLlAigc;
        this.synchronousLlOnline = synchronousLlOnline;
        this.synchronousRl = synchronousRl;
        this.synchronousRlAigc = synchronousRlAigc;
        this.synchronousRlOnline = synchronousRlOnline;
    }

    @NonNull
    public static FragmentDialRecordingBinding bind(@NonNull View rootView) {
        int r0 = R.id.dial_recording_aigc;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_aigc);
        if (r4 == null) goto L23;
        r0 = R.id.dial_recording_custom_face;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_custom_face);
        if (r5 == null) goto L23;
        r0 = R.id.dial_recording_online;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online);
        if (r6 == null) goto L23;
        ScrollView r3 = (ScrollView) rootView;
        r0 = R.id.synchronous_ll;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll);
        if (r8 == null) goto L23;
        r0 = R.id.synchronous_ll_aigc;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_aigc);
        if (r9 == null) goto L23;
        r0 = R.id.synchronous_ll_online;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online);
        if (r10 == null) goto L23;
        r0 = R.id.synchronous_rl;
        RecyclerView r11 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl);
        if (r11 == null) goto L23;
        r0 = R.id.synchronous_rl_aigc;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_aigc);
        if (r12 == null) goto L23;
        r0 = R.id.synchronous_rl_online;
        RecyclerView r13 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online);
        if (r13 == null) goto L23;
        return new FragmentDialRecordingBinding(r3, r4, r5, r6, r3, r8, r9, r10, r11, r12, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentDialRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentDialRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_dial_recording, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
