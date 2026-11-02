.class public final Lcom/szabh/smable3/entity/BleMusicControl;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private final mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/MusicEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/MusicAttr;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mMusicEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mMusicAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    iput-object p2, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    iput-object p3, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/util/List;)V
    .locals 10
    .param p1    # Lcom/szabh/smable3/entity/MusicEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/MusicAttr;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/entity/MusicEntity;",
            "Lcom/szabh/smable3/entity/MusicAttr;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "musicEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "musicAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contents"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    move-object v1, p3

    check-cast v1, Ljava/lang/Iterable;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XOiXXOO(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMusicControl;Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMusicControl;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleMusicControl;->copy(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMusicControl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/MusicEntity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    return-object v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/MusicAttr;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMusicControl;
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/MusicEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/MusicAttr;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mMusicEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mMusicAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleMusicControl;

    invoke-direct {v0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    return-object v0
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/MusicEntity;->getMEntity()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/MusicAttr;->getMAttr()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeString$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMusicControl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMusicControl;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final getMMusicAttr()Lcom/szabh/smable3/entity/MusicAttr;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    return-object v0
.end method

.method public final getMMusicEntity()Lcom/szabh/smable3/entity/MusicEntity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMusicControl(mMusicEntity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicEntity:Lcom/szabh/smable3/entity/MusicEntity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mMusicAttr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mMusicAttr:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMusicControl;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
