package com.sma.smartv3.ui.device.watchface.fragment;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseElementFragment extends BaseFragment {

    @tb1
    private View.OnClickListener mOnViewClickListener;

    public BaseElementFragment() {
    }

    @tb1
    public final View.OnClickListener getMOnViewClickListener() {
        return this.mOnViewClickListener;
    }

    public abstract void reset();

    public final void setMOnViewClickListener(@tb1 View.OnClickListener r1) {
        this.mOnViewClickListener = r1;
    }

    public final void setOnViewClickListener(@aa1 View.OnClickListener r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.mOnViewClickListener = r2;
    }
}
