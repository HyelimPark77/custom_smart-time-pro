.class public final Lcom/szabh/smable3/entity/BleBatteryUsage;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBatteryUsage$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleBatteryUsage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,66:1\n222#2,4:67\n222#2,4:71\n222#2,4:75\n*S KotlinDebug\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n*L\n57#1:67,4\n58#1:71,4\n59#1:75,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleBatteryUsage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,66:1\n222#2,4:67\n222#2,4:71\n222#2,4:75\n*S KotlinDebug\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n*L\n57#1:67,4\n58#1:71,4\n59#1:75,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBatteryUsage$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x34


# instance fields
.field private mIdleTime:I

.field private mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLcdTime:I

.field private mSpkTime:I

.field private mSportTime:I

.field private mTalkTime:I

.field private mTotalTime:I

.field private mVibratorTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBatteryUsage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBatteryUsage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBatteryUsage;->Companion:Lcom/szabh/smable3/entity/BleBatteryUsage$Companion;

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

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleBatteryUsage;-><init>(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;)V
    .locals 1
    .param p8    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLastBoot"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastShutdown"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastVoltage"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    .line 12
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v2

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v2

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v2, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    .line 13
    new-instance v9, Lcom/szabh/smable3/entity/BleVoltageRecord;

    const/16 v17, 0x7f

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lcom/szabh/smable3/entity/BleVoltageRecord;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    .line 14
    new-instance v10, Lcom/szabh/smable3/entity/BleVoltageRecord;

    const/16 v18, 0x7f

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/szabh/smable3/entity/BleVoltageRecord;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    .line 15
    new-instance v0, Lcom/szabh/smable3/entity/BleVoltageRecord;

    const/16 v8, 0x7f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 p1, v0

    move/from16 p9, v8

    move-object/from16 p10, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v17

    move/from16 p8, v18

    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleVoltageRecord;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p11, v0

    :goto_9
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p8, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    goto :goto_a

    :cond_9
    move-object/from16 p11, p10

    goto :goto_9

    .line 16
    :goto_a
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleBatteryUsage;-><init>(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBatteryUsage;IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBatteryUsage;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleBatteryUsage;->copy(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;)Lcom/szabh/smable3/entity/BleBatteryUsage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    return v0
.end method

.method public final component10()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    return v0
.end method

.method public final component8()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final component9()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final copy(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;)Lcom/szabh/smable3/entity/BleBatteryUsage;
    .locals 12
    .param p8    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLastBoot"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastShutdown"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLastVoltage"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleBatteryUsage;

    move v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleBatteryUsage;-><init>(IIIIIIILcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;Lcom/szabh/smable3/entity/BleVoltageRecord;)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    const-class v0, Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleVoltageRecord;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleVoltageRecord;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleVoltageRecord;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBatteryUsage;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMIdleTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    return v0
.end method

.method public final getMLastBoot()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final getMLastShutdown()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final getMLastVoltage()Lcom/szabh/smable3/entity/BleVoltageRecord;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-object v0
.end method

.method public final getMLcdTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    return v0
.end method

.method public final getMSpkTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    return v0
.end method

.method public final getMSportTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    return v0
.end method

.method public final getMTalkTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    return v0
.end method

.method public final getMTotalTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    return v0
.end method

.method public final getMVibratorTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleVoltageRecord;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleVoltageRecord;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleVoltageRecord;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMIdleTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    return-void
.end method

.method public final setMLastBoot(Lcom/szabh/smable3/entity/BleVoltageRecord;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-void
.end method

.method public final setMLastShutdown(Lcom/szabh/smable3/entity/BleVoltageRecord;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-void
.end method

.method public final setMLastVoltage(Lcom/szabh/smable3/entity/BleVoltageRecord;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleVoltageRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    return-void
.end method

.method public final setMLcdTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    return-void
.end method

.method public final setMSpkTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    return-void
.end method

.method public final setMSportTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    return-void
.end method

.method public final setMTalkTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    return-void
.end method

.method public final setMTotalTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    return-void
.end method

.method public final setMVibratorTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBatteryUsage(mTotalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTotalTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLcdTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLcdTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTalkTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mTalkTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpkTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSpkTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSportTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mSportTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVibratorTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mVibratorTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIdleTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mIdleTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLastBoot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastBoot:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLastShutdown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastShutdown:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLastVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBatteryUsage;->mLastVoltage:Lcom/szabh/smable3/entity/BleVoltageRecord;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
