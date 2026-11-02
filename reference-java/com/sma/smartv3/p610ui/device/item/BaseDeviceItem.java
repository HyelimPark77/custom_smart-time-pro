package com.sma.smartv3.p610ui.device.item;

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

    /* JADX INFO: renamed from: iv */
    @tb1
    private ImageView f54575iv;

    @tb1
    private TextView tvLeft;

    @tb1
    private TextView tvRight;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    @CallSuper
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.f54575iv = (ImageView) itemHolder.m3483v(R.id.f51417iv);
        this.tvLeft = (TextView) itemHolder.m3483v(R.id.tv_left);
        this.tvRight = (TextView) itemHolder.m3483v(R.id.tv_right);
    }

    @tb1
    public final ImageView getIv() {
        return this.f54575iv;
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
    public void onDetach(@aa1 DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
    }

    public final void setIv(@tb1 ImageView imageView) {
        this.f54575iv = imageView;
    }

    public final void setTvLeft(@tb1 TextView textView) {
        this.tvLeft = textView;
    }

    public final void setTvRight(@tb1 TextView textView) {
        this.tvRight = textView;
    }
}
