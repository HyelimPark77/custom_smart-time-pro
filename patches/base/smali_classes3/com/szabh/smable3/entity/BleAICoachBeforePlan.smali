.class public final Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleAICoachBeforePlan$Companion;
    }
.end annotation


# static fields
.field public static final CHECKSUM_LENGTH:I = 0x80

.field public static final Companion:Lcom/szabh/smable3/entity/BleAICoachBeforePlan$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mCurrentChecksum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurrentChecksumLength:I

.field private mDayMET:I

.field private mExerciseMET:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIsFirst:I

.field private mLastChecksum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastChecksumLength:I

.field private mRoutineMET:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeekExerciseMET:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeekRoutineMET:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->Companion:Lcom/szabh/smable3/entity/BleAICoachBeforePlan$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;-><init>(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[F)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mCurrentChecksum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastChecksum"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRoutineMET"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExerciseMET"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeekRoutineMET"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeekExerciseMET"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    .line 12
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 13
    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 14
    const-string v4, "-999"

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v3

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v6, :cond_4

    .line 15
    new-array v6, v7, [F

    aput v11, v6, v3

    aput v11, v6, v12

    aput v11, v6, v10

    aput v11, v6, v8

    aput v11, v6, v9

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v13, v0, 0x20

    if-eqz v13, :cond_5

    .line 16
    new-array v13, v7, [F

    aput v11, v13, v3

    aput v11, v13, v12

    aput v11, v13, v10

    aput v11, v13, v8

    aput v11, v13, v9

    goto :goto_5

    :cond_5
    move-object/from16 v13, p6

    :goto_5
    and-int/lit8 v14, v0, 0x40

    if-eqz v14, :cond_6

    move v14, v8

    goto :goto_6

    :cond_6
    move/from16 v14, p7

    :goto_6
    and-int/lit16 v15, v0, 0x80

    if-eqz v15, :cond_7

    move v15, v3

    goto :goto_7

    :cond_7
    move/from16 v15, p8

    :goto_7
    move/from16 p1, v3

    and-int/lit16 v3, v0, 0x100

    if-eqz v3, :cond_8

    .line 17
    new-array v3, v7, [F

    aput v11, v3, p1

    aput v11, v3, v12

    aput v11, v3, v10

    aput v11, v3, v8

    aput v11, v3, v9

    goto :goto_8

    :cond_8
    move-object/from16 v3, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    .line 18
    new-array v0, v7, [F

    aput v11, v0, p1

    aput v11, v0, v12

    aput v11, v0, v10

    aput v11, v0, v8

    aput v11, v0, v9

    move-object/from16 p11, v0

    :goto_9
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move-object/from16 p10, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v13

    move/from16 p8, v14

    move/from16 p9, v15

    goto :goto_a

    :cond_9
    move-object/from16 p11, p10

    goto :goto_9

    .line 19
    :goto_a
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;-><init>(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[F)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;Ljava/lang/String;ILjava/lang/String;I[F[FII[F[FILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->copy(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[F)Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    return v0
.end method

.method public final component5()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    return-object v0
.end method

.method public final component6()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    return v0
.end method

.method public final component9()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[F)Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mCurrentChecksum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastChecksum"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRoutineMET"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExerciseMET"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeekRoutineMET"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeekExerciseMET"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;-><init>(Ljava/lang/String;ILjava/lang/String;I[F[FII[F[F)V

    return-object v1
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v4, "LITTLE_ENDIAN"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v5

    iput v5, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    array-length v0, v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    array-length v0, v0

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    array-length v0, v0

    :goto_3
    if-ge v1, v0, :cond_3

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMCurrentChecksum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final getMCurrentChecksumLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    return v0
.end method

.method public final getMDayMET()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    return v0
.end method

.method public final getMExerciseMET()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    return-object v0
.end method

.method public final getMIsFirst()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    return v0
.end method

.method public final getMLastChecksum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLastChecksumLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    return v0
.end method

.method public final getMRoutineMET()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    return-object v0
.end method

.method public final getMWeekExerciseMET()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    return-object v0
.end method

.method public final getMWeekRoutineMET()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCurrentChecksum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    return-void
.end method

.method public final setMCurrentChecksumLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    return-void
.end method

.method public final setMDayMET(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    return-void
.end method

.method public final setMExerciseMET([F)V
    .locals 1
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    return-void
.end method

.method public final setMIsFirst(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    return-void
.end method

.method public final setMLastChecksum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    return-void
.end method

.method public final setMLastChecksumLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    return-void
.end method

.method public final setMRoutineMET([F)V
    .locals 1
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    return-void
.end method

.method public final setMWeekExerciseMET([F)V
    .locals 1
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    return-void
.end method

.method public final setMWeekRoutineMET([F)V
    .locals 1
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachPlan(mCurrentChecksum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCurrentChecksumLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mCurrentChecksumLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLastChecksum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLastChecksumLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mLastChecksumLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRoutineMET="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mRoutineMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mExerciseMET="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mExerciseMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mDayMET="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mDayMET:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsFirst="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mIsFirst:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekRoutineMET="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekRoutineMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekExerciseMET="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->mWeekExerciseMET:[F

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
