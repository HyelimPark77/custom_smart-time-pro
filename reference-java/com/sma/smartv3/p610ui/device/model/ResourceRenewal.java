package com.sma.smartv3.p610ui.device.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreFileList;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.p610ui.device.model.ResourceRenewal;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nResourceRenewal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n1869#2:173\n1870#2:176\n13805#3,2:174\n*S KotlinDebug\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n*L\n115#1:173\n115#1:176\n116#1:174,2\n*E\n"})
public final class ResourceRenewal extends ViewModel {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int QURAN_AUDIO = 1;
    public static final int QURAN_TEXT = 0;
    public static final int RESOURCE_RENEWAL = -1;
    public static final int SACRAL_PUNISHMENT = 2;

    @aa1
    private final MutableLiveData<ArrayList<AppFileDetail>> renewalLiveData = new MutableLiveData<>();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    private final void getQuranAudioData(int i) {
        postData(i);
    }

    private final void getQuranTextData(int i) {
        postData(i);
    }

    private final void getResourceRenewalData() {
        ArrayList<AppFileDetail> arrayList = new ArrayList<>();
        arrayList.add(new AppFileDetail(UtilsKt.XXO(R.string.quran_text), "0", 0.0d, 0L, null, null, null, null, null, null, null, null, false, 8188, null));
        arrayList.add(new AppFileDetail(UtilsKt.XXO(R.string.quran_audio), "1", 0.0d, 0L, null, null, null, null, null, null, null, null, false, 8188, null));
        arrayList.add(new AppFileDetail(UtilsKt.XXO(R.string.sacral_punishment), "2", 0.0d, 0L, null, null, null, null, null, null, null, null, false, 8188, null));
        this.renewalLiveData.postValue(arrayList);
    }

    private final void getSacralPunishmentData(int i) {
        postData(i);
    }

    private final void postData(final int i) {
        AppStoreFileManager.INSTANCE.getAppStoreFileList("4", new Function1() { // from class: com.android.mltcode.paycertificationapi.nl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ResourceRenewal.postData$lambda$0(i, this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postData$lambda$0(int i, ResourceRenewal resourceRenewal, List list) {
        if (list != null) {
            LogUtils.m11130i("postData " + list.size() + " " + i + CertificateUtil.DELIMITER);
            ArrayList<AppFileDetail> arrayList = new ArrayList<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppStoreFileList appStoreFileList = (AppStoreFileList) it.next();
                AppFileDetail[] appx = appStoreFileList.getAppx();
                if (appx != null) {
                    for (AppFileDetail appFileDetail : appx) {
                        if (Intrinsics.XOO0ii0(String.valueOf(i + 1), appStoreFileList.getGroupId())) {
                            arrayList.add(appFileDetail);
                        }
                    }
                }
            }
            resourceRenewal.renewalLiveData.postValue(arrayList);
        } else {
            resourceRenewal.renewalLiveData.postValue(new ArrayList<>());
        }
        return Unit.OXO1;
    }

    public final void downloadFile(int i, @aa1 AppFileDetail appFileDetail) {
        Intrinsics.X0O(appFileDetail, "appFileDetail");
        String appPack = appFileDetail.getAppPack();
        if (appPack != null) {
            AppStoreFileManager.downloadAppFile$default(AppStoreFileManager.INSTANCE, appPack, appFileDetail.getAppPackName(), getBleType(i), 0, 8, null);
        }
    }

    public final int getBleType(int i) {
        if (i == 0) {
            return 5;
        }
        if (i != 1) {
            return i != 2 ? 5 : 7;
        }
        return 6;
    }

    public final void getData(int i) {
        if (i == -1) {
            getResourceRenewalData();
            return;
        }
        if (i == 0) {
            getQuranTextData(i);
            return;
        }
        if (i == 1) {
            getQuranAudioData(i);
        } else if (i != 2) {
            getResourceRenewalData();
        } else {
            getSacralPunishmentData(i);
        }
    }

    public final int getLayoutId(int i) {
        return i == -1 ? R.layout.item_resource_renewal_list : R.layout.item_quran_list;
    }

    @aa1
    public final MutableLiveData<ArrayList<AppFileDetail>> getRenewalLiveData() {
        return this.renewalLiveData;
    }

    @aa1
    public final String getTitleString(int i) {
        if (i == -1) {
            return UtilsKt.XXO(R.string.resource_renewal);
        }
        if (i == 0) {
            return UtilsKt.XXO(R.string.quran_text);
        }
        if (i != 1) {
            return i != 2 ? UtilsKt.XXO(R.string.resource_renewal) : UtilsKt.XXO(R.string.sacral_punishment);
        }
        return UtilsKt.XXO(R.string.quran_audio);
    }
}
