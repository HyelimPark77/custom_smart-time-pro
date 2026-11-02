package com.bestmafen.androidbase.recycler;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ag3;
import com.bestmafen.androidbase.C4238R;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseRecyclerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRecyclerActivity.kt\ncom/bestmafen/androidbase/recycler/BaseRecyclerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public abstract class BaseRecyclerActivity<T> extends BaseActivity implements ag3<T> {
    protected List<T> mList;
    protected CommonAdapter<T> mRecyclerAdapter;
    protected RecyclerView mRecyclerView;

    public final int getCount() {
        return getMList().size();
    }

    @aa1
    public final List<T> getMList() {
        List<T> list = this.mList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mList");
        return null;
    }

    @aa1
    public final CommonAdapter<T> getMRecyclerAdapter() {
        CommonAdapter<T> commonAdapter = this.mRecyclerAdapter;
        if (commonAdapter != null) {
            return commonAdapter;
        }
        Intrinsics.XXO("mRecyclerAdapter");
        return null;
    }

    @aa1
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.XXO("mRecyclerView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        View viewFindViewById = findViewById(C4238R.id.recycler_view);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setMRecyclerView((RecyclerView) viewFindViewById);
        setMList(initList());
        CommonAdapter<T> commonAdapter = new CommonAdapter<T>(this, getMContext(), itemLayoutId(), getMList()) { // from class: com.bestmafen.androidbase.recycler.BaseRecyclerActivity.initView.1
            final /* synthetic */ BaseRecyclerActivity<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, T t, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                this.this$0.initItem(viewHolder, t, i);
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return this.this$0.getCount();
            }
        };
        getMRecyclerView().setAdapter(commonAdapter);
        setMRecyclerAdapter(commonAdapter);
    }

    public final void setMList(@aa1 List<T> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMRecyclerAdapter(@aa1 CommonAdapter<T> commonAdapter) {
        Intrinsics.X0O(commonAdapter, "<set-?>");
        this.mRecyclerAdapter = commonAdapter;
    }

    public final void setMRecyclerView(@aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }
}
