.class public final Lcom/szabh/smable3/entity/BleCPUserInfo;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPUserInfo$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleCPUserInfo$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FEMALE:I = 0x0

.field public static final ITEM_LENGTH:I = 0x33

.field public static final MALE:I = 0x1


# instance fields
.field private isCP:I

.field private mAge:I

.field private mBloodOxygen:I

.field private mBloodOxygenSwitch:I

.field private mCalorie:I

.field private mDateTogether:I

.field private mDistance:I

.field private mDistanceSwitch:I

.field private mGender:I

.field private mHeartRate:I

.field private mHeartRateSwitch:I

.field private mPressure:I

.field private mPressureSwitch:I

.field private mStep:I

.field private mStepGoal:I

.field private mStepSwitch:I

.field private mTemperature:I

.field private mTemperatureSwitch:I

.field private mUserName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPUserInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPUserInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->Companion:Lcom/szabh/smable3/entity/BleCPUserInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x7ffff

    const/16 v21, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/szabh/smable3/entity/BleCPUserInfo;-><init>(IIIIIIIIIIIIIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIILjava/lang/String;)V
    .locals 2
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p19

    const-string v1, "mUserName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    .line 15
    iput p13, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    .line 21
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p20

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

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

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

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v0, v0, v19

    if-eqz v0, :cond_12

    .line 22
    const-string v0, ""

    move-object/from16 p20, v0

    :goto_12
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p19, v18

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 23
    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleCPUserInfo;-><init>(IIIIIIIIIIIIIIIIIILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPUserInfo;IIIIIIIIIIIIIIIIIILjava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPUserInfo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move/from16 p4, v1

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    move/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

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

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleCPUserInfo;->copy(IIIIIIIIIIIIIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleCPUserInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    return v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleCPUserInfo;
    .locals 21
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mUserName"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPUserInfo;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/szabh/smable3/entity/BleCPUserInfo;-><init>(IIIIIIIIIIIIIIIIIILjava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    return-void
.end method

.method public encode()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/16 v5, 0x20

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithMax$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPUserInfo;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getMAge()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    return v0
.end method

.method public final getMBloodOxygen()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    return v0
.end method

.method public final getMBloodOxygenSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    return v0
.end method

.method public final getMDateTogether()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    return v0
.end method

.method public final getMDistanceSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    return v0
.end method

.method public final getMGender()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    return v0
.end method

.method public final getMHeartRate()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    return v0
.end method

.method public final getMHeartRateSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x33

    return v0
.end method

.method public final getMPressure()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    return v0
.end method

.method public final getMPressureSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    return v0
.end method

.method public final getMStepGoal()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    return v0
.end method

.method public final getMStepSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    return v0
.end method

.method public final getMTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    return v0
.end method

.method public final getMTemperatureSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    return v0
.end method

.method public final getMUserName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCP()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    return v0
.end method

.method public final setCP(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    return-void
.end method

.method public final setMAge(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    return-void
.end method

.method public final setMBloodOxygen(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    return-void
.end method

.method public final setMBloodOxygenSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    return-void
.end method

.method public final setMDateTogether(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    return-void
.end method

.method public final setMDistanceSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    return-void
.end method

.method public final setMGender(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    return-void
.end method

.method public final setMHeartRate(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    return-void
.end method

.method public final setMHeartRateSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    return-void
.end method

.method public final setMPressure(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    return-void
.end method

.method public final setMPressureSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    return-void
.end method

.method public final setMStepGoal(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    return-void
.end method

.method public final setMStepSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    return-void
.end method

.method public final setMTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    return-void
.end method

.method public final setMTemperatureSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    return-void
.end method

.method public final setMUserName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPUserInfo(isCP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->isCP:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mGender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mAge:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStepSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeartRateSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRateSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTemperatureSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperatureSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodOxygenSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygenSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPressureSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressureSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistanceSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistanceSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodOxygen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mBloodOxygen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mPressure:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStepGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mStepGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDateTogether="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mDateTogether:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUserName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPUserInfo;->mUserName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
