package com.sma.smartv3.p610ui.p611ai.item;

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

    @Override // com.sma.smartv3.p610ui.p611ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        Intrinsics.XXI(textViewM3482tv);
        setTitle(textViewM3482tv);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final TextView getTitle() {
        TextView textView = this.title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("title");
        return null;
    }

    @Override // com.sma.smartv3.p610ui.p611ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        super.initView();
        q62 q62Var = q62.OXO1;
        if (q62Var.XIi10().length() > 0) {
            setTitle(q62Var.XIi10());
        } else {
            setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
        }
    }

    @Override // com.sma.smartv3.p610ui.p611ai.item.AIFunctionItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function_hot1;
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onBindStateChange");
        initView();
    }

    public final void setTitle(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.title = textView;
    }

    @sf5(tag = I01XX0.X00Xi1X)
    public final void switchAIServe(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }

    public final void setTitle(@aa1 String titleStr) {
        Intrinsics.X0O(titleStr, "titleStr");
        getTitle().setText(AIManager.OXO1.iOiXi11II(titleStr));
    }
}
