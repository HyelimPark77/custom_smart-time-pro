.class public final Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;
.super Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,193:1\n1#2:194\n255#3:195\n*S KotlinDebug\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n*L\n184#1:195\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,193:1\n1#2:194\n255#3:195\n*S KotlinDebug\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n*L\n184#1:195\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static onFinishTime:J


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final doneButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isNeedConnectClassic:Z

.field private isNeedConnectHID:Z

.field private final nextButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->Companion:Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;-><init>()V

    const-string v0, "AppGuideActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO1iXOi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO1iXOi;-><init>(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->nextButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX1OI;-><init>(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->doneButton$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOnFinishTime$cp()J
    .locals 2

    sget-wide v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->onFinishTime:J

    return-wide v0
.end method

.method public static final synthetic access$setOnFinishTime$cp(J)V
    .locals 0

    sput-wide p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->onFinishTime:J

    return-void
.end method

.method private static final doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0322

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getDoneButton()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->doneButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getNextButton()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->nextButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0891

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public finish()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->onFinishTime:J

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final getNext()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNextButton()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "<get-nextButton>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isNeedConnectClassic()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectClassic:Z

    return v0
.end method

.method public final isNeedConnectHID()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectHID:Z

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "BaseAppGuideActivity onCreate"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->X100O()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/github/appintro/AppIntroBase;->setSkipButtonEnabled(Z)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/github/appintro/AppIntroBase;->showStatusBar(Z)V

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/WelcomeGuideFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/guide/WelcomeGuideFragment;-><init>()V

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AppGuideActivity"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    invoke-static {v2, v3, v0, v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v1, Lcom/sma/smartv3/ui/device/guide/EarphonesGuideFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/guide/EarphonesGuideFragment;-><init>()V

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X00Xi1X(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_2

    new-instance v4, Lcom/sma/smartv3/ui/device/guide/BgLocationGuideFragment;

    invoke-direct {v4}, Lcom/sma/smartv3/ui/device/guide/BgLocationGuideFragment;-><init>()V

    invoke-virtual {p0, v4}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_2
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I1Ii()Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isBoundClassic()Z

    move-result v4

    if-nez v4, :cond_4

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectClassic:Z

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->X10i()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_4
    :goto_0
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->III()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundHID()Z

    move-result p1

    if-nez p1, :cond_5

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectHID:Z

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_5
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result p1

    if-nez p1, :cond_9

    sget-object p1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;->O00(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I0IIOI()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OI()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    new-instance p1, Lcom/sma/smartv3/ui/device/guide/NotificationGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/NotificationGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_7
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I0IIOI()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OI()Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    new-instance p1, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_9
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OXX1I()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result p1

    if-nez p1, :cond_a

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/WarmTipGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/WarmTipGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_a
    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->XXiIiX10(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_b

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result p1

    if-nez p1, :cond_b

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_b
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X01I1OX1i()Z

    move-result p1

    if-eqz p1, :cond_c

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/BloodGlucoseGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->III()Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundHID()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isXiaomi()Z

    move-result p1

    if-eqz p1, :cond_c

    new-instance p1, Lcom/sma/smartv3/ui/device/guide/WelcomeGuideFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/guide/WelcomeGuideFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_c
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityList()Ljava/util/List;

    move-result-object p1

    const-string v0, "getActivityList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    instance-of v1, v1, Lcom/sma/smartv3/ui/device/AutoBindActivity;

    if-eqz v1, :cond_d

    move-object v3, v0

    :cond_e
    check-cast v3, Landroid/app/Activity;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    :cond_f
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XI()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Lcom/github/appintro/AppIntroBase;->getIndicatorController()Lcom/github/appintro/indicator/IndicatorController;

    move-result-object p1

    if-eqz p1, :cond_10

    const v0, 0x7f0600b4

    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/github/appintro/indicator/IndicatorController;->setSelectedIndicatorColor(I)V

    :cond_10
    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectClassic:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->connectClassic()V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectHID:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->connectHID()V

    :cond_1
    :goto_0
    const-string v0, "DEVICE_BIND_SUCCESS"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public onDonePressed(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/github/appintro/AppIntroBase;->onDonePressed(Landroidx/fragment/app/Fragment;)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->finish()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 0

    return-void
.end method

.method public onSkipPressed(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/github/appintro/AppIntroBase;->onSkipPressed(Landroidx/fragment/app/Fragment;)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->finish()V

    return-void
.end method

.method public onSlideChanged(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;->getCanSwipe()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;

    if-eqz p1, :cond_1

    move-object p1, p2

    check-cast p1, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getCanSwipe()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p2

    const-string v2, "<get-doneButton>(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_4

    move v0, v1

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setNeedConnectClassic(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectClassic:Z

    return-void
.end method

.method public final setNeedConnectHID(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->isNeedConnectHID:Z

    return-void
.end method
