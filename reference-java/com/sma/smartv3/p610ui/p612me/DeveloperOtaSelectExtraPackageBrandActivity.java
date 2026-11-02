package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.ExtraPackageDataList;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.p610ui.p612me.DeveloperOtaSelectExtraPackageBrandActivity;
import com.sma.smartv3.p610ui.timezonepicker.TimeZonePicker;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectExtraPackageBrandActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectExtraPackageBrandActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageBrandActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n19#2:90\n15#2:91\n19#2:92\n15#2:93\n11#2,2:112\n69#3,3:94\n72#3,5:98\n69#3,3:103\n72#3,5:107\n1#4:97\n1#4:106\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectExtraPackageBrandActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageBrandActivity\n*L\n26#1:90\n26#1:91\n32#1:92\n32#1:93\n74#1:112,2\n42#1:94,3\n42#1:98,5\n85#1:103,3\n85#1:107,5\n42#1:97\n85#1:106\n*E\n"})
public final class DeveloperOtaSelectExtraPackageBrandActivity extends BaseListActivity<ExtraPackageData> {

    @aa1
    private final ExtraPackVersions extraPackVersions;

    @aa1
    private final Lazy tvSelectRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I011OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectExtraPackageBrandActivity.tvSelectRemind_delegate$lambda$0(this.f1049IO);
        }
    });

    @aa1
    private final Lazy tvSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXI11O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectExtraPackageBrandActivity.tvSelect_delegate$lambda$0(this.f5024IO);
        }
    });

    @aa1
    private final Lazy btNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiO0Ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectExtraPackageBrandActivity.btNext_delegate$lambda$0(this.f3730IO);
        }
    });

    @aa1
    private final ArrayList<ExtraPackageData> dataList = new ArrayList<>();

    public DeveloperOtaSelectExtraPackageBrandActivity() {
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        Object extraPackVersions = new ExtraPackVersions(null, null, null, null, null, null, null, 127, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(ExtraPackVersions.class.getName()), (Class<Object>) ExtraPackVersions.class);
        this.extraPackVersions = (ExtraPackVersions) (objFromJson != null ? objFromJson : extraPackVersions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectExtraPackageBrandActivity developerOtaSelectExtraPackageBrandActivity) {
        return (AppCompatButton) developerOtaSelectExtraPackageBrandActivity.findViewById(R.id.bt_next);
    }

    private final AppCompatButton getBtNext() {
        return (AppCompatButton) this.btNext$delegate.getValue();
    }

    private final TextView getTvSelect() {
        return (TextView) this.tvSelect$delegate.getValue();
    }

    private final TextView getTvSelectRemind() {
        return (TextView) this.tvSelectRemind$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(DeveloperOtaSelectExtraPackageBrandActivity developerOtaSelectExtraPackageBrandActivity, ExtraPackageData extraPackageData, View view) {
        developerOtaSelectExtraPackageBrandActivity.getTvSelect().setText(extraPackageData.getVersion() + "  -- " + extraPackageData.getInfo());
        developerOtaSelectExtraPackageBrandActivity.extraPackVersions.setBrandPackVersion(new FirmwareVersion(extraPackageData.getFileName(), extraPackageData.getFileSize(), extraPackageData.getFileUrl(), extraPackageData.getVersion(), extraPackageData.getInfo(), 0, null, null, null, null, TimeZonePicker.OXO1, null));
        a01.OXO1.XIi00iiXO().put(ExtraPackVersions.class.getName(), new Gson().toJson(developerOtaSelectExtraPackageBrandActivity.extraPackVersions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectExtraPackageBrandActivity developerOtaSelectExtraPackageBrandActivity) {
        return (TextView) developerOtaSelectExtraPackageBrandActivity.findViewById(R.id.tv_select_remind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectExtraPackageBrandActivity developerOtaSelectExtraPackageBrandActivity) {
        return (TextView) developerOtaSelectExtraPackageBrandActivity.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        Object extraPackageDataList = new ExtraPackageDataList(0, null, 3, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(ExtraPackageDataList.class.getName()), (Class<Object>) ExtraPackageDataList.class);
        if (objFromJson != null) {
            extraPackageDataList = objFromJson;
        }
        Iterator<ExtraPackageData> it = ((ExtraPackageDataList) extraPackageDataList).getData().iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            ExtraPackageData next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            ExtraPackageData extraPackageData = next;
            if (extraPackageData.getType() == -3) {
                this.dataList.add(extraPackageData);
            }
        }
        if (this.dataList.size() == 0) {
            startActivity(new Intent(this, (Class<?>) DeveloperOtaSelectExtraPackageFontActivity.class));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<ExtraPackageData> initList() {
        return this.dataList;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_brand_pack);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_test_ota_select_version_list;
    }

    public final void nextOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getBtNext().setVisibility(8);
        startActivity(new Intent(this, (Class<?>) DeveloperOtaSelectExtraPackageFontActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 final ExtraPackageData item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(android.R.id.text1, "version:" + item.getVersion() + "\nfileName:" + item.getFileName() + "\nfirmwareVersion:" + item.getFirmwareVersion() + "\ninfo:" + item.getInfo());
        holder.O10IXXX0X(android.R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0011
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeveloperOtaSelectExtraPackageBrandActivity.initItem$lambda$0$0(this.f7257IO, item, view);
            }
        });
    }
}
