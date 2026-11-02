.class public abstract Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# instance fields
.field private final ACCESS_TOKEN_URL:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final WX_USER_INFO_URL:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field private isNoGetOpenId:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-string v0, "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code"

    iput-object v0, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->ACCESS_TOKEN_URL:Ljava/lang/String;

    const-string v0, "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s"

    iput-object v0, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->WX_USER_INFO_URL:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getApi()Lcom/tencent/mm/opensdk/openapi/IWXAPI;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "api"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isNoGetOpenId()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->isNoGetOpenId:Z

    return v0
.end method

.method public abstract loginSuccess(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V
    .param p1    # Lcom/sma/androidthirdpartylogin/model/LoginResponse;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcom/sma/androidthirdpartylogin/R$layout;->activity_we_chat_login:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/mq6;->OXO1(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object p1

    const-string v0, "createWXAPI(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->setApi(Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->getApi()Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->getApi()Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    return-void
.end method

.method public onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 0
    .param p1    # Lcom/tencent/mm/opensdk/modelbase/BaseReq;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 12
    .param p1    # Lcom/tencent/mm/opensdk/modelbase/BaseResp;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "resp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResp = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    check-cast p1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;

    iget-object v9, p1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;->code:Ljava/lang/String;

    iget-boolean p1, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->isNoGetOpenId:Z

    if-eqz p1, :cond_0

    new-instance v0, Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/16 v10, 0xfe

    const/4 v11, 0x0

    const-string v1, "We Chat"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->loginSuccess(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->toStartActivity(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object p1, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->ACCESS_TOKEN_URL:Ljava/lang/String;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/mq6;->OXO1(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/mq6;->XIi00iiXO(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1, v9}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string p1, "format(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v3, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;

    invoke-direct {v3, p0, v9}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity$onResp$1;-><init>(Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sma/androidnetworklib/method/NetWork;->IO(Lcom/sma/androidnetworklib/method/NetWork;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->toStartActivity(Ljava/lang/String;)V

    return-void
.end method

.method public final setApi(Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V
    .locals 1
    .param p1    # Lcom/tencent/mm/opensdk/openapi/IWXAPI;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    return-void
.end method

.method public final setNoGetOpenId(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/androidthirdpartylogin/wechat/WeChatBaseActivity;->isNoGetOpenId:Z

    return-void
.end method

.method public abstract toStartActivity(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
.end method
