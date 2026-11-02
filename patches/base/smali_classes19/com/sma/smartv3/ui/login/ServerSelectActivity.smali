.class public final Lcom/sma/smartv3/ui/login/ServerSelectActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/login/ServerSelectActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n257#2,2:188\n69#3,3:190\n72#3,5:194\n1#4:193\n*S KotlinDebug\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n*L\n77#1:188,2\n168#1:190,3\n168#1:194,5\n168#1:193\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n257#2,2:188\n69#3,3:190\n72#3,5:194\n1#4:193\n*S KotlinDebug\n*F\n+ 1 ServerSelectActivity.kt\ncom/sma/smartv3/ui/login/ServerSelectActivity\n*L\n77#1:188,2\n168#1:190,3\n168#1:194,5\n168#1:193\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/login/ServerSelectActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final IS_FORCE_LOGIN:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private isForceLogin:Z

.field private final llItemContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final selectServerButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final selectServerIsShow$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final taiWanServerLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/login/ServerSelectActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->Companion:Lcom/sma/smartv3/ui/login/ServerSelectActivity$OXO1;

    const-string v0, "is_force_login"

    sput-object v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->IS_FORCE_LOGIN:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/x34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/x34;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y34;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->taiWanServerLl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z34;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a44;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a44;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerIsShow$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b44;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b44;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->llItemContent$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/login/ServerSelectActivity;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerButton_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->moreSetting$lambda$0$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->taiWanServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->llItemContent_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerIsShow_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getIS_FORCE_LOGIN$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->IS_FORCE_LOGIN:Ljava/lang/String;

    return-object v0
.end method

.method private final getLlItemContent()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->llItemContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSelectServerButton()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSelectServerIsShow()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->selectServerIsShow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTaiWanServerLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->taiWanServerLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getSelectServerButton()Landroid/view/View;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final llItemContent_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06bf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final moreSetting$lambda$0$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final selectServerButton_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a1d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final selectServerIsShow_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a1e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final taiWanServerLl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0b74

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final toStartLogin()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "AD_STATE_CHANGE"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

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
.method public final SiliconValleyServerLl(Landroid/view/View;)V
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

    const-string v2, "https://api-usa.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f141251

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final african(Landroid/view/View;)V
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

    const-string v2, "https://api.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f1400b4

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final asiaPacific(Landroid/view/View;)V
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

    const-string v2, "https://api.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f140169

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final asiaPacificTaiWan(Landroid/view/View;)V
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

    const-string v2, "https://api.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f141306

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final chinaMainland(Landroid/view/View;)V
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

    const-string v2, "https://api-c.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f1402be

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final europAmerica(Landroid/view/View;)V
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

    const-string v2, "https://api-eg.iot-solution.net/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f140b53

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final indiaBeatxp(Landroid/view/View;)V
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

    const-string v2, "https://ali-cloud.beatxp.com/kotlinweb"

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const v0, 0x7f140d15

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SERVER_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->IS_FORCE_LOGIN:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->isForceLogin:Z

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iI0I()Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getTaiWanServerLl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getTaiWanServerLl()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getSelectServerButton()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getSelectServerIsShow()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/c44;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/c44;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a06cd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00fb

    return v0
.end method

.method public final moreSetting(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f141323

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d44;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d44;-><init>(Lcom/sma/smartv3/ui/login/ServerSelectActivity;)V

    const v1, 0x7f141079

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final noLogin(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_SELECT_LOGIN"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XX(Landroid/app/Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
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

.method public onHandleBackPressed()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;->isForceLogin:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method
