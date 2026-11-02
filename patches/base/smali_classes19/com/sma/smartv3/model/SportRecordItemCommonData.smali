.class public final Lcom/sma/smartv3/model/SportRecordItemCommonData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private contentList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/sma/smartv3/model/SportRecordItemData;",
            ">;"
        }
    .end annotation
.end field

.field private gpsState:I

.field private mAvgSpeed:F

.field private mCalorie:I

.field private mDistance:I

.field private mDuration:I

.field private mMode:I

.field private mPace:I

.field private mPlatform:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSpeed:I

.field private spanCount:I

.field private sportStartTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportTimeStr:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private workoutImg:I

.field private workoutModeName:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIILjava/util/List;ILjava/lang/String;IIIIILjava/lang/String;FI)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "+",
            "Lcom/sma/smartv3/model/SportRecordItemData;",
            ">;I",
            "Ljava/lang/String;",
            "IIIII",
            "Ljava/lang/String;",
            "FI)V"
        }
    .end annotation

    const-string v0, "sportStartTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportTimeStr"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPlatform"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportStartTime:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutImg:I

    .line 4
    iput p3, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutModeName:I

    .line 5
    iput p4, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->gpsState:I

    .line 6
    iput-object p5, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->contentList:Ljava/util/List;

    .line 7
    iput p6, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->spanCount:I

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportTimeStr:Ljava/lang/String;

    .line 9
    iput p8, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDistance:I

    .line 10
    iput p9, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPace:I

    .line 11
    iput p10, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mCalorie:I

    .line 12
    iput p11, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDuration:I

    .line 13
    iput p12, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mMode:I

    .line 14
    iput-object p13, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPlatform:Ljava/lang/String;

    move p1, p14

    .line 15
    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mAvgSpeed:F

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mSpeed:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILjava/util/List;ILjava/lang/String;IIIIILjava/lang/String;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x40

    .line 17
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v11, v3

    goto :goto_1

    :cond_1
    move/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move v12, v3

    goto :goto_2

    :cond_2
    move/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move v13, v3

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move v14, v3

    goto :goto_4

    :cond_4
    move/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move v15, v3

    goto :goto_5

    :cond_5
    move/from16 v15, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    move/from16 v17, v1

    goto :goto_7

    :cond_7
    move/from16 v17, p14

    :goto_7
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_8

    move/from16 v18, v3

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v3, p0

    goto :goto_8

    :cond_8
    move/from16 v18, p15

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    :goto_8
    invoke-direct/range {v3 .. v18}, Lcom/sma/smartv3/model/SportRecordItemCommonData;-><init>(Ljava/lang/String;IIILjava/util/List;ILjava/lang/String;IIIIILjava/lang/String;FI)V

    return-void
.end method


# virtual methods
.method public final getContentList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SportRecordItemData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->contentList:Ljava/util/List;

    return-object v0
.end method

.method public final getGpsState()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->gpsState:I

    return v0
.end method

.method public final getMAvgSpeed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mAvgSpeed:F

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDuration:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPace:I

    return v0
.end method

.method public final getMPlatform()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mSpeed:I

    return v0
.end method

.method public final getSpanCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->spanCount:I

    return v0
.end method

.method public final getSportStartTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportStartTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getSportTimeStr()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportTimeStr:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutImg()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutImg:I

    return v0
.end method

.method public final getWorkoutModeName()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutModeName:I

    return v0
.end method

.method public final setContentList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/sma/smartv3/model/SportRecordItemData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->contentList:Ljava/util/List;

    return-void
.end method

.method public final setGpsState(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->gpsState:I

    return-void
.end method

.method public final setMAvgSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mAvgSpeed:F

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDuration:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPace:I

    return-void
.end method

.method public final setMPlatform(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPlatform:Ljava/lang/String;

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mSpeed:I

    return-void
.end method

.method public final setSpanCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->spanCount:I

    return-void
.end method

.method public final setSportStartTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportStartTime:Ljava/lang/String;

    return-void
.end method

.method public final setSportTimeStr(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportTimeStr:Ljava/lang/String;

    return-void
.end method

.method public final setWorkoutImg(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutImg:I

    return-void
.end method

.method public final setWorkoutModeName(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutModeName:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 17
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportStartTime:Ljava/lang/String;

    iget v2, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutImg:I

    iget v3, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->workoutModeName:I

    iget v4, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->gpsState:I

    iget-object v5, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->contentList:Ljava/util/List;

    iget v6, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->spanCount:I

    iget-object v7, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->sportTimeStr:Ljava/lang/String;

    iget v8, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDistance:I

    iget v9, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPace:I

    iget v10, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mCalorie:I

    iget v11, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mDuration:I

    iget v12, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mMode:I

    iget-object v13, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mPlatform:Ljava/lang/String;

    iget v14, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mAvgSpeed:F

    iget v15, v0, Lcom/sma/smartv3/model/SportRecordItemCommonData;->mSpeed:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "SportRecordItemCommonData(sportStartTime=\'"

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', workoutImg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", workoutModeName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gpsState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", contentList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spanCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sportTimeStr=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPlatform=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mAvgSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
