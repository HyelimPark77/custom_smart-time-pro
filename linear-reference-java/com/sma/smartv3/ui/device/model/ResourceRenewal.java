package com.sma.smartv3.ui.device.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.nl3;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreFileList;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nResourceRenewal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n1869#2:173\n1870#2:176\n13805#3,2:174\n*S KotlinDebug\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n*L\n115#1:173\n115#1:176\n116#1:174,2\n*E\n"})
public final class ResourceRenewal extends ViewModel {

    @aa1
    public static final OXO1 Companion = null;
    public static final int QURAN_AUDIO = 1;
    public static final int QURAN_TEXT = 0;
    public static final int RESOURCE_RENEWAL = -1;
    public static final int SACRAL_PUNISHMENT = 2;

    @aa1
    private final MutableLiveData<ArrayList<AppFileDetail>> renewalLiveData;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public ResourceRenewal() {
        this.renewalLiveData = new MutableLiveData();
    }

    public static /* synthetic */ Unit OXO1(int r0, ResourceRenewal r1, List r2) {
        return postData$lambda$0(r0, r1, r2);
    }

    private final void getQuranAudioData(int r1) {
        postData(r1);
    }

    private final void getQuranTextData(int r1) {
        postData(r1);
    }

    private final void getResourceRenewalData() {
        ArrayList<AppFileDetail> r0 = new ArrayList();
        r0.add(new AppFileDetail(UtilsKt.XXO(R.string.quran_text), "0", 0.0d, 0, null, null, null, null, null, null, null, null, false, 8188, null));
        r0.add(new AppFileDetail(UtilsKt.XXO(R.string.quran_audio), "1", 0.0d, 0, null, null, null, null, null, null, null, null, false, 8188, null));
        r0.add(new AppFileDetail(UtilsKt.XXO(R.string.sacral_punishment), "2", 0.0d, 0, null, null, null, null, null, null, null, null, false, 8188, null));
        postValue(r0);
    }

    private final void getSacralPunishmentData(int r1) {
        postData(r1);
    }

    private final void postData(final int r3) {
        AppStoreFileManager.INSTANCE.getAppStoreFileList("4", new nl3(r3, this));
    }

    private static final Unit postData$lambda$0(int r8, ResourceRenewal r9, List r10) {
        if (r10 == null) goto L15;
        LogUtils.i(new Object[]{"postData " + r10.size() + " " + r8 + CertificateUtil.DELIMITER});
        ArrayList<AppFileDetail> r0 = new ArrayList();
        Iterator r11 = r10.iterator();
    L5:
        if (r11.hasNext() == false) goto L14;
        AppStoreFileList r1 = (AppStoreFileList) r11.next();
        AppFileDetail[] r2 = r1.getAppx();
        if (r2 == null) goto L5;
        int r3 = r2.length;
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L5;
        AppFileDetail r5 = r2[r4];
        if (Intrinsics.XOO0ii0(String.valueOf(r8 + 1), r1.getGroupId()) == false) goto L13;
        r0.add(r5);
    L13:
        r4 = r4 + 1;
        goto L9
    L14:
        r9.renewalLiveData.postValue(r0);
    L17:
        return Unit.OXO1;
    L15:
        r9.renewalLiveData.postValue(new ArrayList());
        goto L17
    }

    public final void downloadFile(int r9, @aa1 AppFileDetail r10) {
        Intrinsics.X0O(r10, "appFileDetail");
        String r2 = r10.getAppPack();
        if (r2 == null) goto L6;
        AppStoreFileManager.downloadAppFile$default(AppStoreFileManager.INSTANCE, r2, r10.getAppPackName(), getBleType(r9), 0, 8, null);
        return;
    }

    public final int getBleType(int r3) {
        if (r3 != 0) goto L5;
        return 5;
    L5:
        if (r3 != 1) goto L7;
        return 6;
    L7:
        if (r3 == 2) goto L9;
        return 5;
    L9:
        return 7;
    }

    public final void getData(int r2) {
        if (r2 == (-1)) goto L17;
        if (r2 != 0) goto L6;
        getQuranTextData(r2);
        return;
    L6:
        if (r2 != 1) goto L8;
        getQuranAudioData(r2);
        return;
    L8:
        if (r2 == 2) goto L11;
        getResourceRenewalData();
        return;
    L11:
        getSacralPunishmentData(r2);
        return;
    L17:
        getResourceRenewalData();
    }

    public final int getLayoutId(int r2) {
        if (r2 != (-1)) goto L6;
        return R.layout.item_resource_renewal_list;
    L6:
        return R.layout.item_quran_list;
    }

    @aa1
    public final MutableLiveData<ArrayList<AppFileDetail>> getRenewalLiveData() {
        return this.renewalLiveData;
    }

    @aa1
    public final String getTitleString(int r3) {
        if (r3 == (-1)) goto L18;
        if (r3 == 0) goto L16;
        if (r3 == 1) goto L14;
        if (r3 == 2) goto L12;
        return UtilsKt.XXO(R.string.resource_renewal);
    L12:
        return UtilsKt.XXO(R.string.sacral_punishment);
    L14:
        return UtilsKt.XXO(R.string.quran_audio);
    L16:
        return UtilsKt.XXO(R.string.quran_text);
    L18:
        return UtilsKt.XXO(R.string.resource_renewal);
    }
}
