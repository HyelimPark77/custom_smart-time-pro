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
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pop.dial.DialPointerPopup;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DialPointerPopup extends I0OIO1i {

    @aa1
    public final RecyclerView I0IIOi;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Button f51371IO;

    @aa1
    public final RecyclerView OIi0;

    /* JADX INFO: renamed from: com.sma.smartv3.pop.dial.DialPointerPopup$3 */
    public static final class C186393 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ IO0I100XX<Integer> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186393(Activity activity, List<ResourcesIdInfo> list, IO0I100XX<Integer> io0i100xx) {
            super(activity, R.layout.item_pointer_select, list);
            this.$callback = io0i100xx;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C186393 c186393, ResourcesIdInfo resourcesIdInfo, IO0I100XX io0i100xx, int i, View view) {
            Iterator it = ((CommonAdapter) c186393).mDatas.iterator();
            while (it.hasNext()) {
                ((ResourcesIdInfo) it.next()).setSelect(false);
            }
            resourcesIdInfo.setSelect(true);
            io0i100xx.OXO1(Integer.valueOf(i));
            c186393.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.pointerIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final IO0I100XX<Integer> io0i100xx = this.$callback;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi1iO00iX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialPointerPopup.C186393.convert$lambda$0(this.f3694IO, resourcesIdInfo, io0i100xx, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.pop.dial.DialPointerPopup$4 */
    public static final class C186404 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ IO0I100XX<Integer> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186404(Activity activity, List<ResourcesIdInfo> list, IO0I100XX<Integer> io0i100xx) {
            super(activity, R.layout.item_pointer_select, list);
            this.$callback = io0i100xx;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C186404 c186404, ResourcesIdInfo resourcesIdInfo, IO0I100XX io0i100xx, int i, View view) {
            Iterator it = ((CommonAdapter) c186404).mDatas.iterator();
            while (it.hasNext()) {
                ((ResourcesIdInfo) it.next()).setSelect(false);
            }
            resourcesIdInfo.setSelect(true);
            io0i100xx.XIi00iiXO(Integer.valueOf(i));
            c186404.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.pointerIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final IO0I100XX<Integer> io0i100xx = this.$callback;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OX1XiiIi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialPointerPopup.C186404.convert$lambda$0(this.f3445IO, resourcesIdInfo, io0i100xx, i, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialPointerPopup(@aa1 Activity activity, @aa1 List<ResourcesIdInfo> pointers, @aa1 List<ResourcesIdInfo> scales, @aa1 IO0I100XX<Integer> callback) {
        super(activity);
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(pointers, "pointers");
        Intrinsics.X0O(scales, "scales");
        Intrinsics.X0O(callback, "callback");
        LayoutInflater.from(XO0O10()).inflate(R.layout.pop_dial_point, IiI10X());
        View viewFindViewById = IiI10X().findViewById(R.id.rvPointer);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.I0IIOi = recyclerView;
        View viewFindViewById2 = IiI10X().findViewById(R.id.rvScale);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById2;
        this.OIi0 = recyclerView2;
        View viewFindViewById3 = IiI10X().findViewById(R.id.confirmButton);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        Button button = (Button) viewFindViewById3;
        this.f51371IO = button;
        button.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(activity);
        linearLayoutManager2.setOrientation(0);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView.setAdapter(new C186393(activity, pointers, callback));
        recyclerView2.setAdapter(new C186404(activity, scales, callback));
    }

    @aa1
    public final RecyclerView OII() {
        return this.OIi0;
    }

    @aa1
    public final Button OiIIX101O() {
        return this.f51371IO;
    }

    @aa1
    public final RecyclerView XiOIii1() {
        return this.I0IIOi;
    }
}
