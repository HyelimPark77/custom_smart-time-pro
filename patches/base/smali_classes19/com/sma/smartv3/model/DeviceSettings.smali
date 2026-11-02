.class public final Lcom/sma/smartv3/model/DeviceSettings;
.super Lcom/sma/smartv3/model/JsonField;
.source "SourceFile"


# instance fields
.field private alarms:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;"
        }
    .end annotation
.end field

.field private backLight:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private coachings:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;"
        }
    .end annotation
.end field

.field private drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private schedules:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;"
        }
    .end annotation
.end field

.field private sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private stepGoal:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private vibration:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/szabh/smable3/entity/BleSedentarinessSettings;Lcom/szabh/smable3/entity/BleNoDisturbSettings;Ljava/lang/Integer;Ljava/util/List;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleGirlCareSettings;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;Lcom/szabh/smable3/entity/BleGameSettings;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleSedentarinessSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleNoDisturbSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleGestureWake;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleGirlCareSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p13    # Lcom/szabh/smable3/entity/BleGameSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/szabh/smable3/entity/BleSedentarinessSettings;",
            "Lcom/szabh/smable3/entity/BleNoDisturbSettings;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;",
            "Lcom/szabh/smable3/entity/BleHrMonitoringSettings;",
            "Lcom/szabh/smable3/entity/BleGestureWake;",
            "Lcom/szabh/smable3/entity/BleGirlCareSettings;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;",
            "Lcom/szabh/smable3/entity/BleDrinkWaterSettings;",
            "Lcom/szabh/smable3/entity/BleGameSettings;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonField;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    iput-object p4, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    iput-object p5, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    iput-object p7, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    iput-object p8, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    iput-object p9, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    iput-object p10, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    iput-object p11, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    iput-object p12, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    iput-object p13, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/DeviceSettings;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/szabh/smable3/entity/BleSedentarinessSettings;Lcom/szabh/smable3/entity/BleNoDisturbSettings;Ljava/lang/Integer;Ljava/util/List;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleGirlCareSettings;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;Lcom/szabh/smable3/entity/BleGameSettings;ILjava/lang/Object;)Lcom/sma/smartv3/model/DeviceSettings;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/sma/smartv3/model/DeviceSettings;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/szabh/smable3/entity/BleSedentarinessSettings;Lcom/szabh/smable3/entity/BleNoDisturbSettings;Ljava/lang/Integer;Ljava/util/List;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleGirlCareSettings;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;Lcom/szabh/smable3/entity/BleGameSettings;)Lcom/sma/smartv3/model/DeviceSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    return-object v0
.end method

.method public final component13()Lcom/szabh/smable3/entity/BleGameSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Lcom/szabh/smable3/entity/BleSedentarinessSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    return-object v0
.end method

.method public final component4()Lcom/szabh/smable3/entity/BleNoDisturbSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    return-object v0
.end method

.method public final component8()Lcom/szabh/smable3/entity/BleGestureWake;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    return-object v0
.end method

.method public final component9()Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/szabh/smable3/entity/BleSedentarinessSettings;Lcom/szabh/smable3/entity/BleNoDisturbSettings;Ljava/lang/Integer;Ljava/util/List;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleGirlCareSettings;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;Lcom/szabh/smable3/entity/BleGameSettings;)Lcom/sma/smartv3/model/DeviceSettings;
    .locals 14
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleSedentarinessSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleNoDisturbSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleGestureWake;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleGirlCareSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p13    # Lcom/szabh/smable3/entity/BleGameSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/szabh/smable3/entity/BleSedentarinessSettings;",
            "Lcom/szabh/smable3/entity/BleNoDisturbSettings;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;",
            "Lcom/szabh/smable3/entity/BleHrMonitoringSettings;",
            "Lcom/szabh/smable3/entity/BleGestureWake;",
            "Lcom/szabh/smable3/entity/BleGirlCareSettings;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;",
            "Lcom/szabh/smable3/entity/BleDrinkWaterSettings;",
            "Lcom/szabh/smable3/entity/BleGameSettings;",
            ")",
            "Lcom/sma/smartv3/model/DeviceSettings;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/DeviceSettings;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/model/DeviceSettings;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/szabh/smable3/entity/BleSedentarinessSettings;Lcom/szabh/smable3/entity/BleNoDisturbSettings;Ljava/lang/Integer;Ljava/util/List;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleGirlCareSettings;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;Lcom/szabh/smable3/entity/BleGameSettings;)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/model/DeviceSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/DeviceSettings;

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    iget-object v3, p1, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    iget-object p1, p1, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAlarms()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    return-object v0
.end method

