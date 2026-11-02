.class Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$3;
.super Landroidx/room/EntityDeleteOrUpdateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityDeleteOrUpdateAdapter<",
        "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$3;->this$0:Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityDeleteOrUpdateAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getSessionId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 6
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    :goto_1
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getDuration()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindDouble(ID)V

    const/4 v0, 0x4

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getCreateTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->isDelete()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getSessionId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    .line 12
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    return-void

    .line 13
    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->getSessionId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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
    check-cast p2, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$3;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "UPDATE OR ABORT `TranslateSessionEntity` SET `sessionId` = ?,`audioPath` = ?,`duration` = ?,`createTime` = ?,`isDelete` = ? WHERE `sessionId` = ?"

    return-object v0
.end method
