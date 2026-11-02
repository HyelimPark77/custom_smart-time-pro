package com.sma.smartv3.biz;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MyGlideModule implements GlideModule {
    public MyGlideModule() {
    }

    @Override // com.bumptech.glide.module.GlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(@aa1 Context r4, @aa1 GlideBuilder r5) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, "builder");
        r5.setDiskCache(new ExternalCacheDiskCacheFactory(r4, uz0.iX1O1(sz0.OXO1).getName(), DiskCache.Factory.DEFAULT_DISK_CACHE_SIZE));
    }

    @Override // com.bumptech.glide.module.GlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(@aa1 Context r2, @aa1 Glide r3, @aa1 Registry r4) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "glide");
        Intrinsics.X0O(r4, "registry");
    }
}
