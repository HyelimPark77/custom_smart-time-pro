.class public final Lcom/szabh/smable3/entity/BleTestSupportData;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n222#2,4:354\n222#2,4:358\n222#2,4:362\n222#2,4:366\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n*L\n238#1:354,4\n239#1:358,4\n241#1:362,4\n245#1:366,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n222#2,4:354\n222#2,4:358\n222#2,4:362\n222#2,4:366\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n*L\n238#1:354,4\n239#1:358,4\n241#1:362,4\n245#1:366,4\n*E\n"
    }
.end annotation


# instance fields
.field private mBatteryPower:I

.field private mBioDiffValue:I

.field private mBioMaxValue:I

.field private mBleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFirmwareFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFirmwareVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFlash:I

.field private mGoMoreInfo:I

.field private mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mHardwareInfoLength:I

.field private mRSSI:I

.field private mSaiweiInfo:I

.field private mSupportBIO:I

.field private mSupportBIOCheck:I

.field private mSupportGeoSensor:I

.field private mSupportKeyCount:I

.field private mSupportMIC:I

.field private mSupportSD:I

.field private mSupportSpeaker:I

.field private mSupportTuya:I

.field private mUIVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mVoltage:I


# direct methods
.method public constructor <init>()V
    .locals 26

    .line 1
    const v24, 0x7fffff

    const/16 v25, 0x0

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

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v25}, Lcom/szabh/smable3/entity/BleTestSupportData;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIII)V
    .locals 4
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Lcom/szabh/smable3/entity/BleGsensorData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p18    # Lcom/szabh/smable3/entity/BleHardwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object v0, p11

    move-object/from16 v1, p12

    move-object/from16 v2, p18

    const-string v3, "mBleName"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mFirmwareFlag"

    invoke-static {p10, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mFirmwareVersion"

    invoke-static {p11, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mUIVersion"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mHardwareInfo"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    .line 13
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    move/from16 p1, p13

    .line 15
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    .line 20
    iput-object v2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    move/from16 p1, p20

    .line 22
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    move/from16 p1, p21

    .line 23
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    move/from16 p1, p22

    .line 24
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    move/from16 p1, p23

    .line 25
    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    .line 26
    const-string v11, ""

    if-eqz v10, :cond_8

    move-object v10, v11

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-object v12, v11

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    move-object v13, v11

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v11, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, -0x1

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    const/4 v15, -0x1

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, -0x1

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    .line 27
    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareInfo;

    move/from16 p1, v1

    const/4 v1, 0x1

    move-object/from16 p3, v2

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/szabh/smable3/entity/BleHardwareInfo;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_11

    :cond_11
    move/from16 p1, v1

    move-object/from16 p3, v2

    move-object/from16 v0, p18

    :goto_11
    const/high16 v1, 0x40000

    and-int v1, p24, v1

    if-eqz v1, :cond_12

    const/4 v1, 0x0

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v2, 0x80000

    and-int v2, p24, v2

    if-eqz v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    move/from16 v2, p20

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p24, v18

    if-eqz v18, :cond_14

    const/16 v18, 0x0

    goto :goto_14

    :cond_14
    move/from16 v18, p21

    :goto_14
    const/high16 v19, 0x200000

    and-int v19, p24, v19

    if-eqz v19, :cond_15

    const/16 v19, 0x0

    goto :goto_15

    :cond_15
    move/from16 v19, p22

    :goto_15
    const/high16 v20, 0x400000

    and-int v20, p24, v20

    if-eqz v20, :cond_16

    const/16 p24, 0x0

    :goto_16
    move/from16 p2, p1

    move-object/from16 p15, p3

    move-object/from16 p19, v0

    move/from16 p20, v1

    move/from16 p21, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p13, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p14, v14

    move/from16 p16, v15

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p22, v18

    move/from16 p23, v19

    move-object/from16 p1, p0

    goto :goto_17

    :cond_16
    move/from16 p24, p23

    goto :goto_16

    .line 28
    :goto_17
    invoke-direct/range {p1 .. p24}, Lcom/szabh/smable3/entity/BleTestSupportData;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleTestSupportData;IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleTestSupportData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p24, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p24, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p24, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p24, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p24, v16

    move/from16 p6, v1

    if-eqz v16, :cond_14

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p24, v16

    move/from16 p7, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p24, v16

    if-eqz v16, :cond_16

    move/from16 p8, v1

    iget v1, v0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    move/from16 p23, p8

    move/from16 p24, v1

    :goto_16
    move/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_17

    :cond_16
    move/from16 p24, p23

    move/from16 p23, v1

    goto :goto_16

    :goto_17
    invoke-virtual/range {p1 .. p24}, Lcom/szabh/smable3/entity/BleTestSupportData;->copy(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIII)Lcom/szabh/smable3/entity/BleTestSupportData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    return v0
.end method

.method public final component14()Lcom/szabh/smable3/entity/BleGsensorData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    return v0
.end method

.method public final component18()Lcom/szabh/smable3/entity/BleHardwareInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIII)Lcom/szabh/smable3/entity/BleTestSupportData;
    .locals 25
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Lcom/szabh/smable3/entity/BleGsensorData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p18    # Lcom/szabh/smable3/entity/BleHardwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mBleName"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFirmwareFlag"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFirmwareVersion"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mUIVersion"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHardwareInfo"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleTestSupportData;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    invoke-direct/range {v1 .. v24}, Lcom/szabh/smable3/entity/BleTestSupportData;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/szabh/smable3/entity/BleGsensorData;IIILcom/szabh/smable3/entity/BleHardwareInfo;IIIII)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readStringUtil$default(Lcom/bestmafen/baseble/data/BleReadable;BLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readStringUtil$default(Lcom/bestmafen/baseble/data/BleReadable;BLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    const-class v0, Lcom/szabh/smable3/entity/BleVersion2;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleVersion2;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleVersion2;->getMVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    const-class v0, Lcom/szabh/smable3/entity/BleVersion;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleVersion;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleVersion;->getMVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    const-class v0, Lcom/szabh/smable3/entity/BleGsensorData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x7

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleGsensorData;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    const/4 v0, 0x1

    invoke-static {p0, v1, v0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    const-class v3, Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Lcom/szabh/smable3/entity/BleHardwareInfo;

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    invoke-static {p0, v1, v0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    invoke-static {p0, v1, v0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    invoke-static {p0, v1, v0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleTestSupportData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleTestSupportData;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    if-eq v1, p1, :cond_18

    return v2

    :cond_18
    return v0
.end method

.method public final getMBatteryPower()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    return v0
.end method

.method public final getMBioDiffValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    return v0
.end method

.method public final getMBioMaxValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    return v0
.end method

.method public final getMBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFirmwareVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFlash()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    return v0
.end method

.method public final getMGoMoreInfo()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    return v0
.end method

.method public final getMGsensor()Lcom/szabh/smable3/entity/BleGsensorData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    return-object v0
.end method

.method public final getMHardwareInfo()Lcom/szabh/smable3/entity/BleHardwareInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    return-object v0
.end method

.method public final getMHardwareInfoLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    return v0
.end method

.method public final getMRSSI()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    return v0
.end method

.method public final getMSaiweiInfo()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    return v0
.end method

.method public final getMSupportBIO()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    return v0
.end method

.method public final getMSupportBIOCheck()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    return v0
.end method

.method public final getMSupportGeoSensor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    return v0
.end method

.method public final getMSupportKeyCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    return v0
.end method

.method public final getMSupportMIC()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    return v0
.end method

.method public final getMSupportSD()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    return v0
.end method

.method public final getMSupportSpeaker()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    return v0
.end method

.method public final getMSupportTuya()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    return v0
.end method

.method public final getMUIVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMVoltage()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGsensorData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHardwareInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMBatteryPower(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    return-void
.end method

.method public final setMBioDiffValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    return-void
.end method

.method public final setMBioMaxValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    return-void
.end method

.method public final setMBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    return-void
.end method

.method public final setMFirmwareFlag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    return-void
.end method

.method public final setMFirmwareVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    return-void
.end method

.method public final setMFlash(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    return-void
.end method

.method public final setMGoMoreInfo(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    return-void
.end method

.method public final setMGsensor(Lcom/szabh/smable3/entity/BleGsensorData;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleGsensorData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    return-void
.end method

.method public final setMHardwareInfo(Lcom/szabh/smable3/entity/BleHardwareInfo;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHardwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    return-void
.end method

.method public final setMHardwareInfoLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    return-void
.end method

.method public final setMRSSI(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    return-void
.end method

.method public final setMSaiweiInfo(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    return-void
.end method

.method public final setMSupportBIO(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    return-void
.end method

.method public final setMSupportBIOCheck(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    return-void
.end method

.method public final setMSupportGeoSensor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    return-void
.end method

.method public final setMSupportKeyCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    return-void
.end method

.method public final setMSupportMIC(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    return-void
.end method

.method public final setMSupportSD(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    return-void
.end method

.method public final setMSupportSpeaker(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    return-void
.end method

.method public final setMSupportTuya(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    return-void
.end method

.method public final setMUIVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    return-void
.end method

.method public final setMVoltage(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleTestSupportData(mSupportKeyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportKeyCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportMIC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportMIC:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportSpeaker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSpeaker:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportBIO="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIO:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportBIOCheck="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportBIOCheck:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportSD="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportSD:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportGeoSensor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportGeoSensor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportTuya="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSupportTuya:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBleName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBleName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mFirmwareFlag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareFlag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mFirmwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFirmwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mUIVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mUIVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mBatteryPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBatteryPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", GSensor --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGsensor:Lcom/szabh/smable3/entity/BleGsensorData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mFlash="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mFlash:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRSSI="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mRSSI:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHardwareInfoLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfoLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHardwareInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mHardwareInfo:Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mGoMoreInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mGoMoreInfo:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mVoltage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBioMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioMaxValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBioDiffValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mBioDiffValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSaiweiInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTestSupportData;->mSaiweiInfo:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
