.class final Lcom/szabh/smable3/entity/BleBrandInfo;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleBrandInfo;-><init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleBrandInfoHeader;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleBrandInfoItem0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleBrandInfoItem1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mItem0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mItem1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;-><init>(Ljava/lang/String;IJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 7
    new-instance p2, Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    const/4 p5, 0x0

    const/4 v0, 0x1

    invoke-direct {p2, p5, v0, p5}, Lcom/szabh/smable3/entity/BleBrandInfoItem0;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 8
    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;-><init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBrandInfo;-><init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBrandInfo;Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBrandInfo;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBrandInfo;->copy(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;)Lcom/szabh/smable3/entity/BleBrandInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/BleBrandInfoHeader;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    return-object v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/BleBrandInfoItem0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    return-object v0
.end method

.method public final component3()Lcom/szabh/smable3/entity/BleBrandInfoItem1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    return-object v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;)Lcom/szabh/smable3/entity/BleBrandInfo;
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleBrandInfoHeader;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleBrandInfoItem0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleBrandInfoItem1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mItem0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mItem1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfo;

    invoke-direct {v0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBrandInfo;-><init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;)V

    return-object v0
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x28

    invoke-virtual {p0, v2, v3, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0xa8

    invoke-virtual {p0, v1, v2, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBrandInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBrandInfo;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMHeader()Lcom/szabh/smable3/entity/BleBrandInfoHeader;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    return-object v0
.end method

.method public final getMItem0()Lcom/szabh/smable3/entity/BleBrandInfoItem0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    return-object v0
.end method

.method public final getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->getMLengthToWrite()I

    move-result v0

    add-int/lit16 v0, v0, 0xa8

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMHeader(Lcom/szabh/smable3/entity/BleBrandInfoHeader;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleBrandInfoHeader;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    return-void
.end method

.method public final setMItem0(Lcom/szabh/smable3/entity/BleBrandInfoItem0;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleBrandInfoItem0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    return-void
.end method

.method public final setMItem1(Lcom/szabh/smable3/entity/BleBrandInfoItem1;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleBrandInfoItem1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBrandInfo(mHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mHeader:Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mItem0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem0:Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mItem1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfo;->mItem1:Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
