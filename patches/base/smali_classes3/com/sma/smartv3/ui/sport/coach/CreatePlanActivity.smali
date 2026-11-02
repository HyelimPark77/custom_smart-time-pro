.class public final Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;
.super Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCreatePlanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n87#2,7:198\n94#2,3:206\n70#2,7:209\n97#2:216\n140#2,5:217\n145#2,5:223\n1#3:205\n1#3:222\n85#4,3:228\n*S KotlinDebug\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n*L\n81#1:198,7\n81#1:206,3\n81#1:209,7\n81#1:216\n107#1:217,5\n107#1:223,5\n81#1:205\n107#1:222\n118#1:228,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCreatePlanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n87#2,7:198\n94#2,3:206\n70#2,7:209\n97#2:216\n140#2,5:217\n145#2,5:223\n1#3:205\n1#3:222\n85#4,3:228\n*S KotlinDebug\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n*L\n81#1:198,7\n81#1:206,3\n81#1:209,7\n81#1:216\n107#1:217,5\n107#1:223,5\n81#1:205\n107#1:222\n118#1:228,3\n*E\n"
    }
.end annotation


# instance fields
.field private final CREATE_PLAN_DONE:I

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final doneButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final layoutId:I

.field private final mPagerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nextButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nextButtonClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;-><init>()V

    const/16 v0, 0xfe

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->CREATE_PLAN_DONE:I

    const v0, 0x7f0d0046

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->layoutId:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX1Oi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX1Oi1;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O01OXX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O01OXX0;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0XXi1i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0XXi1i0;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1Ii0X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1Ii0X1;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButtonClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIO11Oi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIO11Oi1;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->doneButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0OI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0OI1;-><init>(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->mPagerView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButtonClick_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->mPagerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->onCreate$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0322

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->doneButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private final initConfiguration()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/github/appintro/AppIntroBase;->setSkipButtonEnabled(Z)V

    invoke-virtual {p0, v0}, Lcom/github/appintro/AppIntroBase;->setIndicatorEnabled(Z)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->setWizardMode(Z)V

    invoke-virtual {p0, v1}, Lcom/github/appintro/AppIntroBase;->showStatusBar(Z)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1410c5

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f1402f6

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final mPagerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 1

    const v0, 0x7f0a18fd    # 1.835632E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method private static final nextButtonClick_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0894

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final nextButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0891

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final onCreate$lambda$0(Landroid/view/View;)V
    .locals 0

    const p0, 0x7f140026

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getDoneButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->doneButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->layoutId:I

    return v0
.end method

.method public final getMPagerView()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->mPagerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    return-object v0
.end method

.method public final getNextButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getNextButtonClick()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->nextButtonClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget p3, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->CREATE_PLAN_DONE:I

    if-ne p1, p3, :cond_1

    const/4 p1, -0x1

    const/4 p3, 0x0

    if-ne p2, p1, :cond_0

    const-string p1, "onActivityResult"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI_COACH_PLAN_MOBILE_PHONE_V2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1, p3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p1, "CREATE_AI_COACH_PLAN"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IIX1OXO()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    const/16 p1, 0x2328

    if-ne p2, p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getMPagerView()Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->initConfiguration()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    :cond_0
    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/sport/coach/guide/PlanGoalFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanGoalFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/github/appintro/AppIntroBase;->addSlide(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0OOI1X1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/i0OOI1X1;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    return-void
.end method

.method public onDonePressed(Landroidx/fragment/app/Fragment;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/github/appintro/AppIntroBase;->onDonePressed(Landroidx/fragment/app/Fragment;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->CREATE_PLAN_DONE:I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final onPlanChooseDayChanged(I)V
    .locals 3
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "PLAN_CHOOSE_DAY"
    .end annotation

    const-string v0, "onBloodGlucoseChanged"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onSlideChanged(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Lcom/github/appintro/AppIntroBase;->onSlideChanged(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const p2, 0x7f1410c5

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f1402f6

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment;

    const v1, 0x7f1402f5

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f140254

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object p1

    const p2, 0x7f0815ab

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_1
    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;

    const v0, 0x7f140fe5

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    check-cast p2, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getChoicesSize()I

    move-result p1

    const/4 p2, 0x3

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-lt p1, p2, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButtonClick()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const p2, 0x7f1402f7

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PlanStartTimeFragment;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const p2, 0x7f1402f9

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    instance-of p1, p2, Lcom/sma/smartv3/ui/sport/coach/guide/PlanGoalFragment;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const p2, 0x7f1402f8

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;->getNextButton()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f140c72

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const-string v1, "https://api.iot-solution.net/web/help/ai_coach_activity_assessment.html"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
