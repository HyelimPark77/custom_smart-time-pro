.class public final Lcom/sma/smartv3/ui/launcher/LauncherActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n19#2:271\n15#2:272\n69#3,3:273\n72#3,5:277\n69#3,3:282\n72#3,5:286\n69#3,3:291\n72#3,5:295\n1#4:276\n1#4:285\n1#4:294\n*S KotlinDebug\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n*L\n135#1:271\n135#1:272\n138#1:273,3\n138#1:277,5\n140#1:282,3\n140#1:286,5\n143#1:291,3\n143#1:295,5\n138#1:276\n140#1:285\n143#1:294\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n19#2:271\n15#2:272\n69#3,3:273\n72#3,5:277\n69#3,3:282\n72#3,5:286\n69#3,3:291\n72#3,5:295\n1#4:276\n1#4:285\n1#4:294\n*S KotlinDebug\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n*L\n135#1:271\n135#1:272\n138#1:273,3\n138#1:277,5\n140#1:282,3\n140#1:286,5\n143#1:291,3\n143#1:295,5\n138#1:276\n140#1:285\n143#1:294\n*E\n"
    }
.end annotation


# instance fields
.field private openCountToday:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->delayGo$lambda$0(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    return-void
.end method

.method public static final synthetic access$delayGo(Lcom/sma/smartv3/ui/launcher/LauncherActivity;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->delayGo(J)V

    return-void
.end method

.method public static final synthetic access$go(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    return-void
.end method

.method public static final synthetic access$saveDisplayAd(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->saveDisplayAd()Z

    move-result p0

    return p0
.end method

.method private final delayGo(J)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wk;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wk;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final delayGo$lambda$0(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iXiI()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->isShowingAd()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->isLeftActivity()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0XXi0X()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isShowingAd()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isLeftActivity()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    return-void
.end method

.method private final getDisplayAdNumber()I
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "LAUNCHER_CAN_DISPLAY_AD_NUMBER"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private final go()V
    .locals 34

    move-object/from16 v0, p0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "IS_SELECT_LOGIN"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-class v3, Lcom/sma/smartv3/ui/main/MainActivity;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/model/AppUser;

    const v32, 0x7ffffff

    const/16 v33, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v4 .. v33}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    check-cast v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/launcher/GuideActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_1
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final initADPAd()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "initADPAd"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/LauncherActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setShowAdCompleteListener(Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;)V

    const v1, 0x7f0a0a7c

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    const v2, 0x7f1400a9

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XIi00iiXO;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v0, p0, v1, v2, v3}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->loadAd(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    return-void
.end method

.method private final initADPCAd()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "initADPCAd"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;

    new-instance v1, Lcom/sma/smartv3/ui/launcher/LauncherActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$iO;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->setShowAdCompleteListener(Lcom/sma/smartv3/biz/ad/OnShowADPCAdCompleteListener;)V

    const v1, 0x7f0a0a7c

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    const v2, 0x7f1400b1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XO0O10;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v0, p0, v1, v2, v3}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->loadAd(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    return-void
.end method

.method private final saveDisplayAd()Z
    .locals 6

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, ""

    const-string v4, "LAUNCHER_CAN_DISPLAY_AD_TIME"

    invoke-virtual {v2, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "LAUNCHER_CAN_DISPLAY_AD_NUMBER"

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->getDisplayAdNumber()I

    move-result v0

    add-int/2addr v0, v5

    iput v0, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->openCountToday:I

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->openCountToday:I

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v2, v4, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iput v5, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->openCountToday:I

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->openCountToday:I

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    :goto_0
    return v5
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarVisibility(Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "CHECK_FIRMWARE_VERSION"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "CHECK_FIRMWARE_VERSION_V2"

    invoke-virtual {v0, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iO()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XO0O10()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OIi0()V

    const v1, 0x7f0a0684

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iI()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->delayGo(J)V

    return-void

    :cond_0
    instance-of v0, v1, Lcom/sma/smartv3/view/GifImageView;

    if-eqz v0, :cond_1

    check-cast v1, Lcom/sma/smartv3/view/GifImageView;

    new-instance v0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$O00;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/GifImageView;->setOnPlayListener(Lcom/sma/smartv3/view/GifImageView$OXO1;)V

    return-void

    :cond_1
    instance-of v0, v1, Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    sget-object v2, Lcom/sma/smartv3/util/GifUtils;->OXO1:Lcom/sma/smartv3/util/GifUtils;

    const-string v0, "raw"

    const v3, 0x7f081421

    const-string v4, "launcher"

    invoke-static {p0, v4, v0, v3}, Lcom/android/mltcode/paycertificationapi/X1OOO;->OXO1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    new-instance v7, Lcom/sma/smartv3/ui/launcher/LauncherActivity$IiI10X;

    invoke-direct {v7, p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    const/4 v5, 0x1

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Lcom/sma/smartv3/util/GifUtils;->OXO1(Landroid/content/Context;Ljava/lang/Object;ILandroid/widget/ImageView;Lcom/sma/smartv3/util/GifUtils$OXO1;)V

    :cond_2
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00bd

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0iXXO()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IiI10X()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OIX0iXi()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O00()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IO()V

    invoke-super {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->getDisplayAdNumber()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->openCountToday:I

    const/4 v1, 0x3

    if-gt p1, v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iXiI()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->initADPCAd()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0XXi0X()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->initADPAd()V

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iXiI()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->destroy()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0XXi0X()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->destroy()V

    :cond_1
    return-void
.end method

.method public onHandleBackPressed()V
    .locals 0

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iXiI()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->setLeftActivity(Z)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0XXi0X()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setLeftActivity(Z)V

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iXiI()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->isClicked()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->isAdDismiss()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    :cond_1
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/ad/ADPCAppOpenAdManager;->setLeftActivity(Z)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0XXi0X()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isClicked()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isAdDismiss()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->go()V

    :cond_4
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setLeftActivity(Z)V

    :cond_5
    return-void
.end method
