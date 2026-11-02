.class public final Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;
.super Lcom/android/mltcode/paycertificationapi/q77;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/wx/WxManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final OXO1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/q77;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final OXO1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    return-object v0
.end method

.method public final XIi00iiXO(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "@"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gh_"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onClosed(ILjava/lang/String;)V
    .locals 3

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager WsStatusListener onClosed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onClosing(ILjava/lang/String;)V
    .locals 3

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager WsStatusListener onClosing: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 6

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager WsStatusListener onFailure: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1$onFailure$1;

    const/4 p1, 0x0

    invoke-direct {v3, p1}, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1$onFailure$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onHeartbeat()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager WsStatusListener onHeartbeat"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onMessage(Ljava/lang/String;)V
    .locals 13

    const-string v0, " : "

    const-string v1, "text"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-string v1, "pong"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    :try_start_0
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxMessage;

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxMessage;

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxMessage;->getMessage()Lcom/sma/smartv3/biz/wx/data/Message;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_id()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_id()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_id()J

    move-result-wide v1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager WsStatusListener \u8fc7\u6ee4\u91cd\u590d\u6d88\u606fmsg_id:"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    .line 8
    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getFrom_user_name()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getTo_user_name()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-virtual {p0, v4}, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->XIi00iiXO(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0, v6}, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->XIi00iiXO(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_1

    .line 11
    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_type()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/16 v2, 0x22

    if-eq v1, v2, :cond_3

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_3

    const/16 v2, 0x31

    if-eq v1, v2, :cond_3

    const/16 v2, 0x2a

    if-eq v1, v2, :cond_3

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_3

    .line 12
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager WsStatusListener onMessage : \u6682\u4e0d\u652f\u6301\u7684\u7c7b\u578b = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_id()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getPush_content()Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 15
    invoke-static {v7, v0, v3, v1, v2}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, ""

    if-eqz v1, :cond_4

    .line 16
    :try_start_1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v2

    goto :goto_0

    :cond_4
    move-object v0, v2

    move-object v1, v0

    .line 17
    :goto_0
    sget-object v2, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {v2, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->X00Xi1X(Lcom/sma/smartv3/biz/wx/data/Message;)Ljava/lang/String;

    move-result-object v8

    .line 18
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/WxManager;->IO0II0i()Lcom/sma/smartv3/biz/wx/data/WxProfile;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 19
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getUserName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 20
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getNickName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v1

    .line 21
    :cond_5
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getUserName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 22
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getNickName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v0

    :cond_6
    move-object v7, v1

    .line 23
    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getCreate_time()J

    move-result-wide v0

    const/16 p1, 0x3e8

    int-to-long v9, p1

    mul-long/2addr v0, v9

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/WxManager;->XXiIiX10()I

    move-result p1

    int-to-long v9, p1

    add-long/2addr v9, v0

    const/4 v3, 0x0

    .line 25
    invoke-virtual/range {v2 .. v10}, Lcom/sma/smartv3/biz/wx/WxManager;->X1OI(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void

    .line 26
    :cond_7
    :goto_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager WsStatusListener onMessage : isGroupID = true"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 27
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager WsStatusListener onMessage : Exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method public onMessage(Lokio/ByteString;)V
    .locals 1

    .line 1
    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Lokhttp3/Response;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager WsStatusListener onOpen"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;->OXO1:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onReconnect()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager WsStatusListener onReconnect"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
