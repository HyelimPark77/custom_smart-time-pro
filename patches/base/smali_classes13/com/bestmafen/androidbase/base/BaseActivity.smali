.class public abstract Lcom/bestmafen/androidbase/base/BaseActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/k5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,376:1\n256#2,2:377\n256#2,2:379\n256#2,2:381\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n*L\n303#1:377,2\n311#1:379,2\n317#1:381,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,376:1\n256#2,2:377\n256#2,2:379\n256#2,2:381\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n*L\n303#1:377,2\n311#1:379,2\n317#1:381,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static DEFAULT_NAV_BAR_COLOR:I = 0x0

.field private static DEFAULT_TOP_BAR_COLOR:I = 0x0

.field public static final SCREEN_ORIENTATION_PORTRAIT:Ljava/lang/String; = "screen_orientation_portrait"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STYLE_FULL_WITHOUT_STATUS:I = 0x2

.field public static final STYLE_NORMAL:I = 0x0

.field public static final STYLE_TRANSLUCENT_STATUS:I = 0x1


# instance fields
.field private fakeNavBar:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private fakeStatusBar:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mArg0:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mArg1:I

.field private mArg2:Landroid/os/Parcelable;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mArg3:Ljava/io/Serializable;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field protected mContext:Landroid/app/Activity;

.field private final mStatusStyle:I

.field private final mTitleId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/bestmafen/androidbase/base/BaseActivity;->Companion:Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mTitleId:I

    iput v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg1:I

    return-void
.end method

.method public static final synthetic access$getDEFAULT_NAV_BAR_COLOR$cp()I
    .locals 1

    sget v0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_NAV_BAR_COLOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TOP_BAR_COLOR$cp()I
    .locals 1

    sget v0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_TOP_BAR_COLOR:I

    return v0
.end method

.method public static final synthetic access$setDEFAULT_NAV_BAR_COLOR$cp(I)V
    .locals 0

    sput p0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_NAV_BAR_COLOR:I

    return-void
.end method

.method public static final synthetic access$setDEFAULT_TOP_BAR_COLOR$cp(I)V
    .locals 0

    sput p0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_TOP_BAR_COLOR:I

    return-void
.end method

.method private final addFakeSystemBars()V
    .locals 6

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/k5;->layoutId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->bindView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/k5;->layoutId()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getStatusBarHeight()I

    move-result v5

    invoke-direct {v4, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v3, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getNavBarHeight()I

    move-result v5

    invoke-direct {v4, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v3, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeNavBar:Landroid/view/View;

    iget-object v3, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v3, v1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeNavBar:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final addBackPressedDispatcher()V
    .locals 2

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    new-instance v1, Lcom/bestmafen/androidbase/base/BaseActivity$addBackPressedDispatcher$1;

    invoke-direct {v1, p0}, Lcom/bestmafen/androidbase/base/BaseActivity$addBackPressedDispatcher$1;-><init>(Lcom/bestmafen/androidbase/base/BaseActivity;)V

    invoke-virtual {v0, p0, v1}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    return-void
.end method

.method public bindView()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final disableOrientation()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public final enableOrientation()V
    .locals 3

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "screen_orientation_portrait"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public final getColor()I
    .locals 2

    sget v0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_TOP_BAR_COLOR:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/bestmafen/androidbase/R$color;->navBarColor:I

    return v0

    :cond_0
    sget v0, Lcom/bestmafen/androidbase/R$color;->elie_statusBarColor:I

    return v0

    :cond_1
    sget v0, Lcom/bestmafen/androidbase/R$color;->navBarColor:I

    return v0
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

.method public final getFakeStatusBar()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

    return-object v0
.end method

.method public getMArg0()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg0:Ljava/lang/String;

    return-object v0
.end method

.method public getMArg1()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg1:I

    return v0
.end method

.method public getMArg2()Landroid/os/Parcelable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg2:Landroid/os/Parcelable;

    return-object v0
.end method

.method public getMArg3()Ljava/io/Serializable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg3:Ljava/io/Serializable;

    return-object v0
.end method

.method public final getMContext()Landroid/app/Activity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mContext:Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMStatusStyle()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mStatusStyle:I

    return v0
.end method

.method public getMTitleId()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mTitleId:I

    return v0
.end method

.method public final getNavColor()I
    .locals 2

    sget v0, Lcom/bestmafen/androidbase/base/BaseActivity;->DEFAULT_NAV_BAR_COLOR:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/bestmafen/androidbase/R$color;->statusBarColor:I

    return v0

    :cond_0
    sget v0, Lcom/bestmafen/androidbase/R$color;->elie_statusBarColor:I

    return v0

    :cond_1
    sget v0, Lcom/bestmafen/androidbase/R$color;->statusBarColor:I

    return v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMStatusStyle()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->enableOrientation()V

    invoke-virtual {p0, p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMContext(Landroid/app/Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mArg0"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg0(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mArg1"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg1(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mArg2"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg2(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mArg3"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg3(Ljava/io/Serializable;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->initEvent()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    :cond_0
    invoke-interface {p0, p1}, Lcom/android/mltcode/paycertificationapi/k5;->init(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->addFakeSystemBars()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setTheme()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setTheme()V

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/k5;->layoutId()I

    move-result p1

    if-ne p1, v2, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->bindView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/k5;->layoutId()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMTitleId()I

    move-result p1

    if-eq p1, v2, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMTitleId()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/ah6;->OXO1(Landroid/view/View;)V

    :cond_3
    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/k5;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->addBackPressedDispatcher()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->initEvent()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    :cond_0
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setFakeStatusBar(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

    return-void
.end method

.method public setMArg0(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg0:Ljava/lang/String;

    return-void
.end method

.method public setMArg1(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg1:I

    return-void
.end method

.method public setMArg2(Landroid/os/Parcelable;)V
    .locals 0
    .param p1    # Landroid/os/Parcelable;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg2:Landroid/os/Parcelable;

    return-void
.end method

.method public setMArg3(Ljava/io/Serializable;)V
    .locals 0
    .param p1    # Ljava/io/Serializable;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mArg3:Ljava/io/Serializable;

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

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->mContext:Landroid/app/Activity;

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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0, p2}, Lcom/bestmafen/androidbase/base/BaseActivity;->isLightColor(I)Z

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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/BarUtils;->setNavBarVisibility(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final setStatusBarColor(Landroid/app/Activity;I)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

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
    invoke-virtual {p0, p2}, Lcom/bestmafen/androidbase/base/BaseActivity;->isLightColor(I)Z

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

.method public final setTheme()V
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "SELECT_THEME"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "light"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v5, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

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

    invoke-virtual {v0, v1, v4, v5}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

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

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v2, 0x10

    if-eq v0, v2, :cond_6

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

    invoke-virtual {v0, v1, v4, v5}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_7
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ek4;->O1O()V

    :cond_8
    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getColor()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getNavColor()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarColor(Landroid/app/Activity;I)V

    return-void
.end method

.method public final transparentNavBar()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeNavBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final transparentStatusBar()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->isEnableEdgeToEdge()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity;->fakeStatusBar:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p0}, Lcom/blankj/utilcode/util/BarUtils;->transparentStatusBar(Landroid/app/Activity;)V

    return-void
.end method
