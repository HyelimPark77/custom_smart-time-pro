.class final Lcom/szabh/smable3/entity/BleBrandInfoImage;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBrandInfoImage$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBrandInfoImage$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private hasAlpha:I

.field private mAddress:J

.field private mCompression:I

.field private mHeight:I

.field private mId:J

.field private mPixelFormat:I

.field private mWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoImage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoImage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->Companion:Lcom/szabh/smable3/entity/BleBrandInfoImage$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x7f

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleBrandInfoImage;-><init>(JJIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    .line 4
    iput-wide p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    .line 5
    iput p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    .line 6
    iput p6, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    .line 7
    iput p7, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    .line 8
    iput p8, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    .line 9
    iput p9, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    return-void
.end method

.method public synthetic constructor <init>(JJIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const-wide/16 v0, 0x0

    if-eqz p11, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v0, 0x0

    if-eqz p11, :cond_2

    move p5, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p6, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p7, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p8, v0

    :cond_5
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_6

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p10, p9

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleBrandInfoImage;-><init>(JJIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBrandInfoImage;JJIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBrandInfoImage;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    :cond_2
    move v5, p5

    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    move v6, p1

    goto :goto_0

    :cond_3
    move/from16 v6, p6

    :goto_0
    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    move v7, p1

    goto :goto_1

    :cond_4
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    move v8, p1

    goto :goto_2

    :cond_5
    move/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p10, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    move v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_6
    move/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleBrandInfoImage;->copy(JJIIIII)Lcom/szabh/smable3/entity/BleBrandInfoImage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    return v0
.end method

.method public final copy(JJIIIII)Lcom/szabh/smable3/entity/BleBrandInfoImage;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoImage;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleBrandInfoImage;-><init>(JJIIIII)V

    return-object v0
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v2, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v2, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    invoke-virtual {p0, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v2, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    const/4 v3, 0x3

    invoke-virtual {p0, v2, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt24$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;

    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getHasAlpha()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    return v0
.end method

.method public final getMAddress()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    return-wide v0
.end method

.method public final getMCompression()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    return v0
.end method

.method public final getMHeight()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    return v0
.end method

.method public final getMId()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    return-wide v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final getMPixelFormat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    return v0
.end method

.method public final getMWidth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setHasAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    return-void
.end method

.method public final setMAddress(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    return-void
.end method

.method public final setMCompression(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    return-void
.end method

.method public final setMHeight(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    return-void
.end method

.method public final setMId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    return-void
.end method

.method public final setMPixelFormat(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    return-void
.end method

.method public final setMWidth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBrandInfoImage(mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mAddress:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasAlpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->hasAlpha:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCompression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mCompression:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPixelFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoImage;->mPixelFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
