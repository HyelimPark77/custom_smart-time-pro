package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.baidu.platform.comapi.map.MapController;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,251:1\n13805#2,2:252\n37#3,2:254\n37#3,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n*L\n233#1:252,2\n246#1:254,2\n247#1:256,2\n*E\n"})
public final class BrandInfoBuilder {
    public static final int CD_BITMAP_COMPRESSION_JL = 2;
    public static final int CD_BITMAP_COMPRESSION_JL_JPEG = 3;
    public static final int CD_BITMAP_COMPRESSION_NONE = 0;
    public static final int CD_BITMAP_COMPRESSION_RLE_LINE = 1;
    public static final int CD_RGB_565 = 1;
    public static final int CD_RGB_565_BE = 2;
    public static final int CD_RGB_888 = 2;
    public static final int GRAVITY_X_CENTER = 4;
    public static final int GRAVITY_X_LEFT = 1;
    public static final int GRAVITY_X_RIGHT = 2;
    public static final int GRAVITY_Y_BOTTOM = 16;
    public static final int GRAVITY_Y_CENTER = 32;
    public static final int GRAVITY_Y_TOP = 8;

    @aa1
    public static final BrandInfoBuilder INSTANCE = null;

    static {
        INSTANCE = new BrandInfoBuilder();
    }

    private BrandInfoBuilder() {
    }

    @aa1
    public final byte[] build(@aa1 String r19, @aa1 BrandInfoImageItem r20) {
        Intrinsics.X0O(r19, "bleName");
        Intrinsics.X0O(r20, MapController.ITEM_LAYER_TAG);
        BleBrandInfo r3 = new BleBrandInfo(null, null, null, 7, null);
        r3.getMHeader().setMItemCount(2);
        long r4 = ((long) r3.getMHeader().getMLengthToWrite()) + ((long) (r3.getMHeader().getMItemCount() * 4));
        r3.getMItem0().setMBleName(r19);
        long r5 = r4 + ((long) r3.getMItem0().getMLengthToWrite());
        r3.getMItem1().setMX(r20.getMX());
        r3.getMItem1().setMY(r20.getMY());
        r3.getMItem1().setMAnchor(r20.getMAnchor());
        r3.getMItem1().setMCount(r20.getMImageInfos().length);
        r3.getMItem1().setMPlayInterval(r20.getMPlayInterval());
        long r6 = (r5 + ((long) 32)) + ((long) (r3.getMItem1().getMCount() * 16));
        ArrayList r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        BrandInfoImage[] r2 = r20.getMImageInfos();
        int r7 = r2.length;
        long r11 = r6;
        int r8 = 0;
    L3:
        if (r8 >= r7) goto L5;
        BrandInfoImage r9 = r2[r8];
        r0.add(r9.getMImageBuffer());
        r1.add(new BleBrandInfoImage(BleWatchFaceId.WATCHFACE_ID_INVALID, r11, r9.getMWidth(), r9.getMHeight(), r9.getHasAlpha(), r9.getMCompression(), r9.getMPixelFormat()));
        r11 = r11 + ((long) r9.getMImageBuffer().length);
        r8 = r8 + 1;
        goto L3
    L5:
        r3.getMItem1().setMImageInfos((BleBrandInfoImage[]) r1.toArray(new BleBrandInfoImage[0]));
        r3.getMItem1().setMImageBuffers((byte[][]) r0.toArray(new byte[0][]));
        return r3.toByteArray();
    }
}
