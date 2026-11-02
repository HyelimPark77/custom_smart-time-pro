package com.sma.smartv3.pop.dial;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.IO0I100XX;
import com.android.mltcode.paycertificationapi.OX1XiiIi;
import com.android.mltcode.paycertificationapi.Oi1iO00iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DialPointerPopup extends I0OIO1i {

    @aa1
    public final RecyclerView I0IIOi;

    @aa1
    public final Button IO;

    @aa1
    public final RecyclerView OIi0;

    /* JADX INFO: renamed from: com.sma.smartv3.pop.dial.DialPointerPopup$3, reason: invalid class name */
    public static final class AnonymousClass3 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ IO0I100XX<Integer> $callback;

        public AnonymousClass3(Activity r1, List<ResourcesIdInfo> r2, IO0I100XX<Integer> r3) {
            this.$callback = r3;
            super(r1, R.layout.item_pointer_select, r2);
        }

        public static /* synthetic */ void OXO1(AnonymousClass3 r0, ResourcesIdInfo r1, IO0I100XX r2, int r3, View r4) {
            convert$lambda$0(r0, r1, r2, r3, r4);
        }

        private static final void convert$lambda$0(AnonymousClass3 r2, ResourcesIdInfo r3, IO0I100XX r4, int r5, View r6) {
            Iterator r7 = r2.mDatas.iterator();
        L4:
            if (r7.hasNext() == false) goto L6;
            ((ResourcesIdInfo) r7.next()).setSelect(false);
            goto L4
        L6:
            r3.setSelect(true);
            r4.OXO1(Integer.valueOf(r5));
            r2.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, final ResourcesIdInfo r4, final int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, "resourcesIdInfo");
            ((ImageView) r3.getView(R.id.pointerIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r1 = 0;
        L6:
            r0.setVisibility(r1);
            RelativeLayout r6 = (RelativeLayout) r3.getView(R.id.rv);
            final IO0I100XX<Integer> r2 = this.$callback;
            r6.setOnClickListener(new Oi1iO00iX(this, r4, r2, r5));
            return;
        L5:
            r1 = 8;
            goto L6
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.pop.dial.DialPointerPopup$4, reason: invalid class name */
    public static final class AnonymousClass4 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ IO0I100XX<Integer> $callback;

        public AnonymousClass4(Activity r1, List<ResourcesIdInfo> r2, IO0I100XX<Integer> r3) {
            this.$callback = r3;
            super(r1, R.layout.item_pointer_select, r2);
        }

        public static /* synthetic */ void OXO1(AnonymousClass4 r0, ResourcesIdInfo r1, IO0I100XX r2, int r3, View r4) {
            convert$lambda$0(r0, r1, r2, r3, r4);
        }

        private static final void convert$lambda$0(AnonymousClass4 r2, ResourcesIdInfo r3, IO0I100XX r4, int r5, View r6) {
            Iterator r7 = r2.mDatas.iterator();
        L4:
            if (r7.hasNext() == false) goto L6;
            ((ResourcesIdInfo) r7.next()).setSelect(false);
            goto L4
        L6:
            r3.setSelect(true);
            r4.XIi00iiXO(Integer.valueOf(r5));
            r2.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, final ResourcesIdInfo r4, final int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, "resourcesIdInfo");
            ((ImageView) r3.getView(R.id.pointerIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r1 = 0;
        L6:
            r0.setVisibility(r1);
            RelativeLayout r6 = (RelativeLayout) r3.getView(R.id.rv);
            final IO0I100XX<Integer> r2 = this.$callback;
            r6.setOnClickListener(new OX1XiiIi(this, r4, r2, r5));
            return;
        L5:
            r1 = 8;
            goto L6
        }
    }

    public DialPointerPopup(@aa1 Activity r6, @aa1 List<ResourcesIdInfo> r7, @aa1 List<ResourcesIdInfo> r8, @aa1 IO0I100XX<Integer> r9) {
        Intrinsics.X0O(r6, "activity");
        Intrinsics.X0O(r7, "pointers");
        Intrinsics.X0O(r8, "scales");
        Intrinsics.X0O(r9, "callback");
        super(r6);
        LayoutInflater.from(XO0O10()).inflate(R.layout.pop_dial_point, IiI10X());
        View r0 = IiI10X().findViewById(R.id.rvPointer);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        RecyclerView r1 = (RecyclerView) r0;
        this.I0IIOi = r1;
        View r2 = IiI10X().findViewById(R.id.rvScale);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        RecyclerView r3 = (RecyclerView) r2;
        this.OIi0 = r3;
        View r4 = IiI10X().findViewById(R.id.confirmButton);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        Button r5 = (Button) r4;
        this.IO = r5;
        r5.setVisibility(8);
        LinearLayoutManager r10 = new LinearLayoutManager(r6);
        r10.setOrientation(0);
        r1.setLayoutManager(r10);
        LinearLayoutManager r11 = new LinearLayoutManager(r6);
        r11.setOrientation(0);
        r3.setLayoutManager(r11);
        r1.setAdapter(new AnonymousClass3(r6, r7, r9));
        r3.setAdapter(new AnonymousClass4(r6, r8, r9));
    }

    @aa1
    public final RecyclerView OII() {
        return this.OIi0;
    }

    @aa1
    public final Button OiIIX101O() {
        return this.IO;
    }

    @aa1
    public final RecyclerView XiOIii1() {
        return this.I0IIOi;
    }
}
