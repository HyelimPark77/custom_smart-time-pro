.class Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/RecordDeviceFile;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/RecordDeviceFile;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMId()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    .line 8
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 10
    :goto_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    .line 11
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_2
    const/4 v0, 0x6

    .line 13
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMSize()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 14
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMWidth()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 15
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMHeight()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x9

    .line 16
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMDuration()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMThumbnail()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_3

    .line 18
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 19
    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 20
    :goto_3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMFileType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 21
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsFavority()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 22
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMContent()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_4

    .line 23
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 24
    :cond_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    :goto_4
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsSync()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsDelete()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 27
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMProcessType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 28
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMProcessStatus()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 29
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMProcessPath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_5

    .line 30
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 31
    :cond_5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMProcessPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 32
    :goto_5
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsRead()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsConversion()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 34
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMReservedTextType()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 35
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMReservedText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x16

    if-nez v0, :cond_6

    .line 36
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_6

    .line 37
    :cond_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMReservedText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 38
    :goto_6
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMIsSummaryReport()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x17

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 39
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMSummaryReportText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_7

    .line 40
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_7

    .line 41
    :cond_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMSummaryReportText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 42
    :goto_7
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMFileName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x19

    if-nez v0, :cond_8

    .line 43
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_8

    .line 44
    :cond_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMFileName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 45
    :goto_8
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMTaskId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1a

    if-nez v0, :cond_9

    .line 46
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_9

    .line 47
    :cond_9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 48
    :goto_9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->getMModel()I

    move-result p2

    int-to-long v0, p2

    const/16 p2, 0x1b

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
    check-cast p2, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/RecordDeviceFile;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR REPLACE INTO `RecordDeviceFile` (`mId`,`mTime`,`mLocalTime`,`mName`,`mPath`,`mSize`,`mWidth`,`mHeight`,`mDuration`,`mThumbnail`,`mFileType`,`mIsFavority`,`mContent`,`mIsSync`,`mIsDelete`,`mProcessType`,`mProcessStatus`,`mProcessPath`,`mIsRead`,`mIsConversion`,`mReservedTextType`,`mReservedText`,`mIsSummaryReport`,`mSummaryReportText`,`mFileName`,`mTaskId`,`mModel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
