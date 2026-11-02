package com.bestmafen.androidbase.list;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.np;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.R;
import com.bestmafen.androidbase.base.BaseFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseListFragment.kt\ncom/bestmafen/androidbase/list/BaseListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public abstract class BaseListFragment<T> extends BaseFragment implements np<T> {
    protected List<T> mList;
    protected XII0Oi10O<T> mListAdapter;
    protected ListView mListView;

    public static final class OXO1 extends XII0Oi10O<T> {
        public final /* synthetic */ BaseListFragment<T> X11iII1O1;

        public OXO1(BaseListFragment<T> r1, Activity r2, int r3, List<T> r4) {
            this.X11iII1O1 = r1;
            super(r2, r3, r4);
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        public void XIi00iiXO(ug6 r2, T r3, int r4) {
            Intrinsics.X0O(r2, "viewHolder");
            this.X11iII1O1.initItem(r2, r3, r4);
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return this.X11iII1O1.getItemCount();
        }
    }

    public BaseListFragment() {
    }

    public final int getItemCount() {
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
    public final XII0Oi10O<T> getMListAdapter() {
        XII0Oi10O<T> r0 = this.mListAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mListAdapter");
        return null;
    }

    @aa1
    public final ListView getMListView() {
        ListView r0 = this.mListView;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mListView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        View r0 = getMView().findViewById(R.id.list_view);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.widget.ListView");
        setMListView((ListView) r0);
        setMList(initList());
        OXO1 r3 = new OXO1(this, getMActivity(), itemLayoutId(), getMList());
        getMListView().setAdapter(r3);
        setMListAdapter(r3);
    }

    public final void setMList(@aa1 List<T> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMListAdapter(@aa1 XII0Oi10O<T> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mListAdapter = r2;
    }

    public final void setMListView(@aa1 ListView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mListView = r2;
    }
}
