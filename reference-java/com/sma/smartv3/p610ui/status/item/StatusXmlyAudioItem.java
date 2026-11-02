package com.sma.smartv3.p610ui.status.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.p610ui.status.item.StatusXmlyAudioItem;
import com.sma.smartv3.pro.R;
import com.smart.xmlyaudiolibrary.XmlyAudioWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StatusXmlyAudioItem extends BaseDslItem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(DslViewHolder dslViewHolder, View it) {
        Intrinsics.X0O(it, "it");
        ContextCompat.startActivity(dslViewHolder.getContext(), new Intent(dslViewHolder.getContext(), (Class<?>) XmlyAudioWebViewActivity.class), new Bundle());
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        itemHolder.clickItem(new Function1() { // from class: com.android.mltcode.paycertificationapi.s95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StatusXmlyAudioItem.bindView$lambda$0(itemHolder, (View) obj);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_xmly_audio;
    }
}
