.class public final Lcom/szabh/smable3/entity/BleMatchRecord3;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchRecord3$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMatchRecord3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,64:1\n222#2,4:65\n232#2,3:69\n222#2,15:72\n232#2,3:87\n222#2,15:90\n222#2,4:105\n222#2,4:109\n*S KotlinDebug\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n*L\n31#1:65,4\n33#1:69,3\n33#1:72,15\n41#1:87,3\n41#1:90,15\n43#1:105,4\n44#1:109,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMatchRecord3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,64:1\n222#2,4:65\n232#2,3:69\n222#2,15:72\n232#2,3:87\n222#2,15:90\n222#2,4:105\n222#2,4:109\n*S KotlinDebug\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n*L\n31#1:65,4\n33#1:69,3\n33#1:72,15\n41#1:87,3\n41#1:90,15\n43#1:105,4\n44#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field public static final CLASSIC:I = 0x1

.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchRecord3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FIELD_HOCKEY:I = 0x5

.field public static final FUTSAL:I = 0x4

.field public static final ITEM_LENGTH:I = 0xf16

.field public static final PROFILE:I = 0x2

.field public static final RUGBY:I = 0x6

.field public static final TRAINING:I = 0x3

.field public static final YOUTH:I


# instance fields
.field private mIsStopWatchData:I

.field private mLogList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;"
        }
    .end annotation
.end field

.field private mLogListSize:I

.field private mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPeriodList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;"
        }
    .end annotation
.end field

.field private mPeriodListSize:I

.field private mStart:I

.field private mStopWatchList:Ljava/util/List;
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

.field private mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:I

.field private mWeather:Lcom/szabh/smable3/entity/BleWeather2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchRecord3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchRecord3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchRecord3;->Companion:Lcom/szabh/smable3/entity/BleMatchRecord3$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/szabh/smable3/entity/BleMatchRecord3;-><init>(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;)V
    .locals 1
    .param p6    # Lcom/szabh/smable3/entity/BleMatchPeriod2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p10    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/entity/BleWeather2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/szabh/smable3/entity/BleMatchRecordTeam3;",
            "Lcom/szabh/smable3/entity/BleWeather2;",
            ")V"
        }
    .end annotation

    const-string v0, "mPeriod"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriodList"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLogList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mStopWatchList"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTeamInfo"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeather"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    .line 13
    iput-object p11, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    move/from16 v0, p12

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

    goto :goto_4

    :cond_4
    move/from16 v2, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    .line 14
    new-instance v7, Lcom/szabh/smable3/entity/BleMatchPeriod2;

    const/16 v16, 0xff

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/szabh/smable3/entity/BleMatchPeriod2;-><init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    .line 15
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    goto :goto_6

    :cond_6
    move-object/from16 v6, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    .line 16
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    .line 17
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    .line 18
    new-instance v11, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    const v28, 0xffff

    const/16 v29, 0x0

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

    invoke-direct/range {v11 .. v29}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;-><init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    .line 19
    new-instance v12, Lcom/szabh/smable3/entity/BleWeather2;

    const v30, 0x1ffff

    const/16 v31, 0x0

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

    invoke-direct/range {v12 .. v31}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p12, v12

    :goto_a
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p6, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p8, v6

    move-object/from16 p7, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v11

    goto :goto_b

    :cond_a
    move-object/from16 p12, p11

    goto :goto_a

    .line 20
    :goto_b
    invoke-direct/range {p1 .. p12}, Lcom/szabh/smable3/entity/BleMatchRecord3;-><init>(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchRecord3;IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchRecord3;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/szabh/smable3/entity/BleMatchRecord3;->copy(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;)Lcom/szabh/smable3/entity/BleMatchRecord3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    return v0
.end method

.method public final component10()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-object v0
.end method

.method public final component11()Lcom/szabh/smable3/entity/BleWeather2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    return v0
.end method

.method public final component6()Lcom/szabh/smable3/entity/BleMatchPeriod2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

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
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;)Lcom/szabh/smable3/entity/BleMatchRecord3;
    .locals 13
    .param p6    # Lcom/szabh/smable3/entity/BleMatchPeriod2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p10    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/entity/BleWeather2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/szabh/smable3/entity/BleMatchRecordTeam3;",
            "Lcom/szabh/smable3/entity/BleWeather2;",
            ")",
            "Lcom/szabh/smable3/entity/BleMatchRecord3;"
        }
    .end annotation

    const-string v0, "mPeriod"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriodList"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLogList"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mStopWatchList"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTeamInfo"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeather"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMatchRecord3;

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lcom/szabh/smable3/entity/BleMatchRecord3;-><init>(IIIIILcom/szabh/smable3/entity/BleMatchPeriod2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather2;)V

    return-object v1
.end method

.method public decode()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    const-class v0, Lcom/szabh/smable3/entity/BleMatchPeriod2;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v3, 0xe

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v2}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/szabh/smable3/entity/BleMatchPeriod2;

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/16 v6, 0x9

    if-ge v5, v6, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v6}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const/16 v3, 0x129

    if-ge v4, v3, :cond_1

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    const/16 v1, 0x63

    if-ge v4, v1, :cond_3

    const-class v1, Lcom/szabh/smable3/entity/BleMatchLog3;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v3, 0x10

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    :goto_3
    const-class v0, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0x83c

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    const-class v0, Lcom/szabh/smable3/entity/BleWeather2;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0x14

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleWeather2;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v0, 0x0

    invoke-static {p0, v0, v2, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchRecord3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getMIsStopWatchData()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    return v0
.end method

.method public final getMLogList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    return-object v0
.end method

.method public final getMLogListSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    return v0
.end method

.method public final getMPeriod()Lcom/szabh/smable3/entity/BleMatchPeriod2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    return-object v0
.end method

.method public final getMPeriodList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    return-object v0
.end method

.method public final getMPeriodListSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    return v0
.end method

.method public final getMStopWatchList()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    return-object v0
.end method

.method public final getMTeamInfo()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    return v0
.end method

.method public final getMWeather()Lcom/szabh/smable3/entity/BleWeather2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMIsStopWatchData(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    return-void
.end method

.method public final setMLogList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchLog3;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    return-void
.end method

.method public final setMLogListSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    return-void
.end method

.method public final setMPeriod(Lcom/szabh/smable3/entity/BleMatchPeriod2;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleMatchPeriod2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    return-void
.end method

.method public final setMPeriodList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchPeriod2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    return-void
.end method

.method public final setMPeriodListSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    return-void
.end method

.method public final setMStopWatchList(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    return-void
.end method

.method public final setMTeamInfo(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    return-void
.end method

.method public final setMWeather(Lcom/szabh/smable3/entity/BleWeather2;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleWeather2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchRecord3(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodListSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodListSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLogListSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogListSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsStopWatchData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mIsStopWatchData:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriod:Lcom/szabh/smable3/entity/BleMatchPeriod2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mPeriodList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLogList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mLogList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mStopWatchList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mStopWatchList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mTeamInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecord3;->mWeather:Lcom/szabh/smable3/entity/BleWeather2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
