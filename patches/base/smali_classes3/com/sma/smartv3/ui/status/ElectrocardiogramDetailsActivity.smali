.class public final Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElectrocardiogramDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n69#2,3:54\n72#2,5:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n*L\n35#1:54,3\n35#1:58,5\n35#1:57\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nElectrocardiogramDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n69#2,3:54\n72#2,5:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n*L\n35#1:54,3\n35#1:58,5\n35#1:57\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeleteElectrocardiogram$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDetailsLandscape$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEditEleSymptom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX1O0ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX1O0ii;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0IXO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0IXO1i;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mEditEleSymptom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXXiIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXXiIO;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDeleteElectrocardiogram$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiO0iO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiO0iO0;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDetailsLandscape$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDeleteElectrocardiogram_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mEditEleSymptom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->initView$lambda$2(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDetailsLandscape_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->initView$lambda$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMDeleteElectrocardiogram()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDeleteElectrocardiogram$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMDetailsLandscape()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mDetailsLandscape$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMEditEleSymptom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->mEditEleSymptom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/EleDetailsLandscapeActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initView$lambda$2(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final mDeleteElectrocardiogram_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0350

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mDetailsLandscape_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0351

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mEditEleSymptom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a033e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
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
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1404cd

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->getMDetailsLandscape()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1I1i0O1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1I1i0O1;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->getMEditEleSymptom()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X01IOI;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/X01IOI;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity;->getMDeleteElectrocardiogram()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi11XiXX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/Oi11XiXX;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0094

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
