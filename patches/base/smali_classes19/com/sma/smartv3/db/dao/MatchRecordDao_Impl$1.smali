.class Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/MatchRecord;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/MatchRecord;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/MatchRecord;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMStart()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMType()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMPeriodListSize()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMLogListSize()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMIsDelete()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMSource()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMIsStopWatchData()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 14
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->XXI(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMStopWatchList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stopWatchListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_1

    .line 15
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 16
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 17
    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->XXI(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMTeamInfo()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->teamInfoToString(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_2

    .line 18
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 19
    :cond_2
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 20
    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->XXI(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMWeather()Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->weatherToString(Lcom/szabh/smable3/entity/BleWeather;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_3

    .line 21
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 22
    :cond_3
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 23
    :goto_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMHomeTeamScore()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMGuestTeamScore()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMode()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMinBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 27
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMAirPressure()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 28
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 29
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMaxPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMinPace()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 31
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x16

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 32
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMaxSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x17

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMinSpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x18

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 34
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x19

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 35
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMaxAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 36
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMMinAltitude()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1b

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 37
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMPeriod()Lcom/sma/smartv3/db/entity/MatchPeriod;

    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1c

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 39
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMMatchRecordId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 40
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMDuration()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1e

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 41
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMDistance()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x1f

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 42
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMStep()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 43
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMCalorie()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x21

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 44
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x22

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 45
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMAvgBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x23

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 46
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMMaxBpm()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x24

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 47
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMMaxSpeed()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x25

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 48
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x26

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 49
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchPeriod;->getMIsDelete()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x27

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
    check-cast p2, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/MatchRecord;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `MatchRecord` (`mId`,`mStart`,`mLocalTime`,`mType`,`mPeriodListSize`,`mLogListSize`,`mIsSync`,`mIsDelete`,`mSource`,`mIsStopWatchData`,`mStopWatchList`,`mTeamInfo`,`mWeather`,`mHomeTeamScore`,`mGuestTeamScore`,`mMode`,`mMinBpm`,`mAirPressure`,`mPace`,`mMaxPace`,`mMinPace`,`mSpm`,`mMaxSpm`,`mMinSpm`,`mAltitude`,`mMaxAltitude`,`mMinAltitude`,`p_mId`,`p_mMatchRecordId`,`p_mDuration`,`p_mDistance`,`p_mStep`,`p_mCalorie`,`p_mSpeed`,`p_mAvgBpm`,`p_mMaxBpm`,`p_mMaxSpeed`,`p_mIsSync`,`p_mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
