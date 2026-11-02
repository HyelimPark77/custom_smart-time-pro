package com.sma.smartv3.util;

import android.content.Context;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GifUtils {

    @aa1
    public static final GifUtils OXO1 = null;

    public interface OXO1 {
        void OXO1();
    }

    static {
        OXO1 = new GifUtils();
    }

    public GifUtils() {
    }

    public final void OXO1(@aa1 Context r2, @aa1 Object r3, final int r4, @aa1 ImageView r5, @aa1 final OXO1 r6) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "model");
        Intrinsics.X0O(r5, "imageView");
        Intrinsics.X0O(r6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Glide.with(r2).asGif().load(r3).diskCacheStrategy(DiskCacheStrategy.DATA).listener(new GifUtils$play$1(r4, r6)).into(r5);
    }

    public final void XIi00iiXO(@aa1 Context r2, @aa1 Object r3, @aa1 ImageView r4) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "model");
        Intrinsics.X0O(r4, "imageView");
        Glide.with(r2).load(r3).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(r4);
    }
}
