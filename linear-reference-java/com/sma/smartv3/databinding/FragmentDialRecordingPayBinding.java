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
        int r1 = R.id.dial_purchase_history_more;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_purchase_history_more);
        if (r5 == null) goto L41;
        r1 = R.id.dial_recording_aigc;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_aigc);
        if (r6 == null) goto L41;
        r1 = R.id.dial_recording_custom_face;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_custom_face);
        if (r7 == null) goto L41;
        r1 = R.id.dial_recording_online;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online);
        if (r8 == null) goto L41;
        r1 = R.id.dial_recording_online_pay;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.dial_recording_online_pay);
        if (r9 == null) goto L41;
        r1 = R.id.free_limited_time_history_ll;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_history_ll);
        if (r10 == null) goto L41;
        r1 = R.id.free_limited_time_history_more;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_history_more);
        if (r11 == null) goto L41;
        r1 = R.id.free_limited_time_rl;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.free_limited_time_rl);
        if (r12 == null) goto L41;
        r1 = R.id.purchase_history_ll;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.purchase_history_ll);
        if (r13 == null) goto L41;
        r1 = R.id.purchase_history_rl;
        RecyclerView r14 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.purchase_history_rl);
        if (r14 == null) goto L41;
        ScrollView r4 = (ScrollView) rootView;
        r1 = R.id.synchronous_ll;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll);
        if (r16 == null) goto L41;
        r1 = R.id.synchronous_ll_aigc;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_aigc);
        if (r17 == null) goto L41;
        r1 = R.id.synchronous_ll_online;
        LinearLayout r18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online);
        if (r18 == null) goto L41;
        r1 = R.id.synchronous_ll_online_pay;
        LinearLayout r19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.synchronous_ll_online_pay);
        if (r19 == null) goto L41;
        r1 = R.id.synchronous_rl;
        RecyclerView r20 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl);
        if (r20 == null) goto L41;
        r1 = R.id.synchronous_rl_aigc;
        RecyclerView r21 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_aigc);
        if (r21 == null) goto L41;
        r1 = R.id.synchronous_rl_online;
        RecyclerView r22 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online);
        if (r22 == null) goto L41;
        r1 = R.id.synchronous_rl_online_pay;
        RecyclerView r23 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.synchronous_rl_online_pay);
        if (r23 == null) goto L41;
        return new FragmentDialRecordingPayBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, r16, r17, r18, r19, r20, r21, r22, r23);
    L41:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentDialRecordingPayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentDialRecordingPayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_dial_recording_pay, parent, false);
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
