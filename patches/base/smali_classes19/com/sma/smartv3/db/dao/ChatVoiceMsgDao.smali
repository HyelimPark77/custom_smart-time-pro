.class public interface abstract Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract addChatVoice(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)J
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
    .end annotation
.end method

.method public abstract deleteByType(Lcom/sma/smartv3/dto/FunctionType;)I
    .param p1    # Lcom/sma/smartv3/dto/FunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "delete from chatvoiceassistantmessage where type =:functionType"
    .end annotation
.end method

.method public abstract queryAllChatVoiceMessage(Lcom/sma/smartv3/dto/FunctionType;)Ljava/util/List;
    .param p1    # Lcom/sma/smartv3/dto/FunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from chatvoiceassistantmessage where type = :functionType"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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
.end method
