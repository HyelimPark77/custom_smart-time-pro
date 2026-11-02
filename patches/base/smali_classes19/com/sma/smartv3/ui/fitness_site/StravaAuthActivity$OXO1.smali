.class public final Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 11

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "shouldOverrideUrlLoading -> url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    const-string v0, "http://localhost/auth/callback"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    const-string p1, "code"

    invoke-static {p2, p1, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "activity:write"

    invoke-static {p2, p1, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "authorize OK"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-string v6, "code="

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p2

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string p1, "substring(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v6, v4, [C

    const/16 p1, 0x26

    aput-char p1, v6, v1

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt__StringsKt;->iI0OIOO(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/CharSequence;

    new-array v6, v4, [C

    const/16 p1, 0x3d

    aput-char p1, v6, v1

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt__StringsKt;->iI0OIOO(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    sget-object p2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    iget-object v0, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->access$getMContext(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/nb5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/nb5;-><init>(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)V

    invoke-virtual {p2, v0, p1, v2}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->getToken(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_1
    move-object v5, p2

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return v4
.end method
