package com.sma.smartv3.p610ui.translate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.iXXiX1O1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.databinding.ItemAuraBinauralLeftBinding;
import com.sma.smartv3.databinding.ItemAuraBinauralRightBinding;
import com.sma.smartv3.p610ui.translate.TranslateMultiDeviceAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTranslateMultiDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n388#2,7:194\n388#2,7:201\n543#2,6:208\n*S KotlinDebug\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n*L\n61#1:194,7\n71#1:201,7\n85#1:208,6\n*E\n"})
public final class TranslateMultiDeviceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int TYPE_EAR = 1;
    public static final int TYPE_PHONE = 2;

    @tb1
    private XIi00iiXO playListener;

    @aa1
    private final List<iOIXXXII0> dataList = new ArrayList();
    private boolean showTranslation = true;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public final class TranslateRecordEarViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemAuraBinauralLeftBinding binding;
        final /* synthetic */ TranslateMultiDeviceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranslateRecordEarViewHolder(@aa1 TranslateMultiDeviceAdapter translateMultiDeviceAdapter, ItemAuraBinauralLeftBinding binding) {
            super(binding.getRoot());
            Intrinsics.X0O(binding, "binding");
            this.this$0 = translateMultiDeviceAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(TranslateMultiDeviceAdapter translateMultiDeviceAdapter, iOIXXXII0 ioixxxii0, View view) {
            XIi00iiXO xIi00iiXO = translateMultiDeviceAdapter.playListener;
            if (xIi00iiXO != null) {
                String strO10IXXX0X = ioixxxii0.O10IXXX0X();
                Intrinsics.XXI(strO10IXXX0X);
                xIi00iiXO.play(strO10IXXX0X);
            }
        }

        public final void bind(@aa1 final iOIXXXII0 item) {
            String strXiOIii1;
            Intrinsics.X0O(item, "item");
            this.binding.tvOriginal.setText(String.valueOf(item.XX0()));
            if (!this.this$0.showTranslation || (strXiOIii1 = item.XiOIii1()) == null || strXiOIii1.length() == 0) {
                this.binding.tvTranslated.setVisibility(8);
            } else {
                this.binding.tvTranslated.setText(String.valueOf(item.XiOIii1()));
                this.binding.tvTranslated.setVisibility(0);
            }
            String strO10IXXX0X = item.O10IXXX0X();
            if (strO10IXXX0X == null || strO10IXXX0X.length() == 0 || !this.this$0.showTranslation || this.this$0.playListener == null) {
                this.binding.ivPlay.setVisibility(8);
                return;
            }
            this.binding.ivPlay.setVisibility(0);
            FrameLayout root = this.binding.getRoot();
            final TranslateMultiDeviceAdapter translateMultiDeviceAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.m06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateMultiDeviceAdapter.TranslateRecordEarViewHolder.bind$lambda$0(translateMultiDeviceAdapter, item, view);
                }
            });
        }
    }

    public final class TranslateRecordPhoneViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemAuraBinauralRightBinding binding;
        final /* synthetic */ TranslateMultiDeviceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranslateRecordPhoneViewHolder(@aa1 TranslateMultiDeviceAdapter translateMultiDeviceAdapter, ItemAuraBinauralRightBinding binding) {
            super(binding.getRoot());
            Intrinsics.X0O(binding, "binding");
            this.this$0 = translateMultiDeviceAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(TranslateMultiDeviceAdapter translateMultiDeviceAdapter, iOIXXXII0 ioixxxii0, View view) {
            XIi00iiXO xIi00iiXO = translateMultiDeviceAdapter.playListener;
            if (xIi00iiXO != null) {
                String strO10IXXX0X = ioixxxii0.O10IXXX0X();
                Intrinsics.XXI(strO10IXXX0X);
                xIi00iiXO.play(strO10IXXX0X);
            }
        }

        public final void bind(@aa1 final iOIXXXII0 item) {
            String strXiOIii1;
            Intrinsics.X0O(item, "item");
            this.binding.tvOriginal.setText(String.valueOf(item.XX0()));
            i1O0OXO1O.OXO1.OXO1("showTranslation:" + this.this$0.showTranslation);
            if (!this.this$0.showTranslation || (strXiOIii1 = item.XiOIii1()) == null || strXiOIii1.length() == 0) {
                this.binding.tvTranslated.setVisibility(8);
            } else {
                this.binding.tvTranslated.setText(String.valueOf(item.XiOIii1()));
                this.binding.tvTranslated.setVisibility(0);
            }
            String strO10IXXX0X = item.O10IXXX0X();
            if (strO10IXXX0X == null || strO10IXXX0X.length() == 0 || !this.this$0.showTranslation || this.this$0.playListener == null) {
                this.binding.ivPlay.setVisibility(8);
                return;
            }
            this.binding.ivPlay.setVisibility(0);
            FrameLayout root = this.binding.getRoot();
            final TranslateMultiDeviceAdapter translateMultiDeviceAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.n06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateMultiDeviceAdapter.TranslateRecordPhoneViewHolder.bind$lambda$0(translateMultiDeviceAdapter, item, view);
                }
            });
        }
    }

    public interface XIi00iiXO {
        void play(@aa1 String str);
    }

    public final void add(@aa1 iOIXXXII0 data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("MultiDeviceAdd " + data);
        this.dataList.add(data);
        notifyItemChanged(this.dataList.size() + (-1));
    }

    public final void clear() {
        this.dataList.clear();
        notifyDataSetChanged();
    }

    @aa1
    public final List<iOIXXXII0> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Integer numX0O = this.dataList.get(i).X0O();
        if (numX0O != null) {
            return numX0O.intValue();
        }
        return 0;
    }

    public final void hideTranslation() {
        this.showTranslation = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 RecyclerView.ViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            ((TranslateRecordEarViewHolder) holder).bind(this.dataList.get(i));
        } else if (itemViewType != 2) {
            ((TranslateRecordEarViewHolder) holder).bind(this.dataList.get(i));
        } else {
            ((TranslateRecordPhoneViewHolder) holder).bind(this.dataList.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public RecyclerView.ViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        if (i == 1) {
            ViewBinding viewBindingOXO1 = iXXiX1O1.OXO1(this, parent, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1.INSTANCE);
            Intrinsics.O10IXXX0X(viewBindingOXO1, "createViewHolder(...)");
            return new TranslateRecordEarViewHolder(this, (ItemAuraBinauralLeftBinding) viewBindingOXO1);
        }
        if (i != 2) {
            ViewBinding viewBindingOXO2 = iXXiX1O1.OXO1(this, parent, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$3.INSTANCE);
            Intrinsics.O10IXXX0X(viewBindingOXO2, "createViewHolder(...)");
            return new TranslateRecordEarViewHolder(this, (ItemAuraBinauralLeftBinding) viewBindingOXO2);
        }
        ViewBinding viewBindingOXO3 = iXXiX1O1.OXO1(this, parent, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2.INSTANCE);
        Intrinsics.O10IXXX0X(viewBindingOXO3, "createViewHolder(...)");
        return new TranslateRecordPhoneViewHolder(this, (ItemAuraBinauralRightBinding) viewBindingOXO3);
    }

    public final void setPlayListener(@tb1 XIi00iiXO xIi00iiXO) {
        this.playListener = xIi00iiXO;
    }

    public final void submitData(@aa1 List<iOIXXXII0> data) {
        Intrinsics.X0O(data, "data");
        this.dataList.clear();
        this.dataList.addAll(data);
        notifyDataSetChanged();
    }

    public final void update(@aa1 iOIXXXII0 data) {
        Intrinsics.X0O(data, "data");
        if (this.dataList.isEmpty()) {
            add(data);
            return;
        }
        iOIXXXII0 ioixxxii0 = (iOIXXXII0) CollectionsKt___CollectionsKt.Xi1XO00(this.dataList);
        ioixxxii0.O1O(String.valueOf(data.XX0()));
        ioixxxii0.m2112iI(String.valueOf(data.XiOIii1()));
        ioixxxii0.iX1O1(data.OII());
        notifyItemChanged(this.dataList.size() - 1);
    }

    public final void updateAudioPath(@tb1 String str) {
        iOIXXXII0 ioixxxii0Previous;
        if (str == null || str.length() == 0) {
            return;
        }
        List<iOIXXXII0> list = this.dataList;
        ListIterator<iOIXXXII0> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                ioixxxii0Previous = null;
                break;
            }
            ioixxxii0Previous = listIterator.previous();
            Integer numOII = ioixxxii0Previous.OII();
            if (numOII != null && numOII.intValue() == 1) {
                break;
            }
        }
        iOIXXXII0 ioixxxii0 = ioixxxii0Previous;
        if (ioixxxii0 != null) {
            ioixxxii0.iOOX010X(str);
            notifyItemChanged(this.dataList.size() - 1);
        }
    }

    public final void updateLastAudioPathByEmpty(@aa1 String path) {
        int iNextIndex;
        Intrinsics.X0O(path, "path");
        if (this.dataList.isEmpty()) {
            return;
        }
        List<iOIXXXII0> list = this.dataList;
        ListIterator<iOIXXXII0> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            String strO10IXXX0X = listIterator.previous().O10IXXX0X();
            if (strO10IXXX0X == null || strO10IXXX0X.length() == 0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            this.dataList.get(iNextIndex).iOOX010X(path);
            notifyItemChanged(iNextIndex);
        }
    }

    public final void updateLastAudioPathByTTSEnd(@aa1 String path) {
        int iNextIndex;
        Intrinsics.X0O(path, "path");
        i1O0OXO1O.OXO1.OXO1("Adapter update size:" + this.dataList.size() + " path:" + path);
        if (this.dataList.isEmpty()) {
            return;
        }
        List<iOIXXXII0> list = this.dataList;
        ListIterator<iOIXXXII0> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Integer numOII = listIterator.previous().OII();
            if (numOII != null && numOII.intValue() == 1) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            this.dataList.get(iNextIndex).iOOX010X(path);
            notifyItemChanged(iNextIndex);
        }
    }
}
