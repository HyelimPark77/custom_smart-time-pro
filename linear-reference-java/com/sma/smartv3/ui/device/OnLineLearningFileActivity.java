package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.fg1;
import com.android.mltcode.paycertificationapi.gg1;
import com.android.mltcode.paycertificationapi.hg1;
import com.android.mltcode.paycertificationapi.ig1;
import com.android.mltcode.paycertificationapi.jg1;
import com.android.mltcode.paycertificationapi.kg1;
import com.android.mltcode.paycertificationapi.lg1;
import com.android.mltcode.paycertificationapi.mg1;
import com.android.mltcode.paycertificationapi.ng1;
import com.android.mltcode.paycertificationapi.og1;
import com.android.mltcode.paycertificationapi.pg1;
import com.android.mltcode.paycertificationapi.q04;
import com.android.mltcode.paycertificationapi.qg1;
import com.android.mltcode.paycertificationapi.rg1;
import com.android.mltcode.paycertificationapi.sg1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tg1;
import com.android.mltcode.paycertificationapi.ug1;
import com.android.mltcode.paycertificationapi.vg1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.ItemSelectorHelperKt;
import com.angcyo.dsladapter.iO;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AudioBookItem;
import com.sma.smartv3.model.LearnCardDataItem;
import com.sma.smartv3.model.LearnCardItemList;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOnLineLearningFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n50#2,3:357\n53#2:363\n55#2,2:365\n1563#3:360\n1634#3,2:361\n1636#3:364\n1563#3:367\n1634#3,3:368\n1869#3,2:371\n1761#3,3:373\n*S KotlinDebug\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n*L\n61#1:357,3\n61#1:363\n61#1:365,2\n61#1:360\n61#1:361,2\n61#1:364\n332#1:367\n332#1:368,3\n134#1:371,2\n188#1:373,3\n*E\n"})
public final class OnLineLearningFileActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final List<DslAdapterItem> fixedItemList;
    private boolean isSelectorAll;

    @aa1
    private List<AudioBookItem> mAlreadyHaveList;

    @aa1
    private final Lazy mButton$delegate;

    @aa1
    private List<AudioBookItem> mChooseAudioBookItem;
    private int mChooseNumber;

    @aa1
    private final List<LearnCardItemList> mFileTypeFiles;

    @aa1
    private final List<AudioBookItem> mOnLineAudioBookItemFiles;
    private final boolean openChooseType;

    @aa1
    private final Lazy tvFreeSpace$delegate;

    public static final class OXO1 implements iO {
        public final /* synthetic */ OnLineLearningFileActivity OXO1;

        public OXO1(OnLineLearningFileActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.angcyo.dsladapter.iO
        public void OXO1(List<DslAdapterItem> r2, List<Integer> r3, boolean r4, q04 r5) {
            Intrinsics.X0O(r2, "selectorItems");
            Intrinsics.X0O(r3, "selectorIndexList");
            Intrinsics.X0O(r5, "selectorParams");
            iO.OXO1.OXO1(this, r2, r3, r4, r5);
            this.OXO1.setSelectorAll(r4);
        }

        @Override // com.angcyo.dsladapter.iO
        public /* bridge */ void XIi00iiXO(int r1, int r2) {
            iO.OXO1.XIi00iiXO(this, r1, r2);
        }
    }

    public OnLineLearningFileActivity() {
        this.tvFreeSpace$delegate = LazyKt__LazyJVMKt.iO(new sg1(this));
        this.mButton$delegate = LazyKt__LazyJVMKt.iO(new tg1(this));
        this.openChooseType = true;
        this.mChooseAudioBookItem = new ArrayList();
        this.mAlreadyHaveList = new ArrayList();
        this.mOnLineAudioBookItemFiles = new ArrayList();
        this.mFileTypeFiles = new ArrayList();
        this.fixedItemList = new ArrayList();
    }

    public static /* synthetic */ Unit I0iXXO(AudioBookItem r0, OnLineLearningFileActivity r1, DslAdapterItem r2) {
        return showLearningData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1(OnLineLearningFileActivity r0, List r1) {
        return showAudioBookList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(OnLineLearningFileActivity r0, DslAdapter r1) {
        return showLearnCardList$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void IIX1OXO(View r0) {
        showLearningData$lambda$0$0$0$1(r0);
    }

    public static /* synthetic */ void O10IXXX0X(AudioBookItem r0, OnLineLearningFileActivity r1, ImageView r2, View r3) {
        showLearningData$lambda$0$0$0$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ Button OII(OnLineLearningFileActivity r0) {
        return mButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX(OnLineLearningFileActivity r0, List r1) {
        return showLearnCardList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(DslAdapter r0, OnLineLearningFileActivity r1, DslAdapter r2) {
        return showLearnCardList$lambda$0$0$1$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit X01IiOiIi(AudioBookItem r0, OnLineLearningFileActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showLearningData$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit X0O(LearnCardItemList r0, LearnCardDataItem r1, DslAdapter r2, OnLineLearningFileActivity r3, DslAdapterItem r4) {
        return showLearnCardList$lambda$0$0$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ TextView X1ii(OnLineLearningFileActivity r0) {
        return tvFreeSpace_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(DslAdapterItem r0, LearnCardDataItem r1, View r2) {
        showLearnCardList$lambda$0$0$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(LearnCardItemList r0, OnLineLearningFileActivity r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return showLearnCardList$lambda$0$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ void XiOIO(DslAdapterItem r0, View r1) {
        showLearnCardList$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(LearnCardDataItem r0, DslAdapterItem r1, DslAdapter r2, OnLineLearningFileActivity r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return showLearnCardList$lambda$0$0$1$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    private final String getAppStoreBinOnlinePath(String r1) {
        if (r1 != null) goto L5;
        return "";
    L5:
        return r1;
    }

    private final TextView getTvFreeSpace() {
        return (TextView) getValue();
    }

    public static /* synthetic */ Unit iIiiO(OnLineLearningFileActivity r0, DslAdapter r1) {
        return showLearningData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(LearnCardItemList r0, OnLineLearningFileActivity r1, DslAdapterItem r2) {
        return showLearnCardList$lambda$0$0$0(r0, r1, r2);
    }

    private static final Button mButton_delegate$lambda$0(OnLineLearningFileActivity r1) {
        return (Button) r1.findViewById(R.id.online_learning_button);
    }

    private final void setViewBg(View r4, float r5, float r6, float r7, float r8) {
        GradientDrawable r0 = new GradientDrawable();
        r0.setCornerRadii(new float[]{r5, r5, r7, r7, r8, r8, r6, r6});
        r0.setColor(getResources().getColor(R.color.audio_book_tv_bg_color));
        if (r4 == null) goto L6;
        r4.setBackground(r0);
        return;
    }

    private static final Unit showAudioBookList$lambda$0(OnLineLearningFileActivity r14, List r15) {
        if (r15 == null) goto L14;
        r14.mOnLineAudioBookItemFiles.clear();
        DslAdapterItem r2 = null;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        Object r7 = null;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        Object r11 = null;
        r14.getDslAdapter().getItemSelectorHelper().O1O(new q04(r2, ItemSelectorHelperKt.XiOIii1(false), r4, r5, r6, r7, r8, r9, r10, r11, 1021, null));
        r14.getDslAdapter().getItemSelectorHelper().X11iII1O1(1);
        Iterator r16 = r15.iterator();
    L5:
        if (r16.hasNext() == false) goto L12;
        AppFileDetail r0 = (AppFileDetail) r16.next();
        List<AudioBookItem> r1 = r14.mOnLineAudioBookItemFiles;
        String r12 = r0.getAppPreImg();
        if (r14.getMArg1() != 0) goto L10;
        String r3 = r0.getAppName();
    L9:
        String r13 = r3;
        r1.add(new AudioBookItem(0, r13, (int) (r0.getAppSize() * ((double) 1024)), false, r12, r14.getAppStoreBinOnlinePath(r0.getAppPack()), r0.getAppNewFlag(), r0.getAppPackName(), 0, 265, null));
        goto L5
    L10:
        r3 = r0.getAppGroupName();
        goto L9
    L12:
        r14.showLearningData();
    L14:
        return Unit.OXO1;
    }

    private static final Unit showLearnCardList$lambda$0(final OnLineLearningFileActivity r1, List r2) {
        if (r2 == null) goto L5;
        r1.getDslAdapter().resetItem(new ArrayList());
        r1.renderAdapter(new lg1(r1));
    L5:
        return Unit.OXO1;
    }

    private static final Unit showLearnCardList$lambda$0$0(final OnLineLearningFileActivity r8, final DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        r9.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(r9, 2, null, 2, null);
        Iterator<LearnCardItemList> r2 = r8.mFileTypeFiles.iterator();
    L4:
        if (r2.hasNext() == false) goto L12;
        final LearnCardItemList r3 = r2.next();
        if (r3.getList().isEmpty() == true) goto L8;
        DslAdapterExKt.O10IXXX0X(r8.getDslAdapter(), R.layout.item_learn_card_title, new ug1(r3, r8));
    L8:
        Iterator<LearnCardDataItem> r4 = r3.getList().iterator();
    L10:
        if (r4.hasNext() == false) goto L4;
        final LearnCardDataItem r5 = r4.next();
        DslAdapterExKt.O10IXXX0X(r8.getDslAdapter(), R.layout.item_list_audio_book_learn, new vg1(r3, r5, r9, r8));
        goto L10
    L12:
        DslAdapter.setAdapterStatus$default(r9, 0, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit showLearnCardList$lambda$0$0$0(final LearnCardItemList r1, final OnLineLearningFileActivity r2, final DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsGroupHead(true);
        r3.setItemIsHover(false);
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r3.setItemBindOverride(new ig1(r1, r2, r3));
        r3.setItemTag(r1.getTypeName());
        return Unit.OXO1;
    }

    private static final Unit showLearnCardList$lambda$0$0$0$0(LearnCardItemList r0, OnLineLearningFileActivity r1, final DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.learn_card_arrow_tv_title);
        if (r7 == null) goto L5;
        r7.setText(r0.getTypeName());
    L5:
        TextView r8 = r3.tv(R.id.learn_card_arrow_tv_content);
        if (r8 == null) goto L8;
        r8.setText(r0.getList().size() + r1.getString(R.string.learn_card_project_tip));
    L8:
        View r9 = r3.v(R.id.learn_card_all_choose_layout);
        if (r9 == null) goto L11;
        r9.setVisibility(8);
    L11:
        ImageView r10 = (ImageView) r3.v(R.id.learn_card_arrow_icon);
        if (r10 != null) goto L14;
    L18:
        if (r10 == null) goto L21;
        r10.setOnClickListener(new fg1(r2));
    L21:
        return Unit.OXO1;
    L14:
        if (r2.getItemGroupExtend() == false) goto L16;
        int r11 = R.drawable.learn_card_ic_arrow_closure;
    L17:
        r10.setImageResource(r11);
        goto L18
    L16:
        r11 = R.drawable.learn_card_ic_arrow_open;
        goto L17
    }

    private static final void showLearnCardList$lambda$0$0$0$0$0(DslAdapterItem r0, View r1) {
        r0.setItemGroupExtend(!r0.getItemGroupExtend());
    }

    private static final Unit showLearnCardList$lambda$0$0$1(LearnCardItemList r1, final LearnCardDataItem r2, final DslAdapter r3, final OnLineLearningFileActivity r4, final DslAdapterItem r5) {
        Intrinsics.X0O(r5, "$this$dslItem");
        r5.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r5.setItemBindOverride(new qg1(r2, r5, r3, r4));
        return Unit.OXO1;
    }

    private static final Unit showLearnCardList$lambda$0$0$1$0(final LearnCardDataItem r0, final DslAdapterItem r1, final DslAdapter r2, final OnLineLearningFileActivity r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "adapterItem");
        Intrinsics.X0O(r7, "payloads");
        ImageView r8 = r4.img(R.id.iv);
        if (r8 == null) goto L5;
        r8.setImageResource(r0.getPath());
    L5:
        TextView r9 = r4.tv(R.id.tv);
        if (r9 == null) goto L8;
        r9.setText(r0.getName());
    L8:
        TextView r10 = r4.tv(R.id.audio_book_file_size);
        if (r10 == null) goto L11;
        r10.setText("");
    L11:
        ImageView r11 = r4.img(R.id.list_item_choose_iv);
        if (r11 == null) goto L15;
        r11.setVisibility(0);
    L15:
        if (r1.getItemIsSelected() == true) goto L17;
    L19:
        Intrinsics.XXI(r11);
        Glide.with(r11.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r11);
    L20:
        r4.itemView.setOnClickListener(new gg1(r1, r0));
        r2.setOnDispatchUpdatesAfterOnce(new hg1(r2, r3));
        return Unit.OXO1;
    L17:
        if (r0.isChoose() == false) goto L19;
        Intrinsics.XXI(r11);
        Glide.with(r11.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r11);
        goto L20
    }

    private static final void showLearnCardList$lambda$0$0$1$0$0(DslAdapterItem r3, LearnCardDataItem r4, View r5) {
        DslAdapterItem.updateItemSelector$default(r3, !r3.getItemIsSelected(), false, 2, null);
        r4.setChoose(r3.getItemIsSelected());
    }

    private static final Unit showLearnCardList$lambda$0$0$1$0$1(DslAdapter r1, OnLineLearningFileActivity r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "it");
        r1.getItemSelectorHelper().iI(r2.fixedItemList);
        return Unit.OXO1;
    }

    private static final Unit showLearningData$lambda$0(final OnLineLearningFileActivity r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        Iterator<AudioBookItem> r5 = r3.mOnLineAudioBookItemFiles.iterator();
    L4:
        if (r5.hasNext() == false) goto L7;
        final AudioBookItem r0 = r5.next();
        DslAdapterExKt.O10IXXX0X(r3.getDslAdapter(), R.layout.item_list_audio_book_learn, new jg1(r0, r3));
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit showLearningData$lambda$0$0(final AudioBookItem r1, final OnLineLearningFileActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new mg1(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showLearningData$lambda$0$0$0(final AudioBookItem r9, final OnLineLearningFileActivity r10, DslViewHolder r11, int r12, DslAdapterItem r13, List r14) {
        Intrinsics.X0O(r11, "itemHolder");
        Intrinsics.X0O(r13, "adapterItem");
        Intrinsics.X0O(r14, "<unused var>");
        TextView r0 = r11.tv(R.id.tv);
        if (r0 == null) goto L5;
        r0.setText(r9.getName());
    L5:
        TextView r1 = r11.tv(R.id.audio_book_file_size);
        if (r1 == null) goto L8;
        r1.setText(r9.getSize() + "kb");
    L8:
        r10.setViewBg(r1, 0.0f, 0.0f, 0.0f, 20.0f);
        TextView r2 = r11.tv(R.id.audio_book_file_top_tip);
        ImageView r3 = r11.img(R.id.iv);
        if (r3 == null) goto L11;
        Glide.with(r3.getContext()).load(r9.getOnlinePath()).into(r3);
    L11:
        final ImageView r6 = r11.img(R.id.list_item_choose_iv);
        if (r2 == null) goto L32;
        List<AudioBookItem> r4 = r10.mAlreadyHaveList;
        int r7 = 0;
        if ((r4 instanceof Collection) == true) goto L16;
    L18:
        Iterator<T> r5 = r4.iterator();
    L20:
        if (r5.hasNext() == false) goto L26;
        if (Intrinsics.XOO0ii0(((AudioBookItem) r5.next()).getOnlinePath(), r9.getOnlinePath()) == false) goto L20;
        r2.setText(r10.getString(R.string.audio_book_already_have));
        r10.setViewBg(r2, 20.0f, 0.0f, 0.0f, 0.0f);
        r11.itemView.setOnClickListener(new ng1());
        if (r6 == null) goto L30;
        r6.setVisibility(8);
    L30:
        r2.setVisibility(r7);
    L26:
        r11.itemView.setOnClickListener(new og1(r9, r10, r6));
        if (r6 == null) goto L29;
        r6.setVisibility(0);
    L29:
        r7 = 8;
        goto L30
    L16:
        if (r4.isEmpty() == false) goto L18;
    L32:
        return Unit.OXO1;
    }

    private static final void showLearningData$lambda$0$0$0$1(View r0) {
    }

    private static final void showLearningData$lambda$0$0$0$2(AudioBookItem r1, OnLineLearningFileActivity r2, ImageView r3, View r4) {
        boolean r0 = true;
        r1.setChoose(!r1.isChoose());
        if (r1.isChoose() == false) goto L5;
        r2.mChooseNumber++;
        Intrinsics.XXI(r3);
        Glide.with(r3.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r3);
    L6:
        Button r5 = r2.getMButton();
        if (r2.mChooseNumber > 0) goto L10;
        r0 = false;
    L10:
        r5.setEnabled(r0);
        return;
    L5:
        r2.mChooseNumber--;
        Intrinsics.XXI(r3);
        Glide.with(r3.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r3);
        goto L6
    }

    private static final TextView tvFreeSpace_delegate$lambda$0(OnLineLearningFileActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_free_space);
    }

    @aa1
    public final List<DslAdapterItem> getFixedItemList() {
        return this.fixedItemList;
    }

    @aa1
    public final List<AudioBookItem> getMAlreadyHaveList() {
        return this.mAlreadyHaveList;
    }

    public final Button getMButton() {
        return (Button) getValue();
    }

    @aa1
    public final List<AudioBookItem> getMChooseAudioBookItem() {
        return this.mChooseAudioBookItem;
    }

    public final int getMChooseNumber() {
        return this.mChooseNumber;
    }

    @aa1
    public final List<LearnCardItemList> getMFileTypeFiles() {
        return this.mFileTypeFiles;
    }

    @aa1
    public final List<AudioBookItem> getMOnLineAudioBookItemFiles() {
        return this.mOnLineAudioBookItemFiles;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        JsonArray r6 = JsonParser.parseString(a01.OXO1.XO0O10().getString(b01.XI)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r6);     // Catch: Exception -> L8
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r7 = r6.iterator();     // Catch: Exception -> L8
    L5:
        if (r7.hasNext() == false) goto L9;
        JsonElement r1 = r7.next();     // Catch: Exception -> L8
        r0.add(new Gson().fromJson(r1, AudioBookItem.class));     // Catch: Exception -> L8
    L9:
        this.mAlreadyHaveList = CollectionsKt___CollectionsKt.OO0Oi10(r0);
        return;
    L8:
        r0 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        this.mChooseNumber = 0;
        getMButton().setEnabled(false);
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (getMArg1() != 0) goto L5;
        String r1 = getString(R.string.item_audio_book_learn_title);
    L6:
        r0.setText(r1);
        getTvFreeSpace().setText(getMArg0());
        return;
    L5:
        r1 = getString(R.string.item_learn_card_title);
        goto L6
    }

    public final boolean isSelectorAll() {
        return this.isSelectorAll;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_on_line_learning_file;
    }

    public final void onBottomClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mChooseAudioBookItem != null) goto L6;
        finish();
        return;
    L6:
        Intent r6 = new Intent();
        this.mChooseAudioBookItem.clear();
        List<AudioBookItem> r0 = this.mOnLineAudioBookItemFiles;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L8:
        if (r2.hasNext() == false) goto L13;
        AudioBookItem r3 = (AudioBookItem) r2.next();
        if (r3.isChoose() == false) goto L12;
        this.mChooseAudioBookItem.add(r3);
    L12:
        r1.add(Unit.OXO1);
        goto L8
    L13:
        r6.putExtra("chooseItem", new Gson().toJson(this.mChooseAudioBookItem));
        setResult(-1, r6);
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new GridLayoutManager(this, 3));
        selectorListener();
        showAudioBookList();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void selectorListener() {
        getDslAdapter().getItemSelectorHelper().iX1O1(new OXO1(this));
    }

    public final void setMAlreadyHaveList(@aa1 List<AudioBookItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAlreadyHaveList = r2;
    }

    public final void setMChooseAudioBookItem(@aa1 List<AudioBookItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mChooseAudioBookItem = r2;
    }

    public final void setMChooseNumber(int r1) {
        this.mChooseNumber = r1;
    }

    public final void setSelectorAll(boolean r1) {
        this.isSelectorAll = r1;
    }

    public final void showAudioBookList() {
        AppStoreFileManager r0 = AppStoreFileManager.INSTANCE;
        if (getMArg1() != 0) goto L5;
        String r1 = "2";
    L6:
        r0.getAudioBookFileList(r1, new rg1(this));
        return;
    L5:
        r1 = "3";
        goto L6
    }

    public final void showLearnCardList() {
        AppStoreFileManager.INSTANCE.getAppStoreFileList("3", new pg1(this));
    }

    public final void showLearningData() {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new kg1(this));
    }
}
