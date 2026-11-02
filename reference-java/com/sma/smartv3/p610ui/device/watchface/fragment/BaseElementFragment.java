package com.sma.smartv3.p610ui.device.watchface.fragment;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseElementFragment extends BaseFragment {

    @tb1
    private View.OnClickListener mOnViewClickListener;

    @tb1
    public final View.OnClickListener getMOnViewClickListener() {
        return this.mOnViewClickListener;
    }

    public abstract void reset();

    public final void setMOnViewClickListener(@tb1 View.OnClickListener onClickListener) {
        this.mOnViewClickListener = onClickListener;
    }

    public final void setOnViewClickListener(@aa1 View.OnClickListener listener) {
        Intrinsics.X0O(listener, "listener");
        this.mOnViewClickListener = listener;
    }
}
