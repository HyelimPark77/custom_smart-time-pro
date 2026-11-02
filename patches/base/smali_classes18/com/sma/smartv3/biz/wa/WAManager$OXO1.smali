.class public final Lcom/sma/smartv3/biz/wa/WAManager$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/bo4$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/wa/WAManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final XO0O10()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WAManager subscribe -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi()Lcom/android/mltcode/paycertificationapi/bo4;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "subscribe"

    invoke-static {v1}, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/bo4;->X1ii(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic iO()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/biz/wa/WAManager$OXO1;->XO0O10()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WAManager onConnectError: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public varargs XIi00iiXO(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WAManager onMessage -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , time = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    array-length p1, p2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    aget-object p1, p2, p1

    instance-of p2, p1, Lorg/json/JSONObject;

    if-nez p2, :cond_1

    goto/16 :goto_7

    :cond_1
    :try_start_0
    const-string p2, "null cannot be cast to non-null type org.json.JSONObject"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/json/JSONObject;

    const-string p2, "response"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    new-instance p2, Lcom/google/gson/Gson;

    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-class v1, Lcom/sma/smartv3/biz/wa/data/WAMessage;

    invoke-virtual {p2, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wa/data/WAMessage;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WAManager onMessage message: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->isGroupMsg()Z

    move-result p2

    if-eqz p2, :cond_2

    goto/16 :goto_7

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getSender()Lcom/sma/smartv3/biz/wa/data/WAMessageSender;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/wa/data/WAMessageSender;->getPushname()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getFrom()Ljava/lang/String;

    move-result-object v3

    const-string p2, ""

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getTo()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getSender()Lcom/sma/smartv3/biz/wa/data/WAMessageSender;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wa/data/WAMessageSender;->isMe()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wa/WAManager;->iIXi1iiXI()Lcom/sma/smartv3/biz/wa/data/WAUserInfo;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WAManager onMessage profile: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wa/data/WAUserInfo;->getPushname()Ljava/lang/String;

    move-result-object p2

    :cond_3
    move-object v6, p2

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :goto_0
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "poll_creation"

    const-string v2, "vcard"

    const-string v7, "event_creation"

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    :try_start_1
    const-string v0, "location"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto/16 :goto_1

    :cond_4
    const p2, 0x7f1402a6

    goto/16 :goto_2

    :sswitch_1
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7f1402a2

    goto :goto_2

    :sswitch_2
    const-string v0, "video"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->isGif()Z

    move-result p2

    if-eqz p2, :cond_7

    const p2, 0x7f1402a4

    goto :goto_2

    :cond_7
    const p2, 0x7f1402ac

    goto :goto_2

    :sswitch_3
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_1

    :cond_8
    const p2, 0x7f1402ab

    goto :goto_2

    :sswitch_4
    const-string v0, "image"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_1

    :cond_9
    const p2, 0x7f1402a5

    goto :goto_2

    :sswitch_5
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_1

    :cond_a
    const p2, 0x7f1402a8

    goto :goto_2

    :sswitch_6
    const-string v0, "ptt"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_1

    :cond_b
    const p2, 0x7f1402ad

    goto :goto_2

    :sswitch_7
    const-string v0, "sticker"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_c

    :goto_1
    const p2, 0x7f1402a7

    goto :goto_2

    :cond_c
    const p2, 0x7f1402a3

    :goto_2
    invoke-static {p2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    goto :goto_4

    :sswitch_8
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_4

    :cond_d
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getEventName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_3
    move-object v7, p2

    goto :goto_5

    :sswitch_9
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_4

    :cond_e
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getVcardFormattedName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :sswitch_a
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getPollName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :sswitch_b
    const-string v1, "chat"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :goto_4
    goto :goto_3

    :cond_10
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getContent()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :goto_5
    sget-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/data/WAMessage;->getT()J

    move-result-wide p1

    const/16 v0, 0x3e8

    int-to-long v8, v0

    mul-long/2addr p1, v8

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXiIiX10()I

    move-result v0

    int-to-long v8, v0

    add-long/2addr v8, p1

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v9}, Lcom/sma/smartv3/biz/wa/WAManager;->IXOIIIO(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WAManager onMessage -> e:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70aaf6c3 -> :sswitch_7
        0x1b2f0 -> :sswitch_6
        0xb74f5f -> :sswitch_5
        0x5faa95b -> :sswitch_4
        0x6ad5086 -> :sswitch_3
        0x6b0147b -> :sswitch_2
        0x336e7ae4 -> :sswitch_1
        0x714f9fb5 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x2e9358 -> :sswitch_b
        0xb74f5f -> :sswitch_a
        0x6ad5086 -> :sswitch_9
        0x336e7ae4 -> :sswitch_8
    .end sparse-switch
.end method

.method public onConnected()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager onConnected"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/wa/WAManager;->XOO0ii0()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zl6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/zl6;-><init>()V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onDisconnected()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager onDisconnected"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
