.class public final Lcom/szabh/smable3/entity/BleWorkout4Segmentation;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout4Segmentation$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout4Segmentation$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mByteOrder:Ljava/nio/ByteOrder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mDistanceList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mDurationList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mEnd:I

.field private mLength:I

.field private mMode:I

.field private mReserve:I

.field private mSize:I

.field private mStart:I

.field private mValueList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout4Segmentation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->Companion:Lcom/szabh/smable3/entity/BleWorkout4Segmentation$Companion;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;-><init>(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mDistanceList"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mDurationList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mValueList"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 12
    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    .line 13
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    .line 14
    new-instance p9, Ljava/util/ArrayList;

    invoke-direct {p9}, Ljava/util/ArrayList;-><init>()V

    :cond_8
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 15
    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;-><init>(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getMByteOrder$cp()Ljava/nio/ByteOrder;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    return-object v0
.end method

.method public static final synthetic access$setMByteOrder$cp(Ljava/nio/ByteOrder;)V
    .locals 0

    sput-object p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWorkout4Segmentation;IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWorkout4Segmentation;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->copy(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleWorkout4Segmentation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleWorkout4Segmentation;
    .locals 11
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleWorkout4Segmentation;"
        }
    .end annotation

    const-string v0, "mDistanceList"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mDurationList"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mValueList"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;-><init>(IIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    sget-object v2, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v2, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    const/16 v3, 0xa6

    if-eq v2, v3, :cond_1

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v2, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    const/16 v4, 0x64

    int-to-float v4, v4

    mul-float/2addr v2, v4

    float-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMDistanceList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    return-object v0
.end method

.method public final getMDurationList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    return-object v0
.end method

.method public final getMEnd()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    return v0
.end method

.method public final getMLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    return v0
.end method

.method public final getMReserve()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    return v0
.end method

.method public final getMSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    return v0
.end method

.method public final getMValueList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDistanceList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    return-void
.end method

.method public final setMDurationList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    return-void
.end method

.method public final setMEnd(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    return-void
.end method

.method public final setMLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    return-void
.end method

.method public final setMReserve(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    return-void
.end method

.method public final setMSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    return-void
.end method

.method public final setMValueList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWorkout4Segmentation(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReserve="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mReserve:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistanceList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDistanceList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mDurationList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mDurationList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mValueList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4Segmentation;->mValueList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
