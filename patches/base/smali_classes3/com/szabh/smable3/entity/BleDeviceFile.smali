.class public final Lcom/szabh/smable3/entity/BleDeviceFile;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleDeviceFile$Companion;
    }
.end annotation


# static fields
.field public static final AUDIO:I = 0x0

.field public static final BIN:I = 0x2

.field public static final BMP:I = 0x3

.field public static final Companion:Lcom/szabh/smable3/entity/BleDeviceFile$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_AUDIO:I = 0x0

.field public static final TYPE_BIN:I = 0x1

.field public static final TYPE_IMG:I = 0x2

.field public static final TYPE_INFO:I = 0x3

.field public static final WAV:I = 0x1


# instance fields
.field private mFileContent:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFileFormat:I

.field private mFileSize:I

.field private mFileType:I

.field private mIndex:I

.field private mOffsetValue:I

.field private mTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleDeviceFile$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleDeviceFile$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleDeviceFile;->Companion:Lcom/szabh/smable3/entity/BleDeviceFile$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleDeviceFile;-><init>(IIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIII[B)V
    .locals 1
    .param p7    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mFileContent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    return-void
.end method

.method public synthetic constructor <init>(IIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    .line 10
    new-array p7, v0, [B

    :cond_6
    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleDeviceFile;-><init>(IIIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleDeviceFile;IIIIII[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleDeviceFile;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleDeviceFile;->copy(IIIIII[B)Lcom/szabh/smable3/entity/BleDeviceFile;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    return v0
.end method

.method public final component7()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    return-object v0
.end method

.method public final copy(IIIIII[B)Lcom/szabh/smable3/entity/BleDeviceFile;
    .locals 9
    .param p7    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mFileContent"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleDeviceFile;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/szabh/smable3/entity/BleDeviceFile;-><init>(IIIIII[B)V

    return-object v1
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    const/16 v1, 0x12

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    :cond_0
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleDeviceFile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleDeviceFile;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMFileContent()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    return-object v0
.end method

.method public final getMFileFormat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    return v0
.end method

.method public final getMFileSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    return v0
.end method

.method public final getMFileType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    return v0
.end method

.method public final getMIndex()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    return v0
.end method

.method public final getMOffsetValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMFileContent([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    return-void
.end method

.method public final setMFileFormat(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    return-void
.end method

.method public final setMFileSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    return-void
.end method

.method public final setMFileType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    return-void
.end method

.method public final setMIndex(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    return-void
.end method

.method public final setMOffsetValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleDeviceFile(mFileType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFileFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mOffsetValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mOffsetValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFileContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleDeviceFile;->mFileContent:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
