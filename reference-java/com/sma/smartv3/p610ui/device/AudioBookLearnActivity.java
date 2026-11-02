package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AudioBookItem;
import com.sma.smartv3.p610ui.device.AudioBookLearnActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAppAudioBookList;
import com.szabh.smable3.entity.BleAppAudioBookPath;
import com.szabh.smable3.entity.BleAppOp;
import com.szabh.smable3.entity.BleFilePath;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAudioBookLearnActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBookLearnActivity.kt\ncom/sma/smartv3/ui/device/AudioBookLearnActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n50#2,3:392\n53#2:398\n55#2,2:400\n50#2,3:421\n53#2:427\n55#2,2:429\n35#2,2:438\n35#2,2:461\n1563#3:395\n1634#3,2:396\n1636#3:399\n1563#3:424\n1634#3,2:425\n1636#3:428\n1869#3:431\n1870#3:433\n1563#3:434\n1634#3,3:435\n1869#3,2:459\n87#4,7:402\n94#4,3:410\n70#4,7:413\n97#4:420\n173#4,7:440\n180#4,3:448\n143#4,7:451\n183#4:458\n1#5:409\n1#5:432\n1#5:447\n*S KotlinDebug\n*F\n+ 1 AudioBookLearnActivity.kt\ncom/sma/smartv3/ui/device/AudioBookLearnActivity\n*L\n86#1:392,3\n86#1:398\n86#1:400,2\n161#1:421,3\n161#1:427\n161#1:429,2\n313#1:438,2\n91#1:461,2\n86#1:395\n86#1:396,2\n86#1:399\n161#1:424\n161#1:425,2\n161#1:428\n167#1:431\n167#1:433\n289#1:434\n289#1:435,3\n368#1:459,2\n101#1:402,7\n101#1:410,3\n101#1:413,7\n101#1:420\n314#1:440,7\n314#1:448,3\n314#1:451,7\n314#1:458\n101#1:409\n314#1:447\n*E\n"})
public final class AudioBookLearnActivity extends BaseJLFileManageActivity {

    @aa1
    private final List<AudioBookItem> mAudioBookItemFiles;

    @tb1
    private List<AudioBookItem> mAudioBookItemList;

    @tb1
    private List<AppFileDetail> mAudioBookLearnList;
    private final int mResultCode;

