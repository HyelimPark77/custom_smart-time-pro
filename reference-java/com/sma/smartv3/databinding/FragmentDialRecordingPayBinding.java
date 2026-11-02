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
public final class FragmentDialRecordingPayBinding implements ViewBinding {

    @NonNull
    public final PFMedium dialPurchaseHistoryMore;

    @NonNull
    public final PFMedium dialRecordingAigc;

    @NonNull
    public final PFMedium dialRecordingCustomFace;

    @NonNull
    public final PFMedium dialRecordingOnline;

    @NonNull
    public final PFMedium dialRecordingOnlinePay;

    @NonNull
    public final LinearLayout freeLimitedTimeHistoryLl;

    @NonNull
    public final PFMedium freeLimitedTimeHistoryMore;

    @NonNull
    public final RecyclerView freeLimitedTimeRl;

    @NonNull
    public final LinearLayout purchaseHistoryLl;

    @NonNull
    public final RecyclerView purchaseHistoryRl;

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
    public final LinearLayout synchronousLlOnlinePay;

    @NonNull
    public final RecyclerView synchronousRl;

    @NonNull
    public final RecyclerView synchronousRlAigc;

    @NonNull
    public final RecyclerView synchronousRlOnline;

    @NonNull
    public final RecyclerView synchronousRlOnlinePay;

    private FragmentDialRecordingPayBinding(@NonNull ScrollView rootView_, @NonNull PFMedium dialPurchaseHistoryMore, @NonNull PFMedium dialRecordingAigc, @NonNull PFMedium dialRecordingCustomFace, @NonNull PFMedium dialRecordingOnline, @NonNull PFMedium dialRecordingOnlinePay, @NonNull LinearLayout freeLimitedTimeHistoryLl, @NonNull PFMedium freeLimitedTimeHistoryMore, @NonNull RecyclerView freeLimitedTimeRl, @NonNull LinearLayout purchaseHistoryLl, @NonNull RecyclerView purchaseHistoryRl, @NonNull ScrollView rootView, @NonNull LinearLayout synchronousLl, @NonNull LinearLayout synchronousLlAigc, @NonNull LinearLayout synchronousLlOnline, @NonNull LinearLayout synchronousLlOnlinePay, @NonNull RecyclerView synchronousRl, @NonNull RecyclerView synchronousRlAigc, @NonNull RecyclerView synchronousRlOnline, @NonNull RecyclerView synchronousRlOnlinePay) {
        this.rootView_ = rootView_;
        this.dialPurchaseHistoryMore = dialPurchaseHistoryMore;
        this.dialRecordingAigc = dialRecordingAigc;
        this.dialRecordingCustomFace = dialRecordingCustomFace;
        this.dialRecordingOnline = dialRecordingOnline;
        this.dialRecordingOnlinePay = dialRecordingOnlinePay;
        this.freeLimitedTimeHistoryLl = freeLimitedTimeHistoryLl;
        this.freeLimitedTimeHistoryMore = freeLimitedTimeHistoryMore;
        this.freeLimitedTimeRl = freeLimitedTimeRl;
        this.purchaseHistoryLl = purchaseHistoryLl;
        this.purchaseHistoryRl = purchaseHistoryRl;
        this.rootView = rootView;
        this.synchronousLl = synchronousLl;
        this.synchronousLlAigc = synchronousLlAigc;
        this.synchronousLlOnline = synchronousLlOnline;
        this.synchronousLlOnlinePay = synchronousLlOnlinePay;
        this.synchronousRl = synchronousRl;
        this.synchronousRlAigc = synchronousRlAigc;
        this.synchronousRlOnline = synchronousRlOnline;
        this.synchronousRlOnlinePay = synchronousRlOnlinePay;
    }

    @NonNull
    public static FragmentDialRecordingPayBinding bind(@NonNull View rootView) {
        int i = R.id.dial_purchase_history_more;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_purchase_history_more);
        if (pFMedium != null) {
            i = R.id.dial_recording_aigc;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_aigc);
            if (pFMedium2 != null) {
                i = R.id.dial_recording_custom_face;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_custom_face);
                if (pFMedium3 != null) {
                    i = R.id.dial_recording_online;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online);
                    if (pFMedium4 != null) {
                        i = R.id.dial_recording_online_pay;
                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online_pay);
                        if (pFMedium5 != null) {
                            i = R.id.free_limited_time_history_ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_history_ll);
                            if (linearLayout != null) {
                                i = R.id.free_limited_time_history_more;
                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_history_more);
                                if (pFMedium6 != null) {
                                    i = R.id.free_limited_time_rl;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_rl);
                                    if (recyclerView != null) {
                                        i = R.id.purchase_history_ll;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.purchase_history_ll);
                                        if (linearLayout2 != null) {
                                            i = R.id.purchase_history_rl;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.purchase_history_rl);
                                            if (recyclerView2 != null) {
                                                ScrollView scrollView = (ScrollView) rootView;
                                                i = R.id.synchronous_ll;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll);
                                                if (linearLayout3 != null) {
                                                    i = R.id.synchronous_ll_aigc;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_aigc);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.synchronous_ll_online;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.synchronous_ll_online_pay;
                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online_pay);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.synchronous_rl;
                                                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl);
                                                                if (recyclerView3 != null) {
                                                                    i = R.id.synchronous_rl_aigc;
                                                                    RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_aigc);
                                                                    if (recyclerView4 != null) {
                                                                        i = R.id.synchronous_rl_online;
                                                                        RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online);
                                                                        if (recyclerView5 != null) {
                                                                            i = R.id.synchronous_rl_online_pay;
                                                                            RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online_pay);
                                                                            if (recyclerView6 != null) {
                                                                                return new FragmentDialRecordingPayBinding(scrollView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, linearLayout, pFMedium6, recyclerView, linearLayout2, recyclerView2, scrollView, linearLayout3, linearLayout4, linearLayout5, linearLayout6, recyclerView3, recyclerView4, recyclerView5, recyclerView6);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static FragmentDialRecordingPayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDialRecordingPayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_dial_recording_pay, parent, false);
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
