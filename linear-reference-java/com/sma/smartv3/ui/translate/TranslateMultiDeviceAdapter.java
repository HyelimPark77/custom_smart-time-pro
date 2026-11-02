package com.sma.smartv3.ui.translate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.iXXiX1O1;
import com.android.mltcode.paycertificationapi.m06;
import com.android.mltcode.paycertificationapi.n06;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.sma.smartv3.databinding.ItemAuraBinauralLeftBinding;
import com.sma.smartv3.databinding.ItemAuraBinauralRightBinding;
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
    public static final OXO1 Companion = null;
    public static final int TYPE_EAR = 1;
    public static final int TYPE_PHONE = 2;

    @aa1
    private final List<iOIXXXII0> dataList;

    @tb1
    private XIi00iiXO playListener;
    private boolean showTranslation;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public final class TranslateRecordEarViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemAuraBinauralLeftBinding binding;
        final /* synthetic */ TranslateMultiDeviceAdapter this$0;

        public TranslateRecordEarViewHolder(@aa1 TranslateMultiDeviceAdapter r2, ItemAuraBinauralLeftBinding r3) {
            Intrinsics.X0O(r3, "binding");
            this.this$0 = r2;
            super(r3.getRoot());
            this.binding = r3;
        }

        public static /* synthetic */ void OXO1(TranslateMultiDeviceAdapter r0, iOIXXXII0 r1, View r2) {
            bind$lambda$0(r0, r1, r2);
        }

        private static final void bind$lambda$0(TranslateMultiDeviceAdapter r0, iOIXXXII0 r1, View r2) {
            XIi00iiXO r3 = TranslateMultiDeviceAdapter.access$getPlayListener$p(r0);
            if (r3 == null) goto L6;
            String r4 = r1.O10IXXX0X();
            Intrinsics.XXI(r4);
            r3.play(r4);
            return;
        }

        public final void bind(@aa1 final iOIXXXII0 r5) {
            Intrinsics.X0O(r5, MapController.ITEM_LAYER_TAG);
            this.binding.tvOriginal.setText(String.valueOf(r5.XX0()));
            if (TranslateMultiDeviceAdapter.access$getShowTranslation$p(this.this$0) == false) goto L10;
            String r0 = r5.XiOIii1();
            if (r0 == null) goto L10;
            if (r0.length() == 0) goto L10;
            this.binding.tvTranslated.setText(String.valueOf(r5.XiOIii1()));
            this.binding.tvTranslated.setVisibility(0);
        L11:
            String r1 = r5.O10IXXX0X();
            if (r1 != null) goto L14;
        L22:
            this.binding.ivPlay.setVisibility(8);
            return;
        L14:
            if (r1.length() == 0) goto L22;
            if (TranslateMultiDeviceAdapter.access$getShowTranslation$p(this.this$0) == false) goto L22;
            if (TranslateMultiDeviceAdapter.access$getPlayListener$p(this.this$0) == null) goto L22;
            this.binding.ivPlay.setVisibility(0);
            FrameLayout r2 = this.binding.getRoot();
            final TranslateMultiDeviceAdapter r3 = this.this$0;
            r2.setOnClickListener(new m06(r3, r5));
            return;
        L10:
            this.binding.tvTranslated.setVisibility(8);
            goto L11
        }
    }

    public final class TranslateRecordPhoneViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemAuraBinauralRightBinding binding;
        final /* synthetic */ TranslateMultiDeviceAdapter this$0;

        public TranslateRecordPhoneViewHolder(@aa1 TranslateMultiDeviceAdapter r2, ItemAuraBinauralRightBinding r3) {
            Intrinsics.X0O(r3, "binding");
            this.this$0 = r2;
            super(r3.getRoot());
            this.binding = r3;
        }

        public static /* synthetic */ void OXO1(TranslateMultiDeviceAdapter r0, iOIXXXII0 r1, View r2) {
            bind$lambda$0(r0, r1, r2);
        }

        private static final void bind$lambda$0(TranslateMultiDeviceAdapter r0, iOIXXXII0 r1, View r2) {
            XIi00iiXO r3 = TranslateMultiDeviceAdapter.access$getPlayListener$p(r0);
            if (r3 == null) goto L6;
            String r4 = r1.O10IXXX0X();
            Intrinsics.XXI(r4);
            r3.play(r4);
            return;
        }

        public final void bind(@aa1 final iOIXXXII0 r5) {
            Intrinsics.X0O(r5, MapController.ITEM_LAYER_TAG);
            this.binding.tvOriginal.setText(String.valueOf(r5.XX0()));
            i1O0OXO1O.OXO1.OXO1("showTranslation:" + TranslateMultiDeviceAdapter.access$getShowTranslation$p(this.this$0));
            if (TranslateMultiDeviceAdapter.access$getShowTranslation$p(this.this$0) == false) goto L10;
            String r0 = r5.XiOIii1();
            if (r0 == null) goto L10;
            if (r0.length() == 0) goto L10;
            this.binding.tvTranslated.setText(String.valueOf(r5.XiOIii1()));
            this.binding.tvTranslated.setVisibility(0);
        L11:
            String r1 = r5.O10IXXX0X();
            if (r1 != null) goto L14;
        L22:
            this.binding.ivPlay.setVisibility(8);
            return;
        L14:
            if (r1.length() == 0) goto L22;
            if (TranslateMultiDeviceAdapter.access$getShowTranslation$p(this.this$0) == false) goto L22;
            if (TranslateMultiDeviceAdapter.access$getPlayListener$p(this.this$0) == null) goto L22;
            this.binding.ivPlay.setVisibility(0);
            FrameLayout r2 = this.binding.getRoot();
            final TranslateMultiDeviceAdapter r3 = this.this$0;
            r2.setOnClickListener(new n06(r3, r5));
            return;
        L10:
            this.binding.tvTranslated.setVisibility(8);
            goto L11
        }
    }

    public interface XIi00iiXO {
        void play(@aa1 String r1);
    }

    static {
        Companion = new OXO1(null);
    }

    public TranslateMultiDeviceAdapter() {
        this.dataList = new ArrayList();
        this.showTranslation = true;
    }

    public static final /* synthetic */ XIi00iiXO access$getPlayListener$p(TranslateMultiDeviceAdapter r0) {
        return r0.playListener;
    }

    public static final /* synthetic */ boolean access$getShowTranslation$p(TranslateMultiDeviceAdapter r0) {
        return r0.showTranslation;
    }

    public final void add(@aa1 iOIXXXII0 r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1("MultiDeviceAdd " + r4);
        this.dataList.add(r4);
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
    public int getItemViewType(int r2) {
        Integer r3 = this.dataList.get(r2).X0O();
        if (r3 != null) goto L5;
        return 0;
    L5:
        return r3.intValue();
    }

    public final void hideTranslation() {
        this.showTranslation = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 RecyclerView.ViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        int r0 = r3.getItemViewType();
        if (r0 != 1) goto L5;
        ((TranslateRecordEarViewHolder) r3).bind(this.dataList.get(r4));
        return;
    L5:
        if (r0 == 2) goto L8;
        ((TranslateRecordEarViewHolder) r3).bind(this.dataList.get(r4));
        return;
    L8:
        ((TranslateRecordPhoneViewHolder) r3).bind(this.dataList.get(r4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public RecyclerView.ViewHolder onCreateViewHolder(@aa1 ViewGroup r3, int r4) {
        Intrinsics.X0O(r3, "parent");
        if (r4 != 1) goto L5;
        ViewBinding r5 = iXXiX1O1.OXO1(this, r3, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1.INSTANCE);
        Intrinsics.O10IXXX0X(r5, "createViewHolder(...)");
        return new TranslateRecordEarViewHolder(this, (ItemAuraBinauralLeftBinding) r5);
    L5:
        if (r4 == 2) goto L8;
        ViewBinding r6 = iXXiX1O1.OXO1(this, r3, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$3.INSTANCE);
        Intrinsics.O10IXXX0X(r6, "createViewHolder(...)");
        return new TranslateRecordEarViewHolder(this, (ItemAuraBinauralLeftBinding) r6);
    L8:
        ViewBinding r7 = iXXiX1O1.OXO1(this, r3, TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2.INSTANCE);
        Intrinsics.O10IXXX0X(r7, "createViewHolder(...)");
        return new TranslateRecordPhoneViewHolder(this, (ItemAuraBinauralRightBinding) r7);
    }

    public final void setPlayListener(@tb1 XIi00iiXO r1) {
        this.playListener = r1;
    }

    public final void submitData(@aa1 List<iOIXXXII0> r2) {
        Intrinsics.X0O(r2, "data");
        this.dataList.clear();
        this.dataList.addAll(r2);
        notifyDataSetChanged();
    }

    public final void update(@aa1 iOIXXXII0 r3) {
        Intrinsics.X0O(r3, "data");
        if (this.dataList.isEmpty() == true) goto L6;
        iOIXXXII0 r0 = (iOIXXXII0) CollectionsKt___CollectionsKt.Xi1XO00(this.dataList);
        r0.O1O(String.valueOf(r3.XX0()));
        r0.iI(String.valueOf(r3.XiOIii1()));
        r0.iX1O1(r3.OII());
        notifyItemChanged(this.dataList.size() - 1);
        return;
    L6:
        add(r3);
    }

    public final void updateAudioPath(@tb1 String r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length() == 0) goto L28;
        List<iOIXXXII0> r0 = this.dataList;
        ListIterator<iOIXXXII0> r1 = r0.listIterator(r0.size());
    L8:
        if (r1.hasPrevious() == false) goto L15;
        iOIXXXII0 r2 = r1.previous();
        Integer r3 = r2.OII();
        if (r3 == null) goto L8;
        if (r3.intValue() != 1) goto L8;
    L16:
        iOIXXXII0 r4 = r2;
        if (r4 == null) goto L27;
        r4.iOOX010X(r5);
        notifyItemChanged(this.dataList.size() - 1);
        return;
    L27:
        return;
    L15:
        r2 = null;
        goto L16
    }

    public final void updateLastAudioPathByEmpty(@aa1 String r4) {
        Intrinsics.X0O(r4, "path");
        if (this.dataList.isEmpty() == true) goto L20;
        List<iOIXXXII0> r0 = this.dataList;
        ListIterator<iOIXXXII0> r1 = r0.listIterator(r0.size());
    L6:
        if (r1.hasPrevious() == false) goto L12;
        String r2 = r1.previous().O10IXXX0X();
        if (r2 == null) goto L11;
        if (r2.length() != 0) goto L6;
    L11:
        int r3 = r1.nextIndex();
    L13:
        if (r3 == (-1)) goto L21;
        this.dataList.get(r3).iOOX010X(r4);
        notifyItemChanged(r3);
        return;
    L21:
        return;
    L12:
        r3 = -1;
        goto L13
    }

    public final void updateLastAudioPathByTTSEnd(@aa1 String r5) {
        Intrinsics.X0O(r5, "path");
        i1O0OXO1O.OXO1.OXO1("Adapter update size:" + this.dataList.size() + " path:" + r5);
        if (this.dataList.isEmpty() == true) goto L23;
        List<iOIXXXII0> r0 = this.dataList;
        ListIterator<iOIXXXII0> r1 = r0.listIterator(r0.size());
    L6:
        if (r1.hasPrevious() == false) goto L13;
        Integer r2 = r1.previous().OII();
        if (r2 == null) goto L6;
        if (r2.intValue() != 1) goto L6;
        int r3 = r1.nextIndex();
    L14:
        if (r3 == (-1)) goto L24;
        this.dataList.get(r3).iOOX010X(r5);
        notifyItemChanged(r3);
        return;
    L24:
        return;
    L13:
        r3 = -1;
        goto L14
    }
}
