.class Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;

    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V
    .locals 3
    .param p1    # Landroidx/sqlite/SQLiteStatement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
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
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->IiI10X(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getType()Lcom/sma/smartv3/dto/FunctionType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/converter/FunctionTypeConverter;->fromFunctionType(Lcom/sma/smartv3/dto/FunctionType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 9
    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->XO0O10(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getAiMode()Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/converter/ChatAiModeConverter;->fromAiMode(Lcom/sma/smartv3/dto/ChatAiMode;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    :goto_2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getEnded()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;->this$0:Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;

    invoke-static {v0}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->O00(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getShowType()Lcom/sma/smartv3/dto/ChatShowType;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;->fromShowType(Lcom/sma/smartv3/dto/ChatShowType;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x6

    if-nez p2, :cond_3

    .line 14
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    return-void

    .line 15
    :cond_3
    invoke-interface {p1, v0, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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
    check-cast p2, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "INSERT OR ABORT INTO `ChatVoiceAssistantMessage` (`id`,`data`,`type`,`aiMode`,`ended`,`showType`) VALUES (nullif(?, 0),?,?,?,?,?)"

    return-object v0
.end method
