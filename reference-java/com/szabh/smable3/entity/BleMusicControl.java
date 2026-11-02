package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
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

    public BleMusicControl(@aa1 MusicEntity mMusicEntity, @aa1 MusicAttr mMusicAttr, @aa1 String mContent) {
        Intrinsics.X0O(mMusicEntity, "mMusicEntity");
        Intrinsics.X0O(mMusicAttr, "mMusicAttr");
        Intrinsics.X0O(mContent, "mContent");
        this.mMusicEntity = mMusicEntity;
        this.mMusicAttr = mMusicAttr;
        this.mContent = mContent;
    }

    public static /* synthetic */ BleMusicControl copy$default(BleMusicControl bleMusicControl, MusicEntity musicEntity, MusicAttr musicAttr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            musicEntity = bleMusicControl.mMusicEntity;
        }
        if ((i & 2) != 0) {
            musicAttr = bleMusicControl.mMusicAttr;
        }
        if ((i & 4) != 0) {
            str = bleMusicControl.mContent;
        }
        return bleMusicControl.copy(musicEntity, musicAttr, str);
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
    public final BleMusicControl copy(@aa1 MusicEntity mMusicEntity, @aa1 MusicAttr mMusicAttr, @aa1 String mContent) {
        Intrinsics.X0O(mMusicEntity, "mMusicEntity");
        Intrinsics.X0O(mMusicAttr, "mMusicAttr");
        Intrinsics.X0O(mContent, "mContent");
        return new BleMusicControl(mMusicEntity, mMusicAttr, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMusicEntity.getMEntity());
        writeInt8(this.mMusicAttr.getMAttr());
        BleWritable.writeString$default(this, this.mContent, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMusicControl)) {
            return false;
        }
        BleMusicControl bleMusicControl = (BleMusicControl) obj;
        return this.mMusicEntity == bleMusicControl.mMusicEntity && this.mMusicAttr == bleMusicControl.mMusicAttr && Intrinsics.XOO0ii0(this.mContent, bleMusicControl.mContent);
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return bytes.length + 2;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleMusicControl(@aa1 MusicEntity musicEntity, @aa1 MusicAttr musicAttr, @aa1 List<String> contents) {
        this(musicEntity, musicAttr, CollectionsKt___CollectionsKt.XOiXXOO(contents, I000IiI1O.C2156iO.XO0O10, null, null, 0, null, null, 62, null));
        Intrinsics.X0O(musicEntity, "musicEntity");
        Intrinsics.X0O(musicAttr, "musicAttr");
        Intrinsics.X0O(contents, "contents");
    }
}
