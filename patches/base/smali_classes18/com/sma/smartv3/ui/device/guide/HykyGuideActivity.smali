.class public final Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;
.super Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHykyGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n1#2:107\n1869#3,2:108\n255#4:110\n*S KotlinDebug\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n*L\n55#1:108,2\n97#1:110\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u5e9f\u5f03"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n1#2:107\n1869#3,2:108\n255#4:110\n*S KotlinDebug\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n*L\n55#1:108,2\n97#1:110\n*E\n"
    }
.end annotation


# instance fields
.field private final doneButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private functionList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nextButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXXIO1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXXIO1OI;-><init>(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->nextButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OII0Oii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OII0Oii;-><init>(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->doneButton$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->functionList:Ljava/util/List;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0322

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getDoneButton()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->doneButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getNextButton()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->nextButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final initHyky()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->functionList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;->OXO1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;-><init>()V

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;->XIi00iiXO()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;-><init>()V

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0891

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getNext()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getNextButton()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "<get-nextButton>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->setSkipButtonEnabled(Z)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->showStatusBar(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity$OXO1;->iO()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->functionList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->functionList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->initHyky()V

    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityList()Ljava/util/List;

    move-result-object p1

    const-string v0, "getActivityList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    instance-of v1, v1, Lcom/sma/smartv3/ui/device/AutoBindActivity;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_4
    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onDonePressed(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/github/appintro/AppIntroBase;->onDonePressed(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    instance-of p1, p2, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getDoneButton()Landroid/widget/TextView;

    move-result-object p2

    const-string v2, "<get-doneButton>(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_2

    move v0, v1

    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
