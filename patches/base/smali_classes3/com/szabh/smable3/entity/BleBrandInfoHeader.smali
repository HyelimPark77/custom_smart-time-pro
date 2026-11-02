.class final Lcom/szabh/smable3/entity/BleBrandInfoHeader;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBrandInfoHeader$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBrandInfoHeader$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x20


# instance fields
.field private mCRC:I

.field private mFileSize:J

.field private mFileTypeFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mItemCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoHeader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoHeader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->Companion:Lcom/szabh/smable3/entity/BleBrandInfoHeader$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;-><init>(Ljava/lang/String;IJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJI)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mFileTypeFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    .line 5
    iput-wide p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    const-string p1, "BR"

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    move p7, v0

    :goto_0
    move-wide p5, p3

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_1

    :cond_3
    move p7, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;-><init>(Ljava/lang/String;IJI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Ljava/lang/String;IJIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBrandInfoHeader;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-wide p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    :cond_3
    move p7, p5

    move-wide p5, p3

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->copy(Ljava/lang/String;IJI)Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    return v0
.end method

.method public final copy(Ljava/lang/String;IJI)Lcom/szabh/smable3/entity/BleBrandInfoHeader;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mFileTypeFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;-><init>(Ljava/lang/String;IJI)V

    return-object v1
.end method

.method public encode()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->IiI10X:Ljava/nio/charset/Charset;

    const/4 v2, 0x2

    invoke-virtual {p0, v0, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v4, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32$default(Lcom/bestmafen/baseble/data/BleWritable;JLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, v3, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    const/16 v0, 0x16

    new-array v0, v0, [B

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMCRC()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    return v0
.end method

.method public final getMFileSize()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    return-wide v0
.end method

.method public final getMFileTypeFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMItemCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCRC(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    return-void
.end method

.method public final setMFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    return-void
.end method

.method public final setMFileTypeFlag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    return-void
.end method

.method public final setMItemCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBrandInfoHeader(mFileTypeFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileTypeFlag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mItemCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mFileSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mCRC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->mCRC:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
