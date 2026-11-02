package com.sma.smartv3.p610ui.p611ai.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AIGridSpacingItemDecoration;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAISearchTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISearchTopItem.kt\ncom/sma/smartv3/ui/ai/item/AISearchTopItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public class AISearchTopItem extends BaseDslItem {
    public Context mContext;
    private RecyclerView mHotrv;

    @aa1
    private List<String> mList;
    private TextView mRecordsCleartv;
    private RecyclerView mRecordsrv;
    private TextView mRecordstv;

    public AISearchTopItem(@aa1 List<String> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mList = mList;
    }

    public static /* synthetic */ void setRecyclerView$default(AISearchTopItem aISearchTopItem, RecyclerView recyclerView, int i, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRecyclerView");
        }
        if ((i2 & 2) != 0) {
            i = 3;
        }
        aISearchTopItem.setRecyclerView(recyclerView, i, list);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.search_func_records_tv);
        Intrinsics.XXI(viewM3483v);
        TextView textView = (TextView) viewM3483v;
        this.mRecordstv = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("mRecordstv");
            textView = null;
        }
        Context context = textView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        View viewM3483v2 = itemHolder.m3483v(R.id.search_func_records_rv);
        Intrinsics.XXI(viewM3483v2);
        this.mRecordsrv = (RecyclerView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.search_func_hot_rv);
        Intrinsics.XXI(viewM3483v3);
        this.mHotrv = (RecyclerView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.search_records_clear_tv);
        Intrinsics.XXI(viewM3483v4);
        TextView textView3 = (TextView) viewM3483v4;
        this.mRecordsCleartv = textView3;
        if (textView3 == null) {
            Intrinsics.XXO("mRecordsCleartv");
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I01XX0.OXO1(I01XX0.X11I, "");
            }
        });
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final List<String> getMList() {
        return this.mList;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        RecyclerView recyclerView;
        String[] stringArray = getMContext().getResources().getStringArray(R.array.search_hot);
        Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
        List listOXI0X0 = ArraysKt___ArraysKt.OXI0X0(stringArray);
        q62 q62Var = q62.OXO1;
        int i = 0;
        TextView textView = null;
        if (q62Var.XIi10().length() > 0) {
            setTitle(q62Var.XIi10());
        } else {
            setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
        }
        RecyclerView recyclerView2 = this.mHotrv;
        if (recyclerView2 == null) {
            Intrinsics.XXO("mHotrv");
            recyclerView = null;
        } else {
            recyclerView = recyclerView2;
        }
        setRecyclerView$default(this, recyclerView, 0, listOXI0X0, 2, null);
        TextView textView2 = this.mRecordstv;
        if (textView2 == null) {
            Intrinsics.XXO("mRecordstv");
            textView2 = null;
        }
        List<String> list = this.mList;
        if (list == null || list.isEmpty()) {
            RecyclerView recyclerView3 = this.mRecordsrv;
            if (recyclerView3 == null) {
                Intrinsics.XXO("mRecordsrv");
                recyclerView3 = null;
            }
            i = 8;
            recyclerView3.setVisibility(8);
            TextView textView3 = this.mRecordsCleartv;
            if (textView3 == null) {
                Intrinsics.XXO("mRecordsCleartv");
            } else {
                textView = textView3;
            }
            textView.setVisibility(8);
        } else {
            RecyclerView recyclerView4 = this.mRecordsrv;
            if (recyclerView4 == null) {
                Intrinsics.XXO("mRecordsrv");
                recyclerView4 = null;
            }
            recyclerView4.setVisibility(0);
            RecyclerView recyclerView5 = this.mRecordsrv;
            if (recyclerView5 == null) {
                Intrinsics.XXO("mRecordsrv");
                recyclerView5 = null;
            }
            setRecyclerView(recyclerView5, 3, this.mList);
            TextView textView4 = this.mRecordsCleartv;
            if (textView4 == null) {
                Intrinsics.XXO("mRecordsCleartv");
            } else {
                textView = textView4;
            }
            textView.setVisibility(0);
        }
        textView2.setVisibility(i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_search_top;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMList(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setRecyclerView(@aa1 RecyclerView mRecyclerView, int i, @aa1 List<String> list) {
        Intrinsics.X0O(mRecyclerView, "mRecyclerView");
        Intrinsics.X0O(list, "list");
        mRecyclerView.setLayoutManager(new GridLayoutManager(getMContext(), i));
        mRecyclerView.setAdapter(new AISearchTopItem$setRecyclerView$mAdapter$1(list, getMContext()));
        if (mRecyclerView.getItemDecorationCount() == 0) {
            mRecyclerView.addItemDecoration(new AIGridSpacingItemDecoration(i, SizeUtils.dp2px(15.0f)));
        }
    }

    @aa1
    public final String setTitle(@aa1 String titleStr) {
        Intrinsics.X0O(titleStr, "titleStr");
        return AIManager.OXO1.iOiXi11II(titleStr);
    }
}
