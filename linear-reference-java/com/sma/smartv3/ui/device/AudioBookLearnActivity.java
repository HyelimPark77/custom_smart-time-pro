package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.I01O0IX;
import com.android.mltcode.paycertificationapi.I10i100ii;
import com.android.mltcode.paycertificationapi.IOIiXO;
import com.android.mltcode.paycertificationapi.OOO1II;
import com.android.mltcode.paycertificationapi.OXOiX1X;
import com.android.mltcode.paycertificationapi.Oi1X0;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XIiXOOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1OIXOX;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AudioBookItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.view.text.PFMedium;
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
import java.lang.reflect.Type;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAudioBookLearnActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBookLearnActivity.kt\ncom/sma/smartv3/ui/device/AudioBookLearnActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n50#2,3:392\n53#2:398\n55#2,2:400\n50#2,3:421\n53#2:427\n55#2,2:429\n35#2,2:438\n35#2,2:461\n1563#3:395\n1634#3,2:396\n1636#3:399\n1563#3:424\n1634#3,2:425\n1636#3:428\n1869#3:431\n1870#3:433\n1563#3:434\n1634#3,3:435\n1869#3,2:459\n87#4,7:402\n94#4,3:410\n70#4,7:413\n97#4:420\n173#4,7:440\n180#4,3:448\n143#4,7:451\n183#4:458\n1#5:409\n1#5:432\n1#5:447\n*S KotlinDebug\n*F\n+ 1 AudioBookLearnActivity.kt\ncom/sma/smartv3/ui/device/AudioBookLearnActivity\n*L\n86#1:392,3\n86#1:398\n86#1:400,2\n161#1:421,3\n161#1:427\n161#1:429,2\n313#1:438,2\n91#1:461,2\n86#1:395\n86#1:396,2\n86#1:399\n161#1:424\n161#1:425,2\n161#1:428\n167#1:431\n167#1:433\n289#1:434\n289#1:435,3\n368#1:459,2\n101#1:402,7\n101#1:410,3\n101#1:413,7\n101#1:420\n314#1:440,7\n314#1:448,3\n314#1:451,7\n314#1:458\n101#1:409\n314#1:447\n*E\n"})
public final class AudioBookLearnActivity extends BaseJLFileManageActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy btnBottomLinkJump$delegate;

    @aa1
    private final List<String> deleteFilePath;

    @aa1
    private final List<AudioBookItem> mAudioBookItemFiles;

    @tb1
    private List<AudioBookItem> mAudioBookItemList;

    @tb1
    private List<AppFileDetail> mAudioBookLearnList;
    private final int mResultCode;

    public static final class OXO1 extends TypeToken<List<? extends AudioBookItem>> {
        public OXO1() {
        }
    }

    public AudioBookLearnActivity() {
        this.btnBottomLinkJump$delegate = LazyKt__LazyJVMKt.iO(new I10i100ii(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new OXOiX1X(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new OOO1II(this));
        this.TAG = "AudioBookLearnActivity";
        this.deleteFilePath = new ArrayList();
        if (getMArg1() != 0) goto L5;
        String r0 = XIi00iiXO.O00;
    L6:
        setMSDCardName(r0);
        this.mAudioBookItemFiles = new ArrayList();
        this.mResultCode = 254;
        return;
    L5:
        r0 = XIi00iiXO.IiI10X;
        goto L6
    }

    public static /* synthetic */ Unit X0i1O(AudioBookLearnActivity r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView X11iII1O1(AudioBookLearnActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1IX(AudioBookLearnActivity r0, List r1) {
        return initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XXIIO1i11(AudioBookItem r0, AudioBookLearnActivity r1, ImageView r2, View r3) {
        showList$lambda$0$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ ImageView XXX11i(AudioBookLearnActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(AudioBookLearnActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AudioBookLearnActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final Button btnBottomLinkJump_delegate$lambda$0(AudioBookLearnActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom_link_jump);
    }

    private final void downloadAppFile() {
        getTaskPanel().setVisibility(0);
        getRecyclerView().setVisibility(8);
        TextView r0 = getTvProgressTip();
        if (getMArg1() != 0) goto L5;
        int r2 = R.string.audiobooks_transmission_tip;
    L6:
        r0.setText(r2);
        getRightBtn().setVisibility(8);
        getRecyclerViewTitle().setVisibility(8);
        getTvCancel().setVisibility(8);
        getTvRetry().setVisibility(8);
        List<AudioBookItem> r1 = this.mAudioBookItemList;
        if (r1 == null) goto L17;
        Intrinsics.XXI(r1);
        if (r1.isEmpty() == true) goto L18;
        List<AudioBookItem> r3 = this.mAudioBookItemList;
        Intrinsics.XXI(r3);
        setMAudioBookItem((AudioBookItem) CollectionsKt___CollectionsKt.IIII0iI(r3));
        AppStoreFileManager r4 = AppStoreFileManager.INSTANCE;
        AudioBookItem r5 = getMAudioBookItem();
        Intrinsics.XXI(r5);
        String r6 = r5.getBinOnlinePath();
        AudioBookItem r7 = getMAudioBookItem();
        Intrinsics.XXI(r7);
        String r8 = r7.getMPackage();
        if (getMArg1() != 0) goto L14;
        int r9 = 3;
    L15:
        AppStoreFileManager.downloadAppFile$default(r4, r6, r8, r9, 0, 8, null);
        return;
    L14:
        r9 = 4;
        goto L15
    L18:
        return;
    L17:
        return;
    L5:
        r2 = R.string.studycard_transmission_tip;
        goto L6
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getBtnBottomLinkJump() {
        return (Button) getValue();
    }

    public static /* synthetic */ Button iI(AudioBookLearnActivity r0) {
        return btnBottomLinkJump_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIXi1iiXI(AudioBookItem r0, AudioBookLearnActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iX1O1(AudioBookItem r0, AudioBookLearnActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    private static final Unit initView$lambda$0(AudioBookLearnActivity r4, List r5) {
        if (r5 == null) goto L4;
        SPUtils r0 = a01.OXO1.IiI10X();
        List r1 = CollectionsKt___CollectionsKt.OO0Oi10(r5);
        r0.put(r4.getMSDCardName(), new Gson().toJson(r1));
    L4:
        if (r5 == null) goto L6;
        List<AppFileDetail> r6 = CollectionsKt___CollectionsKt.OO0Oi10(r5);
    L7:
        r4.mAudioBookLearnList = r6;
        return Unit.OXO1;
    L6:
        r6 = null;
        goto L7
    }

    private static final Unit showList$lambda$0(final AudioBookLearnActivity r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        Iterator<AudioBookItem> r5 = r3.mAudioBookItemFiles.iterator();
    L4:
        if (r5.hasNext() == false) goto L7;
        final AudioBookItem r0 = r5.next();
        DslAdapterExKt.O10IXXX0X(r3.getDslAdapter(), R.layout.item_list_audio_book_learn, new IOIiXO(r0, r3));
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final AudioBookItem r1, final AudioBookLearnActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new I01O0IX(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(final AudioBookItem r0, final AudioBookLearnActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "adapterItem");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tv);
        if (r6 == null) goto L5;
        r6.setText(r0.getName());
    L5:
        TextView r7 = r2.tv(R.id.audio_book_file_size);
        if (r7 == null) goto L8;
        r7.setText(r0.getSize() + "kb");
    L8:
        ImageView r8 = r2.img(R.id.iv);
        Intrinsics.XXI(r8);
        Glide.with(r8.getContext()).load(r0.getOnlinePath()).error(R.drawable.audiobook_normal_icon).into(r8);
        final ImageView r9 = r2.img(R.id.list_item_choose_iv);
        if (r0.isChoose() == false) goto L11;
        Intrinsics.XXI(r9);
        Glide.with(r9.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r9);
    L13:
        if (r1.getOpenDeleteType() == false) goto L15;
        r2.itemView.setOnClickListener(new Oi1X0(r0, r1, r9));
        int r10 = 0;
    L16:
        r9.setVisibility(r10);
        return Unit.OXO1;
    L15:
        r10 = 8;
        goto L16
    L11:
        Intrinsics.XXI(r9);
        Glide.with(r9.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r9);
        goto L13
    }

    private static final void showList$lambda$0$0$0$0(AudioBookItem r0, AudioBookLearnActivity r1, ImageView r2, View r3) {
        r0.setChoose(!r0.isChoose());
        if (r0.isChoose() == false) goto L5;
        r1.setDeleteNum(r1.getDeleteNum() + 1);
    L6:
        r1.changeDeleteBtnText(r1.getDeleteNum());
        if (r0.isChoose() == false) goto L10;
        Intrinsics.XXI(r2);
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_item_choose_icon)).into(r2);
        return;
    L10:
        Intrinsics.XXI(r2);
        Glide.with(r2.getContext()).load(Integer.valueOf(R.drawable.audio_book_unchoose_icon)).into(r2);
        return;
    L5:
        r1.setDeleteNum(r1.getDeleteNum() - 1);
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void allSelect(boolean r3) {
        super.allSelect(r3);
        Iterator<T> r4 = this.mAudioBookItemFiles.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        ((AudioBookItem) r4.next()).setChoose(isAllSelect());
        goto L4
    L7:
        if (getOpenDeleteType() == true) goto L9;
    L13:
        getDslAdapter().notifyDataChanged();
        return;
    L9:
        if (isAllSelect() == false) goto L11;
        int r5 = this.mAudioBookItemFiles.size();
    L12:
        setDeleteNum(r5);
        changeDeleteBtnText(getDeleteNum());
        goto L13
    L11:
        r5 = 0;
        goto L12
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void cleanListData() {
        super.cleanListData();
        List<AppFileDetail> r0 = this.mAudioBookLearnList;
        if (r0 == null) goto L6;
        r0.clear();
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void confirmDeleteFile() {
        super.confirmDeleteFile();
        if (this.deleteFilePath.size() <= 0) goto L6;
        BaseJLFileManageActivity.showLoading$default(this, false, 1, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.DELETE, new BleAppAudioBookPath(this.deleteFilePath.size(), CollectionsKt___CollectionsKt.i0I0O111I(this.deleteFilePath)), false, false, 24, null);
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void deleteFilePath(boolean r2) {
        super.deleteFilePath(r2);
        dismissLoading();
        if (r2 == false) goto L12;
        Iterator<AudioBookItem> r3 = this.mAudioBookItemFiles.iterator();
    L6:
        if (r3.hasNext() == false) goto L10;
        if (r3.next().isChoose() == false) goto L6;
        r3.remove();
        goto L6
    L10:
        showList();
        setOpenDeleteType(false);
        changeActivityState();
        return;
    L12:
        ToastUtils.showLong(R.string.failed_to_delete);
    }

    @aa1
    public final List<String> getDeleteFilePath() {
        return this.deleteFilePath;
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void getFile() {
        super.getFile();
        SPUtils r0 = a01.OXO1.XO0O10();
        List<AudioBookItem> r1 = this.mAudioBookItemFiles;
        r0.put(b01.XI, new Gson().toJson(r1));
        int r2 = this.mResultCode;
        String r3 = getTvFreeSpace().getText().toString();
        int r4 = getMArg1();
        Bundle r5 = new Bundle();
        r5.putString("mArg0", r3);
        r5.putInt("mArg1", r4);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r6 = new Intent(this, OnLineLearningFileActivity.class);
        r6.putExtras(r5);
        startActivityForResult(r6, r2);
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

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (r0 != null) goto L5;
    L14:
        i72 r1 = i72.OXO1;
        if (r1.XOIO11O() == false) goto L17;
        getBtnBottomLinkJump().setVisibility(8);
        getRightBtn().setVisibility(8);
    L19:
        if (r1.iX0iii0() == false) goto L39;
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_sound_learn_help);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    L39:
        JsonArray r2 = JsonParser.parseString(a01.OXO1.IiI10X().getString(getMSDCardName())).getAsJsonArray();     // Catch: Exception -> L27
        Intrinsics.XXI(r2);     // Catch: Exception -> L27
        Collection r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));     // Catch: Exception -> L27
        Iterator<JsonElement> r4 = r2.iterator();     // Catch: Exception -> L27
    L24:
        if (r4.hasNext() == false) goto L28;
        JsonElement r5 = r4.next();     // Catch: Exception -> L27
        r3.add(new Gson().fromJson(r5, AppFileDetail.class));     // Catch: Exception -> L27
    L28:
        List<AppFileDetail> r6 = CollectionsKt___CollectionsKt.OO0Oi10(r3);
        this.mAudioBookLearnList = r6;
        if (r6 == null) goto L33;
        if (r6 != null) goto L32;
        return;
    L32:
        if (r6.size() == 0) goto L33;
        return;
    L33:
        AppStoreFileManager r7 = AppStoreFileManager.INSTANCE;
        if (getMArg1() != 0) goto L36;
        String r8 = "2";
    L37:
        r7.getAudioBookFileList(r8, new XIiXOOO(this));
        return;
    L36:
        r8 = "3";
    L27:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L28
    L17:
        getBtnBottomLinkJump().setVisibility(0);
        getRightBtn().setVisibility(0);
        goto L19
    L5:
        if (getMArg1() != 0) goto L10;
        if (q62.OXO1.i000X() == false) goto L10;
        String r9 = getString(R.string.storybook);
    L13:
        r0.setText(r9);
    L10:
        if (getMArg1() != 0) goto L12;
        r9 = getString(R.string.item_audio_book_learn_title);
        goto L13
    L12:
        r9 = getString(R.string.item_learn_card_title);
        goto L13
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_audio_book_learn;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, @tb1 Intent r4) {
        super.onActivityResult(r2, r3, r4);
        if (r2 == this.mResultCode) goto L5;
        return;
    L5:
        if (r3 != (-1)) goto L16;
        if (r4 == null) goto L8;
        Serializable r5 = r4.getSerializableExtra("chooseItem");
    L9:
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type kotlin.String");
        Type r6 = new OXO1().getType();
        List<AudioBookItem> r7 = (List) new Gson().fromJson((String) r5, r6);
        this.mAudioBookItemList = r7;
        if (r7 == null) goto L12;
        int r8 = r7.size();
    L13:
        setMTotalListSize(r8);
        setMCurListSize(1);
        downloadAppFile();
        return;
    L12:
        r8 = 1;
        goto L13
    L8:
        r5 = null;
        goto L9
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void onAudioAppOpUpdate(@aa1 BleAppOp r4) {
        Intrinsics.X0O(r4, "appOp");
        if (r4.getMStatus() != 1) goto L15;
        List<AudioBookItem> r0 = this.mAudioBookItemList;
        if (r0 == null) goto L7;
        AudioBookItem r2 = getMAudioBookItem();
        TypeIntrinsics.OXO1(r0).remove(r2);
    L7:
        List<AudioBookItem> r1 = this.mAudioBookItemList;
        if (r1 == null) goto L13;
        Intrinsics.XXI(r1);
        if (r1.isEmpty() == true) goto L13;
        setMCurListSize(getMCurListSize() + 1);
        downloadAppFile();
        return;
    L13:
        super.onAudioAppOpUpdate(r4);
        return;
    }

    public final void onBottomClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        List<AudioBookItem> r7 = this.mAudioBookItemFiles;
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r7, 10));
        Iterator<T> r8 = r7.iterator();
    L4:
        if (r8.hasNext() == false) goto L10;
        AudioBookItem r1 = (AudioBookItem) r8.next();
        if (r1.isChoose() == false) goto L8;
        this.deleteFilePath.add(getMSDCardName() + "/" + r1.getMPackage());
    L8:
        r0.add(Unit.OXO1);
        goto L4
    L10:
        if (getOpenDeleteType() == true) goto L12;
        getFile();
        return;
    L12:
        if (this.mAudioBookItemFiles.size() <= 0) goto L15;
        showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.audio_book_delete_pop_content2, R.string.audio_book_delete_pop_sure);
        return;
    L15:
        ToastUtils.showLong(R.string.select_file_tip);
    }

    public final void onBottomLinkJump(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (getMArg1() != 0) goto L5;
        String r6 = "2";
    L6:
        BleCache r0 = BleCache.INSTANCE;
        X1OOO.i010I(this, "https://dev.iot-solution.net/audiobookDownload/dist?appModuleId=" + r6 + "&bleName=" + r0.getMBleName() + "&flag=" + r0.getMFirmwareFlag());
        return;
    L5:
        r6 = "3";
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ArrayList r0 = new ArrayList();
        Locale r1 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r1, "getDefault(...)");
        String r2 = "music".toUpperCase(r1);
        Intrinsics.O10IXXX0X(r2, "toUpperCase(...)");
        r0.add(r2);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.UPDATE, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(r0)), false, false, 24, null);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        if (getMArg1() != 0) goto L5;
        String r0 = XIi00iiXO.O00;
    L6:
        setMSDCardName(r0);
        ArrayList r1 = new ArrayList();
        String r2 = getMSDCardName();
        Locale r3 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r3, "getDefault(...)");
        String r4 = r2.toUpperCase(r3);
        Intrinsics.O10IXXX0X(r4, "toUpperCase(...)");
        r1.add(r4);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.UPDATE, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(r1)), false, false, 24, null);
        getRecyclerView().setLayoutManager(new GridLayoutManager(this, 3));
        readListData();
        return;
    L5:
        r0 = XIi00iiXO.IiI10X;
        goto L6
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getDslAdapter() == null) goto L6;
        getDslAdapter().notifyDataChanged();
        return;
    }

    public final void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        Bundle r4 = new Bundle();
        r4.putString("mArg0", "https://api.iot-solution.net/web/help/audio_book_download_help.html");
        r4.putInt("mArg1", 2);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, WebViewActivity.class);
        r0.putExtras(r4);
        startActivity(r0);
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void readListData() {
        ArrayList r0 = new ArrayList();
        String r1 = getMSDCardName();
        Locale r2 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r2, "getDefault(...)");
        String r3 = r1.toUpperCase(r2);
        Intrinsics.O10IXXX0X(r3, "toUpperCase(...)");
        r0.add(r3);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FILE_PATH, BleKeyFlag.READ, new BleAppAudioBookPath(1, CollectionsKt___CollectionsKt.i0I0O111I(r0)), false, false, 24, null);
    }

    public final void setMAudioBookItemList(@tb1 List<AudioBookItem> r1) {
        this.mAudioBookItemList = r1;
    }

    public final void setMAudioBookLearnList(@tb1 List<AppFileDetail> r1) {
        this.mAudioBookLearnList = r1;
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void showList() {
        super.showList();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " showList -> mAudioBookItemFiles = " + this.mAudioBookItemFiles);
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new iO1OIXOX(this));
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.ui.device.BaseJLFileManageActivity
    public void upListData(@aa1 BleAppAudioBookList r19) {
        Intrinsics.X0O(r19, Y5.c.c);
        if (i72.OXO1.XOIO11O() == true) goto L9;
        PFMedium r2 = getOpenDeleteBtn();
        if (r19.getMCount() != 0) goto L7;
        int r3 = 8;
    L8:
        r2.setVisibility(r3);
        goto L9
    L7:
        r3 = 0;
    L9:
        this.mAudioBookItemFiles.clear();
        List<AppFileDetail> r4 = this.mAudioBookLearnList;
        if (r4 == null) goto L47;
        if (r4 != null) goto L13;
    L22:
        i1O0OXO1O r5 = i1O0OXO1O.OXO1;
        String r6 = this.TAG;
        List<AppFileDetail> r7 = this.mAudioBookLearnList;
        if (r7 == null) goto L25;
        Integer r8 = Integer.valueOf(r7.size());
    L26:
        r5.OXO1(r6 + " mAudioBookLearnList = " + r8 + "  mSDCardName = " + getMSDCardName());
        r5.XIi00iiXO(this.TAG + " filePath = " + r19.getMList().size() + "  mSDCardName = " + r19);
        Iterator<T> r1 = r19.getMList().iterator();
    L28:
        if (r1.hasNext() == false) goto L45;
        BleFilePath r9 = (BleFilePath) r1.next();
        List<AppFileDetail> r10 = this.mAudioBookLearnList;
        Intrinsics.XXI(r10);
        Iterator<T> r11 = r10.iterator();
    L31:
        if (r11.hasNext() == false) goto L35;
        Object r12 = r11.next();
        String r13 = ((AppFileDetail) r12).getAppPackName();
        Locale r14 = Locale.ROOT;
        String r15 = r13.toLowerCase(r14);
        Intrinsics.O10IXXX0X(r15, "toLowerCase(...)");
        String r16 = r9.getMName().toLowerCase(r14);
        Intrinsics.O10IXXX0X(r16, "toLowerCase(...)");
        if (Intrinsics.XOO0ii0(r15, r16) == false) goto L31;
    L36:
        AppFileDetail r17 = (AppFileDetail) r12;
        if (r17 != null) goto L38;
        this.mAudioBookItemFiles.add(new AudioBookItem(0, r9.getMName(), r9.getMSize() / 1024, false, "", null, false, r9.getMName(), 0, 361, null));
        goto L28
    L38:
        List<AudioBookItem> r18 = this.mAudioBookItemFiles;
        String r110 = r17.getAppPreImg();
        String r111 = r17.getAppPackName();
        if (Intrinsics.XOO0ii0(getMSDCardName(), XIi00iiXO.O00) == false) goto L42;
        String r20 = r17.getAppName();
    L43:
        r18.add(new AudioBookItem(0, r20, (int) (r17.getAppSize() * ((double) 1024)), false, r110, null, false, r111, 0, 361, null));
        goto L28
    L42:
        r20 = r17.getAppGroupName();
        goto L43
    L35:
        r12 = null;
        goto L36
    L45:
        showList();
        return;
    L25:
        r8 = null;
        goto L26
    L13:
        if (r4.size() != 0) goto L22;
    L47:
        JsonArray r21 = JsonParser.parseString(a01.OXO1.IiI10X().getString(getMSDCardName())).getAsJsonArray();     // Catch: Exception -> L20
        Intrinsics.XXI(r21);     // Catch: Exception -> L20
        Collection r22 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r21, 10));     // Catch: Exception -> L20
        Iterator<JsonElement> r23 = r21.iterator();     // Catch: Exception -> L20
    L17:
        if (r23.hasNext() == false) goto L21;
        r22.add(new Gson().fromJson(r23.next(), AppFileDetail.class));     // Catch: Exception -> L20
    L21:
        this.mAudioBookLearnList = CollectionsKt___CollectionsKt.OO0Oi10(r22);
    L20:
        r22 = CollectionsKt__CollectionsKt.iI();
        goto L21
    }
}
