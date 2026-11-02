.class public final Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n*L\n41#1:328,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n*L\n41#1:328,4\n*E\n"
    }
.end annotation


# static fields
.field public static final AI_COACH_PLAN_TRAINING:I = 0x4

.field public static final CHECKSUM_LENGTH:I = 0x80

.field public static final Companion:Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DELETE_AI_COACH_PLAN:I = 0x3

.field public static final GET_AI_COACH_PLAN:I = 0x1

.field public static final GET_AI_COACH_PLAN_SUM:I = 0x0

.field public static final LEAVE_AI_COACH_PLAN:I = 0x2


# instance fields
.field private mCoachType:I

.field private mCurrentChecksum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastChecksum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlanStartTime:J

.field private mPlanTime:Ljava/util/List;
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

.field private mPlanWeekNum:I

.field private mSource:I

.field private mVo2Max:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->Companion:Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;-><init>(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IJ)V"
        }
    .end annotation

    const-string v0, "mCurrentChecksum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastChecksum"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPlanTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    .line 10
    iput-wide p8, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 11
    const-string p1, ""

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 12
    const-string p2, "-999"

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v0, 0x0

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

    .line 13
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    const-wide/16 p8, 0x0

    :cond_7
    move-wide p10, p8

    move-object p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 14
    invoke-direct/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;-><init>(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    iget-wide p8, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    :cond_7
    move-wide p10, p8

    move-object p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->copy(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJ)Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    return v0
.end method

.method public final component6()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    return v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJ)Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IJ)",
            "Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;"
        }
    .end annotation

    const-string v0, "mCurrentChecksum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastChecksum"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPlanTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move-wide/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;-><init>(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;IJ)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O1OOiOO1i;->I11X11OX(Ljava/util/List;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    const-class v1, Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v3, 0x6

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTime$Companion;->timeInMillis(Lcom/szabh/smable3/entity/BleTime;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMCoachType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    return v0
.end method

.method public final getMCurrentChecksum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLastChecksum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPlanStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    return-wide v0
.end method

.method public final getMPlanTime()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMPlanWeekNum()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    return v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    return v0
.end method

.method public final getMVo2Max()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCoachType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    return-void
.end method

.method public final setMCurrentChecksum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    return-void
.end method

.method public final setMPlanStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    return-void
.end method

.method public final setMPlanTime(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    return-void
.end method

.method public final setMPlanWeekNum(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    return-void
.end method

.method public final setMVo2Max(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

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

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCurrentChecksum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLastChecksum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mLastChecksum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , mSource = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mCoachType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mCoachType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVo2Max = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mVo2Max:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mPlanTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , mPlanWeekNum = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanWeekNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mPlanStartTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;->mPlanStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
