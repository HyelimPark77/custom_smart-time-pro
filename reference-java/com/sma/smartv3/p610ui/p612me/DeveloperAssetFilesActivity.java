package com.sma.smartv3.p610ui.p612me;

import android.R;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperAssetFilesActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperAssetFilesActivity extends BaseListActivity<String> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(DeveloperAssetFilesActivity developerAssetFilesActivity, String str, View view) {
        developerAssetFilesActivity.setResult(-1, new Intent().putExtra("text", str));
        developerAssetFilesActivity.finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<String> initList() throws IOException {
        List<String> listOXI0X0;
        AssetManager assets = getAssets();
        String mArg0 = getMArg0();
        Intrinsics.XXI(mArg0);
        String[] list = assets.list(mArg0);
        return (list == null || (listOXI0X0 = ArraysKt___ArraysKt.OXI0X0(list)) == null) ? new ArrayList() : listOXI0X0;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_asset_files;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 final String item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.text1, item);
        holder.O10IXXX0X(R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiX11XIO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeveloperAssetFilesActivity.initItem$lambda$0$0(this.f8630IO, item, view);
            }
        });
    }
}
