.class public final Lcom/szabh/smable3/entity/BleMatchYouthSettings3;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchYouthSettings3$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMatchYouthSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchYouthSettings3.kt\ncom/szabh/smable3/entity/BleMatchYouthSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMatchYouthSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchYouthSettings3.kt\ncom/szabh/smable3/entity/BleMatchYouthSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchYouthSettings3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NAME_LENGTH:I = 0x19


# instance fields
.field private mBreakTime:Ljava/util/List;
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

.field private mButtonType:I

.field private mEventTime:I

.field private mGoalAutoStop:I

.field private mGps:I

.field private mGuestTeamColor:I

.field private mHomeTeamColor:I

.field private mMatchView:I

.field private mPenaltyAutoStop:I

.field private mPenaltyTime:I

.field private mPeriodMode:I

.field private mPeriodReminder:I

.field private mPeriodReminderTime:I

.field private mPeriodTime:Ljava/util/List;
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

.field private mPeriods:I

.field private mRefereeRole:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRingVolume:I

.field private mScreen:I

.field private mTeamNames:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mVibration:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchYouthSettings3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->Companion:Lcom/szabh/smable3/entity/BleMatchYouthSettings3$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 23

    .line 1
    const v21, 0xfffff

    const/16 v22, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v22}, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;-><init>(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIII)V
    .locals 2
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIIIIIII",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;IIIIIII)V"
        }
    .end annotation

    move-object v0, p13

    const-string v1, "mPeriodTime"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mBreakTime"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mTeamNames"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mRefereeRole"

    invoke-static {p13, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    .line 14
    iput-object p12, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    .line 15
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    move/from16 p1, p20

    .line 22
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 24
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

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

    .line 25
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    .line 26
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

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

    and-int v0, v0, v20

    if-eqz v0, :cond_13

    const/16 p21, 0x0

    :goto_13
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p19, v18

    move/from16 p20, v19

    goto :goto_14

    :cond_13
    move/from16 p21, p20

    goto :goto_13

    .line 27
    :goto_14
    invoke-direct/range {p1 .. p21}, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;-><init>(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchYouthSettings3;ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchYouthSettings3;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move/from16 p5, v1

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    move/from16 p20, p5

    move/from16 p21, v1

    :goto_13
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move/from16 p21, p20

    move/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->copy(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIII)Lcom/szabh/smable3/entity/BleMatchYouthSettings3;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    return v0
.end method

.method public final component2()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    return-object v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    return v0
.end method

.method public final component3()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    return v0
.end method

.method public final copy(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIII)Lcom/szabh/smable3/entity/BleMatchYouthSettings3;
    .locals 22
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIIIIIII",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;IIIIIII)",
            "Lcom/szabh/smable3/entity/BleMatchYouthSettings3;"
        }
    .end annotation

    const-string v0, "mPeriodTime"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBreakTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTeamNames"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRefereeRole"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;

    move/from16 v2, p1

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;-><init>(ILjava/util/List;Ljava/util/List;IIIIIIIILjava/util/List;Ljava/util/List;IIIIIII)V

    return-object v1
.end method

.method public encode()V
    .locals 11

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move v2, v6

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x0

    const/16 v3, 0x9

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    if-ltz v2, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v1

    :goto_1
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {p0, v3, v8, v7, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v6

    :goto_2
    const/16 v3, 0x8

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    if-ltz v2, :cond_2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_3

    :cond_2
    move-object v3, v1

    :goto_3
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {p0, v3, v8, v7, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    invoke-static {p0, v1, v8, v7, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    move v9, v6

    :goto_4
    const-string v10, ""

    if-ge v9, v7, :cond_5

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    if-ltz v9, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v9, v2, :cond_4

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    :cond_4
    move-object v1, v10

    check-cast v1, Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x19

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    const/4 v1, 0x4

    if-ge v6, v1, :cond_7

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    if-ltz v6, :cond_6

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v6, v2, :cond_6

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_6

    :cond_6
    move-object v1, v10

    :goto_6
    check-cast v1, Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x19

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    invoke-static {p0, v1, v8, v7, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    if-eq v1, p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getMBreakTime()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMButtonType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    return v0
.end method

.method public final getMEventTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    return v0
.end method

.method public final getMGoalAutoStop()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    return v0
.end method

.method public final getMGps()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    return v0
.end method

.method public final getMGuestTeamColor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    return v0
.end method

.method public final getMHomeTeamColor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xcb

    return v0
.end method

.method public final getMMatchView()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    return v0
.end method

.method public final getMPenaltyAutoStop()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    return v0
.end method

.method public final getMPenaltyTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    return v0
.end method

.method public final getMPeriodMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    return v0
.end method

.method public final getMPeriodReminder()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    return v0
.end method

.method public final getMPeriodReminderTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    return v0
.end method

.method public final getMPeriodTime()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMPeriods()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    return v0
.end method

.method public final getMRefereeRole()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    return-object v0
.end method

.method public final getMRingVolume()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    return v0
.end method

.method public final getMScreen()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    return v0
.end method

.method public final getMTeamNames()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    return-object v0
.end method

.method public final getMVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMBreakTime(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    return-void
.end method

.method public final setMButtonType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    return-void
.end method

.method public final setMEventTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    return-void
.end method

.method public final setMGoalAutoStop(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    return-void
.end method

.method public final setMGps(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    return-void
.end method

.method public final setMGuestTeamColor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    return-void
.end method

.method public final setMHomeTeamColor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    return-void
.end method

.method public final setMMatchView(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    return-void
.end method

.method public final setMPenaltyAutoStop(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    return-void
.end method

.method public final setMPenaltyTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    return-void
.end method

.method public final setMPeriodMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    return-void
.end method

.method public final setMPeriodReminder(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    return-void
.end method

.method public final setMPeriodReminderTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    return-void
.end method

.method public final setMPeriodTime(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    return-void
.end method

.method public final setMPeriods(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    return-void
.end method

.method public final setMRefereeRole(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    return-void
.end method

.method public final setMRingVolume(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    return-void
.end method

.method public final setMScreen(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    return-void
.end method

.method public final setMTeamNames(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    return-void
.end method

.method public final setMVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchYouthSettings3(mPeriods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriods:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBreakTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mBreakTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mButtonType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mButtonType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHomeTeamColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mHomeTeamColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGuestTeamColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGuestTeamColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPenaltyTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mScreen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMatchView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mMatchView:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTeamNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mTeamNames:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRefereeRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRefereeRole:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mEventTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mEventTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRingVolume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mRingVolume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodReminderTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPeriodReminderTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGoalAutoStop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mGoalAutoStop:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPenaltyAutoStop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchYouthSettings3;->mPenaltyAutoStop:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
