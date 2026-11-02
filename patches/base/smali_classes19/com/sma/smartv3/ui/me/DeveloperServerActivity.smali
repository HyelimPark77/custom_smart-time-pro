.class public final Lcom/sma/smartv3/ui/me/DeveloperServerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final devServerLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final kaiServerLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final taoServerLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i01OX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i01OX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOOX0I0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOOX0I0X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->kaiServerLl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0iIXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO0iIXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->taoServerLl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX0OiXX1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX0OiXX1i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->devServerLl$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->taoServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->devServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->devServer$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->kaiServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->testServer$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final devServer$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "752868"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "API_BASE_URL"

    const-string v2, "https://dev.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SERVER_NAME"

    const-string v1, "Dev Server"

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->toStartLogin()V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "error"

    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final devServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a02ed

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final getDevServerLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->devServerLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getKaiServerLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->kaiServerLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTaoServerLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->taoServerLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private static final kaiServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a067e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final taoServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0b75

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final testServer$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "837765"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "API_BASE_URL"

    const-string v2, "https://ceshi.smawatch.cn/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SERVER_NAME"

    const-string v1, "Test Server"

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->toStartLogin()V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "error"

    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final toStartLogin()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "IS_SELECT_LOGIN"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "IS_LOGIN_QUERY_USER"

    invoke-virtual {v0, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XOiXXOO(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final devServer(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {p1, v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "Invitation code"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;->iX1O1(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i00OIOXO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i00OIOXO0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getKaiServerLl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getTaoServerLl()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getDevServerLl()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final kaiServer(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "API_BASE_URL"

    const-string v2, "http://192.168.1.88:8080/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SERVER_NAME"

    const-string v1, "Kai Server"

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->toStartLogin()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0129

    return v0
.end method

.method public final onEmailLoginDone(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ALREADY_LOGIN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final taoServer(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "API_BASE_URL"

    const-string v2, "http://192.168.0.240:8080/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SERVER_NAME"

    const-string v1, "Tao Server"

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->toStartLogin()V

    return-void
.end method

.method public final testServer(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {p1, v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "Invitation code"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;->iX1O1(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiOiXI1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiOiXI1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperServerActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void
.end method
