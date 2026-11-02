package com.sma.smartv3.p610ui.p611ai.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AIFunctionItem extends BaseDslItem {
    private final int type;

    public AIFunctionItem() {
        this(0, 1, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Object itemData = getItemData();
        Intrinsics.X1ii(itemData, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        AIFunction aIFunction = (AIFunction) itemData;
        View view = itemHolder.itemView;
        if (this.type == 0) {
            view.setBackgroundResource(aIFunction.getBg());
        }
        Intrinsics.XXI(view);
        UtilsKt.IX1XiI(view, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(aIFunction.getIcon());
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_desc);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(aIFunction.getTitle());
        }
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(aIFunction.getDesc());
        }
        if (!aIFunction.isHot() || this.type != 0) {
            if (textViewM3482tv2 != null) {
                textViewM3482tv2.setTextColor(gk4.m1859iO(itemHolder.getContext(), R.color.line_color));
            }
        } else {
            if (textViewM3482tv != null) {
                textViewM3482tv.setTextColor(gk4.m1859iO(itemHolder.getContext(), R.color.white));
            }
            if (textViewM3482tv2 != null) {
                textViewM3482tv2.setTextColor(gk4.m1859iO(itemHolder.getContext(), R.color.white));
            }
        }
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function;
    }

    public AIFunctionItem(int i) {
        this.type = i;
    }

    public /* synthetic */ AIFunctionItem(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
