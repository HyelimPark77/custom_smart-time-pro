.class Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/BloodGlucose2;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/BloodGlucose2;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMMeasurementId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMMeasurementId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUserId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    .line 8
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUserId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 10
    :goto_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMStartTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    .line 11
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMStartTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 13
    :goto_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMEndTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    .line 14
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 15
    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMEndTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 16
    :goto_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMModelNo()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    .line 17
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 18
    :cond_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMModelNo()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_4
    const/16 v0, 0x8

    .line 19
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/16 v0, 0x9

    .line 20
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    .line 21
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMFasting()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 22
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMWithin2hrsMeal()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 23
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMCompletedProgress()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMCurrentLevel()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMRiskCode()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_5

    .line 26
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 27
    :cond_5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMRiskCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 28
    :goto_5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMInsights()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_6

    .line 29
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_6

    .line 30
    :cond_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMInsights()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 31
    :goto_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTips()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_7

    .line 32
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_7

    .line 33
    :cond_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTips()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 34
    :goto_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLocaleInsights()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_8

    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_8

    .line 36
    :cond_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLocaleInsights()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 37
    :goto_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLocaleTips()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_9

    .line 38
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_9

    .line 39
    :cond_9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLocaleTips()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 40
    :goto_9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 41
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMIsDelete()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x14

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
    check-cast p2, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/BloodGlucose2;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `BloodGlucose2` (`mId`,`mTime`,`mMeasurementId`,`mUserId`,`mStartTime`,`mEndTime`,`mModelNo`,`mLowerBound`,`mUpperBound`,`mFasting`,`mWithin2hrsMeal`,`mCompletedProgress`,`mCurrentLevel`,`mRiskCode`,`mInsights`,`mTips`,`mLocaleInsights`,`mLocaleTips`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