    @aa1
    private final Lazy btnBottomLinkJump$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10i100ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AudioBookLearnActivity.btnBottomLinkJump_delegate$lambda$0(this.f1326IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOiX1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AudioBookLearnActivity.abhTitleRight_delegate$lambda$0(this.f3523IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOO1II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AudioBookLearnActivity.abhTitleOtherRight_delegate$lambda$0(this.f3259IO);
        }
    });

    @aa1
    private final String TAG = "AudioBookLearnActivity";

    @aa1
    private final List<String> deleteFilePath = new ArrayList();

    public static final class OXO1 extends TypeToken<List<? extends AudioBookItem>> {
    }

    public AudioBookLearnActivity() {
        setMSDCardName(getMArg1() == 0 ? XIi00iiXO.O00 : XIi00iiXO.IiI10X);
        this.mAudioBookItemFiles = new ArrayList();
        this.mResultCode = 254;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(AudioBookLearnActivity audioBookLearnActivity) {
        return (ImageView) audioBookLearnActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AudioBookLearnActivity audioBookLearnActivity) {
        return (ImageView) audioBookLearnActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnBottomLinkJump_delegate$lambda$0(AudioBookLearnActivity audioBookLearnActivity) {
        return (Button) audioBookLearnActivity.findViewById(R.id.btn_bottom_link_jump);
    }

    private final void downloadAppFile() {
        getTaskPanel().setVisibility(0);
        getRecyclerView().setVisibility(8);
        getTvProgressTip().setText(getMArg1() == 0 ? R.string.audiobooks_transmission_tip : R.string.studycard_transmission_tip);
        getRightBtn().setVisibility(8);
        getRecyclerViewTitle().setVisibility(8);
        getTvCancel().setVisibility(8);
        getTvRetry().setVisibility(8);
        List<AudioBookItem> list = this.mAudioBookItemList;
        if (list != null) {
            Intrinsics.XXI(list);
            if (list.isEmpty()) {
                return;
            }
            List<AudioBookItem> list2 = this.mAudioBookItemList;
            Intrinsics.XXI(list2);
            setMAudioBookItem((AudioBookItem) CollectionsKt___CollectionsKt.IIII0iI(list2));
            AppStoreFileManager appStoreFileManager = AppStoreFileManager.INSTANCE;
            AudioBookItem mAudioBookItem = getMAudioBookItem();
            Intrinsics.XXI(mAudioBookItem);
            String binOnlinePath = mAudioBookItem.getBinOnlinePath();
            AudioBookItem mAudioBookItem2 = getMAudioBookItem();
            Intrinsics.XXI(mAudioBookItem2);
            AppStoreFileManager.downloadAppFile$default(appStoreFileManager, binOnlinePath, mAudioBookItem2.getMPackage(), getMArg1() == 0 ? 3 : 4, 0, 8, null);
        }
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getBtnBottomLinkJump() {
        return (Button) this.btnBottomLinkJump$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(AudioBookLearnActivity audioBookLearnActivity, List list) {
        if (list != null) {
            a01.OXO1.IiI10X().put(audioBookLearnActivity.getMSDCardName(), new Gson().toJson(CollectionsKt___CollectionsKt.OO0Oi10(list)));
        }
        audioBookLearnActivity.mAudioBookLearnList = list != null ? CollectionsKt___CollectionsKt.OO0Oi10(list) : null;
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final AudioBookLearnActivity audioBookLearnActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (final AudioBookItem audioBookItem : audioBookLearnActivity.mAudioBookItemFiles) {
            DslAdapterExKt.O10IXXX0X(audioBookLearnActivity.getDslAdapter(), R.layout.item_list_audio_book_learn, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOIiXO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AudioBookLearnActivity.showList$lambda$0$0(audioBookItem, audioBookLearnActivity, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final AudioBookItem audioBookItem, final AudioBookLearnActivity audioBookLearnActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.I01O0IX
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AudioBookLearnActivity.showList$lambda$0$0$0(audioBookItem, audioBookLearnActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(final AudioBookItem audioBookItem, final AudioBookLearnActivity audioBookLearnActivity, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        int i2;
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
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        Intrinsics.XXI(imageViewImg);
        Glide.with(imageViewImg.getContext()).load(audioBookItem.getOnlinePath()).error(R.drawable.audiobook_normal_icon).into(imageViewImg);
        final ImageView imageViewImg2 = itemHolder.img(R.id.list_item_choose_iv);
        if (audioBookItem.isChoose()) {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageViewImg2);
        } else {
            Intrinsics.XXI(imageViewImg2);
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageViewImg2);
        }
        if (audioBookLearnActivity.getOpenDeleteType()) {
            itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi1X0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioBookLearnActivity.showList$lambda$0$0$0$0(audioBookItem, audioBookLearnActivity, imageViewImg2, view);
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
    public static final void showList$lambda$0$0$0$0(AudioBookItem audioBookItem, AudioBookLearnActivity audioBookLearnActivity, ImageView imageView, View view) {
        audioBookItem.setChoose(!audioBookItem.isChoose());
        if (audioBookItem.isChoose()) {
            audioBookLearnActivity.setDeleteNum(audioBookLearnActivity.getDeleteNum() + 1);
        } else {
            audioBookLearnActivity.setDeleteNum(audioBookLearnActivity.getDeleteNum() - 1);
        }
        audioBookLearnActivity.changeDeleteBtnText(audioBookLearnActivity.getDeleteNum());
        if (audioBookItem.isChoose()) {
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(imageView);
        } else {
            Intrinsics.XXI(imageView);
            Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(imageView);
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void allSelect(boolean z) {
        super.allSelect(z);
        Iterator<T> it = this.mAudioBookItemFiles.iterator();
        while (it.hasNext()) {
            ((AudioBookItem) it.next()).setChoose(isAllSelect());
        }
        if (getOpenDeleteType()) {
            setDeleteNum(isAllSelect() ? this.mAudioBookItemFiles.size() : 0);
            changeDeleteBtnText(getDeleteNum());
        }
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void cleanListData() {
        super.cleanListData();
        List<AppFileDetail> list = this.mAudioBookLearnList;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void confirmDeleteFile() {
        super.confirmDeleteFile();
        if (this.deleteFilePath.size() > 0) {
            BaseJLFileManageActivity.showLoading$default(this, false, 1, null);
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.DELETE, new BleAppAudioBookPath(this.deleteFilePath.size(), CollectionsKt___CollectionsKt.i0I0O111I(this.deleteFilePath)), false, false, 24, null);
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void deleteFilePath(boolean z) {
        super.deleteFilePath(z);
        dismissLoading();
        if (!z) {
            ToastUtils.showLong(R.string.failed_to_delete);
            return;
        }
        Iterator<AudioBookItem> it = this.mAudioBookItemFiles.iterator();
        while (it.hasNext()) {
            if (it.next().isChoose()) {
                it.remove();
            }
        }
        showList();
        setOpenDeleteType(false);
        changeActivityState();
    }

    @aa1
    public final List<String> getDeleteFilePath() {
        return this.deleteFilePath;
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void getFile() {
        super.getFile();
        a01.OXO1.XO0O10().put(b01.f5634XI, new Gson().toJson(this.mAudioBookItemFiles));
        int i = this.mResultCode;
        String string = getTvFreeSpace().getText().toString();
        int mArg1 = getMArg1();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", string);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) OnLineLearningFileActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, i);
    }

    @aa1
    public final List<AudioBookItem> getMAudioBookItemFiles() {
        return this.mAudioBookItemFiles;
    }

    @tb1
    public final List<AudioBookItem> getMAudioBookItemList() {
        return this.mAudioBookItemList;
    }

    @tb1
    public final List<AppFileDetail> getMAudioBookLearnList() {
        return this.mAudioBookLearnList;
    }

    public final int getMResultCode() {
        return this.mResultCode;
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        Collection collectionM39402iI;
        String string;
        super.initView();
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        if (textView != null) {
            if (getMArg1() == 0 && q62.OXO1.i000X()) {
                string = getString(R.string.storybook);
            } else {
                string = getMArg1() == 0 ? getString(R.string.item_audio_book_learn_title) : getString(R.string.item_learn_card_title);
            }
            textView.setText(string);
        }
        i72 i72Var = i72.OXO1;
        if (i72Var.XOIO11O()) {
            getBtnBottomLinkJump().setVisibility(8);
            getRightBtn().setVisibility(8);
        } else {
            getBtnBottomLinkJump().setVisibility(0);
            getRightBtn().setVisibility(0);
        }
        if (i72Var.iX0iii0()) {
            getAbhTitleRight().setVisibility(0);
            getAbhTitleRight().setImageResource(R.drawable.icon_sound_learn_help);
            getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        }
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(getMSDCardName())).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), AppFileDetail.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        List<AppFileDetail> listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        this.mAudioBookLearnList = listOO0Oi10;
        if (listOO0Oi10 == null || (listOO0Oi10 != null && listOO0Oi10.size() == 0)) {
            AppStoreFileManager.INSTANCE.getAudioBookFileList(getMArg1() == 0 ? "2" : "3", new Function1() { // from class: com.android.mltcode.paycertificationapi.XIiXOOO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AudioBookLearnActivity.initView$lambda$0(this.f4630IO, (List) obj);
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_audio_book_learn;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.mResultCode && i2 == -1) {
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("chooseItem") : null;
            Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type kotlin.String");
            List<AudioBookItem> list = (List) new Gson().fromJson((String) serializableExtra, new OXO1().getType());
            this.mAudioBookItemList = list;
            setMTotalListSize(list != null ? list.size() : 1);
            setMCurListSize(1);
            downloadAppFile();
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void onAudioAppOpUpdate(@aa1 BleAppOp appOp) {
        Intrinsics.X0O(appOp, "appOp");
        if (appOp.getMStatus() == 1) {
            List<AudioBookItem> list = this.mAudioBookItemList;
            if (list != null) {
                TypeIntrinsics.OXO1(list).remove(getMAudioBookItem());
            }
            List<AudioBookItem> list2 = this.mAudioBookItemList;
            if (list2 != null) {
                Intrinsics.XXI(list2);
                if (!list2.isEmpty()) {
                    setMCurListSize(getMCurListSize() + 1);
                    downloadAppFile();
                    return;
                }
            }
            super.onAudioAppOpUpdate(appOp);
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        List<AudioBookItem> list = this.mAudioBookItemFiles;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (AudioBookItem audioBookItem : list) {
            if (audioBookItem.isChoose()) {
                this.deleteFilePath.add(getMSDCardName() + "/" + audioBookItem.getMPackage());
            }
            arrayList.add(Unit.OXO1);
        }
        if (!getOpenDeleteType()) {
            getFile();
        } else if (this.mAudioBookItemFiles.size() > 0) {
            showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.audio_book_delete_pop_content2, R.string.audio_book_delete_pop_sure);
        } else {
            ToastUtils.showLong(R.string.select_file_tip);
        }
    }

    public final void onBottomLinkJump(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String str = getMArg1() == 0 ? "2" : "3";
        BleCache bleCache = BleCache.INSTANCE;
        X1OOO.i010I(this, "https://dev.iot-solution.net/audiobookDownload/dist?appModuleId=" + str + "&bleName=" + bleCache.getMBleName() + "&flag=" + bleCache.getMFirmwareFlag());
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale, "getDefault(...)");
        String upperCase = "music".toUpperCase(locale);
        Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
        arrayList.add(upperCase);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.UPDATE, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(arrayList)), false, false, 24, null);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        setMSDCardName(getMArg1() == 0 ? XIi00iiXO.O00 : XIi00iiXO.IiI10X);
        ArrayList arrayList = new ArrayList();
        String mSDCardName = getMSDCardName();
        Locale locale = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale, "getDefault(...)");
        String upperCase = mSDCardName.toUpperCase(locale);
        Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
        arrayList.add(upperCase);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.UPDATE, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(arrayList)), false, false, 24, null);
        getRecyclerView().setLayoutManager(new GridLayoutManager(this, 3));
        readListData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getDslAdapter() != null) {
            getDslAdapter().notifyDataChanged();
        }
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/audio_book_download_help.html");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void readListData() {
        ArrayList arrayList = new ArrayList();
        String mSDCardName = getMSDCardName();
        Locale locale = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale, "getDefault(...)");
        String upperCase = mSDCardName.toUpperCase(locale);
        Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
        arrayList.add(upperCase);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.READ, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(arrayList)), false, false, 24, null);
    }

    public final void setMAudioBookItemList(@tb1 List<AudioBookItem> list) {
        this.mAudioBookItemList = list;
    }

    public final void setMAudioBookLearnList(@tb1 List<AppFileDetail> list) {
        this.mAudioBookLearnList = list;
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void showList() {
        super.showList();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " showList -> mAudioBookItemFiles = " + this.mAudioBookItemFiles);
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1OIXOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioBookLearnActivity.showList$lambda$0(this.f8035IO, (DslAdapter) obj);
            }
        });
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseJLFileManageActivity
    public void upListData(@aa1 BleAppAudioBookList filePath) {
        Collection collectionM39402iI;
        Object next;
        String lowerCase;
        String lowerCase2;
        Intrinsics.X0O(filePath, "filePath");
        if (!i72.OXO1.XOIO11O()) {
            getOpenDeleteBtn().setVisibility(filePath.getMCount() == 0 ? 8 : 0);
        }
        this.mAudioBookItemFiles.clear();
        List<AppFileDetail> list = this.mAudioBookLearnList;
        if (list == null || (list != null && list.size() == 0)) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(getMSDCardName())).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), AppFileDetail.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            this.mAudioBookLearnList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = this.TAG;
        List<AppFileDetail> list2 = this.mAudioBookLearnList;
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        i1o0oxo1o.OXO1(str + " mAudioBookLearnList = " + numValueOf + "  mSDCardName = " + getMSDCardName());
        i1o0oxo1o.XIi00iiXO(this.TAG + " filePath = " + filePath.getMList().size() + "  mSDCardName = " + filePath);
        for (BleFilePath bleFilePath : filePath.getMList()) {
            List<AppFileDetail> list3 = this.mAudioBookLearnList;
            Intrinsics.XXI(list3);
            Iterator<T> it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String appPackName = ((AppFileDetail) next).getAppPackName();
                Locale locale = Locale.ROOT;
                lowerCase = appPackName.toLowerCase(locale);
                Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
                lowerCase2 = bleFilePath.getMName().toLowerCase(locale);
                Intrinsics.O10IXXX0X(lowerCase2, "toLowerCase(...)");
            } while (!Intrinsics.XOO0ii0(lowerCase, lowerCase2));
            AppFileDetail appFileDetail = (AppFileDetail) next;
            if (appFileDetail != null) {
                this.mAudioBookItemFiles.add(new AudioBookItem(0, Intrinsics.XOO0ii0(getMSDCardName(), XIi00iiXO.O00) ? appFileDetail.getAppName() : appFileDetail.getAppGroupName(), (int) (appFileDetail.getAppSize() * ((double) 1024)), false, appFileDetail.getAppPreImg(), null, false, appFileDetail.getAppPackName(), 0, 361, null));
            } else {
                this.mAudioBookItemFiles.add(new AudioBookItem(0, bleFilePath.getMName(), bleFilePath.getMSize() / 1024, false, "", null, false, bleFilePath.getMName(), 0, 361, null));
            }
        }
        showList();
    }
}
