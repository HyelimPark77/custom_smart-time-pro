.class Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$3;
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
        "Lcom/sma/smartv3/db/entity/MatchLog;",
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$3;->this$0:Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/MatchLog;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/MatchLog;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMMatchRecordId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTime()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCountingTime()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMPeriodTime()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMPeriodNumber()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCancelType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTeam()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMPlayer()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMOtherType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 14
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMStopWatchTotal()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 16
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/MatchLog;->getMIsDelete()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0xf

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
    check-cast p2, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$3;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/MatchLog;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `MatchLog` (`mId`,`mMatchRecordId`,`mTime`,`mCountingTime`,`mPeriodTime`,`mPeriodNumber`,`mType`,`mCount`,`mCancelType`,`mTeam`,`mPlayer`,`mOtherType`,`mStopWatchTotal`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
