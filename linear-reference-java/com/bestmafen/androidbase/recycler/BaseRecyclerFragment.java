package com.bestmafen.androidbase.recycler;

import android.app.Activity;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ag3;
import com.bestmafen.androidbase.R;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.base.BaseFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseRecyclerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRecyclerFragment.kt\ncom/bestmafen/androidbase/recycler/BaseRecyclerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public abstract class BaseRecyclerFragment<T> extends BaseFragment implements ag3<T> {
    protected List<T> mList;
    protected CommonAdapter<T> mRecyclerAdapter;
    protected RecyclerView mRecyclerView;

    public BaseRecyclerFragment() {
    }

    public final int getCount() {
        return getMList().size();
    }

    @aa1
    public final List<T> getMList() {
        List<T> r0 = this.mList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mList");
        return null;
    }

    @aa1
    public final CommonAdapter<T> getMRecyclerAdapter() {
        CommonAdapter<T> r0 = this.mRecyclerAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecyclerAdapter");
        return null;
    }

    @aa1
    public final RecyclerView getMRecyclerView() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecyclerView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        View r0 = getMView().findViewById(R.id.recycler_view);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        setMRecyclerView((RecyclerView) r0);
        setMList(initList());
        final Activity r1 = getMActivity();
        final int r2 = itemLayoutId();
        final List<T> r3 = getMList();
        CommonAdapter<T> r4 = new AnonymousClass1(this, r1, r2, r3);
        getMRecyclerView().setAdapter(r4);
        setMRecyclerAdapter(r4);
    }

    public final void setMList(@aa1 List<T> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMRecyclerAdapter(@aa1 CommonAdapter<T> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecyclerAdapter = r2;
    }

    public final void setMRecyclerView(@aa1 RecyclerView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecyclerView = r2;
    }
}