.method public final getBackLight()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCoachings()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    return-object v0
.end method

.method public final getDrinkWaterSettings()Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    return-object v0
.end method

.method public final getGameSettings()Lcom/szabh/smable3/entity/BleGameSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    return-object v0
.end method

.method public final getGestureWake()Lcom/szabh/smable3/entity/BleGestureWake;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    return-object v0
.end method

.method public final getGirlCare()Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    return-object v0
.end method

.method public final getHrMonitoringSettings()Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    return-object v0
.end method

.method public final getNoDisturbSettings()Lcom/szabh/smable3/entity/BleNoDisturbSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    return-object v0
.end method

.method public final getSchedules()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    return-object v0
.end method

.method public final getSedentarinessSettings()Lcom/szabh/smable3/entity/BleSedentarinessSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    return-object v0
.end method

.method public final getStepGoal()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getVibration()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGestureWake;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDrinkWaterSettings;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    if-nez v2, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGameSettings;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    return v0
.end method

.method public final setAlarms(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    return-void
.end method

.method public final setBackLight(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    return-void
.end method

.method public final setCoachings(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    return-void
.end method

.method public final setDrinkWaterSettings(Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    return-void
.end method

.method public final setGestureWake(Lcom/szabh/smable3/entity/BleGestureWake;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleGestureWake;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    return-void
.end method

.method public final setGirlCare(Lcom/szabh/smable3/entity/BleGirlCareSettings;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleGirlCareSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    return-void
.end method

.method public final setHrMonitoringSettings(Lcom/szabh/smable3/entity/BleHrMonitoringSettings;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    return-void
.end method

.method public final setNoDisturbSettings(Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleNoDisturbSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    return-void
.end method

.method public final setSchedules(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSchedule;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    return-void
.end method

.method public final setSedentarinessSettings(Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleSedentarinessSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    return-void
.end method

.method public final setStepGoal(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    return-void
.end method

.method public final setVibration(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/DeviceSettings;->stepGoal:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/sma/smartv3/model/DeviceSettings;->backLight:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/sma/smartv3/model/DeviceSettings;->sedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    iget-object v3, p0, Lcom/sma/smartv3/model/DeviceSettings;->noDisturbSettings:Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    iget-object v4, p0, Lcom/sma/smartv3/model/DeviceSettings;->vibration:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/sma/smartv3/model/DeviceSettings;->alarms:Ljava/util/List;

    iget-object v6, p0, Lcom/sma/smartv3/model/DeviceSettings;->hrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    iget-object v7, p0, Lcom/sma/smartv3/model/DeviceSettings;->gestureWake:Lcom/szabh/smable3/entity/BleGestureWake;

    iget-object v8, p0, Lcom/sma/smartv3/model/DeviceSettings;->girlCare:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    iget-object v9, p0, Lcom/sma/smartv3/model/DeviceSettings;->schedules:Ljava/util/List;

    iget-object v10, p0, Lcom/sma/smartv3/model/DeviceSettings;->coachings:Ljava/util/List;

    iget-object v11, p0, Lcom/sma/smartv3/model/DeviceSettings;->drinkWaterSettings:Lcom/szabh/smable3/entity/BleDrinkWaterSettings;

    iget-object v12, p0, Lcom/sma/smartv3/model/DeviceSettings;->gameSettings:Lcom/szabh/smable3/entity/BleGameSettings;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "DeviceSettings(stepGoal="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backLight="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sedentarinessSettings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", noDisturbSettings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vibration="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alarms="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hrMonitoringSettings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gestureWake="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", girlCare="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", schedules="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", coachings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", drinkWaterSettings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gameSettings="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
