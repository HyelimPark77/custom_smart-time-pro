package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.pl;
import com.android.mltcode.paycertificationapi.ql;
import com.android.mltcode.paycertificationapi.rl;
import com.android.mltcode.paycertificationapi.sl;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tl;
import com.android.mltcode.paycertificationapi.ul;
import com.android.mltcode.paycertificationapi.vl;
import com.android.mltcode.paycertificationapi.wl;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.LearnCardDataItem;
import com.sma.smartv3.model.LearnCardItemList;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nLearnCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1869#2:316\n1869#2,2:317\n1870#2:319\n1869#2,2:320\n1869#2,2:341\n173#3,7:322\n180#3,3:330\n143#3,7:333\n183#3:340\n1#4:329\n*S KotlinDebug\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n*L\n179#1:316\n184#1:317,2\n179#1:319\n197#1:320,2\n68#1:341,2\n216#1:322,7\n216#1:330,3\n216#1:333,7\n216#1:340\n216#1:329\n*E\n"})
public final class LearnCardActivity extends BaseJLFileManageActivity {

    @tb1
    private Handler mHandler111;

    @aa1
    private final List<LearnCardItemList> mTypeFiles;

    @aa1
    private Runnable myTask;
    private int progress1111;

    public static final class OXO1 implements Runnable {
        public final /* synthetic */ LearnCardActivity IO;

        public OXO1(LearnCardActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            int r0 = this.IO.getProgress1111();
            this.IO.setProgress1111(r0 + 1);
            this.IO.mTask();
            if (this.IO.getProgress1111() > 100) goto L8;
            Handler r1 = LearnCardActivity.access$getMHandler111$p(this.IO);
            if (r1 == null) goto L9;
            r1.postDelayed(this, 40);
            return;
        L9:
            return;
        }
    }

    public LearnCardActivity() {
        this.mTypeFiles = new ArrayList();
        this.myTask = new OXO1(this);
    }

