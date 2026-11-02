package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseDeviceItem extends BaseDslItem {

    @tb1
    private ImageView iv;

    @tb1
    private TextView tvLeft;

    @tb1
    private TextView tvRight;

    public BaseDeviceItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    @CallSuper
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        this.iv = (ImageView) r2.v(R.id.iv);
        this.tvLeft = (TextView) r2.v(R.id.tv_left);
        this.tvRight = (TextView) r2.v(R.id.tv_right);
    }

    @tb1
    public final ImageView getIv() {
        return this.iv;
    }

    @tb1
    public final TextView getTvLeft() {
        return this.tvLeft;
    }

    @tb1
    public final TextView getTvRight() {
        return this.tvRight;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void onDetach(@aa1 DslViewHolder r1, int r2) {
        Intrinsics.X0O(r1, "itemHolder");
    }

    public final void setIv(@tb1 ImageView r1) {
        this.iv = r1;
    }

    public final void setTvLeft(@tb1 TextView r1) {
        this.tvLeft = r1;
    }

    public final void setTvRight(@tb1 TextView r1) {
        this.tvRight = r1;
    }
}
