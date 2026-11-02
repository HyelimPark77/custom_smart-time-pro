package com.bestmafen.androidbase.adapter.recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.jc;
import com.android.mltcode.paycertificationapi.lc;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MultiItemTypeAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    protected Context mContext;
    protected List<T> mDatas;
    protected lc mItemViewDelegateManager;
    protected iO mOnItemClickListener;

    public class OXO1 implements View.OnClickListener {
        public final /* synthetic */ MultiItemTypeAdapter I1;
        public final /* synthetic */ ViewHolder IO;

        public OXO1(MultiItemTypeAdapter r1, ViewHolder r2) {
            this.I1 = r1;
            this.IO = r2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View r4) {
            if (this.I1.mOnItemClickListener == null) goto L6;
            int r0 = this.IO.getAdapterPosition();
            this.I1.mOnItemClickListener.OXO1(r4, this.IO, r0);
            return;
        }
    }

    public class XIi00iiXO implements View.OnLongClickListener {
        public final /* synthetic */ MultiItemTypeAdapter I1;
        public final /* synthetic */ ViewHolder IO;

        public XIi00iiXO(MultiItemTypeAdapter r1, ViewHolder r2) {
            this.I1 = r1;
            this.IO = r2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View r4) {
            if (this.I1.mOnItemClickListener == null) goto L6;
            int r0 = this.IO.getAdapterPosition();
            return this.I1.mOnItemClickListener.XIi00iiXO(r4, this.IO, r0);
        L6:
            return false;
        }
    }

    public interface iO {
        void OXO1(View r1, RecyclerView.ViewHolder r2, int r3);

        boolean XIi00iiXO(View r1, RecyclerView.ViewHolder r2, int r3);
    }

    public MultiItemTypeAdapter(Context r1, List<T> r2) {
        this.mContext = r1;
        this.mDatas = r2;
        this.mItemViewDelegateManager = new lc();
    }

    public MultiItemTypeAdapter addItemViewDelegate(jc<T> r2) {
        XIi00iiXO(r2);
        return this;
    }

    public void convert(ViewHolder r3, T r4) {
        iO(r3, r4, r3.getAdapterPosition());
    }

    public List<T> getDatas() {
        return this.mDatas;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDatas.size();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r3) {
        if (useItemViewDelegateManager() == true) goto L7;
        return super.getItemViewType(r3);
    L7:
        return I0IIOi(this.mDatas.get(r3), r3);
    }

    public boolean isEnabled(int r1) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
        onBindViewHolder((ViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public void onViewHolderCreated(ViewHolder r1, View r2) {
    }

    public void setListener(ViewGroup r1, ViewHolder r2, int r3) {
        if (isEnabled(r3) == true) goto L5;
        return;
    L5:
        r2.getConvertView().setOnClickListener(new OXO1(this, r2));
        r2.getConvertView().setOnLongClickListener(new XIi00iiXO(this, r2));
    }

    public void setOnItemClickListener(iO r1) {
        this.mOnItemClickListener = r1;
    }

    public boolean useItemViewDelegateManager() {
        if (O00() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public MultiItemTypeAdapter addItemViewDelegate(int r2, jc<T> r3) {
        OXO1(r2, r3);
        return this;
    }

    public void onBindViewHolder(ViewHolder r2, int r3) {
        convert(r2, this.mDatas.get(r3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup r3, int r4) {
        int r0 = XO0O10(r4).XIi00iiXO();
        ViewHolder r1 = ViewHolder.createViewHolder(this.mContext, r3, r0);
        onViewHolderCreated(r1, r1.getConvertView());
        setListener(r3, r1, r4);
        return r1;
    }
}
