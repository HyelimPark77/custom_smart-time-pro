.class Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$3;
.super Landroidx/room/EntityDeletionOrUpdateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityDeletionOrUpdateAdapter<",
        "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;Landroidx/room/RoomDatabase;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            "this$0",
            "database"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$3;->this$0:Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/EntityDeletionOrUpdateAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 6
    :goto_0
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 9
    :goto_1
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 12
    :goto_2
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getDevType()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 13
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 14
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getSdkFlag()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 15
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getVid()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 16
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUid()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 17
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getPid()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    const/16 v0, 0xb

    .line 18
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevLatitude()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    const/16 v0, 0xc

    .line 19
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevLongitude()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    const/16 v0, 0xd

    .line 20
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevUpdateTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    const/16 v0, 0xe

    .line 21
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevLatitude()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    const/16 v0, 0xf

    .line 22
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevLongitude()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindDouble(ID)V

    const/16 v0, 0x10

    .line 23
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevUpdateTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    const/16 v0, 0x11

    .line 24
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getOnlineTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    .line 25
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_3

    .line 26
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    goto :goto_3

    .line 27
    :cond_3
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 28
    :goto_3
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getId()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x13

    invoke-interface {p1, p2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindLong(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$3;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `HistoryRecord` SET `id` = ?,`name` = ?,`address` = ?,`mapped_address` = ?,`dev_type` = ?,`connect_type` = ?,`sdk_flag` = ?,`vid` = ?,`uid` = ?,`pid` = ?,`left_dev_lat` = ?,`left_dev_lon` = ?,`left_dev_update_time` = ?,`right_dev_lat` = ?,`right_dev_lon` = ?,`right_dev_update_time` = ?,`online_time` = ?,`update_address` = ? WHERE `id` = ?"

    return-object v0
.end method
