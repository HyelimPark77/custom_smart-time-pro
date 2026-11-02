package com.bestmafen.androidbase.adapter.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import com.android.mltcode.paycertificationapi.jc;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CommonAdapter<T> extends MultiItemTypeAdapter<T> {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    protected int mLayoutId;

    public class OXO1 implements jc<T> {
        public final /* synthetic */ int OXO1;
        public final /* synthetic */ CommonAdapter XIi00iiXO;

        public OXO1(CommonAdapter r1, int r2) {
            this.XIi00iiXO = r1;
            this.OXO1 = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.jc
        public boolean OXO1(T r1, int r2) {
            return true;
        }

        @Override // com.android.mltcode.paycertificationapi.jc
        public int XIi00iiXO() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.jc
        public void iO(ViewHolder r2, T r3, int r4) {
            this.XIi00iiXO.convert(r2, r3, r4);
        }
    }

    public CommonAdapter(Context r1, int r2, List<T> r3) {
        super(r1, r3);
        this.mContext = r1;
        this.mInflater = LayoutInflater.from(r1);
        this.mLayoutId = r2;
        this.mDatas = r3;
        addItemViewDelegate(new OXO1(this, r2));
    }

    public abstract void convert(ViewHolder r1, T r2, int r3);
}
