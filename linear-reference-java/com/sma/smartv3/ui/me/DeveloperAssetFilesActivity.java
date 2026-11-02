package com.sma.smartv3.ui.me;

import android.R;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiX11XIO0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperAssetFilesActivity extends BaseListActivity<String> {
    public DeveloperAssetFilesActivity() {
    }

    public static /* synthetic */ void OIX0iXi(DeveloperAssetFilesActivity r0, String r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    private static final void initItem$lambda$0$0(DeveloperAssetFilesActivity r1, String r2, View r3) {
        r1.setResult(-1, new Intent().putExtra("text", r2));
        r1.finish();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (String) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<String> initList() {
        AssetManager r0 = getAssets();
        String r1 = getMArg0();
        Intrinsics.XXI(r1);
        String[] r2 = r0.list(r1);
        if (r2 == null) goto L9;
        List<String> r3 = ArraysKt___ArraysKt.OXI0X0(r2);
        if (r3 == null) goto L9;
        return r3;
    L9:
        return new ArrayList();
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_asset_files;
    }

    public void initItem(@aa1 ug6 r2, @aa1 final String r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.text1, r3);
        r2.O10IXXX0X(R.id.text1, new iiX11XIO0(this, r3));
    }
}
