.class Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/HealthyReport;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/HealthyReport;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/HealthyReport;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserGender()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserWeight()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserHeight()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_0

    .line 8
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 10
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMAbnormalNumber()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x8

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMHeartRateTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMHeartRateValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMHeartRateAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_1

    .line 14
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMHeartRateAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_1
    const/16 v0, 0xb

    .line 16
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodPressureTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSystolicValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMDiastolicValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 19
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodPressureAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_2

    .line 20
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 21
    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodPressureAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_2
    const/16 v0, 0xf

    .line 22
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodOxygenTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 23
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodOxygenValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodOxygenAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_3

    .line 25
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 26
    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodOxygenAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_3
    const/16 v0, 0x12

    .line 27
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSleepTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 28
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSleepDeepLengthTime()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 29
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSleepPiecemealTime()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 30
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSleepAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_4

    .line 31
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 32
    :cond_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMSleepAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_4
    const/16 v0, 0x16

    .line 33
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMPressureTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 34
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMPressureValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x17

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 35
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMPressureAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_5

    .line 36
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 37
    :cond_5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMPressureAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_5
    const/16 v0, 0x19

    .line 38
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodGlucose2Time()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 39
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodGlucose2Value()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x1a

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 40
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodGlucose2AIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1b

    if-nez v0, :cond_6

    .line 41
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_6

    .line 42
    :cond_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMBloodGlucose2AIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_6
    const/16 v0, 0x1c

    .line 43
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeightTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 44
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeightValue()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x1d

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 45
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeightAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1e

    if-nez v0, :cond_7

    .line 46
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_7

    .line 47
    :cond_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeightAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_7
    const/16 v0, 0x1f

    .line 48
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeekSportsTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 49
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeekSportsNumber()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 50
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeekSportsAllTime()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x21

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 51
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeekSportsAIRecords()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x22

    if-nez v0, :cond_8

    .line 52
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_8

    .line 53
    :cond_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMWeekSportsAIRecords()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 54
    :goto_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMIsSync()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x23

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
    check-cast p2, Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/HealthyReportDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/HealthyReport;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `HealthyReport` (`mId`,`mUserGender`,`mUserWeight`,`mUserHeight`,`mTime`,`mLocalTime`,`mAbnormalNumber`,`mHeartRateTime`,`mHeartRateValue`,`mHeartRateAIRecords`,`mBloodPressureTime`,`mSystolicValue`,`mDiastolicValue`,`mBloodPressureAIRecords`,`mBloodOxygenTime`,`mBloodOxygenValue`,`mBloodOxygenAIRecords`,`mSleepTime`,`mSleepDeepLengthTime`,`mSleepPiecemealTime`,`mSleepAIRecords`,`mPressureTime`,`mPressureValue`,`mPressureAIRecords`,`mBloodGlucose2Time`,`mBloodGlucose2Value`,`mBloodGlucose2AIRecords`,`mWeightTime`,`mWeightValue`,`mWeightAIRecords`,`mWeekSportsTime`,`mWeekSportsNumber`,`mWeekSportsAllTime`,`mWeekSportsAIRecords`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
