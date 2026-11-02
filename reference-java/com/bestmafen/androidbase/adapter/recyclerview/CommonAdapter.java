package com.bestmafen.androidbase.adapter.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CommonAdapter<T> extends MultiItemTypeAdapter<T> {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    protected int mLayoutId;

    public class OXO1 implements InterfaceC2572jc<T> {
        public final /* synthetic */ int OXO1;

        public OXO1(int i) {
            this.OXO1 = i;
        }

        @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
        public boolean OXO1(T t, int i) {
            return true;
        }

        @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
        public int XIi00iiXO() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
        /* JADX INFO: renamed from: iO */
        public void mo2372iO(ViewHolder viewHolder, T t, int i) {
            CommonAdapter.this.convert(viewHolder, t, i);
        }
    }

    public CommonAdapter(Context context, int i, List<T> list) {
        super(context, list);
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mLayoutId = i;
        this.mDatas = list;
        addItemViewDelegate(new OXO1(i));
    }

    public abstract void convert(ViewHolder viewHolder, T t, int i);
}
