package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.q04;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.InterfaceC3284iO;
import com.angcyo.dsladapter.ItemSelectorHelperKt;
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
import com.sma.smartv3.p610ui.device.OnLineLearningFileActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOnLineLearningFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n50#2,3:357\n53#2:363\n55#2,2:365\n1563#3:360\n1634#3,2:361\n1636#3:364\n1563#3:367\n1634#3,3:368\n1869#3,2:371\n1761#3,3:373\n*S KotlinDebug\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n*L\n61#1:357,3\n61#1:363\n61#1:365,2\n61#1:360\n61#1:361,2\n61#1:364\n332#1:367\n332#1:368,3\n134#1:371,2\n188#1:373,3\n*E\n"})
public final class OnLineLearningFileActivity extends BaseDSLRecyclerActivity {
    private boolean isSelectorAll;
    private int mChooseNumber;

    @aa1
    private final Lazy tvFreeSpace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sg1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return OnLineLearningFileActivity.tvFreeSpace_delegate$lambda$0(this.f11023IO);
        }
    });

    @aa1
    private final Lazy mButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tg1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return OnLineLearningFileActivity.mButton_delegate$lambda$0(this.f11248IO);
        }
    });
    private final boolean openChooseType = true;

    @aa1
    private List<AudioBookItem> mChooseAudioBookItem = new ArrayList();

    @aa1
    private List<AudioBookItem> mAlreadyHaveList = new ArrayList();

    @aa1
    private final List<AudioBookItem> mOnLineAudioBookItemFiles = new ArrayList();

    @aa1
    private final List<LearnCardItemList> mFileTypeFiles = new ArrayList();

    @aa1
    private final List<DslAdapterItem> fixedItemList = new ArrayList();

    public static final class OXO1 implements InterfaceC3284iO {
        public OXO1() {
        }

        @Override // com.angcyo.dsladapter.InterfaceC3284iO
        public void OXO1(List<DslAdapterItem> selectorItems, List<Integer> selectorIndexList, boolean z, q04 selectorParams) {
            Intrinsics.X0O(selectorItems, "selectorItems");
            Intrinsics.X0O(selectorIndexList, "selectorIndexList");
            Intrinsics.X0O(selectorParams, "selectorParams");
            InterfaceC3284iO.OXO1.OXO1(this, selectorItems, selectorIndexList, z, selectorParams);
            OnLineLearningFileActivity.this.setSelectorAll(z);
        }

        @Override // com.angcyo.dsladapter.InterfaceC3284iO
        public /* bridge */ void XIi00iiXO(int i, int i2) {
            InterfaceC3284iO.OXO1.XIi00iiXO(this, i, i2);
        }
    }

    private final String getAppStoreBinOnlinePath(String str) {
        return str == null ? "" : str;
    }

    private final TextView getTvFreeSpace() {
        return (TextView) this.tvFreeSpace$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mButton_delegate$lambda$0(OnLineLearningFileActivity onLineLearningFileActivity) {
        return (Button) onLineLearningFileActivity.findViewById(R.id.online_learning_button);
    }

    private final void setViewBg(View view, float f, float f2, float f3, float f4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{f, f, f3, f3, f4, f4, f2, f2});
        gradientDrawable.setColor(getResources().getColor(R.color.audio_book_tv_bg_color));
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAudioBookList$lambda$0(OnLineLearningFileActivity onLineLearningFileActivity, List list) {
        if (list != null) {
            onLineLearningFileActivity.mOnLineAudioBookItemFiles.clear();
            onLineLearningFileActivity.getDslAdapter().getItemSelectorHelper().O1O(new q04(null, ItemSelectorHelperKt.XiOIii1(false), false, false, false, null, false, false, false, null, 1021, null));
            onLineLearningFileActivity.getDslAdapter().getItemSelectorHelper().X11iII1O1(1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppFileDetail appFileDetail = (AppFileDetail) it.next();
                onLineLearningFileActivity.mOnLineAudioBookItemFiles.add(new AudioBookItem(0, onLineLearningFileActivity.getMArg1() == 0 ? appFileDetail.getAppName() : appFileDetail.getAppGroupName(), (int) (appFileDetail.getAppSize() * ((double) 1024)), false, appFileDetail.getAppPreImg(), onLineLearningFileActivity.getAppStoreBinOnlinePath(appFileDetail.getAppPack()), appFileDetail.getAppNewFlag(), appFileDetail.getAppPackName(), 0, 265, null));
            }
            onLineLearningFileActivity.showLearningData();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0(final OnLineLearningFileActivity onLineLearningFileActivity, List list) {
        if (list != null) {
            onLineLearningFileActivity.getDslAdapter().resetItem(new ArrayList());
            onLineLearningFileActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.lg1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OnLineLearningFileActivity.showLearnCardList$lambda$0$0(this.f9428IO, (DslAdapter) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0(final OnLineLearningFileActivity onLineLearningFileActivity, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        for (final LearnCardItemList learnCardItemList : onLineLearningFileActivity.mFileTypeFiles) {
            if (!learnCardItemList.getList().isEmpty()) {
                DslAdapterExKt.O10IXXX0X(onLineLearningFileActivity.getDslAdapter(), R.layout.item_learn_card_title, new Function1() { // from class: com.android.mltcode.paycertificationapi.ug1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OnLineLearningFileActivity.showLearnCardList$lambda$0$0$0(learnCardItemList, onLineLearningFileActivity, (DslAdapterItem) obj);
                    }
                });
            }
            for (final LearnCardDataItem learnCardDataItem : learnCardItemList.getList()) {
                DslAdapterExKt.O10IXXX0X(onLineLearningFileActivity.getDslAdapter(), R.layout.item_list_audio_book_learn, new Function1() { // from class: com.android.mltcode.paycertificationapi.vg1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OnLineLearningFileActivity.showLearnCardList$lambda$0$0$1(learnCardItemList, learnCardDataItem, renderAdapter, onLineLearningFileActivity, (DslAdapterItem) obj);
                    }
                });
            }
        }
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0$0(final LearnCardItemList learnCardItemList, final OnLineLearningFileActivity onLineLearningFileActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(learnCardItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ig1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return OnLineLearningFileActivity.showLearnCardList$lambda$0$0$0$0(learnCardItemList, onLineLearningFileActivity, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(learnCardItemList.getTypeName());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0$0$0(LearnCardItemList learnCardItemList, OnLineLearningFileActivity onLineLearningFileActivity, final DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.learn_card_arrow_tv_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(learnCardItemList.getTypeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.learn_card_arrow_tv_content);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(learnCardItemList.getList().size() + onLineLearningFileActivity.getString(R.string.learn_card_project_tip));
        }
        View viewM3483v = itemHolder.m3483v(R.id.learn_card_all_choose_layout);
        if (viewM3483v != null) {
            viewM3483v.setVisibility(8);
        }
        ImageView imageView = (ImageView) itemHolder.m3483v(R.id.learn_card_arrow_icon);
        if (imageView != null) {
            imageView.setImageResource(dslAdapterItem.getItemGroupExtend() ? R.drawable.learn_card_ic_arrow_closure : R.drawable.learn_card_ic_arrow_open);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fg1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnLineLearningFileActivity.showLearnCardList$lambda$0$0$0$0$0(dslAdapterItem, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLearnCardList$lambda$0$0$0$0$0(DslAdapterItem dslAdapterItem, View view) {
        dslAdapterItem.setItemGroupExtend(!dslAdapterItem.getItemGroupExtend());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0$1(LearnCardItemList learnCardItemList, final LearnCardDataItem learnCardDataItem, final DslAdapter dslAdapter, final OnLineLearningFileActivity onLineLearningFileActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(learnCardItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.qg1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return OnLineLearningFileActivity.showLearnCardList$lambda$0$0$1$0(learnCardDataItem, dslItem, dslAdapter, onLineLearningFileActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0$1$0(final LearnCardDataItem learnCardDataItem, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final OnLineLearningFileActivity onLineLearningFileActivity, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List payloads) {
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
        ImageView imageViewImg2 = itemHolder.img(R.id.list_item_choose_iv);
        if (imageViewImg2 != null) {
            imageViewImg2.setVisibility(0);
        }
        if (dslAdapterItem.getItemIsSelected() && learnCardDataItem.isChoose()) {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageViewImg2);
        } else {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageViewImg2);
        }
        itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.gg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnLineLearningFileActivity.showLearnCardList$lambda$0$0$1$0$0(dslAdapterItem, learnCardDataItem, view);
            }
        });
        dslAdapter.setOnDispatchUpdatesAfterOnce(new Function1() { // from class: com.android.mltcode.paycertificationapi.hg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OnLineLearningFileActivity.showLearnCardList$lambda$0$0$1$0$1(dslAdapter, onLineLearningFileActivity, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLearnCardList$lambda$0$0$1$0$0(DslAdapterItem dslAdapterItem, LearnCardDataItem learnCardDataItem, View view) {
        DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
        learnCardDataItem.setChoose(dslAdapterItem.getItemIsSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearnCardList$lambda$0$0$1$0$1(DslAdapter dslAdapter, OnLineLearningFileActivity onLineLearningFileActivity, DslAdapter it) {
        Intrinsics.X0O(it, "it");
        dslAdapter.getItemSelectorHelper().m3490iI(onLineLearningFileActivity.fixedItemList);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearningData$lambda$0(final OnLineLearningFileActivity onLineLearningFileActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (final AudioBookItem audioBookItem : onLineLearningFileActivity.mOnLineAudioBookItemFiles) {
            DslAdapterExKt.O10IXXX0X(onLineLearningFileActivity.getDslAdapter(), R.layout.item_list_audio_book_learn, new Function1() { // from class: com.android.mltcode.paycertificationapi.jg1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OnLineLearningFileActivity.showLearningData$lambda$0$0(audioBookItem, onLineLearningFileActivity, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLearningData$lambda$0$0(final AudioBookItem audioBookItem, final OnLineLearningFileActivity onLineLearningFileActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.mg1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return OnLineLearningFileActivity.showLearningData$lambda$0$0$0(audioBookItem, onLineLearningFileActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
    public static final Unit showLearningData$lambda$0$0$0(final AudioBookItem audioBookItem, final OnLineLearningFileActivity onLineLearningFileActivity, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(audioBookItem.getName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.audio_book_file_size);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(audioBookItem.getSize() + "kb");
        }
        onLineLearningFileActivity.setViewBg(textViewM3482tv2, 0.0f, 0.0f, 0.0f, 20.0f);
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.audio_book_file_top_tip);
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            Glide.with(imageViewImg.getContext()).load(audioBookItem.getOnlinePath()).into(imageViewImg);
        }
        final ImageView imageViewImg2 = itemHolder.img(R.id.list_item_choose_iv);
        if (textViewM3482tv3 != null) {
            List<AudioBookItem> list2 = onLineLearningFileActivity.mAlreadyHaveList;
            int i2 = 0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.og1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnLineLearningFileActivity.showLearningData$lambda$0$0$0$2(audioBookItem, onLineLearningFileActivity, imageViewImg2, view);
                    }
                });
                if (imageViewImg2 != null) {
                    imageViewImg2.setVisibility(0);
                }
                i2 = 8;
            } else {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.og1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OnLineLearningFileActivity.showLearningData$lambda$0$0$0$2(audioBookItem, onLineLearningFileActivity, imageViewImg2, view);
                            }
                        });
                        if (imageViewImg2 != null) {
                            imageViewImg2.setVisibility(0);
                        }
                        i2 = 8;
                    } else if (Intrinsics.XOO0ii0(((AudioBookItem) it.next()).getOnlinePath(), audioBookItem.getOnlinePath())) {
                        textViewM3482tv3.setText(onLineLearningFileActivity.getString(R.string.audio_book_already_have));
                        onLineLearningFileActivity.setViewBg(textViewM3482tv3, 20.0f, 0.0f, 0.0f, 0.0f);
                        itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ng1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OnLineLearningFileActivity.showLearningData$lambda$0$0$0$1(view);
                            }
                        });
                        if (imageViewImg2 != null) {
                            imageViewImg2.setVisibility(8);
                        }
                    }
                }
            }
            textViewM3482tv3.setVisibility(i2);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLearningData$lambda$0$0$0$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLearningData$lambda$0$0$0$2(AudioBookItem audioBookItem, OnLineLearningFileActivity onLineLearningFileActivity, ImageView imageView, View view) {
        audioBookItem.setChoose(!audioBookItem.isChoose());
        if (audioBookItem.isChoose()) {
            onLineLearningFileActivity.mChooseNumber++;
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageView);
        } else {
            onLineLearningFileActivity.mChooseNumber--;
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageView);
        }
        onLineLearningFileActivity.getMButton().setEnabled(onLineLearningFileActivity.mChooseNumber > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvFreeSpace_delegate$lambda$0(OnLineLearningFileActivity onLineLearningFileActivity) {
        return (TextView) onLineLearningFileActivity.findViewById(R.id.tv_free_space);
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
        return (Button) this.mButton$delegate.getValue();
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.XO0O10().getString(b01.f5634XI)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), AudioBookItem.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.mAlreadyHaveList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        this.mChooseNumber = 0;
        getMButton().setEnabled(false);
        ((TextView) findViewById(R.id.abh_title_center)).setText(getMArg1() == 0 ? getString(R.string.item_audio_book_learn_title) : getString(R.string.item_learn_card_title));
        getTvFreeSpace().setText(getMArg0());
    }

    public final boolean isSelectorAll() {
        return this.isSelectorAll;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_on_line_learning_file;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mChooseAudioBookItem == null) {
            finish();
            return;
        }
        Intent intent = new Intent();
        this.mChooseAudioBookItem.clear();
        List<AudioBookItem> list = this.mOnLineAudioBookItemFiles;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (AudioBookItem audioBookItem : list) {
            if (audioBookItem.isChoose()) {
                this.mChooseAudioBookItem.add(audioBookItem);
            }
            arrayList.add(Unit.OXO1);
        }
        intent.putExtra("chooseItem", new Gson().toJson(this.mChooseAudioBookItem));
        setResult(-1, intent);
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

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void selectorListener() {
        getDslAdapter().getItemSelectorHelper().iX1O1(new OXO1());
    }

    public final void setMAlreadyHaveList(@aa1 List<AudioBookItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAlreadyHaveList = list;
    }

    public final void setMChooseAudioBookItem(@aa1 List<AudioBookItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mChooseAudioBookItem = list;
    }

    public final void setMChooseNumber(int i) {
        this.mChooseNumber = i;
    }

    public final void setSelectorAll(boolean z) {
        this.isSelectorAll = z;
    }

    public final void showAudioBookList() {
        AppStoreFileManager.INSTANCE.getAudioBookFileList(getMArg1() == 0 ? "2" : "3", new Function1() { // from class: com.android.mltcode.paycertificationapi.rg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OnLineLearningFileActivity.showAudioBookList$lambda$0(this.f10810IO, (List) obj);
            }
        });
    }

    public final void showLearnCardList() {
        AppStoreFileManager.INSTANCE.getAppStoreFileList("3", new Function1() { // from class: com.android.mltcode.paycertificationapi.pg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OnLineLearningFileActivity.showLearnCardList$lambda$0(this.f10358IO, (List) obj);
            }
        });
    }

    public final void showLearningData() {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.kg1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OnLineLearningFileActivity.showLearningData$lambda$0(this.f9162IO, (DslAdapter) obj);
            }
        });
    }
}
