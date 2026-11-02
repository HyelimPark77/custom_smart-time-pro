package com.sma.smartv3.ui.status.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.s95;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.smart.xmlyaudiolibrary.XmlyAudioWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StatusXmlyAudioItem extends BaseDslItem {
    public StatusXmlyAudioItem() {
    }

    public static /* synthetic */ Unit O00(DslViewHolder r0, View r1) {
        return bindView$lambda$0(r0, r1);
    }

    private static final Unit bindView$lambda$0(DslViewHolder r2, View r3) {
        Intrinsics.X0O(r3, "it");
        ContextCompat.startActivity(r2.getContext(), new Intent(r2.getContext(), XmlyAudioWebViewActivity.class), new Bundle());
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        r2.clickItem(new s95(r2));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_xmly_audio;
    }
}
