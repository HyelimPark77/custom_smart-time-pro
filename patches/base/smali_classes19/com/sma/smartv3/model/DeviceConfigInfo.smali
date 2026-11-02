.class public final Lcom/sma/smartv3/model/DeviceConfigInfo;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# instance fields
.field private alarmWithTag:I

.field private customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private defHeartRateMonitoringSwitch:I

.field private deviceImage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private deviceImage2:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private devicePlatform:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private devicePrototype:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareId:I

.field private id:I

.field private macConfig:Lcom/sma/smartv3/model/MacConfig;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private projectId:I

.field private requireReadAlarm:I

.field private requireReadNoDisturb:I

.field private scheduleMax:I

.field private supWarnTipGuide:I

.field private supWf:I

.field private supportBackLightTimeArrays:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private supportGirlCare:I

.field private supportMusic:I

.field private supportNFC:I

.field private supportPeriodicHeartRateMonitoring:I

.field private supportSyncContact:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;)V
    .locals 3
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Lcom/sma/smartv3/model/CustomConfigInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Lcom/sma/smartv3/model/MacConfig;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    move-object/from16 v0, p15

    move-object/from16 v1, p21

    const-string v2, "devicePrototype"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "devicePlatform"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deviceImage"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "supportBackLightTimeArrays"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deviceImage2"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    .line 3
    iput p2, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    .line 4
    iput p3, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    .line 9
    iput p8, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    .line 10
    iput p9, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    .line 11
    iput p10, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    .line 12
    iput p11, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    .line 13
    iput p12, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    move/from16 p1, p14

    .line 15
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    .line 16
    iput-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    move/from16 p1, p19

    .line 20
    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    .line 22
    iput-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    .line 24
    const-string v3, ""

    if-eqz v1, :cond_3

    move-object v7, v3

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v8, v3

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v9, v3

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    move v11, v2

    goto :goto_7

    :cond_7
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move v12, v2

    goto :goto_8

    :cond_8
    move/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move v13, v2

    goto :goto_9

    :cond_9
    move/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    move v14, v2

    goto :goto_a

    :cond_a
    move/from16 v14, p11

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    move v15, v2

    goto :goto_b

    :cond_b
    move/from16 v15, p12

    :goto_b
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    move/from16 v16, v2

    goto :goto_c

    :cond_c
    move/from16 v16, p13

    :goto_c
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    move/from16 v17, v2

    goto :goto_d

    :cond_d
    move/from16 v17, p14

    :goto_d
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    move-object/from16 v18, v3

    goto :goto_e

    :cond_e
    move-object/from16 v18, p15

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move/from16 v19, v2

    goto :goto_f

    :cond_f
    move/from16 v19, p16

    :goto_f
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move/from16 v20, v2

    goto :goto_10

    :cond_10
    move/from16 v20, p17

    :goto_10
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move/from16 v21, v2

    goto :goto_11

    :cond_11
    move/from16 v21, p18

    :goto_11
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move/from16 v22, v2

    goto :goto_12

    :cond_12
    move/from16 v22, p19

    :goto_12
    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eqz v0, :cond_13

    move-object/from16 v24, v3

    move-object/from16 v23, p20

    move-object/from16 v25, p22

    move-object/from16 v3, p0

    goto :goto_13

    :cond_13
    move-object/from16 v24, p21

    move-object/from16 v3, p0

    move-object/from16 v23, p20

    move-object/from16 v25, p22

    :goto_13
    invoke-direct/range {v3 .. v25}, Lcom/sma/smartv3/model/DeviceConfigInfo;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/DeviceConfigInfo;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;ILjava/lang/Object;)Lcom/sma/smartv3/model/DeviceConfigInfo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lcom/sma/smartv3/model/DeviceConfigInfo;->copy(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;)Lcom/sma/smartv3/model/DeviceConfigInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    return v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    return v0
.end method

.method public final component20()Lcom/sma/smartv3/model/CustomConfigInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Lcom/sma/smartv3/model/MacConfig;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    return v0
.end method

.method public final copy(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;)Lcom/sma/smartv3/model/DeviceConfigInfo;
    .locals 24
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Lcom/sma/smartv3/model/CustomConfigInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Lcom/sma/smartv3/model/MacConfig;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "devicePrototype"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devicePlatform"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceImage"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportBackLightTimeArrays"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceImage2"

    move-object/from16 v2, p21

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/DeviceConfigInfo;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v23, p22

    move-object/from16 v22, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v23}, Lcom/sma/smartv3/model/DeviceConfigInfo;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIILjava/lang/String;IIIILcom/sma/smartv3/model/CustomConfigInfo;Ljava/lang/String;Lcom/sma/smartv3/model/MacConfig;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/DeviceConfigInfo;

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    iget v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    iget-object p1, p1, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getAlarmWithTag()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    return v0
.end method

