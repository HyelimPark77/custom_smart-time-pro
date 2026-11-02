.class public abstract Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;
.super Lcom/github/appintro/AppIntro;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,242:1\n257#2,2:243\n257#2,2:245\n257#2,2:247\n*S KotlinDebug\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n*L\n161#1:243,2\n169#1:245,2\n175#1:247,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,242:1\n257#2,2:243\n257#2,2:245\n257#2,2:247\n*S KotlinDebug\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n*L\n161#1:243,2\n169#1:245,2\n175#1:247,2\n*E\n"
    }
.end annotation


# instance fields
.field private fakeNavBar:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private fakeStatusBar:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final layoutId:I

.field protected mContext:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/github/appintro/AppIntro;-><init>()V

    const v0, 0x7f0d0031

    iput v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->layoutId:I

    return-void
.end method

.method private final addFakeSystemBars()V
    .locals 9

    const v0, 0x1020002

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getStatusBarHeight()I

    move-result v8

    invoke-direct {v7, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v5, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeStatusBar:Landroid/view/View;

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getNavBarHeight()I

    move-result v8

    invoke-direct {v7, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v5, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeNavBar:Landroid/view/View;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeStatusBar:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v1, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeNavBar:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method private final setStatusBarColor(Landroid/app/Activity;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeStatusBar:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {v0, p2}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isLightColor(I)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setStatusBarLightMode(Landroid/app/Activity;Z)V

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setStatusBarLightMode(Landroid/app/Activity;Z)V

    return-void
.end method


# virtual methods
.method public final addBackPressedDispatcher()V
    .locals 2

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity$addBackPressedDispatcher$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity$addBackPressedDispatcher$1;-><init>(Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;)V

    invoke-virtual {v0, p0, v1}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    return-void
.end method

.method public getDelegate()Landroidx/appcompat/app/AppCompatDelegate;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0, p0}, Landroidx/appcompat/app/SkinAppCompatDelegateImpl;->get(Landroid/app/Activity;Landroidx/appcompat/app/AppCompatCallback;)Landroidx/appcompat/app/AppCompatDelegate;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->layoutId:I

    return v0
.end method

.method public final getMContext()Landroid/app/Activity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->mContext:Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isEnableEdgeToEdge()Z
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/16 v1, 0x23

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    return v2
.end method

.method public final isLightColor(I)Z
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    invoke-static {p1}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/github/appintro/AppIntroBase;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "screen_orientation_portrait"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_0
    invoke-virtual {p0, p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setMContext(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->addFakeSystemBars()V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setTheme()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->addBackPressedDispatcher()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setMContext(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->mContext:Landroid/app/Activity;

    return-void
.end method

.method public final setNavBarColor(Landroid/app/Activity;I)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isLightColor(I)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarLightMode(Landroid/app/Activity;Z)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarLightMode(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final setNavBarVisibility(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarVisibility(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final setSwipe(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->setSwipeLock(Z)V

    return-void
.end method

.method public final setTheme()V
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SELECT_THEME"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "light"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v5, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    const-string v1, "brown_black"

    invoke-virtual {v0, v1, v4, v5}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ek4;->O1O()V

    goto :goto_0

    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v0, v6, :cond_7

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x10

    if-eq v0, v1, :cond_6

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ek4;->O1O()V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_7
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ek4;->O1O()V

    :cond_8
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f060715

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f060531

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setNavBarColor(Landroid/app/Activity;I)V

    return-void
.end method

.method public final transparentNavBar()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final transparentStatusBar()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->fakeStatusBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p0}, Lcom/blankj/utilcode/util/BarUtils;->transparentStatusBar(Landroid/app/Activity;)V

    return-void
.end method
