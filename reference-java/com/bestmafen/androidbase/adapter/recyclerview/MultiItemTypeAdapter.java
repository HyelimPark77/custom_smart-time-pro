package com.bestmafen.androidbase.adapter.recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2649lc;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MultiItemTypeAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    protected Context mContext;
    protected List<T> mDatas;
    protected C2649lc mItemViewDelegateManager = new C2649lc();
    protected InterfaceC4239iO mOnItemClickListener;

    public class OXO1 implements View.OnClickListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ ViewHolder f20375IO;

        public OXO1(ViewHolder viewHolder) {
            this.f20375IO = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MultiItemTypeAdapter.this.mOnItemClickListener != null) {
                MultiItemTypeAdapter.this.mOnItemClickListener.OXO1(view, this.f20375IO, this.f20375IO.getAdapterPosition());
            }
        }
    }

    public class XIi00iiXO implements View.OnLongClickListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ ViewHolder f20377IO;

        public XIi00iiXO(ViewHolder viewHolder) {
            this.f20377IO = viewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (MultiItemTypeAdapter.this.mOnItemClickListener == null) {
                return false;
            }
            return MultiItemTypeAdapter.this.mOnItemClickListener.XIi00iiXO(view, this.f20377IO, this.f20377IO.getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter$iO */
    public interface InterfaceC4239iO {
        void OXO1(View view, RecyclerView.ViewHolder viewHolder, int i);

        boolean XIi00iiXO(View view, RecyclerView.ViewHolder viewHolder, int i);
    }

    public MultiItemTypeAdapter(Context context, List<T> list) {
        this.mContext = context;
        this.mDatas = list;
    }

    public MultiItemTypeAdapter addItemViewDelegate(InterfaceC2572jc<T> interfaceC2572jc) {
        this.mItemViewDelegateManager.XIi00iiXO(interfaceC2572jc);
        return this;
    }

    public void convert(ViewHolder viewHolder, T t) {
        this.mItemViewDelegateManager.m2539iO(viewHolder, t, viewHolder.getAdapterPosition());
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
    public int getItemViewType(int i) {
        return !useItemViewDelegateManager() ? super.getItemViewType(i) : this.mItemViewDelegateManager.I0IIOi(this.mDatas.get(i), i);
    }

    public boolean isEnabled(int i) {
        return true;
    }

    public void onViewHolderCreated(ViewHolder viewHolder, View view) {
    }

    public void setListener(ViewGroup viewGroup, ViewHolder viewHolder, int i) {
        if (isEnabled(i)) {
            viewHolder.getConvertView().setOnClickListener(new OXO1(viewHolder));
            viewHolder.getConvertView().setOnLongClickListener(new XIi00iiXO(viewHolder));
        }
    }

    public void setOnItemClickListener(InterfaceC4239iO interfaceC4239iO) {
        this.mOnItemClickListener = interfaceC4239iO;
    }

    public boolean useItemViewDelegateManager() {
        return this.mItemViewDelegateManager.O00() > 0;
    }

    public MultiItemTypeAdapter addItemViewDelegate(int i, InterfaceC2572jc<T> interfaceC2572jc) {
        this.mItemViewDelegateManager.OXO1(i, interfaceC2572jc);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        convert(viewHolder, this.mDatas.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolderCreateViewHolder = ViewHolder.createViewHolder(this.mContext, viewGroup, this.mItemViewDelegateManager.XO0O10(i).XIi00iiXO());
        onViewHolderCreated(viewHolderCreateViewHolder, viewHolderCreateViewHolder.getConvertView());
        setListener(viewGroup, viewHolderCreateViewHolder, i);
        return viewHolderCreateViewHolder;
    }
}
