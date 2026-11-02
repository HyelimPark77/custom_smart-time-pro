.class Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/Workout;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/Workout;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/Workout;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 6
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitude()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAirPressure()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 14
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 16
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 19
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 21
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 22
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 23
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x16

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x17

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 27
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinStress()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x18

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 28
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxStress()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x19

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 29
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgStress()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 31
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 32
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMIsDelete()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 34
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPrototype()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f

    if-nez v0, :cond_1

    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPrototype()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 37
    :goto_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    if-nez v0, :cond_2

    .line 38
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 39
    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 40
    :goto_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x21

    if-nez v0, :cond_3

    .line 41
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 42
    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 43
    :goto_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x22

    if-nez v0, :cond_4

    .line 44
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 45
    :cond_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 46
    :goto_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x23

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 47
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x24

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 48
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRestDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x25

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 49
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAGpsType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x26

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 50
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x27

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 51
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMetTotal()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x28

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 52
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAerobic()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x29

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 53
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAnaerobic()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x2a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 54
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStamina()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x2b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 55
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgSpeed()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x2c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 56
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCadence()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x2d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 57
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxCadence()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x2e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 58
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCnt()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x2f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 59
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromIntArray([I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x30

    if-nez v0, :cond_5

    .line 60
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 61
    :cond_5
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 62
    :goto_5
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPersonalZone()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromIntArray([I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x31

    if-nez v0, :cond_6

    .line 63
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_6

    .line 64
    :cond_6
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 65
    :goto_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMLactateThresholdPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x32

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 66
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x33

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 67
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMTrainingLoad()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x34

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 68
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxVO2()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x35

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 69
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMLactateThresholdHr()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x36

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 70
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAlgorithmMarking()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x37

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 71
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x38

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 72
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x39

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 73
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->floatArrayListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3a

    if-nez v0, :cond_7

    .line 74
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_7

    .line 75
    :cond_7
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 76
    :goto_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMHrPathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 77
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMHrPathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 78
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMHrPathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3d

    if-nez v0, :cond_8

    .line 79
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_8

    .line 80
    :cond_8
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 81
    :goto_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPacePathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 82
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPacePathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 83
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPacePathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x40

    if-nez v0, :cond_9

    .line 84
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_9

    .line 85
    :cond_9
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 86
    :goto_9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeedPathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x41

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 87
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeedPathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x42

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 88
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeedPathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x43

    if-nez v0, :cond_a

    .line 89
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_a

    .line 90
    :cond_a
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 91
    :goto_a
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCadencePathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x44

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 92
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCadencePathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x45

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 93
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCadencePathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x46

    if-nez v0, :cond_b

    .line 94
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_b

    .line 95
    :cond_b
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 96
    :goto_b
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitudePathCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x47

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 97
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitudePathSampleInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x48

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 98
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitudePathPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x49

    if-nez v0, :cond_c

    .line 99
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_c

    .line 100
    :cond_c
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 101
    :goto_c
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMGoalDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 102
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMGoalTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 103
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMGoalCalorie()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 104
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPausedDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 105
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCurBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 106
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAscendAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x4f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 107
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDescendAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x50

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 108
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCurStress()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x51

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 109
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSwimType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x52

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 110
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCntFore()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x53

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 111
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCntBack()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x54

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 112
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBackSwingTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x55

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 113
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDownSwingTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x56

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 114
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDribbleTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x57

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 115
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMTripCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x58

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 116
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSessionCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x59

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 117
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMVerticalOscillation()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x5a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 118
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRunPowerWatt()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x5b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 119
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStepLen()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x5c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 120
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMTrainingStatus()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x5d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 121
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFitnessAge()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x5e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 122
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMTlTrend()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x5f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 123
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBestRunTime()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromIntArray([I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x60

    if-nez v0, :cond_d

    .line 124
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_d

    .line 125
    :cond_d
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 126
    :goto_d
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFitnessLevel()[F

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromFloatArray([F)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x61

    if-nez v0, :cond_e

    .line 127
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_e

    .line 128
    :cond_e
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 129
    :goto_e
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorieTotal()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x62

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 130
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPowerCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x63

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 131
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPowerInterval()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x64

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 132
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMPowerPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x65

    if-nez v0, :cond_f

    .line 133
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_f

    .line 134
    :cond_f
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 135
    :goto_f
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getRealTimeAerobic()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x66

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 136
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getRealTimeAnaerobic()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x67

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 137
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFatTotal()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x68

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 138
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCarboTotal()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x69

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 139
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 140
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 141
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorDifferenceTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 142
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 143
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 144
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x6f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 145
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorDifferenceDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x70

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 146
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x71

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 147
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x72

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 148
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x73

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 149
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorDifferencePace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x74

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 150
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x75

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 151
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x76

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 152
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualSpeedV2()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x77

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 153
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x78

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 154
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x79

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 155
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorDifferenceSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x7a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 156
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x7b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 157
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxOxygenPower()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x7c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 158
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMTrendWeek()[F

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromFloatArray([F)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7d

    if-nez v0, :cond_10

    .line 159
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_10

    .line 160
    :cond_10
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 161
    :goto_10
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCyclingIndex()[F

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->fromFloatArray([F)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7e

    if-nez v0, :cond_11

    .line 162
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_11

    .line 163
    :cond_11
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 164
    :goto_11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStaBalance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x7f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 165
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSwimSwolf()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x80

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 166
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCntLap()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x81

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 167
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFrontCrawlPerc()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x82

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 168
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBreaststrokePerc()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x83

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 169
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMBackstrokePerc()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x84

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 170
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMButterflyPerc()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x85

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 171
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpmPathPointsCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x86

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 172
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpmPathPointsPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x87

    if-nez v0, :cond_12

    .line 173
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_12

    .line 174
    :cond_12
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 175
    :goto_12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStepLenCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x88

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 176
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMStepLenPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->floatWatchToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x89

    if-nez v0, :cond_13

    .line 177
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_13

    .line 178
    :cond_13
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 179
    :goto_13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMEllipticalSteps()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x8b

    .line 180
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildSwimStartTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 181
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildSwimDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 182
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildSwimDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x8e

    .line 183
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildCyclingStartTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 184
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildCyclingDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 185
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildCyclingDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x90

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x91

    .line 186
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildRunStartTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 187
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildRunDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x92

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 188
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildRunDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x93

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 189
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildSwimMode()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x94

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 190
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildCyclingMode()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x95

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 191
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildRunMode()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x96

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 192
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMChildNumber()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x97

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 193
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRunLactateAvg()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x98

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 194
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMCyclingLactateAvg()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x99

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 195
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMFlag()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 196
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryHrCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 197
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;->IIX1OXO(Lcom/sma/smartv3/db/dao/WorkoutDao_Impl;)Lcom/sma/smartv3/db/entity/WorkoutConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryHrPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9c

    if-nez v0, :cond_14

    .line 198
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_14

    .line 199
    :cond_14
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 200
    :goto_14
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMSwimPoolLength()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 201
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDeviceId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9e

    if-nez v0, :cond_15

    .line 202
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_15

    .line 203
    :cond_15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 204
    :goto_15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Workout;->getMAICoachSportID()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x9f

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
    check-cast p2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/WorkoutDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/Workout;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR ABORT INTO `Workout` (`mId`,`mStart`,`mEnd`,`mLocalTime`,`mDuration`,`mAltitude`,`mAirPressure`,`mSpm`,`mMode`,`mStep`,`mDistance`,`mCalorie`,`mSpeed`,`mPace`,`mAvgBpm`,`mMaxBpm`,`mMinBpm`,`mMaxSpm`,`mMinSpm`,`mMaxPace`,`mMinPace`,`mMaxAltitude`,`mMinAltitude`,`mMinStress`,`mMaxStress`,`mAvgStress`,`mSource`,`mIsSync`,`mIsDelete`,`mFeel`,`mPrototype`,`mFirmwareFlag`,`mBleName`,`mPlatform`,`mMaxSpeed`,`mMinSpeed`,`mRestDuration`,`mAGpsType`,`mType`,`mMetTotal`,`mAerobic`,`mAnaerobic`,`mStamina`,`mAvgSpeed`,`mCadence`,`mMaxCadence`,`mCnt`,`mBpmZoneCount`,`mPersonalZone`,`mLactateThresholdPace`,`mRecoveryTime`,`mTrainingLoad`,`mMaxVO2`,`mLactateThresholdHr`,`mAlgorithmMarking`,`mPathCount`,`mPathSampleInterval`,`mPathPoints`,`mHrPathCount`,`mHrPathSampleInterval`,`mHrPathPoints`,`mPacePathCount`,`mPacePathSampleInterval`,`mPacePathPoints`,`mSpeedPathCount`,`mSpeedPathSampleInterval`,`mSpeedPathPoints`,`mCadencePathCount`,`mCadencePathSampleInterval`,`mCadencePathPoints`,`mAltitudePathCount`,`mAltitudePathSampleInterval`,`mAltitudePathPoints`,`mGoalDistance`,`mGoalTime`,`mGoalCalorie`,`mPausedDuration`,`mCurBpm`,`mAscendAltitude`,`mDescendAltitude`,`mCurStress`,`mSwimType`,`mCntFore`,`mCntBack`,`mBackSwingTime`,`mDownSwingTime`,`mDribbleTime`,`mTripCount`,`mSessionCount`,`mVerticalOscillation`,`mRunPowerWatt`,`mStepLen`,`mTrainingStatus`,`mFitnessAge`,`mTlTrend`,`mBestRunTime`,`mFitnessLevel`,`mCalorieTotal`,`mPowerCount`,`mPowerInterval`,`mPowerPoints`,`realTimeAerobic`,`realTimeAnaerobic`,`mFatTotal`,`mCarboTotal`,`mNavigatorTargetTime`,`mNavigatorActualTime`,`mNavigatorDifferenceTime`,`mNavigatorStatusTime`,`mNavigatorTargetDistance`,`mNavigatorActualDistance`,`mNavigatorDifferenceDistance`,`mNavigatorStatusDistance`,`mNavigatorTargetPace`,`mNavigatorActualPace`,`mNavigatorDifferencePace`,`mNavigatorStatusPace`,`mNavigatorTargetSpeedV2`,`mNavigatorActualSpeedV2`,`mNavigatorTargetSpeed`,`mNavigatorActualSpeed`,`mNavigatorDifferenceSpeed`,`mNavigatorStatusSpeed`,`mMaxOxygenPower`,`mTrendWeek`,`mCyclingIndex`,`mStaBalance`,`mSwimSwolf`,`mCntLap`,`mFrontCrawlPerc`,`mBreaststrokePerc`,`mBackstrokePerc`,`mButterflyPerc`,`mSpmPathPointsCount`,`mSpmPathPointsPoints`,`mStepLenCount`,`mStepLenPoints`,`mEllipticalSteps`,`mChildSwimStartTime`,`mChildSwimDuration`,`mChildSwimDistance`,`mChildCyclingStartTime`,`mChildCyclingDuration`,`mChildCyclingDistance`,`mChildRunStartTime`,`mChildRunDuration`,`mChildRunDistance`,`mChildSwimMode`,`mChildCyclingMode`,`mChildRunMode`,`mChildNumber`,`mRunLactateAvg`,`mCyclingLactateAvg`,`mFlag`,`mRecoveryHrCount`,`mRecoveryHrPoints`,`mSwimPoolLength`,`mDeviceId`,`mAICoachSportID`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
