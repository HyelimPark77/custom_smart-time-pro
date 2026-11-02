.class public final Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;


# instance fields
.field private final __chatAiModeConverter:Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

.field private final __chatShowTypeConverter:Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __functionTypeConverter:Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

.field private final __insertAdapterOfChatVoiceAssistantMessage:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "__db"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

    invoke-direct {v0}, Lcom/sma/smartv3/db/converter/FunctionTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__functionTypeConverter:Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

    new-instance v0, Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

    invoke-direct {v0}, Lcom/sma/smartv3/db/converter/ChatAiModeConverter;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatAiModeConverter:Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

    new-instance v0, Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

    invoke-direct {v0}, Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatShowTypeConverter:Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__insertAdapterOfChatVoiceAssistantMessage:Landroidx/room/EntityInsertAdapter;

    return-void
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/FunctionTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__functionTypeConverter:Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

    return-object p0
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatShowTypeConverter:Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/dto/FunctionType;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "delete from chatvoiceassistantmessage where type =?"

    invoke-interface {p2, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__FunctionType_enumToString(Lcom/sma/smartv3/dto/FunctionType;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    invoke-interface {v0, p1, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    invoke-static {p2}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__insertAdapterOfChatVoiceAssistantMessage:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;)Lcom/sma/smartv3/db/converter/ChatAiModeConverter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatAiModeConverter:Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

    return-object p0
.end method

.method private __FunctionType_enumToString(Lcom/sma/smartv3/dto/FunctionType;)Ljava/lang/String;
    .locals 3
    .param p1    # Lcom/sma/smartv3/dto/FunctionType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "_value"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$2;->$SwitchMap$com$sma$smartv3$dto$FunctionType:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string p1, "THIRD_PARTY_AI_ASSISTANT"

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/dto/FunctionType;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "select * from chatvoiceassistantmessage where type = ?"

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__FunctionType_enumToString(Lcom/sma/smartv3/dto/FunctionType;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v3, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    const-string v2, "id"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "data"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "type"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "aiMode"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "ended"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "showType"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    long-to-int v12, v9

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    move-object v13, v9

    :goto_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    :goto_2
    iget-object v11, v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__functionTypeConverter:Lcom/sma/smartv3/db/converter/FunctionTypeConverter;

    invoke-virtual {v11, v9}, Lcom/sma/smartv3/db/converter/FunctionTypeConverter;->toFunctionType(Ljava/lang/String;)Lcom/sma/smartv3/dto/FunctionType;

    move-result-object v14

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v9, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    :goto_3
    iget-object v11, v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatAiModeConverter:Lcom/sma/smartv3/db/converter/ChatAiModeConverter;

    invoke-virtual {v11, v9}, Lcom/sma/smartv3/db/converter/ChatAiModeConverter;->toAiMode(Ljava/lang/String;)Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object v15

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    long-to-int v9, v10

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_3

    const/4 v10, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v10

    :goto_4
    iget-object v11, v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__chatShowTypeConverter:Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;

    invoke-virtual {v11, v10}, Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;->toShowType(Ljava/lang/String;)Lcom/sma/smartv3/dto/ChatShowType;

    move-result-object v17

    new-instance v11, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move/from16 v16, v9

    invoke-direct/range {v11 .. v17}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;-><init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)V

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v8

    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method


# virtual methods
.method public addChatVoice(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "item"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOIIXI1I;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/XOIIXI1I;-><init>(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public deleteByType(Lcom/sma/smartv3/dto/FunctionType;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "functionType"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X10O00Oi;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/X10O00Oi;-><init>(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/dto/FunctionType;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public queryAllChatVoiceMessage(Lcom/sma/smartv3/dto/FunctionType;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "functionType"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/dto/FunctionType;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOXX1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OOXX1;-><init>(Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;Lcom/sma/smartv3/dto/FunctionType;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
