.class public final Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

    iput-object p2, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lorg/json/JSONObject;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const-string v2, "openid"

    const-string v4, ""

    invoke-static {v1, v2, v4}, Lcom/blankj/utilcode/util/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "access_token"

    invoke-static {v1, v2, v4}, Lcom/blankj/utilcode/util/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v2, "refresh_token"

    invoke-static {v1, v2, v4}, Lcom/blankj/utilcode/util/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "unionid"

    invoke-static {v1, v2, v4}, Lcom/blankj/utilcode/util/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v12, v2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v12, v4

    :goto_2
    const-string v2, "errcode"

    const/4 v4, -0x1

    invoke-static {v1, v2, v4}, Lcom/blankj/utilcode/util/JsonUtils;->getInt(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v2

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v3, 0x9c5d

    if-ne v2, v3, :cond_3

    const-string v1, "\u53d6\u6d88\u767b\u5f55"

    :cond_3
    iget-object v2, v0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

    invoke-virtual {v2, v1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->toStartActivity(Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance v5, Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v14, v0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->XIi00iiXO:Ljava/lang/String;

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/16 v15, 0x30

    const/16 v16, 0x0

    const-string v6, "We Chat"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

    invoke-virtual {v1, v5}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->loginSuccess(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V

    iget-object v1, v0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

    invoke-virtual {v1, v3}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->toStartActivity(Ljava/lang/String;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1:Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;

    invoke-virtual {v0, p1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->toStartActivity(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;->OXO1(Lorg/json/JSONObject;)V

    return-void
.end method
