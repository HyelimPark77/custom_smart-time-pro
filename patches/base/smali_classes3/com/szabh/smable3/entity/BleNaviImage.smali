.class public final Lcom/szabh/smable3/entity/BleNaviImage;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleNaviImage$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleNaviImage$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0x40


# instance fields
.field private mImageBuffers:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleNaviImage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleNaviImage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleNaviImage;->Companion:Lcom/szabh/smable3/entity/BleNaviImage$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleNaviImage;-><init>([BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mImageBuffers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    return-void
.end method

.method public synthetic constructor <init>([BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [B

    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleNaviImage;-><init>([B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleNaviImage;[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleNaviImage;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleNaviImage;->copy([B)Lcom/szabh/smable3/entity/BleNaviImage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    return-object v0
.end method

.method public final copy([B)Lcom/szabh/smable3/entity/BleNaviImage;
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mImageBuffers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleNaviImage;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleNaviImage;-><init>([B)V

    return-object v0
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    const/16 v0, 0x40

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleNaviImage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleNaviImage;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMImageBuffers()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x40

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public final setMImageBuffers([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleNaviImage(mImageBuffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleNaviImage;->mImageBuffers:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
