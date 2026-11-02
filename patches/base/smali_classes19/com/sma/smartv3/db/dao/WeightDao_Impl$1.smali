.class Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/WeightDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/Weight;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/Weight;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/Weight;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "statement",
            "entity"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMIsMeasure()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x7

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x8

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFat()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x9

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfMuscle()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xa

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfFat()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xb

    .line 14
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfProtein()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xc

    .line 15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfWater()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xd

    .line 16
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMStateOfNutrition()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xe

    .line 17
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMIdealWeight()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0xf

    .line 18
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMAgeOfBody()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 19
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMAgeOfBodyRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_1

    .line 20
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 21
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 22
    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBmiRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_2

    .line 23
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 24
    :cond_2
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBmiWHORange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_3

    .line 26
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 27
    :cond_3
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_3
    const/16 v0, 0x13

    .line 28
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBmr()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 29
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBmrRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_4

    .line 30
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 31
    :cond_4
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_4
    const/16 v0, 0x15

    .line 32
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMBodyShape()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x16

    .line 33
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMDesirableWeight()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x17

    .line 34
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMFatFreeBodyWeight()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x18

    .line 35
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMFatToControl()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x19

    .line 36
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMLevelOfVisceralFat()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 37
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMLevelOfVisceralFatRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1a

    if-nez v0, :cond_5

    .line 38
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 39
    :cond_5
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_5
    const/16 v0, 0x1b

    .line 40
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMMuscleToControl()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 41
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFatRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1c

    if-nez v0, :cond_6

    .line 42
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_6

    .line 43
    :cond_6
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_6
    const/16 v0, 0x1d

    .line 44
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfMuscle()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 45
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfMuscleRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1e

    if-nez v0, :cond_7

    .line 46
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_7

    .line 47
    :cond_7
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 48
    :goto_7
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfProteinRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f

    if-nez v0, :cond_8

    .line 49
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_8

    .line 50
    :cond_8
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_8
    const/16 v0, 0x20

    .line 51
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSkeletalMuscle()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 52
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSkeletalMuscleRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x21

    if-nez v0, :cond_9

    .line 53
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_9

    .line 54
    :cond_9
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_9
    const/16 v0, 0x22

    .line 55
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSubcutaneousFat()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 56
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfSubcutaneousFatRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x23

    if-nez v0, :cond_a

    .line 57
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_a

    .line 58
    :cond_a
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 59
    :goto_a
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfWaterRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    if-nez v0, :cond_b

    .line 60
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_b

    .line 61
    :cond_b
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_b
    const/16 v0, 0x25

    .line 62
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMScore()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x26

    .line 63
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfBone()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 64
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfBoneRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x27

    if-nez v0, :cond_c

    .line 65
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_c

    .line 66
    :cond_c
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 67
    :goto_c
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfFatRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    if-nez v0, :cond_d

    .line 68
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_d

    .line 69
    :cond_d
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 70
    :goto_d
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfMuscleRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x29

    if-nez v0, :cond_e

    .line 71
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_e

    .line 72
    :cond_e
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_e
    const/16 v0, 0x2a

    .line 73
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfProtein()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 74
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfProteinRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2b

    if-nez v0, :cond_f

    .line 75
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_f

    .line 76
    :cond_f
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_f
    const/16 v0, 0x2c

    .line 77
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfSkeletalMuscle()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 78
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfSkeletalMuscleRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2d

    if-nez v0, :cond_10

    .line 79
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_10

    .line 80
    :cond_10
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_10
    const/16 v0, 0x2e

    .line 81
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfWater()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 82
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightOfWaterRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    if-nez v0, :cond_11

    .line 83
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_11

    .line 84
    :cond_11
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 85
    :goto_11
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightRange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x30

    if-nez v0, :cond_12

    .line 86
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_12

    .line 87
    :cond_12
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_12
    const/16 v0, 0x31

    .line 88
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightToControl()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 89
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WeightDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMWeightWHORange()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->objectToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x32

    if-nez v0, :cond_13

    .line 90
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_13

    .line 91
    :cond_13
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 92
    :goto_13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMIsDelete()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x33

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 93
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfProteinLevel()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x34

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 94
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfWaterLevel()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x35

    invoke-interface {p1, p2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x1010
        }
        names = {
            "statement",
            "entity"
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/Weight;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `Weight` (`mId`,`mTime`,`mLocalTime`,`mWeight`,`mIsSync`,`mIsMeasure`,`mBmi`,`mRatioOfFat`,`mWeightOfMuscle`,`mWeightOfFat`,`mRatioOfProtein`,`mRatioOfWater`,`mStateOfNutrition`,`mIdealWeight`,`mAgeOfBody`,`mAgeOfBodyRange`,`mBmiRange`,`mBmiWHORange`,`mBmr`,`mBmrRange`,`mBodyShape`,`mDesirableWeight`,`mFatFreeBodyWeight`,`mFatToControl`,`mLevelOfVisceralFat`,`mLevelOfVisceralFatRange`,`mMuscleToControl`,`mRatioOfFatRange`,`mRatioOfMuscle`,`mRatioOfMuscleRange`,`mRatioOfProteinRange`,`mRatioOfSkeletalMuscle`,`mRatioOfSkeletalMuscleRange`,`mRatioOfSubcutaneousFat`,`mRatioOfSubcutaneousFatRange`,`mRatioOfWaterRange`,`mScore`,`mWeightOfBone`,`mWeightOfBoneRange`,`mWeightOfFatRange`,`mWeightOfMuscleRange`,`mWeightOfProtein`,`mWeightOfProteinRange`,`mWeightOfSkeletalMuscle`,`mWeightOfSkeletalMuscleRange`,`mWeightOfWater`,`mWeightOfWaterRange`,`mWeightRange`,`mWeightToControl`,`mWeightWHORange`,`mIsDelete`,`mRatioOfProteinLevel`,`mRatioOfWaterLevel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
