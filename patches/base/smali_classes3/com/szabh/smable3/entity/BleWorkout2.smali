.class public final Lcom/szabh/smable3/entity/BleWorkout2;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout2$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout2$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x80


# instance fields
.field private mAirPressure:I

.field private mAltitude:I

.field private mAltitudeclimb:I

.field private mAvgBpm:I

.field private mAvgStress:I

.field private mCalorie:I

.field private mDistance:I

.field private mDuration:I

.field private mEnd:I

.field private mMaxAltitude:I

.field private mMaxBpm:I

.field private mMaxPace:I

.field private mMaxSpeed:I

.field private mMaxSpm:I

.field private mMaxStress:I

.field private mMinAltitude:I

.field private mMinBpm:I

.field private mMinPace:I

.field private mMinSpeed:I

.field private mMinSpm:I

.field private mMinStress:I

.field private mMode:I

.field private mPace:I

.field private mRestDuration:I

.field private mSpeed:I

.field private mSpm:I

.field private mStart:I

.field private mStep:I

.field private mUndefined:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout2;->Companion:Lcom/szabh/smable3/entity/BleWorkout2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 32

    .line 1
    const v30, 0x1fffffff

    const/16 v31, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v31}, Lcom/szabh/smable3/entity/BleWorkout2;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    .line 15
    iput p13, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    .line 16
    iput p14, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    .line 17
    iput p15, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    move/from16 p1, p20

    .line 22
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    move/from16 p1, p21

    .line 23
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    move/from16 p1, p22

    .line 24
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    move/from16 p1, p23

    .line 25
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    move/from16 p1, p24

    .line 26
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    move/from16 p1, p25

    .line 27
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    move/from16 p1, p26

    .line 28
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    move/from16 p1, p27

    .line 29
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    move/from16 p1, p28

    .line 30
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    move/from16 p1, p29

    .line 31
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 30

    move/from16 v0, p30

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

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    const/16 v23, 0x0

    goto :goto_16

    :cond_16
    move/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    const/16 v24, 0x0

    goto :goto_17

    :cond_17
    move/from16 v24, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    const/16 v25, 0x0

    goto :goto_18

    :cond_18
    move/from16 v25, p25

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    const/16 v26, 0x0

    goto :goto_19

    :cond_19
    move/from16 v26, p26

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    const/16 v27, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v27, p27

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1b

    const/16 v28, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v28, p28

    :goto_1b
    const/high16 v29, 0x10000000

    and-int v0, v0, v29

    if-eqz v0, :cond_1c

    const/16 p30, 0x0

    :goto_1c
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

    move/from16 p20, v19

    move/from16 p21, v20

    move/from16 p22, v21

    move/from16 p23, v22

    move/from16 p24, v23

    move/from16 p25, v24

    move/from16 p26, v25

    move/from16 p27, v26

    move/from16 p28, v27

    move/from16 p29, v28

    goto :goto_1d

    :cond_1c
    move/from16 p30, p29

    goto :goto_1c

    .line 32
    :goto_1d
    invoke-direct/range {p1 .. p30}, Lcom/szabh/smable3/entity/BleWorkout2;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWorkout2;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWorkout2;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p30

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p30, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p30, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p30, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p30, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p30, v16

    move/from16 p6, v1

    if-eqz v16, :cond_14

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p30, v16

    move/from16 p7, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p30, v16

    move/from16 p8, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p30, v16

    move/from16 p9, v1

    if-eqz v16, :cond_17

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p30, v16

    move/from16 p10, v1

    if-eqz v16, :cond_18

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p30, v16

    move/from16 p11, v1

    if-eqz v16, :cond_19

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p30, v16

    move/from16 p12, v1

    if-eqz v16, :cond_1a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p30, v16

    move/from16 p13, v1

    if-eqz v16, :cond_1b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p30, v16

    if-eqz v16, :cond_1c

    move/from16 p14, v1

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    move/from16 p29, p14

    move/from16 p30, v1

    :goto_1c
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move/from16 p26, p11

    move/from16 p27, p12

    move/from16 p28, p13

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

    goto :goto_1d

    :cond_1c
    move/from16 p30, p29

    move/from16 p29, v1

    goto :goto_1c

    :goto_1d
    invoke-virtual/range {p1 .. p30}, Lcom/szabh/smable3/entity/BleWorkout2;->copy(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWorkout2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    return v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    return v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    return v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWorkout2;
    .locals 30
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout2;

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move/from16 v27, p27

    move/from16 v28, p28

    move/from16 v29, p29

    invoke-direct/range {v0 .. v29}, Lcom/szabh/smable3/entity/BleWorkout2;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWorkout2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWorkout2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    if-eq v1, p1, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    return v0
.end method

.method public final getMAltitudeclimb()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    return v0
.end method

.method public final getMEnd()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    return v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    return v0
.end method

.method public final getMMinSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    return v0
.end method

.method public final getMRestDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    return v0
.end method

.method public final getMUndefined()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    return-void
.end method

.method public final setMAltitudeclimb(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    return-void
.end method

.method public final setMEnd(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    return-void
.end method

.method public final setMMinSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    return-void
.end method

.method public final setMRestDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    return-void
.end method

.method public final setMUndefined(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWorkout2(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAirPressure:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUndefined="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mUndefined:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAvgStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMaxSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mMinSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRestDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mRestDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudeclimb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout2;->mAltitudeclimb:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
