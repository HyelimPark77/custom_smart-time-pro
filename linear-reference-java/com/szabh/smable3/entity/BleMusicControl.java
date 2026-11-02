package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMusicControl extends BleWritable {

    @aa1
    private final String mContent;

    @aa1
    private final MusicAttr mMusicAttr;

    @aa1
    private final MusicEntity mMusicEntity;

    public BleMusicControl(@aa1 MusicEntity r2, @aa1 MusicAttr r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "mMusicEntity");
        Intrinsics.X0O(r3, "mMusicAttr");
        Intrinsics.X0O(r4, "mContent");
        this.mMusicEntity = r2;
        this.mMusicAttr = r3;
        this.mContent = r4;
    }

    public static /* synthetic */ BleMusicControl copy$default(BleMusicControl r0, MusicEntity r1, MusicAttr r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mMusicEntity;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mMusicAttr;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mContent;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final MusicEntity component1() {
        return this.mMusicEntity;
    }

    @aa1
    public final MusicAttr component2() {
        return this.mMusicAttr;
    }

    @aa1
    public final String component3() {
        return this.mContent;
    }

    @aa1
    public final BleMusicControl copy(@aa1 MusicEntity r2, @aa1 MusicAttr r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "mMusicEntity");
        Intrinsics.X0O(r3, "mMusicAttr");
        Intrinsics.X0O(r4, "mContent");
        return new BleMusicControl(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMusicEntity.getMEntity());
        writeInt8(this.mMusicAttr.getMAttr());
        BleWritable.writeString$default(this, this.mContent, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMusicControl) == true) goto L8;
        return false;
    L8:
        BleMusicControl r6 = (BleMusicControl) r5;
        if (this.mMusicEntity == r6.mMusicEntity) goto L12;
        return false;
    L12:
        if (this.mMusicAttr == r6.mMusicAttr) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mContent, r6.mContent) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return r0.length + 2;
    }

    @aa1
    public final MusicAttr getMMusicAttr() {
        return this.mMusicAttr;
    }

    @aa1
    public final MusicEntity getMMusicEntity() {
        return this.mMusicEntity;
    }

    public int hashCode() {
        return (((this.mMusicEntity.hashCode() * 31) + this.mMusicAttr.hashCode()) * 31) + this.mContent.hashCode();
    }

    @aa1
    public String toString() {
        return "BleMusicControl(mMusicEntity=" + this.mMusicEntity + ", mMusicAttr=" + this.mMusicAttr + ", mContent='" + this.mContent + "')";
    }

    public BleMusicControl(@aa1 MusicEntity r11, @aa1 MusicAttr r12, @aa1 List<String> r13) {
        Intrinsics.X0O(r11, "musicEntity");
        Intrinsics.X0O(r12, "musicAttr");
        Intrinsics.X0O(r13, TTContentsEventConstants.XIi00iiXO.IiI10X);
        this(r11, r12, CollectionsKt___CollectionsKt.XOiXXOO(r13, I000IiI1O.iO.XO0O10, null, null, 0, null, null, 62, null));
    }
}
