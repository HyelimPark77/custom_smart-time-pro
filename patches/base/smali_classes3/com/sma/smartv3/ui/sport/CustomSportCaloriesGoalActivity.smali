.class public final Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;
.super Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;
.source "SourceFile"


# instance fields
.field private final calEt$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXO10O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXO10O1;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;->calEt$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;->calEt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method private static final calEt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a01fa

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method


# virtual methods
.method public final getCalEt()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;->calEt$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

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

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140389

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0057

    return v0
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportCaloriesGoalActivity;->getCalEt()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Lkotlin/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "pair"

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    const p1, 0x7f140ffa

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
