package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.LearnCardDataItem;
import com.sma.smartv3.model.LearnCardItemList;
import com.sma.smartv3.p610ui.device.LearnCardActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nLearnCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1869#2:316\n1869#2,2:317\n1870#2:319\n1869#2,2:320\n1869#2,2:341\n173#3,7:322\n180#3,3:330\n143#3,7:333\n183#3:340\n1#4:329\n*S KotlinDebug\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n*L\n179#1:316\n184#1:317,2\n179#1:319\n197#1:320,2\n68#1:341,2\n216#1:322,7\n216#1:330,3\n216#1:333,7\n216#1:340\n216#1:329\n*E\n"})
public final class LearnCardActivity extends BaseJLFileManageActivity {

    @tb1
    private Handler mHandler111;

    @aa1
    private final List<LearnCardItemList> mTypeFiles = new ArrayList();

    @aa1
    private Runnable myTask = new OXO1();
    private int progress1111;

    public static final class OXO1 implements Runnable {
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            LearnCardActivity.this.setProgress1111(LearnCardActivity.this.getProgress1111() + 1);
            LearnCardActivity.this.mTask();
            if (LearnCardActivity.this.getProgress1111() > 100 || (handler = LearnCardActivity.this.mHandler111) == null) {
                return;
            }
            handler.postDelayed(this, 40L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final LearnCardActivity learnCardActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (final LearnCardItemList learnCardItemList : learnCardActivity.mTypeFiles) {
            if (!learnCardItemList.getList().isEmpty()) {
                DslAdapterExKt.O10IXXX0X(learnCardActivity.getDslAdapter(), R.layout.item_learn_card_title, new Function1() { // from class: com.android.mltcode.paycertificationapi.sl
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LearnCardActivity.showList$lambda$0$0(learnCardItemList, learnCardActivity, (DslAdapterItem) obj);
                    }
                });
            }
            for (final LearnCardDataItem learnCardDataItem : learnCardItemList.getList()) {
                DslAdapterExKt.O10IXXX0X(learnCardActivity.getDslAdapter(), R.layout.item_list_audio_book_learn, new Function1() { // from class: com.android.mltcode.paycertificationapi.tl
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LearnCardActivity.showList$lambda$0$1(learnCardItemList, learnCardDataItem, learnCardActivity, (DslAdapterItem) obj);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final LearnCardItemList learnCardItemList, final LearnCardActivity learnCardActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(learnCardItemList.getTypeName()));
        dslItem.setItemGroupExtend(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ql
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LearnCardActivity.showList$lambda$0$0$0(learnCardItemList, learnCardActivity, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(learnCardItemList.getTypeName());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(final LearnCardItemList learnCardItemList, final LearnCardActivity learnCardActivity, final DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        int i2;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.learn_card_arrow_tv_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(learnCardItemList.getTypeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.learn_card_arrow_tv_content);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(learnCardItemList.getList().size() + learnCardActivity.getString(R.string.learn_card_project_tip));
        }
        final View viewM3483v = itemHolder.m3483v(R.id.learn_card_all_choose_layout);
        final ImageView imageView = (ImageView) itemHolder.m3483v(R.id.learn_card_all_choose_icon);
        if (viewM3483v != null) {
            if (learnCardActivity.getOpenDeleteType()) {
                itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.vl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LearnCardActivity.showList$lambda$0$0$0$0(learnCardItemList, imageView, learnCardActivity, view);
                    }
                });
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewM3483v.setVisibility(i2);
        }
        final ImageView imageView2 = (ImageView) itemHolder.m3483v(R.id.learn_card_arrow_icon);
        if (imageView2 != null) {
            imageView2.setImageResource(dslAdapterItem.getItemGroupExtend() ? R.drawable.learn_card_ic_arrow_closure : R.drawable.learn_card_ic_arrow_open);
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LearnCardActivity.showList$lambda$0$0$0$1(dslAdapterItem, imageView2, learnCardActivity, viewM3483v, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$0(LearnCardItemList learnCardItemList, ImageView imageView, LearnCardActivity learnCardActivity, View view) {
        learnCardItemList.setAllChoose(!learnCardItemList.isAllChoose());
        if (learnCardItemList.isAllChoose()) {
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageView);
        } else {
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageView);
        }
        for (LearnCardDataItem learnCardDataItem : learnCardItemList.getList()) {
            if (learnCardDataItem.isChoose()) {
                learnCardActivity.setDeleteNum(learnCardActivity.getDeleteNum() + 1);
            } else {
                learnCardActivity.setDeleteNum(learnCardActivity.getDeleteNum() - 1);
            }
            learnCardDataItem.setChoose(learnCardItemList.isAllChoose());
        }
        learnCardActivity.changeDeleteBtnText(learnCardActivity.getDeleteNum());
        learnCardActivity.getDslAdapter().notifyDataChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$1(DslAdapterItem dslAdapterItem, ImageView imageView, LearnCardActivity learnCardActivity, View view, View view2) {
        int i;
        dslAdapterItem.setItemGroupExtend(!dslAdapterItem.getItemGroupExtend());
        if (dslAdapterItem.getItemGroupExtend()) {
            if (learnCardActivity.getOpenDeleteType() && view != null) {
                view.setVisibility(0);
            }
            i = R.drawable.learn_card_ic_arrow_closure;
        } else {
            if (view != null) {
                view.setVisibility(8);
            }
            i = R.drawable.learn_card_ic_arrow_open;
        }
        imageView.setImageResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$1(LearnCardItemList learnCardItemList, final LearnCardDataItem learnCardDataItem, final LearnCardActivity learnCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(learnCardItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ul
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LearnCardActivity.showList$lambda$0$1$0(learnCardDataItem, learnCardActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$1$0(final LearnCardDataItem learnCardDataItem, final LearnCardActivity learnCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List payloads) {
        int i2;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(payloads, "payloads");
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(learnCardDataItem.getPath());
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(learnCardDataItem.getName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.audio_book_file_size);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText("");
        }
        final ImageView imageViewImg2 = itemHolder.img(R.id.list_item_choose_iv);
        if (learnCardDataItem.isChoose()) {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageViewImg2);
        } else {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageViewImg2);
        }
        if (learnCardActivity.getOpenDeleteType()) {
            itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.rl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LearnCardActivity.showList$lambda$0$1$0$0(learnCardDataItem, learnCardActivity, imageViewImg2, view);
                }
            });
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageViewImg2.setVisibility(i2);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$1$0$0(LearnCardDataItem learnCardDataItem, LearnCardActivity learnCardActivity, ImageView imageView, View view) {
        learnCardDataItem.setChoose(!learnCardDataItem.isChoose());
        if (learnCardDataItem.isChoose()) {
            learnCardActivity.setDeleteNum(learnCardActivity.getDeleteNum() + 1);
        } else {
            learnCardActivity.setDeleteNum(learnCardActivity.getDeleteNum() - 1);
        }
        learnCardActivity.changeDeleteBtnText(learnCardActivity.getDeleteNum());
        if (learnCardDataItem.isChoose()) {
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageView);
        } else {
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageView);
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void allSelect(boolean z) {
        super.allSelect(z);
        setDeleteNum(0);
        for (LearnCardItemList learnCardItemList : this.mTypeFiles) {
            learnCardItemList.setAllChoose(isAllSelect());
            if (isAllSelect()) {
                setDeleteNum(getDeleteNum() + learnCardItemList.getList().size());
            }
            Iterator<T> it = learnCardItemList.getList().iterator();
            while (it.hasNext()) {
                ((LearnCardDataItem) it.next()).setChoose(isAllSelect());
            }
        }
        if (getOpenDeleteType()) {
            changeDeleteBtnText(getDeleteNum());
        }
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void confirmDeleteFile() {
        super.confirmDeleteFile();
        Iterator<T> it = this.mTypeFiles.iterator();
        while (it.hasNext()) {
            Iterator<LearnCardDataItem> it2 = ((LearnCardItemList) it.next()).getList().iterator();
            while (it2.hasNext()) {
                if (it2.next().isChoose()) {
                    it2.remove();
                }
            }
        }
        showList();
        setOpenDeleteType(false);
        changeActivityState();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void getFile() {
        super.getFile();
        String string = getTvFreeSpace().getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", string);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) OnLineLearningFileActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 255);
    }

    @aa1
    public final List<LearnCardItemList> getMTypeFiles() {
        return this.mTypeFiles;
    }

    @aa1
    public final Runnable getMyTask() {
        return this.myTask;
    }

    public final int getProgress1111() {
        return this.progress1111;
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.item_learn_card_title));
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_audio_book_learn;
    }

    public final void mTask() {
        getTvProgressTip().setText(R.string.transfering);
        getTvName().setText(getString(R.string.waiting));
        getTvTotalProgress().setText("");
        getPbProgress().setProgress(this.progress1111);
        getTvProgress().setText(this.progress1111 + "%");
        if (this.progress1111 > 100) {
            getTaskPanel().setVisibility(8);
            getRecyclerView().setVisibility(0);
            getRecyclerViewTitle().setVisibility(0);
            getRightBtn().setVisibility(0);
            Handler handler = this.mHandler111;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.mHandler111 = null;
            showList();
        }
        i1O0OXO1O.OXO1.OXO1("mTask  ---------- >  progress = " + this.progress1111);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 255 && i2 == -1) {
            if (this.mHandler111 == null) {
                this.mHandler111 = new Handler(Looper.getMainLooper());
            }
            this.progress1111 = 0;
            getTaskPanel().setVisibility(0);
            getRecyclerView().setVisibility(8);
            getTvProgressTip().setText(R.string.studycard_transmission_tip);
            getRightBtn().setVisibility(8);
            getRecyclerViewTitle().setVisibility(8);
            getTvCancel().setVisibility(0);
            getTvRetry().setVisibility(8);
            Handler handler = this.mHandler111;
            if (handler != null) {
                handler.postDelayed(this.myTask, 40L);
            }
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getOpenDeleteType()) {
            showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.audio_book_delete_pop_content, R.string.audio_book_delete_pop_sure);
        } else {
            getFile();
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        showList();
    }

    public final void setMyTask(@aa1 Runnable runnable) {
        Intrinsics.X0O(runnable, "<set-?>");
        this.myTask = runnable;
    }

    public final void setProgress1111(int i) {
        this.progress1111 = i;
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void showList() {
        super.showList();
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.pl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LearnCardActivity.showList$lambda$0(this.f10385IO, (DslAdapter) obj);
            }
        });
    }
}
