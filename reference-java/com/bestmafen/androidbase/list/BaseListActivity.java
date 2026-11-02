package com.bestmafen.androidbase.list;

import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.InterfaceC2740np;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.C4238R;
import com.bestmafen.androidbase.base.BaseActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseListActivity.kt\ncom/bestmafen/androidbase/list/BaseListActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public abstract class BaseListActivity<T> extends BaseActivity implements InterfaceC2740np<T> {
    protected List<T> mList;
    protected XII0Oi10O<T> mListAdapter;
    protected ListView mListView;

    public static final class OXO1 extends XII0Oi10O<T> {
        public final /* synthetic */ BaseListActivity<T> X11iII1O1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OXO1(BaseListActivity<T> baseListActivity, Activity activity, int i, List<T> list) {
            super(activity, i, list);
            this.X11iII1O1 = baseListActivity;
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        public void XIi00iiXO(ug6 viewHolder, T t, int i) {
            Intrinsics.X0O(viewHolder, "viewHolder");
            this.X11iII1O1.initItem(viewHolder, t, i);
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return this.X11iII1O1.getItemCount();
        }
    }

    public final int getItemCount() {
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
    public final XII0Oi10O<T> getMListAdapter() {
        XII0Oi10O<T> xII0Oi10O = this.mListAdapter;
        if (xII0Oi10O != null) {
            return xII0Oi10O;
        }
        Intrinsics.XXO("mListAdapter");
        return null;
    }

    @aa1
    public final ListView getMListView() {
        ListView listView = this.mListView;
        if (listView != null) {
            return listView;
        }
        Intrinsics.XXO("mListView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        View viewFindViewById = findViewById(C4238R.id.list_view);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setMListView((ListView) viewFindViewById);
        setMList(initList());
        OXO1 oxo1 = new OXO1(this, getMContext(), itemLayoutId(), getMList());
        getMListView().setAdapter((ListAdapter) oxo1);
        setMListAdapter(oxo1);
    }

    public final void setMList(@aa1 List<T> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMListAdapter(@aa1 XII0Oi10O<T> xII0Oi10O) {
        Intrinsics.X0O(xII0Oi10O, "<set-?>");
        this.mListAdapter = xII0Oi10O;
    }

    public final void setMListView(@aa1 ListView listView) {
        Intrinsics.X0O(listView, "<set-?>");
        this.mListView = listView;
    }
}