.method public final getCustomConfig()Lcom/sma/smartv3/model/CustomConfigInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    return-object v0
.end method

.method public final getDefHeartRateMonitoringSwitch()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    return v0
.end method

.method public final getDeviceImage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceImage2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    return-object v0
.end method

.method public final getDevicePlatform()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final getDevicePrototype()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    return v0
.end method

.method public final getMacConfig()Lcom/sma/smartv3/model/MacConfig;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    return-object v0
.end method

.method public final getProjectId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    return v0
.end method

.method public final getRequireReadAlarm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    return v0
.end method

.method public final getRequireReadNoDisturb()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    return v0
.end method

.method public final getScheduleMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    return v0
.end method

.method public final getSupWarnTipGuide()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    return v0
.end method

.method public final getSupWf()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    return v0
.end method

.method public final getSupportBackLightTimeArrays()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    return-object v0
.end method

.method public final getSupportGirlCare()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    return v0
.end method

.method public final getSupportMusic()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    return v0
.end method

.method public final getSupportNFC()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    return v0
.end method

.method public final getSupportPeriodicHeartRateMonitoring()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    return v0
.end method

.method public final getSupportSyncContact()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/CustomConfigInfo;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/MacConfig;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setAlarmWithTag(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    return-void
.end method

.method public final setCustomConfig(Lcom/sma/smartv3/model/CustomConfigInfo;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/CustomConfigInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    return-void
.end method

.method public final setDefHeartRateMonitoringSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    return-void
.end method

.method public final setDeviceImage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    return-void
.end method

.method public final setDeviceImage2(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    return-void
.end method

.method public final setDevicePlatform(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    return-void
.end method

.method public final setDevicePrototype(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    return-void
.end method

.method public final setFirmwareId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    return-void
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    return-void
.end method

.method public final setMacConfig(Lcom/sma/smartv3/model/MacConfig;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/MacConfig;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    return-void
.end method

.method public final setProjectId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    return-void
.end method

.method public final setRequireReadAlarm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    return-void
.end method

.method public final setRequireReadNoDisturb(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    return-void
.end method

.method public final setScheduleMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    return-void
.end method

.method public final setSupWarnTipGuide(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    return-void
.end method

.method public final setSupWf(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    return-void
.end method

.method public final setSupportBackLightTimeArrays(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    return-void
.end method

.method public final setSupportGirlCare(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    return-void
.end method

.method public final setSupportMusic(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    return-void
.end method

.method public final setSupportNFC(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    return-void
.end method

.method public final setSupportPeriodicHeartRateMonitoring(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    return-void
.end method

.method public final setSupportSyncContact(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 24
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->id:I

    iget v2, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->projectId:I

    iget v3, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->firmwareId:I

    iget-object v4, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePrototype:Ljava/lang/String;

    iget-object v5, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->devicePlatform:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage:Ljava/lang/String;

    iget v7, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportSyncContact:I

    iget v8, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadAlarm:I

    iget v9, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->alarmWithTag:I

    iget v10, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->scheduleMax:I

    iget v11, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->requireReadNoDisturb:I

    iget v12, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportPeriodicHeartRateMonitoring:I

    iget v13, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->defHeartRateMonitoringSwitch:I

    iget v14, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportGirlCare:I

    iget-object v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportBackLightTimeArrays:Ljava/lang/String;

    move-object/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportMusic:I

    move/from16 v17, v15

    iget v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supportNFC:I

    move/from16 v18, v15

    iget v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWf:I

    move/from16 v19, v15

    iget v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->supWarnTipGuide:I

    move/from16 v20, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->customConfig:Lcom/sma/smartv3/model/CustomConfigInfo;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->deviceImage2:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/DeviceConfigInfo;->macConfig:Lcom/sma/smartv3/model/MacConfig;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v23, v15

    const-string v15, "DeviceConfigInfo(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", projectId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firmwareId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", devicePrototype="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", devicePlatform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportSyncContact="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", requireReadAlarm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alarmWithTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", requireReadNoDisturb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportPeriodicHeartRateMonitoring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", defHeartRateMonitoringSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportGirlCare="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportBackLightTimeArrays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportMusic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportNFC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supWf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supWarnTipGuide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", customConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceImage2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", macConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
