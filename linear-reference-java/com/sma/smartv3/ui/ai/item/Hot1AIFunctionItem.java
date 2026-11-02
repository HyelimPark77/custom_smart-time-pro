package com.sma.smartv3.ui.ai.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Hot1AIFunctionItem extends AIFunctionItem {
    private final boolean initEvent;
    public TextView title;

    public Hot1AIFunctionItem() {
        super(0, 1, null);
        this.initEvent = true;
    }

    @Override // com.sma.smartv3.ui.ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        super.bindView(r2);
        TextView r3 = r2.tv(R.id.tv_title);
        Intrinsics.XXI(r3);
        setTitle(r3);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final TextView getTitle() {
        TextView r0 = this.title;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("title");
        return null;
    }

    @Override // com.sma.smartv3.ui.ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        super.initView();
        q62 r0 = q62.OXO1;
        if (r0.XIi10().length() <= 0) goto L6;
        setTitle(r0.XIi10());
        return;
    L6:
        setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
    }

    @Override // com.sma.smartv3.ui.ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function_hot1;
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onBindStateChange"});
        initView();
    }

    public final void setTitle(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.title = r2;
    }

    @sf5(tag = I01XX0.X00Xi1X)
    public final void switchAIServe(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    public final void setTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "titleStr");
        String r3 = AIManager.OXO1.iOiXi11II(r2);
        getTitle().setText(r3);
    }
}