    public static /* synthetic */ Unit X0i1O(LearnCardItemList r0, LearnCardDataItem r1, LearnCardActivity r2, DslAdapterItem r3) {
        return showList$lambda$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X11iII1O1(LearnCardDataItem r0, LearnCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showList$lambda$0$1$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void X1IX(LearnCardItemList r0, ImageView r1, LearnCardActivity r2, View r3) {
        showList$lambda$0$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XXIIO1i11(DslAdapterItem r0, ImageView r1, LearnCardActivity r2, View r3, View r4) {
        showList$lambda$0$0$0$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XXX11i(LearnCardItemList r0, LearnCardActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    public static final /* synthetic */ Handler access$getMHandler111$p(LearnCardActivity r0) {
        return r0.mHandler111;
    }

    public static /* synthetic */ void iI(LearnCardDataItem r0, LearnCardActivity r1, ImageView r2, View r3) {
        showList$lambda$0$1$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit iIXi1iiXI(LearnCardActivity r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iX1O1(LearnCardItemList r0, LearnCardActivity r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    private static final Unit showList$lambda$0(final LearnCardActivity r5, DslAdapter r6) {
        Intrinsics.X0O(r6, "$this$renderAdapter");
        Iterator<LearnCardItemList> r7 = r5.mTypeFiles.iterator();
    L4:
        if (r7.hasNext() == false) goto L13;
        final LearnCardItemList r0 = r7.next();
        if (r0.getList().isEmpty() == true) goto L8;
        DslAdapterExKt.O10IXXX0X(r5.getDslAdapter(), R.layout.item_learn_card_title, new sl(r0, r5));
    L8:
        Iterator<LearnCardDataItem> r1 = r0.getList().iterator();
    L10:
        if (r1.hasNext() == false) goto L4;
        final LearnCardDataItem r2 = r1.next();
        DslAdapterExKt.O10IXXX0X(r5.getDslAdapter(), R.layout.item_list_audio_book_learn, new tl(r0, r2, r5));
        goto L10
    L13:
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final LearnCardItemList r2, final LearnCardActivity r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemIsGroupHead(true);
        r4.setItemIsHover(false);
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r2.getTypeName()}));
        r4.setItemGroupExtend(false);
        r4.setItemBindOverride(new ql(r2, r3, r4));
        r4.setItemTag(r2.getTypeName());
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(final LearnCardItemList r1, final LearnCardActivity r2, final DslAdapterItem r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "<unused var>");
        Intrinsics.X0O(r7, "<unused var>");
        TextView r8 = r4.tv(R.id.learn_card_arrow_tv_title);
        if (r8 == null) goto L5;
        r8.setText(r1.getTypeName());
    L5:
        TextView r9 = r4.tv(R.id.learn_card_arrow_tv_content);
        if (r9 == null) goto L8;
        r9.setText(r1.getList().size() + r2.getString(R.string.learn_card_project_tip));
    L8:
        final View r10 = r4.v(R.id.learn_card_all_choose_layout);
        final ImageView r11 = (ImageView) r4.v(R.id.learn_card_all_choose_icon);
        if (r10 != null) goto L11;
    L15:
        final ImageView r12 = (ImageView) r4.v(R.id.learn_card_arrow_icon);
        if (r12 != null) goto L18;
    L22:
        if (r12 == null) goto L25;
        r12.setOnClickListener(new wl(r3, r12, r2, r10));
    L25:
        return Unit.OXO1;
    L18:
        if (r3.getItemGroupExtend() == false) goto L20;
        int r13 = R.drawable.learn_card_ic_arrow_closure;
    L21:
        r12.setImageResource(r13);
        goto L22
    L20:
        r13 = R.drawable.learn_card_ic_arrow_open;
        goto L21
    L11:
        if (r2.getOpenDeleteType() == false) goto L13;
        r4.itemView.setOnClickListener(new vl(r1, r11, r2));
        int r14 = 0;
    L14:
        r10.setVisibility(r14);
        goto L15
    L13:
        r14 = 8;
        goto L14
    }

    private static final void showList$lambda$0$0$0$0(LearnCardItemList r1, ImageView r2, LearnCardActivity r3, View r4) {
        r1.setAllChoose(!r1.isAllChoose());
        if (r1.isAllChoose() == false) goto L5;
        Intrinsics.XXI(r2);
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r2);
    L6:
        Iterator<T> r5 = r1.getList().iterator();
    L8:
        if (r5.hasNext() == false) goto L14;
        LearnCardDataItem r6 = (LearnCardDataItem) r5.next();
        if (r6.isChoose() == false) goto L12;
        r3.setDeleteNum(r3.getDeleteNum() + 1);
    L13:
        r6.setChoose(r1.isAllChoose());
        goto L8
    L12:
        r3.setDeleteNum(r3.getDeleteNum() - 1);
        goto L13
    L14:
        r3.changeDeleteBtnText(r3.getDeleteNum());
        r3.getDslAdapter().notifyDataChanged();
        return;
    L5:
        Intrinsics.XXI(r2);
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r2);
        goto L6
    }

    private static final void showList$lambda$0$0$0$1(DslAdapterItem r0, ImageView r1, LearnCardActivity r2, View r3, View r4) {
        r0.setItemGroupExtend(!r0.getItemGroupExtend());
        if (r0.getItemGroupExtend() == true) goto L5;
        if (r3 == null) goto L11;
        r3.setVisibility(8);
    L11:
        int r5 = R.drawable.learn_card_ic_arrow_open;
    L12:
        r1.setImageResource(r5);
        return;
    L5:
        if (r2.getOpenDeleteType() == false) goto L8;
        if (r3 == null) goto L8;
        r3.setVisibility(0);
    L8:
        r5 = R.drawable.learn_card_ic_arrow_closure;
        goto L12
    }

    private static final Unit showList$lambda$0$1(LearnCardItemList r1, final LearnCardDataItem r2, final LearnCardActivity r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r4.setItemBindOverride(new ul(r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$1$0(final LearnCardDataItem r0, final LearnCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "adapterItem");
        Intrinsics.X0O(r5, "payloads");
        ImageView r6 = r2.img(R.id.iv);
        if (r6 == null) goto L5;
        r6.setImageResource(r0.getPath());
    L5:
        TextView r7 = r2.tv(R.id.tv);
        if (r7 == null) goto L8;
        r7.setText(r0.getName());
    L8:
        TextView r8 = r2.tv(R.id.audio_book_file_size);
        if (r8 == null) goto L11;
        r8.setText("");
    L11:
        final ImageView r9 = r2.img(R.id.list_item_choose_iv);
        if (r0.isChoose() == false) goto L14;
        Intrinsics.XXI(r9);
        Glide.with(r9.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r9);
    L16:
        if (r1.getOpenDeleteType() == false) goto L18;
        r2.itemView.setOnClickListener(new rl(r0, r1, r9));
        int r10 = 0;
    L19:
        r9.setVisibility(r10);
        return Unit.OXO1;
    L18:
        r10 = 8;
        goto L19
    L14:
        Intrinsics.XXI(r9);
        Glide.with(r9.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r9);
        goto L16
    }

    private static final void showList$lambda$0$1$0$0(LearnCardDataItem r0, LearnCardActivity r1, ImageView r2, View r3) {
        r0.setChoose(!r0.isChoose());
        if (r0.isChoose() == false) goto L5;
        r1.setDeleteNum(r1.getDeleteNum() + 1);
    L6:
        r1.changeDeleteBtnText(r1.getDeleteNum());
        if (r0.isChoose() == false) goto L10;
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r2);
        return;
    L10:
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r2);
        return;
    L5:
        r1.setDeleteNum(r1.getDeleteNum() - 1);
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void allSelect(boolean r4) {
        super.allSelect(r4);
        setDeleteNum(0);
        Iterator<T> r5 = this.mTypeFiles.iterator();
    L4:
        if (r5.hasNext() == false) goto L13;
        LearnCardItemList r0 = (LearnCardItemList) r5.next();
        r0.setAllChoose(isAllSelect());
        if (isAllSelect() == false) goto L8;
        setDeleteNum(getDeleteNum() + r0.getList().size());
    L8:
        Iterator<T> r1 = r0.getList().iterator();
    L10:
        if (r1.hasNext() == false) goto L4;
        ((LearnCardDataItem) r1.next()).setChoose(isAllSelect());
        goto L10
    L13:
        if (getOpenDeleteType() == false) goto L15;
        changeDeleteBtnText(getDeleteNum());
    L15:
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void confirmDeleteFile() {
        super.confirmDeleteFile();
        Iterator<T> r0 = this.mTypeFiles.iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        Iterator<LearnCardDataItem> r1 = ((LearnCardItemList) r0.next()).getList().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        if (r1.next().isChoose() == false) goto L7;
        r1.remove();
        goto L7
    L11:
        showList();
        setOpenDeleteType(false);
        changeActivityState();
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void getFile() {
        super.getFile();
        String r0 = getTvFreeSpace().getText().toString();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r0);
        r1.putInt("mArg1", 1);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", null);
        Intent r2 = new Intent(this, OnLineLearningFileActivity.class);
        r2.putExtras(r1);
        startActivityForResult(r2, 255);
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

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.item_learn_card_title));
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_audio_book_learn;
    }

    public final void mTask() {
        getTvProgressTip().setText(R.string.transfering);
        getTvName().setText(getString(R.string.waiting));
        getTvTotalProgress().setText("");
        getPbProgress().setProgress(this.progress1111);
        getTvProgress().setText(this.progress1111 + "%");
        if (this.progress1111 <= 100) goto L8;
        getTaskPanel().setVisibility(8);
        getRecyclerView().setVisibility(0);
        getRecyclerViewTitle().setVisibility(0);
        getRightBtn().setVisibility(0);
        Handler r0 = this.mHandler111;
        if (r0 == null) goto L7;
        r0.removeCallbacksAndMessages(null);
    L7:
        this.mHandler111 = null;
        showList();
    L8:
        i1O0OXO1O.OXO1.OXO1("mTask  ---------- >  progress = " + this.progress1111);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r3, int r4, @tb1 Intent r5) {
        super.onActivityResult(r3, r4, r5);
        if (r3 == 255) goto L5;
        return;
    L5:
        if (r4 == (-1)) goto L7;
        return;
    L7:
        if (this.mHandler111 != null) goto L9;
        this.mHandler111 = new Handler(Looper.getMainLooper());
    L9:
        this.progress1111 = 0;
        getTaskPanel().setVisibility(0);
        getRecyclerView().setVisibility(8);
        getTvProgressTip().setText(R.string.studycard_transmission_tip);
        getRightBtn().setVisibility(8);
        getRecyclerViewTitle().setVisibility(8);
        getTvCancel().setVisibility(0);
        getTvRetry().setVisibility(8);
        Handler r6 = this.mHandler111;
        if (r6 == null) goto L15;
        r6.postDelayed(this.myTask, 40);
        return;
    }

    public final void onBottomClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (getOpenDeleteType() == false) goto L6;
        showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.audio_book_delete_pop_content, R.string.audio_book_delete_pop_sure);
        return;
    L6:
        getFile();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        showList();
    }

    public final void setMyTask(@aa1 Runnable r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.myTask = r2;
    }

    public final void setProgress1111(int r1) {
        this.progress1111 = r1;
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void showList() {
        super.showList();
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new pl(this));
    }
}
