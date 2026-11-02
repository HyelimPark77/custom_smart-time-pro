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
        int i = R.id.dial_recording_aigc;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_aigc);
        if (pFMedium != null) {
            i = R.id.dial_recording_custom_face;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_custom_face);
            if (pFMedium2 != null) {
                i = R.id.dial_recording_online;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online);
                if (pFMedium3 != null) {
                    ScrollView scrollView = (ScrollView) rootView;
                    i = R.id.synchronous_ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll);
                    if (linearLayout != null) {
                        i = R.id.synchronous_ll_aigc;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_aigc);
                        if (linearLayout2 != null) {
                            i = R.id.synchronous_ll_online;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online);
                            if (linearLayout3 != null) {
                                i = R.id.synchronous_rl;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl);
                                if (recyclerView != null) {
                                    i = R.id.synchronous_rl_aigc;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_aigc);
                                    if (recyclerView2 != null) {
                                        i = R.id.synchronous_rl_online;
                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online);
                                        if (recyclerView3 != null) {
                                            return new FragmentDialRecordingBinding(scrollView, pFMedium, pFMedium2, pFMedium3, scrollView, linearLayout, linearLayout2, linearLayout3, recyclerView, recyclerView2, recyclerView3);
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
    public static FragmentDialRecordingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDialRecordingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_dial_recording, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
